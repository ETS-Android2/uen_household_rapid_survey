package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.validatorcrawler.aliazaz.Validator;

import org.json.JSONException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.R;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivitySectionImABinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;

public class SectionIMAActivity extends AppCompatActivity {

    private static final String TAG = "SectionIMAActivity";
    ActivitySectionImABinding bi;
    private DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_im_a);
        setSupportActionBar(bi.toolbar);
        db = MainApp.appInfo.dbHelper;
        try {
            MainApp.child = db.getChildByUUid();
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(MWRA): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        bi.setChild(MainApp.child);
    }

    private boolean validateDates(String baseDate, String forwardDate) {
        try {


            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() >= baseCal.getTimeInMillis();


        } catch (ParseException e) {
            e.printStackTrace();
            Toast.makeText(this, "ParseException(setDateRanges()): " + e.getMessage(), Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private boolean insertNewRecord() {
        if (!MainApp.child.getUid().equals("") || MainApp.superuser) return true;

        MainApp.child.populateMeta();

        long rowId = 0;
        try {
            rowId = db.addChild(MainApp.child);
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, R.string.db_excp_error, Toast.LENGTH_SHORT).show();
            return false;
        }
        MainApp.child.setId(String.valueOf(rowId));
        if (rowId > 0) {
            MainApp.child.setUid(MainApp.child.getDeviceId() + MainApp.child.getId());
            db.updatesFormColumn(TableContracts.ChildTable.COLUMN_UID, MainApp.child.getUid());
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
            updcount = db.updatesChildColumn(TableContracts.ChildTable.COLUMN_SIM, MainApp.child.sIMtoString());
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
            startActivity(new Intent(this, SectionIMBActivity.class).putExtra("complete", true));
        } else {
            Toast.makeText(this, R.string.fail_db_upd, Toast.LENGTH_SHORT).show();
        }
    }

    public void btnEnd(View view) {
        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
    }

    private boolean formValidation() {

        if (!Validator.emptyCheckingContainer(this, bi.GrpName)) {

            return false;
        }

        //if (IMdates is valid date(not, 97, 66, 88, 44)){

        // Only set once
        // IM04 - DOB
        String dobDate = bi.im04y.getText().toString()
                + "-" + bi.im04m.getText().toString()
                + "-" + bi.im04d.getText().toString();

        // IM0501
        String im0501date = bi.im0501y.getText().toString()
                + "-" + bi.im0501m.getText().toString()
                + "-" + bi.im0501d.getText().toString();
        if (!validateDates(dobDate, im0501date)) {
            Validator.emptyCustomTextBox(this, bi.im0501y, "Incorrect Date.");
        }


        // IM0502
        String im0502date = bi.im0502y.getText().toString()
                + "-" + bi.im0502m.getText().toString()
                + "-" + bi.im0502d.getText().toString();
        if (!validateDates(dobDate, im0502date)) {
            Validator.emptyCustomTextBox(this, bi.im0502y, "Incorrect Date.");
        }

        // IM0503
        String im0503date = bi.im0503y.getText().toString()
                + "-" + bi.im0503m.getText().toString()
                + "-" + bi.im0503d.getText().toString();
        if (!validateDates(dobDate, im0503date)) {
            Validator.emptyCustomTextBox(this, bi.im0503y, "Incorrect Date.");
        }

        return true;
        //}
    }


    @Override
    public void onBackPressed() {
        // Toast.makeText(this, "Back Press Not Allowed", Toast.LENGTH_SHORT).show();
        setResult(RESULT_CANCELED);
    }


}