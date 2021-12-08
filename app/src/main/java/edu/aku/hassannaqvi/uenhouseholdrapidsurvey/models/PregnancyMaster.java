package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.selectedMWRA;

import android.database.Cursor;
import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.BR;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;

public class PregnancyMaster extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String clusterCode = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String msno = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //Field Variables;

    private String e101a = _EMPTY_;
    private String e101b = _EMPTY_;
    private String e101 = _EMPTY_;
    private String e102 = _EMPTY_;
    private String e102a = _EMPTY_;


    public void PregnancyMaster() {
    }

    public void populateMeta() {
        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setMuid(MainApp.mwra.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA)).getUid()); //// not applicable in Form table
//        setMsno(MainApp.mwra.getBs1q1());
        setAppver(MainApp.appInfo.getAppVersion());
        setProjectName(PROJECT_NAME);
        setClusterCode(MainApp.currentHousehold.getClusteCcode());
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

    public String getClusterCode() {
        return clusterCode;
    }

    public void setClusterCode(String psuCode) {
        this.clusterCode = psuCode;
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

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
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

    public String getMsno() {
        return msno;
    }

    public void setMsno(String msno) {
        this.msno = msno;
    }

    @Bindable
    public String getE101a() {
        return e101a;
    }

    public void setE101a(String e101a) {
        this.e101a = e101a;
        notifyPropertyChanged(BR.e101a);
    }

    @Bindable
    public String getE101b() {
        return e101b;
    }

    public void setE101b(String e101b) {
        this.e101b = e101b;
        notifyPropertyChanged(BR.e101b);
    }

    @Bindable
    public String getE101() {
        return e101;
    }

    public void setE101(String e101) {
        this.e101 = e101;
        notifyPropertyChanged(BR.e101);
    }

    @Bindable
    public String getE102() {
        return e102;
    }

    public void setE102(String e102) {
        this.e102 = e102;
        notifyPropertyChanged(BR.e102);
    }

    @Bindable
    public String getE102a() {
        return e102a;
    }

    public void setE102a(String e102a) {
        this.e102a = e102a;
        notifyPropertyChanged(BR.e102a);
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.PregnancyDetailsTable.COLUMN_ID, this.id);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_UID, this.uid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_PSU_CODE, this.clusterCode);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_M_SNO, this.msno);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SYSDATE, this.syncDate);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.PregnancyDetailsTable.COLUMN_SE1, new JSONObject(sE1toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json
                .put("e101a", e101a)
                .put("e101a", e101b)
                .put("e101", e101)
                .put("e102", e102)
                .put("e102a", e102a);

        return json.toString();
    }


    public PregnancyMaster Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_UUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_PROJECT_NAME));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_INDEXED));
        this.clusterCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SNO));
        this.msno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_M_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SYNCED_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyDetailsTable.COLUMN_SE1)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);

            this.e101a = json.getString("e101a");
            this.e101a = json.getString("e101a");
            this.e101 = json.getString("e101");
            this.e102 = json.getString("e102");
            this.e102a = json.getString("e102a");

        }
    }


}
