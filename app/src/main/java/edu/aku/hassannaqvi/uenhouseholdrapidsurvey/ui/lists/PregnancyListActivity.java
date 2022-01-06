package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.lists;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;

import java.util.ArrayList;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.R;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.adapters.PregAdapter;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.database.DatabaseHelper;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.databinding.ActivityPregnancyListBinding;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.EndingActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE1AActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE1BActivity;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.ui.sections.SectionE2AActivity;


public class PregnancyListActivity extends AppCompatActivity {


    private static final String TAG = "PregnancyListActivity";
    ActivityPregnancyListBinding bi;
    DatabaseHelper db;
    private PregAdapter pregAdapter;
    ActivityResultLauncher<Intent> MemberInfoLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        // There are no request codes
                        //Intent data = result.getData();
                        // Intent data = result.getData();
                      /*  int age = Integer.parseInt(femalemembers.getHh05y());
                        boolean isFemale = femalemembers.getHh03().equals("2");
                        boolean notMarried = femalemembers.getHh06().equals("2");
                        if (
                            // Adolescent: Male + Female - 10 to 19
                                (age >= 10 && age < 20 && notMarried)
                                        ||
                                        // MWRA: Married females between 14 to 49
                                        (age >= 14 && age < 50 && !notMarried && isFemale )

                        ) {*/
                        MainApp.pregList.add(MainApp.pregD);

                        MainApp.pregCount++;
                        pregAdapter.notifyItemInserted(MainApp.pregList.size() - 1);
                        //  Collections.sort(MainApp.fm, new SortByStatus());
                        //fmAdapter.notifyDataSetChanged();

                        //        }

