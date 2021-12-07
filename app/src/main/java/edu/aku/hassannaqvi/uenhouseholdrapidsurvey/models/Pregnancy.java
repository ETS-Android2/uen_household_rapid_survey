package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.selectedMWRA;

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

public class Pregnancy extends BaseObservable implements Observable {

    private final String TAG = "Pregnancy";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
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
    private String psuCode = _EMPTY_;
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
    private String e103 = _EMPTY_;
    private String e104 = _EMPTY_;
    private String e105 = _EMPTY_;
    private String e106d = _EMPTY_;
    private String e106m = _EMPTY_;
    private String e106y = _EMPTY_;
    private String e107 = _EMPTY_;
    private String e109 = _EMPTY_;
    private String e108 = _EMPTY_;
    private String e110y = _EMPTY_;
    private String e110m = _EMPTY_;
    private String e110d = _EMPTY_;
    private String e111 = _EMPTY_;
    private String e11196x = _EMPTY_;
    private String e112 = _EMPTY_;
    private String e113y = _EMPTY_;
    private String e113m = _EMPTY_;
    private String e114 = _EMPTY_;
    private String e115 = _EMPTY_;


    public void Pregnancy() {
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
        setpsuCode(MainApp.selectedPSU);
        setHhid(MainApp.selectedHHID);
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

    public void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
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
        setE102(e101.equals("2") ? "" : this.e102);
        setE102a(e101.equals("2") ? "" : this.e102a);
        setE103(e101.equals("2") ? "" : this.e103);
        setE104(e101.equals("2") ? "" : this.e104);
        setE105(e101.equals("2") ? "" : this.e105);
        setE106d(e101.equals("2") ? "" : this.e106d);
        setE106m(e101.equals("2") ? "" : this.e106m);
        setE106y(e101.equals("2") ? "" : this.e106y);
        setE107(e101.equals("2") ? "" : this.e107);
        setE108(e101.equals("2") ? "" : this.e108);
        setE109(e101.equals("2") ? "" : this.e109);
        setE110d(e101.equals("2") ? "" : this.e110d);
        setE110m(e101.equals("2") ? "" : this.e110m);
        setE110y(e101.equals("2") ? "" : this.e110y);
        setE111(e101.equals("2") ? "" : this.e111);
        setE112(e101.equals("2") ? "" : this.e112);
        setE113m(e101.equals("2") ? "" : this.e113m);
        setE113y(e101.equals("2") ? "" : this.e113y);
        setE114(e101.equals("2") ? "" : this.e114);
        setE115(e101.equals("2") ? "" : this.e115);
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

    @Bindable
    public String getE103() {
        return e103;
    }

    public void setE103(String e103) {
        this.e103 = e103;
        notifyPropertyChanged(BR.e103);
    }

    @Bindable
    public String getE104() {
        return e104;
    }

    public void setE104(String e104) {
        this.e104 = e104;
        notifyPropertyChanged(BR.e104);
    }

    @Bindable
    public String getE105() {
        return e105;
    }

    public void setE105(String e105) {
        this.e105 = e105;
        boolean b = e105.equals("2") || e105.equals("5") || e105.equals("6");
        setE106d(b ? "" : this.e106d);
        setE106m(b ? "" : this.e106m);
        setE106y(b ? "" : this.e106y);
        setE107(b ? "" : this.e107);
        setE108(b ? "" : this.e108);
        setE109(b ? "" : this.e109);
        setE110d(b ? "" : this.e110d);
        setE110m(b ? "" : this.e110m);
        setE110y(b ? "" : this.e110y);
        setE111(e105.equals("6") ? "" : this.e111);
        setE112(e105.equals("6") ? "" : this.e112);
        notifyPropertyChanged(BR.e105);
    }

    @Bindable
    public String getE106d() {
        return e106d;
    }

    public void setE106d(String e106d) {
        this.e106d = e106d;
        notifyPropertyChanged(BR.e106d);
    }

    @Bindable
    public String getE106m() {
        return e106m;
    }

    public void setE106m(String e106m) {
        this.e106m = e106m;
        notifyPropertyChanged(BR.e106m);
    }

    @Bindable
    public String getE106y() {
        return e106y;
    }

    public void setE106y(String e106y) {
        this.e106y = e106y;
        notifyPropertyChanged(BR.e106y);
    }

    @Bindable
    public String getE107() {
        return e107;
    }

    public void setE107(String e107) {
        this.e107 = e107;
        notifyPropertyChanged(BR.e107);
    }

    @Bindable
    public String getE109() {
        return e109;
    }

    public void setE109(String e109) {
        this.e109 = e109;
        notifyPropertyChanged(BR.e109);
    }

    @Bindable
    public String getE108() {
        return e108;
    }

    public void setE108(String e108) {
        this.e108 = e108;
        notifyPropertyChanged(BR.e108);
    }

    @Bindable
    public String getE110y() {
        return e110y;
    }

    public void setE110y(String e110y) {
        this.e110y = e110y;
        notifyPropertyChanged(BR.e110y);
    }

    @Bindable
    public String getE110m() {
        return e110m;
    }

    public void setE110m(String e110m) {
        this.e110m = e110m;
        notifyPropertyChanged(BR.e110m);
    }

    @Bindable
    public String getE110d() {
        return e110d;
    }

    public void setE110d(String e110d) {
        this.e110d = e110d;
        notifyPropertyChanged(BR.e110d);
    }

    @Bindable
    public String getE111() {
        return e111;
    }

    public void setE111(String e111) {
        this.e111 = e111;
        setE11196x(e111.equals("96") ? this.e11196x : "");
        notifyPropertyChanged(BR.e111);
    }

    @Bindable
    public String getE11196x() {
        return e11196x;
    }

    public void setE11196x(String e11196x) {
        this.e11196x = e11196x;
        notifyPropertyChanged(BR.e11196x);
    }

    @Bindable
    public String getE112() {
        return e112;
    }

    public void setE112(String e112) {
        this.e112 = e112;
        notifyPropertyChanged(BR.e112);
    }

    @Bindable
    public String getE113y() {
        return e113y;
    }

    public void setE113y(String e113y) {
        this.e113y = e113y;
        notifyPropertyChanged(BR.e113y);
    }

    @Bindable
    public String getE113m() {
        return e113m;
    }

    public void setE113m(String e113m) {
        this.e113m = e113m;
        notifyPropertyChanged(BR.e113m);
    }

    @Bindable
    public String getE114() {
        return e114;
    }

    public void setE114(String e114) {
        this.e114 = e114;
        notifyPropertyChanged(BR.e114);
    }

    @Bindable
    public String getE115() {
        return e115;
    }

    public void setE115(String e115) {
        this.e115 = e115;
        notifyPropertyChanged(BR.e115);
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.PregnancyTable.COLUMN_ID, this.id);
        json.put(TableContracts.PregnancyTable.COLUMN_UID, this.uid);
        json.put(TableContracts.PregnancyTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.PregnancyTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.PregnancyTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.PregnancyTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.PregnancyTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.PregnancyTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.PregnancyTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.PregnancyTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.PregnancyTable.COLUMN_M_SNO, this.msno);
        json.put(TableContracts.PregnancyTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.PregnancyTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.PregnancyTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.PregnancyTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.PregnancyTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.PregnancyTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.PregnancyTable.COLUMN_SYSDATE, this.syncDate);
        json.put(TableContracts.PregnancyTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.PregnancyTable.COLUMN_SE1, new JSONObject(sE1toString()));
        return json;
    }

