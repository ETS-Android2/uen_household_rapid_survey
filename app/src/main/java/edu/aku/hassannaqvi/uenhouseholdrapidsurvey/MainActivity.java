package edu.aku.hassannaqvi.uenhouseholdrapidsurvey;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.AndroidManager;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.Child;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.ChildARI;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.ChildDIA;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.FamilyMembers;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.Form;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.MWRA;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.MaternalMortality;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.PregnancyDetails;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.PregnancyMaster;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.ChangePasswordActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.IdentificationActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.SyncActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportPending;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionA1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionD1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE1AActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE1BActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE2AActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE2BActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionF1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionG1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionH1AActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionH1BActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionH2Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionI1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionI2Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionIMAActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionIMBActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionK1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionL1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionM1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionN1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionO1Activity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionUNActivity;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ActivityMainBinding bi;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setSupportActionBar(bi.toolbar);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        //getSupportActionBar().setIcon(R.drawable.app_icon);
        bi.adminView.setVisibility(MainApp.admin ? View.VISIBLE : View.GONE);
        bi.toolbar.setSubtitle("Welcome, " + MainApp.user.getFullname() + (MainApp.admin ? " (Admin)" : "") + "!");
        invalidateOptionsMenu();


        try {
            String pwExpiry = String.valueOf(new JSONObject(MainApp.user.getPwdExpiry()).get("date")).substring(0, 10);
            //     Toast.makeText(this, pwExpiry, Toast.LENGTH_LONG).show();
            Log.d(TAG, "onCreate: pwExpiry: " + pwExpiry);

            Calendar cal = Calendar.getInstance();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
            cal.setTime(sdf.parse(pwExpiry));// all done

            int daysLeft = (int) MILLISECONDS.toDays(cal.getTimeInMillis() - System.currentTimeMillis());
            //  Toast.makeText(this, daysLeft+" Days left", Toast.LENGTH_LONG).show();
            if (daysLeft < 1) {
                Toast.makeText(this, "Your password has expired. Please contact your supervisor.", Toast.LENGTH_LONG).show();
                finish();
            }
            if (daysLeft < 10) {
                bi.message.setText("Your current password is expiring in " + daysLeft + " day(s) on " + pwExpiry + ". Please change your password to avoid account lockout. (Internet Required.)");
                // bi.message.setText("Your password will expire on " + pwExpiry + ". There are only " + daysLeft + " Days left.");
                bi.message.setVisibility(View.VISIBLE);
            } else {
                bi.message.setVisibility(View.GONE);
            }

        } catch (JSONException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
/*            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;*/
/*
            case R.id.updateBlood:
                MainApp.entryType = 3;
                break;

            case R.id.updateStool:
                MainApp.entryType = 4;
                break;*/
            default:
                MainApp.entryType = 0;

        }


        switch (view.getId()) {

            case R.id.startInterview:
/*
            case R.id.startDataEntry:
*/

                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
       /*     case R.id.openAnthro:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;*/
            case R.id.changePassword:
                startActivity(new Intent(this, ChangePasswordActivity.class));
                break;
            case R.id.seca1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA1Activity.class));
                break;
            case R.id.secd1:
                MainApp.familyMember = new FamilyMembers();
                startActivity(new Intent(this, SectionD1Activity.class));
                break;

            case R.id.sece1a:
                MainApp.pregM = new PregnancyMaster();
                startActivity(new Intent(this, SectionE1AActivity.class));
                break;
            case R.id.sece1b:
                MainApp.pregD = new PregnancyDetails();
                startActivity(new Intent(this, SectionE1BActivity.class));
                break;
            case R.id.sece2a:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionE2AActivity.class));
                break;
            case R.id.sece2b:
                MainApp.mortality = new MaternalMortality();
                startActivity(new Intent(this, SectionE2BActivity.class));
                break;
            case R.id.secf1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionF1Activity.class));
                break;
            case R.id.secg1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionG1Activity.class));
                break;
            case R.id.sech1a:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionH1AActivity.class));
                break;
            case R.id.sech1b:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionH1BActivity.class));
                break;
            case R.id.sech2:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionH2Activity.class));
                break;
            case R.id.secia:
                MainApp.childDIA = new ChildDIA();
                startActivity(new Intent(this, SectionI1Activity.class));
                break;
            case R.id.seci2:
                MainApp.childARI = new ChildARI();
                startActivity(new Intent(this, SectionI2Activity.class));
                break;
            case R.id.secima:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionIMAActivity.class));
                break;
            case R.id.secimb:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionIMBActivity.class));
                break;
            case R.id.seck1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionK1Activity.class));
                break;
            case R.id.secl1:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionL1Activity.class));
                break;
            case R.id.secm1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionM1Activity.class));
                break;
            case R.id.secn1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionN1Activity.class));
                break;
            case R.id.seco1:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionO1Activity.class));
                break;
            case R.id.secun:
                MainApp.mwra = new MWRA();
                startActivity(new Intent(this, SectionUNActivity.class));
                break;
            case R.id.dbManager:
                startActivity(new Intent(this, AndroidManager.class));
                break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.action_database:
                intent = new Intent(MainActivity.this, AndroidManager.class);
                startActivity(intent);
                break;

            case R.id.onSync:
                intent = new Intent(MainActivity.this, SyncActivity.class);
                startActivity(intent);
                break;
            case R.id.checkPendingForms:
                intent = new Intent(MainActivity.this, FormsReportPending.class);
                startActivity(intent);
                break;
            case R.id.formsReportDate:
                intent = new Intent(MainActivity.this, FormsReportDate.class);
                startActivity(intent);
                break;
            case R.id.changePassword:
                intent = new Intent(MainActivity.this, ChangePasswordActivity.class);
                startActivity(intent);
                break;
            case R.id.formsReportCluster:
                intent = new Intent(MainActivity.this, FormsReportCluster.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        MenuItem action_database = menu.findItem(R.id.action_database);

        action_database.setVisible(MainApp.admin);
        return true;

    }

}