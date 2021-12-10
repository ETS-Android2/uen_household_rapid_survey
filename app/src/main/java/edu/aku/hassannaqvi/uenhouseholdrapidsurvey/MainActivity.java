package edu.aku.hassannaqvi.uenhouseholdrapidsurvey;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.AndroidManager;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivityMainBinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models.Form;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.IdentificationActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.SyncActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportCluster;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportDate;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists.FormsReportPending;


public class MainActivity extends AppCompatActivity {

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
    }

    public void sectionPress(View view) {


        switch (view.getId()) {
            case R.id.startInterview:
                MainApp.entryType = 1;
                break;
            case R.id.startDataEntry:
                MainApp.entryType = 2;
                break;
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
            case R.id.startDataEntry:

                MainApp.form = new Form();
                startActivity(new Intent(this, IdentificationActivity.class));
                break;
        /*    case R.id.openAnthro:
                MainApp.form = new Form();
                startActivity(new Intent(this, SectionA2Activity.class));
                break;*/
            /*case R.id.seca1:
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
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionI1Activity.class));
                break;
            case R.id.seci2:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionI2Activity.class));
                break;
            case R.id.secima:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionIMA_Activity.class));
                break;
            case R.id.secimb:
                MainApp.child = new Child();
                startActivity(new Intent(this, SectionIMB_Activity.class));
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
                break;*/
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