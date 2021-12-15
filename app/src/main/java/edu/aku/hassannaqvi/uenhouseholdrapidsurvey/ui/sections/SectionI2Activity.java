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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionI2Binding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class SectionI2Activity extends AppCompatActivity {

    private static final String TAG = "SectionI2Activity";
    ActivitySectionI2Binding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i2);
        bi.setChild(MainApp.childARI);
        setupSkips();
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.sectioni2acuterespiratoryinfectionari_mainheading);
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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionI2Activity.this,
                R.layout.custom_spinner, childNames);

        bi.i202resp.setAdapter(adapter);

        bi.i202resp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                bi.age.setText("");
                bi.i202respline.setText("");

                //  if (position == 0) return;
                try {
                    MainApp.childARI = db.getChildARIByUUid(childFmUID.get(bi.i202resp.getSelectedItemPosition()));
                    if (MainApp.childARI.getUid().equals("")) {
                        MainApp.childARI.setFmuid(childFmUID.get(bi.i202resp.getSelectedItemPosition()));
                        bi.age.setText(childAges.get(bi.i202resp.getSelectedItemPosition()));
                        MainApp.childARI.setI102ano(childCodes.get(bi.i202resp.getSelectedItemPosition()));
                        MainApp.childARI.setI102a(childNames.get(bi.i202resp.getSelectedItemPosition()));
                    }
                    bi.i202respline.setText(childCodes.get(bi.i202resp.getSelectedItemPosition()));
                    bi.age.setText(childAges.get(bi.i202resp.getSelectedItemPosition()));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(SectionI2Activity.this, "JSONException(LateAdolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void setupSkips() {

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

    public void btnContinue(View view) {
        if (!formValidation()) return;
        saveDraft();
        if (updateDB()) {
            finish();
            startActivity(new Intent(this, SectionIMAActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    private void saveDraft() {
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
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }
}