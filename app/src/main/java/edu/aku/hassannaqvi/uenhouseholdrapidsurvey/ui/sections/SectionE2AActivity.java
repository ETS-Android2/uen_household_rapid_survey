package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.mortality;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.R;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionE2ABinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class SectionE2AActivity extends AppCompatActivity {

    private static final String TAG = "SectionE2AActivity";
    ActivitySectionE2ABinding bi;
    private DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e2_a);
        bi.setForm(MainApp.form);
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.e2maternalmortalitystatus_mainheading);
        db = MainApp.appInfo.dbHelper;
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;
        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.FormsTable.COLUMN_SE2, MainApp.form.sE2toString());
        } catch (JSONException e) {
            Toast.makeText(this, R.string.upd_db + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void BtnContinue(View view) {
        if (!formValidation()) return;
        if (updateDB()) {

            // Remove current MWRA from the List (Test:Failed!!)
            // MainApp.allMWRAList.remove(0);

            MainApp.totalMortalities = Integer.parseInt(MainApp.form.getE117());

            // Maternal Mortality is ZERO goto next Section
            if (MainApp.totalMortalities > MainApp.mortalityCounter) {
                try {
                    mortality = db.getMortalityBySno(String.valueOf(++MainApp.mortalityCounter));

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "JSONException(MaternalMortality): " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                startActivity(new Intent(this, SectionE2BActivity.class).putExtra("complete", true));
                finish();

            } else {

                // if no more pregnancy and no more mwra than go to E2
                startActivity(new Intent(this, SectionF1Activity.class).putExtra("complete", true));
                finish();

            }

        }

    }


    public void BtnEnd(View view) {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));

    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }

}