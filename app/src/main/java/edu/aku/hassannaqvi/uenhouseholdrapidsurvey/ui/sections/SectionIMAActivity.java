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

    private boolean validateDatesBCG(String baseDate, String forwardDate) {
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

    private boolean validateDates(String baseDate, String forwardDate) {
        try {
            Calendar baseCal = Calendar.getInstance();
            Calendar forwardCal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            baseCal.setTime(sdf.parse(baseDate));// all done
            forwardCal.setTime(sdf.parse(forwardDate));// all done

            return forwardCal.getTimeInMillis() > baseCal.getTimeInMillis();


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
        if (MainApp.child.getIm02().equals("1")) {
            // Only set once
            // IM04 - DOB
            String dobDate = MainApp.child.getIm04y()
                    + "-" + MainApp.child.getIm04m()
                    + "-" + MainApp.child.getIm04d();

            // IM0501
            String im0501date = MainApp.child.getIm0501y()
                    + "-" + MainApp.child.getIm0501m()
                    + "-" + MainApp.child.getIm0501d();
            if (!validateDatesBCG(dobDate, im0501date)) {
                return Validator.emptyCustomTextBox(this, bi.im0501y, "Incorrect Date.");
            }


            // IM0502
            String im0502date = MainApp.child.getIm0502y()
                    + "-" + MainApp.child.getIm0502m()
                    + "-" + MainApp.child.getIm0502d();
            if (!validateDatesBCG(dobDate, im0502date)) {
                return Validator.emptyCustomTextBox(this, bi.im0502y, "Incorrect Date.");
            }

            /*firstVaccine*/
            String firstVaccine = MainApp.child.getIm0501y()
                    + "-" + MainApp.child.getIm0501m()
                    + "-" + MainApp.child.getIm0501d();

            // IM0503
            String im0503date = MainApp.child.getIm0503y()
                    + "-" + MainApp.child.getIm0503m()
                    + "-" + MainApp.child.getIm0503d();
            if (!validateDates(firstVaccine, im0503date)) {
                return Validator.emptyCustomTextBox(this, bi.im0503y, "Incorrect Date.");
            }

            String im0504date = MainApp.child.getIm0504y()
                    + "-" + MainApp.child.getIm0504m()
                    + "-" + MainApp.child.getIm0504d();
            if (!validateDates(firstVaccine, im0504date)) {
                return Validator.emptyCustomTextBox(this, bi.im0504y, "Incorrect Date.");
            }

            String im0505date = MainApp.child.getIm0505y()
                    + "-" + MainApp.child.getIm0505m()
                    + "-" + MainApp.child.getIm0505d();
            if (!validateDates(firstVaccine, im0505date)) {
                return Validator.emptyCustomTextBox(this, bi.im0505y, "Incorrect Date.");
            }

            String im0506date = MainApp.child.getIm0506y()
                    + "-" + MainApp.child.getIm0506m()
                    + "-" + MainApp.child.getIm0506d();
            if (!validateDates(firstVaccine, im0506date)) {
                return Validator.emptyCustomTextBox(this, bi.im0506y, "Incorrect Date.");
            }

            /*secondVaccine*/
            String secondVaccine = MainApp.child.getIm0506y()
                    + "-" + MainApp.child.getIm0506m()
                    + "-" + MainApp.child.getIm0506d();

            // IM0507
            String im0507date = MainApp.child.getIm0507y()
                    + "-" + MainApp.child.getIm0507m()
                    + "-" + MainApp.child.getIm0507d();
            if (!validateDates(secondVaccine, im0507date)) {
                return Validator.emptyCustomTextBox(this, bi.im0507y, "Incorrect Date.");
            }

            String im0508date = MainApp.child.getIm0508y()
                    + "-" + MainApp.child.getIm0508m()
                    + "-" + MainApp.child.getIm0508d();
            if (!validateDates(secondVaccine, im0508date)) {
                return Validator.emptyCustomTextBox(this, bi.im0508y, "Incorrect Date.");
            }

            String im0509date = MainApp.child.getIm0509y()
                    + "-" + MainApp.child.getIm0509m()
                    + "-" + MainApp.child.getIm0509d();
            if (!validateDates(secondVaccine, im0509date)) {
                return Validator.emptyCustomTextBox(this, bi.im0509y, "Incorrect Date.");
            }

            String im0510date = MainApp.child.getIm0510y()
                    + "-" + MainApp.child.getIm0510m()
                    + "-" + MainApp.child.getIm0510d();
            if (!validateDates(secondVaccine, im0510date)) {
                return Validator.emptyCustomTextBox(this, bi.im0510y, "Incorrect Date.");
            }

            /*thirdVaccine*/
            String thirdVaccine = MainApp.child.getIm0510y()
                    + "-" + MainApp.child.getIm0510m()
                    + "-" + MainApp.child.getIm0510d();

            // IM0507
            String im0511date = MainApp.child.getIm0511y()
                    + "-" + MainApp.child.getIm0511m()
                    + "-" + MainApp.child.getIm0511d();
            if (!validateDates(thirdVaccine, im0511date)) {
                return Validator.emptyCustomTextBox(this, bi.im0511y, "Incorrect Date.");
            }

            String im0512date = MainApp.child.getIm0512y()
                    + "-" + MainApp.child.getIm0512m()
                    + "-" + MainApp.child.getIm0512d();
            if (!validateDates(thirdVaccine, im0512date)) {
                return Validator.emptyCustomTextBox(this, bi.im0512y, "Incorrect Date.");
            }

            String im0513date = MainApp.child.getIm0513y()
                    + "-" + MainApp.child.getIm0513m()
                    + "-" + MainApp.child.getIm0513d();
            if (!validateDates(thirdVaccine, im0513date)) {
                return Validator.emptyCustomTextBox(this, bi.im0513y, "Incorrect Date.");
            }

            String im0514date = MainApp.child.getIm0514y()
                    + "-" + MainApp.child.getIm0514m()
                    + "-" + MainApp.child.getIm0514d();
            if (!validateDates(thirdVaccine, im0514date)) {
                return Validator.emptyCustomTextBox(this, bi.im0514y, "Incorrect Date.");
            }

            /*forthVaccine*/
            String forthVaccine = MainApp.child.getIm0514y()
                    + "-" + MainApp.child.getIm0514m()
                    + "-" + MainApp.child.getIm0514d();

            // IM0507
            String im0515date = MainApp.child.getIm0515y()
                    + "-" + MainApp.child.getIm0515m()
                    + "-" + MainApp.child.getIm0515d();
            if (!validateDates(forthVaccine, im0515date)) {
                return Validator.emptyCustomTextBox(this, bi.im0515y, "Incorrect Date.");
            }

            /*fifthVaccine*/
            String fifthVaccine = MainApp.child.getIm0515y()
                    + "-" + MainApp.child.getIm0515m()
                    + "-" + MainApp.child.getIm0515d();

            // IM0507
            String im0516date = MainApp.child.getIm0516y()
                    + "-" + MainApp.child.getIm0516m()
                    + "-" + MainApp.child.getIm0516d();
            if (!validateDates(fifthVaccine, im0516date)) {
                return Validator.emptyCustomTextBox(this, bi.im0516y, "Incorrect Date.");
            }
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