package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.pregD;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.R;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionE1BBinding;

public class SectionE1BActivity extends AppCompatActivity {

    private static final String TAG = "SectionE1AActivity";
    ActivitySectionE1BBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_e1_b);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;

        // FMUID
        MainApp.pregD.setFmuid(MainApp.allMWRAList.get(0).getUid());

/*        try {
            MainApp.child = db.getChildByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Child): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

        bi.setPregD(pregD);
        setupSkips();
//        populateSpinner();
    }


    /*private void populateSpinner() {

        childNames = new ArrayList<>();
        childCodes = new ArrayList<>();
        childAges = new ArrayList<>();
        childFmUID = new ArrayList<>();

        childNames.add("...");
        childCodes.add("");
        childAges.add("");
        childFmUID.add("");

        for (FamilyMembers fm : MainApp.allChildrenList) {
            // FMUID is not null than add only select Child
            if (!MainApp.pregD.getFmuid().equals("")) {
                if (MainApp.pregD.getFmuid().equals(fm.getUid())) {
                    childNames.add(fm.getD102());
                    childCodes.add(fm.getD101());
                    childAges.add(fm.getD109y());
                    childFmUID.add(fm.getUid());
                }

            } else {
                childNames.add(fm.getD102());
                childCodes.add(fm.getD101());
                childAges.add(fm.getD109y());
                childFmUID.add(fm.getUid());
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionE1BActivity.this,
                R.layout.custom_spinner, childNames);

        bi.e108.setAdapter(adapter);

        bi.e108.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0) return;
                if (MainApp.pregD.getUid().equals("")) {
                    MainApp.pregD.setFmuid(childFmUID.get(bi.e108.getSelectedItemPosition()));
                    MainApp.pregD.setE108(childNames.get(bi.e108.getSelectedItemPosition()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }*/

    private void setupSkips() {

    }

    private boolean insertNewRecord() {
        if (!MainApp.pregD.getUid().equals("") || MainApp.superuser) return true;

        MainApp.pregD.populateMeta();
        long rowId = 0;
        try {
            rowId = db.addPregnancyDetails(MainApp.pregD);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.pregD.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.pregD.setUid(MainApp.pregD.getDeviceId() + MainApp.pregD.getId());
            db.updatesPregnancyDetailsColumn(TableContracts.PregnancyDetailsTable.COLUMN_UID, MainApp.pregD.getUid());
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
            db.updatesPregnancyDetailsColumn(TableContracts.PregnancyDetailsTable.COLUMN_SE1, MainApp.pregD.sE1toString());
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
        if (MainApp.pregD.getUid().equals("") ? insertNewRecord() : updateDB()) {
            setResult(RESULT_OK);
            finish();
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
        // Allow BackPress
        setResult(Activity.RESULT_CANCELED);
        super.onBackPressed();

        // Dont Allow BackPress
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
    }

}