package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionI1Binding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class SectionI1Activity extends AppCompatActivity {

    private static final String TAG = "SectionI1Activity";
    ActivitySectionI1Binding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setChildDIA(MainApp.childDIA);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.sectioni1diarrheainformation_mainheading);
        db = MainApp.appInfo.dbHelper;
        //  bi.age.setText(getIntent().getStringExtra("age"));
    }


    private void setupSkips() {

    }


   /* private boolean insertNewRecord() {
        if (!MainApp.childDIA.getUid().equals("") || MainApp.superuser) return true;

        MainApp.childDIA.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChildDIA(MainApp.childDIA);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.childDIA.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.childDIA.setUid(MainApp.childDIA.getDeviceId() + MainApp.childDIA.getId());
            db.updatesChildDIAColumn(TableContracts.ChildDIATable.COLUMN_UID, MainApp.childDIA.getUid());
            return true;
        } else {
            Toast.makeText(this, R.string.upd_db_error, Toast.LENGTH_SHORT).show();
            return false;
        }
    }*/


    private boolean updateDB() {
        if (MainApp.superuser) return true;

        int updcount = 0;
        try {
            updcount = db.updatesChildDIAColumn(TableContracts.ChildDIATable.COLUMN_SI1, MainApp.childDIA.sI1toString());
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
        // if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, ARIChildSelectionActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }


    @Override
    public void onBackPressed() {
        // Allow BackPress
        // super.onBackPressed();

        // Dont Allow BackPress
        Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }
}