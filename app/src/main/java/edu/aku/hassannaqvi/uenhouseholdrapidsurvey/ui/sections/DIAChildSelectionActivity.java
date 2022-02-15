package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.sharedPref;

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
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivityDiachildSelectionBinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class DIAChildSelectionActivity extends AppCompatActivity {

    private static final String TAG = "DIAChildSelectionActivity";
    ActivityDiachildSelectionBinding bi;
    private DatabaseHelper db;
    private ArrayList<String> childNames, childCodes, childAges, childFmUID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(sharedPref.getString("lang", "0").equals("0") ? R.style.AppThemeEnglish1 : R.style.AppThemeUrdu);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_diachild_selection);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        try {
            MainApp.childDIA = db.getChildDIAByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(ChildDIA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        bi.setChildDIA(MainApp.childDIA);
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
            // FMUID is not null than add only select Child
            if (!MainApp.childDIA.getFmuid().equals("")) {
                if (MainApp.childDIA.getFmuid().equals(fm.getUid())) {

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(DIAChildSelectionActivity.this,
                R.layout.custom_spinner, childNames);

        bi.i102a.setAdapter(adapter);

        bi.i102a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                //   bi.age.setText("");
                bi.i102ano.setText("");

                //if (position == 0) return;
                //try {
                //   MainApp.childDIA = db.getChildDIAByUUid(childFmUID.get(bi.i102a.getSelectedItemPosition()));
                if (MainApp.childDIA.getUid().equals("")) {
                    MainApp.childDIA.setFmuid(childFmUID.get(bi.i102a.getSelectedItemPosition()));
                    //        bi.age.setText(childAges.get(bi.i102a.getSelectedItemPosition()));
                    MainApp.childDIA.setI102ano(childCodes.get(bi.i102a.getSelectedItemPosition()));
                    MainApp.childDIA.setI102a(childNames.get(bi.i102a.getSelectedItemPosition()));
                }
                bi.i102ano.setText(childCodes.get(bi.i102a.getSelectedItemPosition()));
                //    bi.age.setText(childAges.get(bi.i102a.getSelectedItemPosition()));
   /*             } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(DIAChildSelectionActivity.this, "JSONException(LateAdolescent)" + e.getMessage(), Toast.LENGTH_SHORT).show();
                }*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private boolean insertNewRecord() {
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
    }


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


    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }


    public void btnContinue(View view) {
        if (!formValidation()) return;
        if (!insertNewRecord()) return;

        if (updateDB()) {
//            allChildrenList.remove(bi.i102a.getSelectedItemPosition() - 1);
            if(bi.i10101.isChecked()) {
                startActivity(new Intent(this, SectionI1Activity.class));
            }else{
                startActivity(new Intent(this, ARIChildSelectionActivity.class));
            }
            finish();
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }


    private boolean formValidation() {
        return Validator.emptyCheckingContainer(this, bi.GrpName);
    }
}