                        checkCompleteFm();
                    }
                    if (result.getResultCode() == Activity.RESULT_CANCELED) {
                        Toast.makeText(PregnancyListActivity.this, "No preg added.", Toast.LENGTH_SHORT).show();
                    }

                }
            });
    private final boolean proceedFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_mwra);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_pregnancy_list);

        // Title with Name of MWRA
        bi.fmHeading.setText("PREGNANCIES OF \n" + MainApp.pregM.getE101a().toUpperCase());

        db = MainApp.appInfo.dbHelper;
        MainApp.pregList = new ArrayList<>();
        Log.d(TAG, "onCreate: preglist " + MainApp.pregList.size());
        try {
            MainApp.pregList = db.getPregDByFmuid(MainApp.allMWRAList.get(0).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(this, "JSONException(PregD)", Toast.LENGTH_SHORT).show();
        }
/*        // Set Selected Preg
        for (int i = 0; i < MainApp.pregList.size(); i++) {
            if (MainApp.pregList.get(i).getIndexed().equals("1")) {
                MainApp.selectedPreg = String.valueOf(i);
                break;
            }
        }*/
        MainApp.pregCount = Math.round(MainApp.pregList.size());

        pregAdapter = new PregAdapter(this, MainApp.pregList);
        bi.rvPreg.setAdapter(pregAdapter);
        bi.rvPreg.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(view -> {
            if (MainApp.form.getSynced().equals("")) {
                //     Toast.makeText(MwraActivity.this, "Opening Mwra Form", Toast.LENGTH_LONG).show();
                try {
                    MainApp.pregD = db.getPregDByPsno(MainApp.allMWRAList.get(0).getUid(), String.valueOf(MainApp.pregList.size() + 1));
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(this, "JSONException(PredD): " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
                MainApp.pregD.setE103(String.valueOf(MainApp.pregList.size() + 1));

                addPreg();
            } else {
                Toast.makeText(PregnancyListActivity.this, "This form has been locked. You cannot add new pregren to locked forms", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity Resumed!", Toast.LENGTH_SHORT).show();

        //MainApp.mwra = new MWRA();
        //MainApp.preg = new Preg();
        if (MainApp.pregList.size() > 0) {
            //MainApp.fm.get(Integer.parseInt(String.valueOf(MainApp.selectedFemale))).setStatus("1");
            bi.btnContinue.setVisibility(View.VISIBLE);
            bi.btnContinue.setEnabled(true);
            //bi.btnRand.setVisibility(View.VISIBLE);

        }
        checkCompleteFm();


        // bi.fab.setClickable(!MainApp.form.getiStatus().equals("1"));
      /* bi.completedmember.setText(mwra.size()+ " MWRAs added");
        bi.totalmember.setText(MainApp.mwraTotal+ " M completed");*/
    }

    private void checkCompleteFm() {
        //     if (!MainApp.form.getIStatus().equals("1")) {
        int compCount = MainApp.pregList.size();

        MainApp.pregCountComplete = compCount;
        //   bi.btnContinue.setVisibility(compCount == mwraCount && !form.getiStatus().equals("1")? View.VISIBLE : View.GONE);
     /*   bi.btnContinue.setVisibility(compCount >= mwraCount ? View.VISIBLE : View.GONE);
        bi.btnContinue.setEnabled(bi.btnContinue.getVisibility()==View.VISIBLE);*/

        //  } else {
        //       Toast.makeText(this, "Form has been completed or locked", Toast.LENGTH_LONG).show();
        //   }
    }

    public void addPreg() {
        if (MainApp.pregList.size() >= MainApp.totalPreg) {
            displayAddMoreDialog();
        } else {
            addMoreMWRA();
        }
        /*Intent intent = new Intent(this, SectionE1BActivity.class);
        //   finish();
        MemberInfoLauncher.launch(intent);*/
    }

    public void btnContinue(View view) {
        if (MainApp.pregList.size() < MainApp.totalPreg) {
            displayProceedDialog();
        } else {
            proceedNext();
        }


    }

    private void proceedNext() {
        MainApp.allMWRAList.remove(0);
        MainApp.pregList = new ArrayList<>();

        if (MainApp.allMWRAList.size() > 0) {
            startActivity(new Intent(this, SectionE1AActivity.class).putExtra("complete", true));
        } else {
            // if no more pregnancy and no more mwra than go to E2
            startActivity(new Intent(this, SectionE2AActivity.class).putExtra("complete", true));

        }        // MainApp.preg = db.getYoungestPregByMUID(MainApp.mwra.getUid());
        finish();

    }

    private void displayProceedDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_preg_dialog)
                .setMessage(String.format(getString(R.string.message_preg_dialog_proceed), MainApp.pregList.size() + "", MainApp.totalPreg + ""))

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
//                        proceedSelect();
                     /*   startActivity(new Intent(PregnancyListActivity.this, SectionE2AActivity.class).putExtra("complete", true));
                        finish();*/
                        proceedNext();
                    }
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.no, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }

    public void btnEnd(View view) {

        finish();
        startActivity(new Intent(this, EndingActivity.class).putExtra("complete", false));
        /*   } else {
               Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show()
           }*/
    }

    private void displayAddMoreDialog() {
        new AlertDialog.Builder(this)
                .setTitle(R.string.title_preg_dialog)
                .setMessage(String.format(getString(R.string.message_preg_dialog_addmore), MainApp.pregList.size() + ""))

                .setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Continue with delete operation
                        addMoreMWRA();
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(R.string.no, null)
                .setIcon(R.drawable.ic_alert_24)
                .show();

    }

    private void addMoreMWRA() {
        Intent intent = new Intent(this, SectionE1BActivity.class);
        //   finish();
        MemberInfoLauncher.launch(intent);
    }


    /*public void btnRand(View view) {
        int aCount = 0;

        String pregUid = db.getYoungestPregByMUID(MainApp.mwra.getUid()).getUid();
        for (int i = 0; i < MainApp.pregList.size(); i++) {

            // Get MWRA from list
            String curPregUid = MainApp.pregList.get(i).getUid();

            // Unselect and Disable if MWRA has been previously selected and refused
            if (pregUid.equals(curPregUid)) {
                MainApp.selectedPreg = String.valueOf(i);
                MainApp.pregList.get(i).setIndexed("1");
                pregAdapter.notifyDataSetChanged();
            }

        }


    }*/

/*    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            if (resultCode == Activity.RESULT_OK) {
                //   mwra.get(selectedFemale).setExpanded(false);
                checkCompleteFm();
                mwraAdapter.notifyItemChanged(selectedFemale);
            }
            if (resultCode == Activity.RESULT_CANCELED) {
                // Write your code if there's no result
                Toast.makeText(this, "Preg for " + MainApp.mwraList.get(selectedFemale).getH221() + " was not added.", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

}