    public String sE1toString() throws JSONException {
        Log.d(TAG, "sE1toString: ");
        JSONObject json = new JSONObject();
        json.put("e101a", e101a)
                .put("e101b", e101b)
                .put("e101", e101)
                .put("e102", e102)
                .put("e102a", e102a)
                .put("e103", e103)
                .put("e104", e104)
                .put("e105", e105)
                .put("e106d", e106d)
                .put("e106m", e106m)
                .put("e106y", e106y)
                .put("e107", e107)
                .put("e109", e109)
                .put("e108", e108)
                .put("e110y", e110y)
                .put("e110m", e110m)
                .put("e110d", e110d)
                .put("e111", e111)
                .put("e11196x", e11196x)
                .put("e112", e112)
                .put("e113y", e113y)
                .put("e113m", e113m)
                .put("e114", e114)
                .put("e115", e115);
        return json.toString();
    }


    public Pregnancy Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_UUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_PROJECT_NAME));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_INDEXED));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_HHID));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SNO));
        this.msno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_M_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SYNCED_DATE));

        sE1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.PregnancyTable.COLUMN_SE1)));
        return this;
    }

    public void sE1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sE1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.e101a = json.getString("e101a");
            this.e101b = json.getString("e101b");
            this.e101 = json.getString("e101");
            this.e102 = json.getString("e102");
            this.e102a = json.getString("e102a");
            this.e103 = json.getString("e103");
            this.e104 = json.getString("e104");
            this.e105 = json.getString("e105");
            this.e106d = json.getString("e106d");
            this.e106m = json.getString("e106m");
            this.e106y = json.getString("e106y");
            this.e107 = json.getString("e107");
            this.e109 = json.getString("e109");
            this.e108 = json.getString("e108");
            this.e110y = json.getString("e110y");
            this.e110m = json.getString("e110m");
            this.e110d = json.getString("e110d");
            this.e111 = json.getString("e111");
            this.e11196x = json.getString("e11196x");
            this.e112 = json.getString("e112");
            this.e113y = json.getString("e113y");
            this.e113m = json.getString("e113m");
            this.e114 = json.getString("e114");
            this.e115 = json.getString("e115");
        }
    }


}
