package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.allChildrenList;

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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivityArichildSelectionBinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class ARIChildSelectionActivity extends AppCompatActivity {

    private static final String TAG = "ARIChildSelectionActivity";
    ActivityArichildSelectionBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_arichild_selection);
        bi.setChildARI(MainApp.childARI);
        setSupportActionBar(bi.toolbar);
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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ARIChildSelectionActivity.this,
                R.layout.custom_spinner, childNames);

        bi.i202a.setAdapter(adapter);

        bi.i202a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.age.setText("");
                bi.i202ano.setText("");

                //  if (position == 0) return;
                try {
                    MainApp.childARI = db.getChildARIByUUid(childFmUID.get(bi.i202a.getSelectedItemPosition()));
                    if (MainApp.childARI.getUid().equals("")) {
                        MainApp.childARI.setFmuid(childFmUID.get(bi.i202a.getSelectedItemPosition()));
                        bi.age.setText(childAges.get(bi.i202a.getSelectedItemPosition()));
                        MainApp.childARI.setI102ano(childCodes.get(bi.i202a.getSelectedItemPosition()));
                        MainApp.childARI.setI102a(childNames.get(bi.i202a.getSelectedItemPosition()));
                    }
                    bi.i202ano.setText(childCodes.get(bi.i202a.getSelectedItemPosition()));
                    bi.age.setText(childAges.get(bi.i202a.getSelectedItemPosition()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(ARIChildSelectionActivity.this, "JSONException(LateAdolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private boolean insertNewRecord() {
        MainApp.childARI.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChildARI(MainApp.childARI);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.childARI.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.childARI.setUid(MainApp.childARI.getDeviceId() + MainApp.childARI.getId());
            db.updatesChildARIColumn(TableContracts.ChildARITable.COLUMN_UID, MainApp.childARI.getUid());
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
            updcount = db.updatesChildARIColumn(TableContracts.ChildARITable.COLUMN_SI2, MainApp.childARI.sI2toString());
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


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;

        if (updateDB()) {
            allChildrenList.remove(bi.i202a.getSelectedItemPosition() - 1);
            startActivity(new Intent(this, SectionI2Activity.class).putExtra("age", bi.age.getText().toString()));
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}