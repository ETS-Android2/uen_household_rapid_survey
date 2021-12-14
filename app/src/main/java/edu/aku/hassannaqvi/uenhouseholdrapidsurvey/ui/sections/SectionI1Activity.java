package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import android.content.Intent;
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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionI1Binding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class SectionI1Activity extends AppCompatActivity {

    private static final String TAG = "SectionI1Activity";
    ActivitySectionI1Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setChildDIA(MainApp.childDIA);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.sectioni1diarrheainformation_mainheading);
        db = MainApp.appInfo.dbHelper;

        populateSpinner();

    }


    private void populateSpinner() {

        // Populate Provinces

        childNames = new ArrayList<>();
        childCodes = new ArrayList<>();
        childAges = new ArrayList<>();
        childFmUID = new ArrayList<>();

        childNames.add("...");
        childCodes.add("");
        childAges.add("");
        childFmUID.add("");

        for (FamilyMembers fm : MainApp.allChildrenList) {
            childNames.add(fm.getD102());
            childCodes.add(fm.getD101());
            childAges.add(fm.getD109y());
            childFmUID.add(fm.getUid());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionI1Activity.this,
                R.layout.custom_spinner, childNames);

        bi.i102resp.setAdapter(adapter);

        bi.i102resp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.age.setText("");
                bi.s102respline.setText("");

                //  if (position == 0) return;
                try {
                    MainApp.childARI = db.getChildARIByUUid(childFmUID.get(bi.i102resp.getSelectedItemPosition()));
                    if (MainApp.childARI.getUid().equals("")) {
                        MainApp.childARI.setFmuid(childFmUID.get(bi.i102resp.getSelectedItemPosition()));
                        bi.age.setText(childAges.get(bi.i102resp.getSelectedItemPosition()));
                        MainApp.childARI.setI102ano(childCodes.get(bi.i102resp.getSelectedItemPosition()));
                        MainApp.childARI.setI102a(childNames.get(bi.i102resp.getSelectedItemPosition()));
                    }
                    bi.s102respline.setText(childCodes.get(bi.i102resp.getSelectedItemPosition()));
                    bi.age.setText(childAges.get(bi.i102resp.getSelectedItemPosition()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionI1Activity.this, "JSONException(LateAdolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


    private void setupSkips() {

    }


    private boolean insertNewRecord() {
        MainApp.childARI.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChildDIA(MainApp.childDIA);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.childARI.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.childARI.setUid(MainApp.childARI.getDeviceId() + MainApp.childARI.getId());
            db.updatesChildARIColumn(TableContracts.ChildDIATable.COLUMN_UID, MainApp.childARI.getUid());
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
            updcount = db.updatesChildDIAColumn(TableContracts.ChildDIATable.COLUMN_SI1, MainApp.childARI.sI1toString());
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
        if (!insertNewRecord()) return;
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionI2Activity.class).putExtra("complete", true));
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