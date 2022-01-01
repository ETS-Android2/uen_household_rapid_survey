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
import java.util.List;

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
    private ArrayList<String> respNames, respLineNo, respFmUIDs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_i1);
        bi.setChildDIA(MainApp.childDIA);
        setSupportActionBar(bi.toolbar);
        setTitle(R.string.sectioni1diarrheainformation_mainheading);
        db = MainApp.appInfo.dbHelper;
        //  bi.age.setText(getIntent().getStringExtra("age"));
    }

    private void populateSpinner() {

        // Populate Respondents
        List<FamilyMembers> respList = new ArrayList<>();
        try {
            respList = db.getAllRespondents();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(Familymembers): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        respNames = new ArrayList<>();
        respLineNo = new ArrayList<>();
        respFmUIDs = new ArrayList<>();

        respNames.add("...");
        respLineNo.add("");
        respFmUIDs.add("");

        int selectedResp = 0;
        int counter = 0;

        for (FamilyMembers fm : respList) {

            respNames.add(fm.getD102());
            respLineNo.add(fm.getD101());
            respFmUIDs.add(fm.getUid());

            if (MainApp.childDIA.getI102cno().equals(fm.getD101())) {
                selectedResp = counter;
            }
            counter++;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SectionI1Activity.this,
                R.layout.custom_spinner, respNames);

        bi.i102as.setAdapter(adapter);
        bi.i102as.setSelection(selectedResp);


        bi.i102as.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // for EditMode auto selection
                if (MainApp.childDIA.getI102cno().equals(respLineNo.get(bi.i102as.getSelectedItemPosition()))) {
                    return;
                } else {

                    //   if(position == 0) return;
                    bi.i102c.setText("");
                    bi.i102cno.setText("");
                    MainApp.childDIA.setRespFmuid(respFmUIDs.get(bi.i102as.getSelectedItemPosition()));
                    MainApp.childDIA.setI102cno(respLineNo.get(bi.i102as.getSelectedItemPosition()));
                    MainApp.childDIA.setI102c(respNames.get(bi.i102as.getSelectedItemPosition()));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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