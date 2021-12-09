package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.mortality;

import android.app.Activity;
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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionE2BBinding;

public class SectionE2BActivity extends AppCompatActivity {

    private static final String TAG = "SectionE2AActivity";
    private DatabaseHelper db;
    ActivitySectionE2BBinding bi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e2_b);
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.e2maternalmortalitystatus_mainheading);
        db = MainApp.appInfo.dbHelper;
        MainApp.mortalityCounter++;
        bi.setMortality(mortality);
    }

    private boolean insertNewRecord() {
        if (!MainApp.mortality.getUid().equals("") || MainApp.superuser) return true;

        MainApp.mortality.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addMortality(MainApp.mortality);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.mortality.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.mortality.setUid(MainApp.mortality.getDeviceId() + MainApp.mortality.getId());
            db.updatesMortalityColumn(TableContracts.MaternalMortalityTable.COLUMN_UID, MainApp.mortality.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            db.updatesMortalityColumn(TableContracts.MaternalMortalityTable.COLUMN_SE2, MainApp.mortality.sE2toString());
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


    public void btnContinue(View view) {

        if (!formValidation()) return;
        if (MainApp.mortality.getUid().equals("") ? insertNewRecord() : updateDB()) {
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
        } else {
            Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        setResult(Activity.RESULT_CANCELED);
        finish();
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