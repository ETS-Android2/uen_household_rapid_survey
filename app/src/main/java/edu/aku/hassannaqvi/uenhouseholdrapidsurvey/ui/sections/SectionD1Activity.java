package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.familyMember;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.memberCount;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionD1Binding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;

public class SectionD1Activity extends AppCompatActivity {

    private static final String TAG = "SectionD1Activity";
    ActivitySectionD1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> fatherNames, fatherCodes, motherNames, motherCodes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_d1);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.sectiondhouseholdmemberinformation_mainheading);
        db = MainApp.appInfo.dbHelper;
    //    MainApp.allMWRAList = new ArrayList<>();
        familyMember.setD101(String.valueOf(memberCount + 1));
        bi.setMember(familyMember);
        populateSpinner();
    }

    private void setupSkips() {
    }

    private void populateSpinner() {

        fatherNames = new ArrayList<>();
        fatherCodes = new ArrayList<>();

        motherNames = new ArrayList<>();
        motherCodes = new ArrayList<>();

        fatherNames.add("...");
        fatherCodes.add("...");
        for (FamilyMembers fl : MainApp.fatherList) {
            fatherNames.add(fl.getD102());
            fatherCodes.add(fl.getD101());
        }
        fatherNames.add("Not Available/Died");
        fatherCodes.add("97");

        motherNames.add("...");
        motherCodes.add("...");
        for (FamilyMembers fl : MainApp.motherList) {
            motherNames.add(fl.getD102());
            motherCodes.add(fl.getD101());
        }
        motherNames.add("Not Available/Died");
        motherCodes.add("97");

        // Apply the adapter to the Father spinner
        bi.d106.setAdapter(new ArrayAdapter<>(SectionD1Activity.this, R.layout.custom_spinner, fatherNames));

        bi.d106.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setD106(fatherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });

        // Apply the adapter to the Mother spinner
        bi.d107.setAdapter(new ArrayAdapter<>(SectionD1Activity.this, R.layout.custom_spinner, motherNames));

        bi.d107.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) return;
                MainApp.familyMember.setD107(motherCodes.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }

        });


    }

    private boolean insertNewRecord() {
        if (!familyMember.getUid().equals("")) return true;
        if (MainApp.superuser) return true;

        // Populate MetaData from MainApp.Forms and any other master tables
        MainApp.familyMember.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addFamilyMembers(familyMember);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        familyMember.setId(String.valueOf(rowId));
        if (rowId > 0) {
            familyMember.setUid(familyMember.getDeviceId() + familyMember.getId());
            db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_UID, familyMember.getUid());
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
            updcount = db.updatesfamilyListColumn(TableContracts.FamilyMembersTable.COLUMN_SD, familyMember.sDtoString());
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
        if (MainApp.familyMember.getUid().equals("") ? insertNewRecord() : updateDB()) {
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
        finish();
        super.onBackPressed();

        // Dont Allow BackPress
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();

    }
}