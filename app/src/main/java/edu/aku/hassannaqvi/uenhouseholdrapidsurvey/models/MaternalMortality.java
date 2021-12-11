package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp._EMPTY_;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.PropertyChangeRegistry;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.BR;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;

public class MaternalMortality extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //Field Variables;
/*    private String e116 = _EMPTY_;
    private String e117 = _EMPTY_;*/
    private String e118 = _EMPTY_;
    private String e119d = _EMPTY_;
    private String e119m = _EMPTY_;
    private String e119y = _EMPTY_;
    private String e120 = _EMPTY_;
    private String e121 = _EMPTY_;
    private String e12196x = _EMPTY_;
    private String e122 = _EMPTY_;
    private String e12296x = _EMPTY_;


    public void Pregnancy() {
    }

    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
//        setMsno(MainApp.mwra.getBs1q1());
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setpsuCode(MainApp.currentHousehold.getClusteCcode());
        setHhid(MainApp.currentHousehold.getHhno());
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSysDate() {
        return sysDate;
    }

    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    public String getpsuCode() {
        return psuCode;
    }

    public String getHhid() {
        return hhid;
    }

    public void setHhid(String hhid) {
        this.hhid = hhid;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceTag() {
        return deviceTag;
    }

    public void setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
    }

    public String getAppver() {
        return appver;
    }

    public void setAppver(String appver) {
        this.appver = appver;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus;
    }

    public String getiStatus96x() {
        return iStatus96x;
    }

    public void setiStatus96x(String iStatus96x) {
        this.iStatus96x = iStatus96x;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSyncDate() {
        return syncDate;
    }

    public void setSyncDate(String syncDate) {
        this.syncDate = syncDate;
    }

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


/*    @Bindable
    public String getE116() {
        return e116;
    }

    public void setE116(String e116) {
        this.e116 = e116;
        setE117(e116.equals("1") ? this.e117 : "");
        setE118(e116.equals("1") ? this.e118 : "");
        setE119d(e116.equals("1") ? this.e119d : "");
        setE119m(e116.equals("1") ? this.e119m : "");
        setE119y(e116.equals("1") ? this.e119y : "");
        setE120(e116.equals("1") ? this.e120 : "");
        setE121(e116.equals("1") ? this.e121 : "");
        setE122(e116.equals("1") ? this.e122 : "");
        setE12296x(e116.equals("1") ? this.e12296x : "");
        notifyPropertyChanged(BR.e116);
    }


    @Bindable
    public String getE117() {
        return e117;
    }

    public void setE117(String e117) {
        this.e117 = e117;
        notifyPropertyChanged(BR.e117);
    }*/


    @Bindable
    public String getE118() {
        return e118;
    }

    public void setE118(String e118) {
        this.e118 = e118;
        notifyPropertyChanged(BR.e118);
    }

    @Bindable
    public String getE119d() {
        return e119d;
    }

    public void setE119d(String e119d) {
        this.e119d = e119d;
        notifyPropertyChanged(BR.e119d);
    }

    @Bindable
    public String getE119m() {
        return e119m;
    }

    public void setE119m(String e119m) {
        this.e119m = e119m;
        notifyPropertyChanged(BR.e119m);
    }

    @Bindable
    public String getE119y() {
        return e119y;
    }

    public void setE119y(String e119y) {
        this.e119y = e119y;
        notifyPropertyChanged(BR.e119y);
    }

    @Bindable
    public String getE120() {
        return e120;
    }

    public void setE120(String e120) {
        this.e120 = e120;
        notifyPropertyChanged(BR.e120);
    }

    @Bindable
    public String getE121() {
        return e121;
    }

    public void setE121(String e121) {
        this.e121 = e121;
        notifyPropertyChanged(BR.e121);
    }

    @Bindable
    public String getE12196x() {
        return e12196x;
    }

    public void setE12196x(String e12196x) {
        this.e12196x = e12196x;
        notifyPropertyChanged(BR.e12196x);
    }

    @Bindable
    public String getE122() {
        return e122;
    }

    public void setE122(String e122) {
        this.e122 = e122;
        setE12296x(e122.equals("96") ? this.e12296x : "");
        notifyPropertyChanged(BR.e122);
    }

    @Bindable
    public String getE12296x() {
        return e12296x;
    }

    public void setE12296x(String e12296x) {
        this.e12296x = e12296x;
        notifyPropertyChanged(BR.e12296x);
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MaternalMortalityTable.COLUMN_ID, this.id);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_UUID, this.uuid);

        json.put(TableContracts.MaternalMortalityTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_SYSDATE, this.syncDate);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.MaternalMortalityTable.COLUMN_SE2, new JSONObject(sE2toString()));
        return json;
    }

    public String sE2toString() throws JSONException {
        Log.d(TAG, "sE2toString: ");
        JSONObject json = new JSONObject();
        json
                /*.put("e116", e116)
                .put("e117", e117)*/
                .put("e118", e118)
                .put("e119d", e119d)
                .put("e119m", e119m)
                .put("e119y", e119y)
                .put("e120", e120)
                .put("e121", e121)
                .put("e12196x", e12196x)
                .put("e122", e122)
                .put("e12296x", e12296x);
        return json.toString();
    }


    public MaternalMortality Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_UUID));

        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_SYNCED_DATE));

        sE2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MaternalMortalityTable.COLUMN_SE2)));
        return this;
    }

    public void sE2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
/*            this.e116 = json.getString("e116");
            this.e117 = json.getString("e117");*/
            this.e118 = json.getString("e118");
            this.e119d = json.getString("e119d");
            this.e119m = json.getString("e119m");
            this.e119y = json.getString("e119y");
            this.e120 = json.getString("e120");
            this.e121 = json.getString("e121");
            this.e12196x = json.getString("e12196x");
            this.e122 = json.getString("e122");
            this.e12296x = json.getString("e12296x");
        }
    }


}
