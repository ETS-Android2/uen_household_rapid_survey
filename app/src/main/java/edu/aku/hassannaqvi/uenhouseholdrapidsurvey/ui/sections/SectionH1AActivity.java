package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.MainActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.R;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionH1aBinding;

public class SectionH1AActivity extends AppCompatActivity {

    private static final String TAG = "SectionH1Activity";
    ActivitySectionH1aBinding bi;
    int childAge;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_h1a);
        bi.setMwra(MainApp.mwra);
        childAge = Integer.parseInt(MainApp.familyList.get(Integer.parseInt(MainApp.selectedChild) - 1).getD109y());
        if (childAge < 6) bi.fldGrpCVh114.setVisibility(View.GONE);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
    }

    private void setupSkips() {
        bi.h113.setOnCheckedChangeListener((group, id) -> {
            if (childAge > 5 && id == bi.h11301.getId())
                bi.fldGrpCVh114.setVisibility(View.VISIBLE);
            else bi.fldGrpCVh114.setVisibility(View.GONE);
        });
    }

    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesFormColumn(TableContracts.MwraTable.COLUMN_SH1, MainApp.mwra.sH1toString());
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
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionH2Activity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDraft() {
    }


    public void BtnEnd(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, MainActivity.class).putExtra("complete", false));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
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