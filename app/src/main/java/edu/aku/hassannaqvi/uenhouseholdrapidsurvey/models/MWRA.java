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

import java.time.LocalDate;

import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.BR;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts;
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp;

public class MWRA extends BaseObservable implements Observable {

    private final String TAG = "MWRA";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    //Not saving in DB
    private final LocalDate localDate = null;
    private final boolean exist = false;
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    // private String muid = _EMPTY_;
    private String cluster = _EMPTY_;
    private String hhid = _EMPTY_;
    private String sno = _EMPTY_;
    private String psuCode = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
    private String deviceId = _EMPTY_;
    private String deviceTag = _EMPTY_;
    private String appver = _EMPTY_;
    private String endTime = _EMPTY_;
    private String iStatus = _EMPTY_;
    private String iStatus96x = _EMPTY_;
    private String synced = _EMPTY_;
    private String syncDate = _EMPTY_;

    //Section Vaiables
    private String sF = _EMPTY_;
    private String sG = _EMPTY_;
    private String sH1 = _EMPTY_;
    private String sH2 = _EMPTY_;
    private String sK = _EMPTY_;
    private String sL = _EMPTY_;


    // Field Variables bs1

    private String f101 = _EMPTY_;
    private String f101a = _EMPTY_;
    private String f101a01 = _EMPTY_;
    private String f101a02 = _EMPTY_;
    private String f101a03 = _EMPTY_;
    private String f101a04 = _EMPTY_;
    private String f101a05 = _EMPTY_;
    private String f101a06 = _EMPTY_;
    private String f101a07 = _EMPTY_;
    private String f101a08 = _EMPTY_;
    private String f101a09 = _EMPTY_;
    private String f101a10 = _EMPTY_;
    private String f101a11 = _EMPTY_;
    private String f101a12 = _EMPTY_;
    private String f101a13 = _EMPTY_;
    private String f101a14 = _EMPTY_;
    private String f101a96 = _EMPTY_;
    private String f101b = _EMPTY_;
    private String f101b01x = _EMPTY_;
    private String f102 = _EMPTY_;
    private String f10201 = _EMPTY_;
    private String f10202 = _EMPTY_;
    private String f10203 = _EMPTY_;
    private String f10204 = _EMPTY_;
    private String f10205 = _EMPTY_;
    private String f10206 = _EMPTY_;
    private String f10207 = _EMPTY_;
    private String f10208 = _EMPTY_;
    private String f10209 = _EMPTY_;
    private String f10210 = _EMPTY_;
    private String f10296 = _EMPTY_;
    private String f10296x = _EMPTY_;
    private String f103 = _EMPTY_;
    private String f10301 = _EMPTY_;
    private String f10302 = _EMPTY_;
    private String f10303 = _EMPTY_;
    private String f10304 = _EMPTY_;
    private String f10305 = _EMPTY_;
    private String f107 = _EMPTY_;
    private String f10796x = _EMPTY_;
    private String f108 = _EMPTY_;
    private String f108wx = _EMPTY_;
    private String f108mx = _EMPTY_;
    private String f11001 = _EMPTY_;
    private String f11002 = _EMPTY_;
    private String f11003 = _EMPTY_;
    private String f11004 = _EMPTY_;
    private String f11005 = _EMPTY_;
    private String f11006 = _EMPTY_;
    private String f11007 = _EMPTY_;
    private String f11008 = _EMPTY_;
    private String f11009 = _EMPTY_;
    private String f11096 = _EMPTY_;
    private String f1109696x = _EMPTY_;
    private String f111 = _EMPTY_;
    private String f112 = _EMPTY_;
    private String f113 = _EMPTY_;
    private String f11301x = _EMPTY_;
    private String f114 = _EMPTY_;
    private String f116 = _EMPTY_;
    private String f117 = _EMPTY_;
    private String f118m = _EMPTY_;
    private String f118d = _EMPTY_;
    private String f119 = _EMPTY_;
    private String f120 = _EMPTY_;
    private String f12001x = _EMPTY_;
    private String f121a = _EMPTY_;
    private String f121b = _EMPTY_;
    private String f121b96x = _EMPTY_;
    private String f122 = _EMPTY_;
    private String f12201x = _EMPTY_;
    private String f123 = _EMPTY_;
    private String f12301 = _EMPTY_;
    private String f12302 = _EMPTY_;
    private String f12303 = _EMPTY_;
    private String f12304 = _EMPTY_;
    private String f12305 = _EMPTY_;
    private String f12306 = _EMPTY_;
    private String f12307 = _EMPTY_;
    private String f12308 = _EMPTY_;
    private String f12309 = _EMPTY_;
    private String f128 = _EMPTY_;
    private String f12801 = _EMPTY_;
    private String f12802 = _EMPTY_;
    private String f12803 = _EMPTY_;
    private String f12804 = _EMPTY_;
    private String f12805 = _EMPTY_;
    private String f12806 = _EMPTY_;
    private String f12807 = _EMPTY_;
    private String f129 = _EMPTY_;
    private String f130 = _EMPTY_;
    private String f13001 = _EMPTY_;
    private String f13002 = _EMPTY_;
    private String f13003 = _EMPTY_;
    private String f13004 = _EMPTY_;
    private String f13005 = _EMPTY_;
    private String f13006 = _EMPTY_;
    private String f13007 = _EMPTY_;
    private String f13008 = _EMPTY_;
    private String f13009 = _EMPTY_;
    private String f13010 = _EMPTY_;
    private String f13011 = _EMPTY_;
    private String f13012 = _EMPTY_;
    private String f13013 = _EMPTY_;
    private String f13014 = _EMPTY_;
    private String f13096 = _EMPTY_;
    private String f13096x = _EMPTY_;
    private String f131 = _EMPTY_;
    private String f131a = _EMPTY_;
    private String f134 = _EMPTY_;
    private String f13401 = _EMPTY_;
    private String f13402 = _EMPTY_;
    private String f13403 = _EMPTY_;
    private String f13404 = _EMPTY_;
    private String f13405 = _EMPTY_;
    private String f13406 = _EMPTY_;
    private String f13407 = _EMPTY_;
    private String f13408 = _EMPTY_;
    private String f13409 = _EMPTY_;
    private String g101 = _EMPTY_;
    private String g102 = _EMPTY_;
    private String g103 = _EMPTY_;
    private String g10301 = _EMPTY_;
    private String g10302 = _EMPTY_;
    private String g10303 = _EMPTY_;
    private String g10304 = _EMPTY_;
    private String g10305 = _EMPTY_;
    private String g10306 = _EMPTY_;
    private String g10307 = _EMPTY_;
    private String g10308 = _EMPTY_;
    private String g10309 = _EMPTY_;
    private String g10310 = _EMPTY_;
    private String g10311 = _EMPTY_;
    private String g10312 = _EMPTY_;
    private String g10313 = _EMPTY_;
    private String g10314 = _EMPTY_;
    private String g10396 = _EMPTY_;
    private String g10396x = _EMPTY_;
    private String g104 = _EMPTY_;
    private String g10496x = _EMPTY_;
    private String g105 = _EMPTY_;
    private String g10501x = _EMPTY_;
    private String g106 = _EMPTY_;
    private String g107 = _EMPTY_;
    private String g10701x = _EMPTY_;
    private String g108 = _EMPTY_;
    private String g109 = _EMPTY_;
    private String g110 = _EMPTY_;
    private String g126 = _EMPTY_;
    private String g113 = _EMPTY_;
    private String g114 = _EMPTY_;
    private String g11496x = _EMPTY_;
    private String g115 = _EMPTY_;
    private String g116 = _EMPTY_;
    private String g117 = _EMPTY_;
    private String g117hx = _EMPTY_;
    private String g117mx = _EMPTY_;
    private String g117dx = _EMPTY_;
    private String g118 = _EMPTY_;
    private String g11801 = _EMPTY_;
    private String g11801x = _EMPTY_;
    private String g11802 = _EMPTY_;
    private String g11802x = _EMPTY_;
    private String g11803 = _EMPTY_;
    private String g11803x = _EMPTY_;
    private String g11804 = _EMPTY_;
    private String g11804x = _EMPTY_;
    private String g11896 = _EMPTY_;
    private String g11896x = _EMPTY_;
    private String g11898 = _EMPTY_;
    private String g119 = _EMPTY_;
    private String g120 = _EMPTY_;
    private String g12096x = _EMPTY_;
    private String g121 = _EMPTY_;
    private String g12196x = _EMPTY_;
    private String g124 = _EMPTY_;
    private String g12401 = _EMPTY_;
    private String g12402 = _EMPTY_;
    private String g12403 = _EMPTY_;
    private String g12404 = _EMPTY_;
    private String g12405 = _EMPTY_;
    private String g12406 = _EMPTY_;
    private String g12407 = _EMPTY_;
    private String g12408 = _EMPTY_;
    private String g12409 = _EMPTY_;
    private String g12410 = _EMPTY_;
    private String g12411 = _EMPTY_;
    private String g12412 = _EMPTY_;
    private String g12413 = _EMPTY_;
    private String g128 = _EMPTY_;
    private String g129 = _EMPTY_;
    private String h101 = _EMPTY_;
    private String h101mx = _EMPTY_;
    private String h101wx = _EMPTY_;
    private String h102 = _EMPTY_;
    private String h103 = _EMPTY_;
    private String h10401 = _EMPTY_;
    private String h10402 = _EMPTY_;
    private String h10403 = _EMPTY_;
    private String h10496 = _EMPTY_;
    private String h10496x = _EMPTY_;
    private String h105 = _EMPTY_;
    private String h106 = _EMPTY_;
    private String h1061x = _EMPTY_;
    private String h107 = _EMPTY_;
    private String h108 = _EMPTY_;
    private String h10896x = _EMPTY_;
    private String h109 = _EMPTY_;
    private String h10901 = _EMPTY_;
    private String h10902 = _EMPTY_;
    private String h10903 = _EMPTY_;
    private String h10904 = _EMPTY_;
    private String h10905 = _EMPTY_;
    private String h10906 = _EMPTY_;
    private String h10907 = _EMPTY_;
    private String h10997 = _EMPTY_;
    private String h10996 = _EMPTY_;
    private String h10996x = _EMPTY_;
    private String h110 = _EMPTY_;
    private String h111 = _EMPTY_;
    private String h112 = _EMPTY_;
    private String h113 = _EMPTY_;
    private String h114 = _EMPTY_;
    private String h115 = _EMPTY_;
    private String h11501 = _EMPTY_;
    private String h11502 = _EMPTY_;
    private String h11503 = _EMPTY_;
    private String h11504 = _EMPTY_;
    private String h11505 = _EMPTY_;
    private String h11506 = _EMPTY_;
    private String h11507 = _EMPTY_;
    private String h11508 = _EMPTY_;
    private String h11509 = _EMPTY_;
    private String h11596 = _EMPTY_;
    private String h11596x = _EMPTY_;
    private String h116 = _EMPTY_;
    private String h11701 = _EMPTY_;
    private String h118 = _EMPTY_;
    private String h119 = _EMPTY_;
    private String h120 = _EMPTY_;
    private String h121 = _EMPTY_;
    private String h122 = _EMPTY_;
    private String h1221x = _EMPTY_;
    private String h123 = _EMPTY_;
    private String h124 = _EMPTY_;
    private String h125 = _EMPTY_;
    private String h126 = _EMPTY_;
    private String h127 = _EMPTY_;
    private String h128 = _EMPTY_;
    private String h12896x = _EMPTY_;
    private String h12901 = _EMPTY_;
    private String h12902 = _EMPTY_;
    private String h12903 = _EMPTY_;
    private String h12904 = _EMPTY_;
    private String h12905 = _EMPTY_;
    private String h12906 = _EMPTY_;
    private String h132 = _EMPTY_;
    private String h132a = _EMPTY_;
    private String h132a96x = _EMPTY_;
    private String h133 = _EMPTY_;
    private String h13301 = _EMPTY_;
    private String h13302 = _EMPTY_;
    private String h13303 = _EMPTY_;
    private String h13304 = _EMPTY_;
    private String h13305 = _EMPTY_;
    private String h13306 = _EMPTY_;
    private String h13307 = _EMPTY_;
    private String h13308 = _EMPTY_;
    private String h13309 = _EMPTY_;
    private String h135 = _EMPTY_;
    private String h13501 = _EMPTY_;
    private String h13502 = _EMPTY_;
    private String h13503 = _EMPTY_;
    private String h13504 = _EMPTY_;
    private String h13505 = _EMPTY_;
    private String h13506 = _EMPTY_;
    private String h13507 = _EMPTY_;
    private String h13508 = _EMPTY_;
    private String h13509 = _EMPTY_;
    private String h13598 = _EMPTY_;
    private String h136 = _EMPTY_;
    private String h13601 = _EMPTY_;
    private String h13602 = _EMPTY_;
    private String h13603 = _EMPTY_;
    private String h13604 = _EMPTY_;
    private String h13605 = _EMPTY_;
    private String h13606 = _EMPTY_;
    private String h13696 = _EMPTY_;
    private String h13696x = _EMPTY_;
    private String h137 = _EMPTY_;
    private String h137a = _EMPTY_;
    private String h137a96x = _EMPTY_;
    private String h137b = _EMPTY_;
    private String h137b96x = _EMPTY_;
    private String h137c = _EMPTY_;
    private String h137c96x = _EMPTY_;
    private String h201 = _EMPTY_;
    private String h201hx = _EMPTY_;
    private String h201dx = _EMPTY_;
    private String h201wx = _EMPTY_;
    private String h202 = _EMPTY_;
    private String h203h = _EMPTY_;
    private String h203d = _EMPTY_;
    private String h203w = _EMPTY_;
    private String h204 = _EMPTY_;
    private String h205 = _EMPTY_;
    private String h20596x = _EMPTY_;
    private String h207 = _EMPTY_;
    private String h20701 = _EMPTY_;
    private String h20702 = _EMPTY_;
    private String h20703 = _EMPTY_;
    private String h20704 = _EMPTY_;
    private String h20705 = _EMPTY_;
    private String h20706 = _EMPTY_;
    private String h20707 = _EMPTY_;
    private String h20708 = _EMPTY_;
    private String h20798 = _EMPTY_;
    private String h208 = _EMPTY_;
    private String h20801 = _EMPTY_;
    private String h20802 = _EMPTY_;
    private String h20803 = _EMPTY_;
    private String h20804 = _EMPTY_;
    private String h20805 = _EMPTY_;
    private String h20806 = _EMPTY_;
    private String h20896 = _EMPTY_;
    private String h209 = _EMPTY_;
    private String h209a = _EMPTY_;
    private String h210 = _EMPTY_;
    private String h211 = _EMPTY_;
    private String h212 = _EMPTY_;
    private String h213 = _EMPTY_;
    private String h214 = _EMPTY_;
    private String h214a = _EMPTY_;
    private String h214b = _EMPTY_;
    private String h214b01 = _EMPTY_;
    private String h214b02 = _EMPTY_;
    private String h214b03 = _EMPTY_;
    private String h214b04 = _EMPTY_;
    private String h214b05 = _EMPTY_;
    private String h214b06 = _EMPTY_;
    private String h214b96 = _EMPTY_;
    private String h214b96x = _EMPTY_;
    private String h214b98 = _EMPTY_;
    private String h215 = _EMPTY_;
    private String h216 = _EMPTY_;
    private String h216a = _EMPTY_;
    private String h216a96x = _EMPTY_;
    private String h217 = _EMPTY_;
    private String h21701 = _EMPTY_;
    private String h21702 = _EMPTY_;
    private String h21703 = _EMPTY_;
    private String h21704 = _EMPTY_;
    private String h21705 = _EMPTY_;
    private String h21706 = _EMPTY_;
    private String h21796 = _EMPTY_;
    private String h21796x = _EMPTY_;
    private String h218 = _EMPTY_;
    private String h219 = _EMPTY_;
    private String h21996x = _EMPTY_;
    private String h220 = _EMPTY_;
    private String h2201 = _EMPTY_;
    private String h2201x = _EMPTY_;
    private String h2202 = _EMPTY_;
    private String h2202x = _EMPTY_;
    private String h2203 = _EMPTY_;
    private String h2203x = _EMPTY_;
    private String h2204 = _EMPTY_;
    private String h2204x = _EMPTY_;
    private String h2205 = _EMPTY_;
    private String h2205x = _EMPTY_;
    private String h2206 = _EMPTY_;
    private String h2206x = _EMPTY_;
    private String h22096 = _EMPTY_;
    private String h22096x = _EMPTY_;
    private String h221 = _EMPTY_;
    private String h222 = _EMPTY_;
    private String h223 = _EMPTY_;
    private String k101 = _EMPTY_;
    private String k101a = _EMPTY_;
    private String k101a01 = _EMPTY_;
    private String k101a02 = _EMPTY_;
    private String k101a03 = _EMPTY_;
    private String k101a04 = _EMPTY_;
    private String k101a05 = _EMPTY_;
    private String k101a06 = _EMPTY_;
    private String k101a07 = _EMPTY_;
    private String k101a08 = _EMPTY_;
    private String k101a09 = _EMPTY_;
    private String k101a10 = _EMPTY_;
    private String k101a11 = _EMPTY_;
    private String k101a12 = _EMPTY_;
    private String k101a13 = _EMPTY_;
    private String k101a96 = _EMPTY_;
    private String k101a96x = _EMPTY_;
    private String k102 = _EMPTY_;
    private String k104a = _EMPTY_;
    private String k104a01 = _EMPTY_;
    private String k104a02 = _EMPTY_;
    private String k104a03 = _EMPTY_;
    private String k104a04 = _EMPTY_;
    private String k104a05 = _EMPTY_;
    private String k104a06 = _EMPTY_;
    private String k104a77 = _EMPTY_;
    private String k104a08 = _EMPTY_;
    private String k104a09 = _EMPTY_;
    private String k104a10 = _EMPTY_;
    private String k104a11 = _EMPTY_;
    private String k104a12 = _EMPTY_;
    private String k104a13 = _EMPTY_;
    private String k103 = _EMPTY_;
    private String k104b = _EMPTY_;
    private String k104b01 = _EMPTY_;
    private String k104b02 = _EMPTY_;
    private String k104b03 = _EMPTY_;
    private String k104b04 = _EMPTY_;
    private String k104b05 = _EMPTY_;
    private String k104b06 = _EMPTY_;
    private String k104b07 = _EMPTY_;
    private String k104b08 = _EMPTY_;
    private String k104b09 = _EMPTY_;
    private String k104b10 = _EMPTY_;
    private String k104b11 = _EMPTY_;
    private String k104b12 = _EMPTY_;
    private String k104b13 = _EMPTY_;
    private String k105 = _EMPTY_;
    private String k105a = _EMPTY_;
    private String k105a01x = _EMPTY_;
    private String k105a02x = _EMPTY_;
    private String k106 = _EMPTY_;
    private String k10601 = _EMPTY_;
    private String k10602 = _EMPTY_;
    private String k10603 = _EMPTY_;
    private String k10604 = _EMPTY_;
    private String k10605 = _EMPTY_;
    private String k10606 = _EMPTY_;
    private String k10607 = _EMPTY_;
    private String k10608 = _EMPTY_;
    private String k10696 = _EMPTY_;
    private String k10696x = _EMPTY_;
    private String k107 = _EMPTY_;
    private String k107a = _EMPTY_;
    private String k107a96x = _EMPTY_;
    private String l101 = _EMPTY_;
    private String l102 = _EMPTY_;
    private String l102a = _EMPTY_;
    private String l102a96x = _EMPTY_;
    private String l103 = _EMPTY_;
    private String l104 = _EMPTY_;
    private String l10496x = _EMPTY_;
    private String l105 = _EMPTY_;
    private String l106 = _EMPTY_;
    private String l10696x = _EMPTY_;
    private String l107 = _EMPTY_;
    private String l10796x = _EMPTY_;
    private String l108 = _EMPTY_;
    private String l10896x = _EMPTY_;
    private String l109 = _EMPTY_;
    private String l10996x = _EMPTY_;
    private String l110 = _EMPTY_;
    private String l111 = _EMPTY_;
    private String l1121 = _EMPTY_;
    private String l1122 = _EMPTY_;
    private String l1123 = _EMPTY_;
    private String l1124 = _EMPTY_;
    private String l1125 = _EMPTY_;
    private String l1131 = _EMPTY_;
    private String l1132 = _EMPTY_;
    private String l1133 = _EMPTY_;
    private String l1134 = _EMPTY_;
    private String l114 = _EMPTY_;
    private String l11496x = _EMPTY_;
    private String l115 = _EMPTY_;
    private String l11596x = _EMPTY_;
    private String l116 = _EMPTY_;
    private String l11696x = _EMPTY_;
    private String l117 = _EMPTY_;
    private String l11796x = _EMPTY_;

    // Constructor
    public void Mwra() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA)).getUid()); //// not applicable in Form table
        // setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA) - 1).getUid());  // not applicable in Form table
        setSno(selectedMWRA);
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
/*
    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }*/

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFmuid() {
        return fmuid;
    }

    public void setFmuid(String fmuid) {
        this.fmuid = fmuid;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
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

    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String indexed) {
        this.indexed = indexed;
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

    public String getpsuCode() {
        return psuCode;
    }

    private void setpsuCode(String psuCode) {
        this.psuCode = psuCode;
    }


    public String getsF() {
        return sF;
    }

    public void setsF(String sF) {
        this.sF = sF;
    }


    public String getsG() {
        return sG;
    }

    public void setsG(String sG) {
        this.sG = sG;
    }


    public String getsH1() {
        return sH1;
    }

    public void setsH1(String sH1) {
        this.sH1 = sH1;
    }


    public String getsH2() {
        return sH2;
    }

    public void setsH2(String sH2) {
        this.sH2 = sH2;
    }


    public String getsK() {
        return sK;
    }

    public void setsK(String sK) {
        this.sK = sK;
    }


    public String getsL() {
        return sL;
    }

    public void setsL(String sL) {
        this.sL = sL;
    }

    @Bindable
    public String getF101() {
        return f101;
    }

    public void setF101(String f101) {
        this.f101 = f101;
        // if F101 is yes
        setF101a01(f101.equals("1") ? "" : this.f101a01);
        setF101a02(f101.equals("1") ? "" : this.f101a02);
        setF101a03(f101.equals("1") ? "" : this.f101a03);
        setF101a04(f101.equals("1") ? "" : this.f101a04);
        setF101a05(f101.equals("1") ? "" : this.f101a05);
        setF101a06(f101.equals("1") ? "" : this.f101a06);
        setF101a07(f101.equals("1") ? "" : this.f101a07);
        setF101a08(f101.equals("1") ? "" : this.f101a08);
        setF101a09(f101.equals("1") ? "" : this.f101a09);
        setF101a10(f101.equals("1") ? "" : this.f101a10);
        setF101a11(f101.equals("1") ? "" : this.f101a11);
        setF101a12(f101.equals("1") ? "" : this.f101a12);
        setF101a13(f101.equals("1") ? "" : this.f101a13);
        setF101a14(f101.equals("1") ? "" : this.f101a14);
        setF101a96(f101.equals("1") ? "" : this.f101a96);
        setF101b(f101.equals("1") ? this.f101b : "");
        setF101b01x(f101.equals("1") ? this.f101b01x : "");

        // if F101 is No
        setF10201(f101.equals("2") ? this.f10201 : "");
        setF10202(f101.equals("2") ? this.f10202 : "");
        setF10203(f101.equals("2") ? this.f10203 : "");
        setF10204(f101.equals("2") ? this.f10204 : "");
        setF10205(f101.equals("2") ? this.f10205 : "");
        setF10206(f101.equals("2") ? this.f10206 : "");
        setF10207(f101.equals("2") ? this.f10207 : "");
        setF10208(f101.equals("2") ? this.f10208 : "");
        setF10209(f101.equals("2") ? this.f10209 : "");
        setF10210(f101.equals("2") ? this.f10210 : "");
        setF10296(f101.equals("2") ? this.f10296 : "");
        setF10296x(f101.equals("2") ? this.f10296x : "");
        setF10301(f101.equals("2") ? this.f10301 : "");
        setF10302(f101.equals("2") ? this.f10302 : "");
        setF10303(f101.equals("2") ? this.f10303 : "");
        setF10304(f101.equals("2") ? this.f10304 : "");
        setF10305(f101.equals("2") ? this.f10305 : "");
        setF107(f101.equals("2") ? this.f107 : "");
        setF10796x(f101.equals("2") ? this.f10796x : "");
        setF108(f101.equals("2") ? this.f108 : "");
        setF108wx(f101.equals("2") ? this.f108wx : "");
        setF108mx(f101.equals("2") ? this.f108mx : "");
        setF11001(f101.equals("2") ? this.f11001 : "");
        setF11002(f101.equals("2") ? this.f11002 : "");
        setF11003(f101.equals("2") ? this.f11003 : "");
        setF11004(f101.equals("2") ? this.f11004 : "");
        setF11005(f101.equals("2") ? this.f11005 : "");
        setF11006(f101.equals("2") ? this.f11006 : "");
        setF11007(f101.equals("2") ? this.f11007 : "");
        setF11008(f101.equals("2") ? this.f11008 : "");
        setF11009(f101.equals("2") ? this.f11009 : "");
        setF11096(f101.equals("2") ? this.f11096 : "");
        setF1109696x(f101.equals("2") ? this.f1109696x : "");

        notifyPropertyChanged(BR.f101);
    }

    @Bindable
    public String getF101a() {
        return f101a;
    }

    public void setF101a(String f101a) {
        this.f101a = f101a;
        notifyPropertyChanged(BR.f101a);
    }

    @Bindable
    public String getF101a01() {
        return f101a01;
    }

    public void setF101a01(String f101a01) {
        if (this.f101a01.equals(f101a01)) return;     // For all checkboxes
        this.f101a01 = f101a01;
        notifyPropertyChanged(BR.f101a01);
    }

    @Bindable
    public String getF101a02() {
        return f101a02;
    }

    public void setF101a02(String f101a02) {
        if (this.f101a02.equals(f101a02)) return;     // For all checkboxes
        this.f101a02 = f101a02;
        notifyPropertyChanged(BR.f101a02);
    }

    @Bindable
    public String getF101a03() {
        return f101a03;
    }

    public void setF101a03(String f101a03) {
        if (this.f101a03.equals(f101a03)) return;     // For all checkboxes
        this.f101a03 = f101a03;
        notifyPropertyChanged(BR.f101a03);
    }

    @Bindable
    public String getF101a04() {
        return f101a04;
    }

    public void setF101a04(String f101a04) {
        if (this.f101a04.equals(f101a04)) return;     // For all checkboxes
        this.f101a04 = f101a04;
        notifyPropertyChanged(BR.f101a04);
    }

    @Bindable
    public String getF101a05() {
        return f101a05;
    }

    public void setF101a05(String f101a05) {
        if (this.f101a05.equals(f101a05)) return;     // For all checkboxes
        this.f101a05 = f101a05;
        notifyPropertyChanged(BR.f101a05);
    }

    @Bindable
    public String getF101a06() {
        return f101a06;
    }

    public void setF101a06(String f101a06) {
        if (this.f101a06.equals(f101a06)) return;     // For all checkboxes
        this.f101a06 = f101a06;
        notifyPropertyChanged(BR.f101a06);
    }

    @Bindable
    public String getF101a07() {
        return f101a07;
    }

    public void setF101a07(String f101a07) {
        if (this.f101a07.equals(f101a07)) return;     // For all checkboxes
        this.f101a07 = f101a07;
        notifyPropertyChanged(BR.f101a07);
    }

    @Bindable
    public String getF101a08() {
        return f101a08;
    }

    public void setF101a08(String f101a08) {
        if (this.f101a08.equals(f101a08)) return;     // For all checkboxes
        this.f101a08 = f101a08;
        notifyPropertyChanged(BR.f101a08);
    }

    @Bindable
    public String getF101a09() {
        return f101a09;
    }

    public void setF101a09(String f101a09) {
        if (this.f101a09.equals(f101a09)) return;     // For all checkboxes
        this.f101a09 = f101a09;
        notifyPropertyChanged(BR.f101a09);
    }

    @Bindable
    public String getF101a10() {
        return f101a10;
    }

    public void setF101a10(String f101a10) {
        if (this.f101a10.equals(f101a10)) return;     // For all checkboxes
        this.f101a10 = f101a10;
        notifyPropertyChanged(BR.f101a10);
    }

    @Bindable
    public String getF101a11() {
        return f101a11;
    }

    public void setF101a11(String f101a11) {
        if (this.f101a11.equals(f101a11)) return;     // For all checkboxes
        this.f101a11 = f101a11;
        notifyPropertyChanged(BR.f101a11);
    }

    @Bindable
    public String getF101a12() {
        return f101a12;
    }

    public void setF101a12(String f101a12) {
        if (this.f101a12.equals(f101a12)) return;     // For all checkboxes
        this.f101a12 = f101a12;
        notifyPropertyChanged(BR.f101a12);
    }

    @Bindable
    public String getF101a13() {
        return f101a13;
    }

    public void setF101a13(String f101a13) {
        if (this.f101a13.equals(f101a13)) return;     // For all checkboxes
        this.f101a13 = f101a13;
        notifyPropertyChanged(BR.f101a13);
    }

    @Bindable
    public String getF101a14() {
        return f101a14;
    }

    public void setF101a14(String f101a14) {
        if (this.f101a14.equals(f101a14)) return;     // For all checkboxes
        this.f101a14 = f101a14;
        notifyPropertyChanged(BR.f101a14);
    }

    @Bindable
    public String getF101a96() {
        return f101a96;
    }

    public void setF101a96(String f101a96) {
        if (this.f101a96.equals(f101a96)) return;     // For all checkboxes
        this.f101a96 = f101a96;
        notifyPropertyChanged(BR.f101a96);
    }

    @Bindable
    public String getF101b() {
        return f101b;
    }

    public void setF101b(String f101b) {
        this.f101b = f101b;
        setF101b01x(f101b.equals("1") ? this.f101b01x : "");

        setF10201(f101b.equals("1") ? this.f10201 : "");
        setF10202(f101b.equals("1") ? this.f10202 : "");
        setF10203(f101b.equals("1") ? this.f10203 : "");
        setF10204(f101b.equals("1") ? this.f10204 : "");
        setF10205(f101b.equals("1") ? this.f10205 : "");
        setF10206(f101b.equals("1") ? this.f10206 : "");
        setF10207(f101b.equals("1") ? this.f10207 : "");
        setF10208(f101b.equals("1") ? this.f10208 : "");
        setF10209(f101b.equals("1") ? this.f10209 : "");
        setF10210(f101b.equals("1") ? this.f10210 : "");
        setF10296(f101b.equals("1") ? this.f10296 : "");
        setF10296x(f101b.equals("1") ? this.f10296x : "");
        setF10301(f101b.equals("1") ? this.f10301 : "");
        setF10302(f101b.equals("1") ? this.f10302 : "");
        setF10303(f101b.equals("1") ? this.f10303 : "");
        setF10304(f101b.equals("1") ? this.f10304 : "");
        setF10305(f101b.equals("1") ? this.f10305 : "");
        setF107(f101b.equals("1") ? this.f107 : "");
        setF10796x(f101b.equals("1") ? this.f10796x : "");
        setF108(f101b.equals("1") ? this.f108 : "");
        setF108wx(f101b.equals("1") ? this.f108wx : "");
        setF108mx(f101b.equals("1") ? this.f108mx : "");
        setF11001(f101b.equals("1") ? this.f11001 : "");
        setF11002(f101b.equals("1") ? this.f11002 : "");
        setF11003(f101b.equals("1") ? this.f11003 : "");
        setF11004(f101b.equals("1") ? this.f11004 : "");
        setF11005(f101b.equals("1") ? this.f11005 : "");
        setF11006(f101b.equals("1") ? this.f11006 : "");
        setF11007(f101b.equals("1") ? this.f11007 : "");
        setF11008(f101b.equals("1") ? this.f11008 : "");
        setF11009(f101b.equals("1") ? this.f11009 : "");
        setF11096(f101b.equals("1") ? this.f11096 : "");
        setF1109696x(f101b.equals("1") ? this.f1109696x : "");
        notifyPropertyChanged(BR.f101b);
    }

    @Bindable
    public String getF101b01x() {
        return f101b01x;
    }

    public void setF101b01x(String f101b01x) {
        this.f101b01x = f101b01x;

        notifyPropertyChanged(BR.f101b01x);
    }

    @Bindable
    public String getF102() {
        return f102;
    }

    public void setF102(String f102) {
        this.f102 = f102;
        notifyPropertyChanged(BR.f102);
    }

    @Bindable
    public String getF10201() {
        return f10201;
    }

    public void setF10201(String f10201) {
        if (this.f10201.equals(f10201)) return;     // For all checkboxes
        this.f10201 = f10201;
        notifyPropertyChanged(BR.f10201);
    }

    @Bindable
    public String getF10202() {
        return f10202;
    }

    public void setF10202(String f10202) {
        if (this.f10202.equals(f10202)) return;     // For all checkboxes
        this.f10202 = f10202;
        notifyPropertyChanged(BR.f10202);
    }

    @Bindable
    public String getF10203() {
        return f10203;
    }

    public void setF10203(String f10203) {
        if (this.f10203.equals(f10203)) return;     // For all checkboxes
        this.f10203 = f10203;
        notifyPropertyChanged(BR.f10203);
    }

    @Bindable
    public String getF10204() {
        return f10204;
    }

    public void setF10204(String f10204) {
        if (this.f10204.equals(f10204)) return;     // For all checkboxes
        this.f10204 = f10204;
        notifyPropertyChanged(BR.f10204);
    }

    @Bindable
    public String getF10205() {
        return f10205;
    }

    public void setF10205(String f10205) {
        if (this.f10205.equals(f10205)) return;     // For all checkboxes
        this.f10205 = f10205;
        notifyPropertyChanged(BR.f10205);
    }

    @Bindable
    public String getF10206() {
        return f10206;
    }

    public void setF10206(String f10206) {
        if (this.f10206.equals(f10206)) return;     // For all checkboxes
        this.f10206 = f10206;
        notifyPropertyChanged(BR.f10206);
    }

    @Bindable
    public String getF10207() {
        return f10207;
    }

    public void setF10207(String f10207) {
        if (this.f10207.equals(f10207)) return;     // For all checkboxes
        this.f10207 = f10207;
        notifyPropertyChanged(BR.f10207);
    }

    @Bindable
    public String getF10208() {
        return f10208;
    }

    public void setF10208(String f10208) {
        if (this.f10208.equals(f10208)) return;     // For all checkboxes
        this.f10208 = f10208;
        notifyPropertyChanged(BR.f10208);
    }

    @Bindable
    public String getF10209() {
        return f10209;
    }

    public void setF10209(String f10209) {
        if (this.f10209.equals(f10209)) return;     // For all checkboxes
        this.f10209 = f10209;
        notifyPropertyChanged(BR.f10209);
    }

    @Bindable
    public String getF10210() {
        return f10210;
    }

    public void setF10210(String f10210) {
        if (this.f10210.equals(f10210)) return;     // For all checkboxes
        this.f10210 = f10210;
        notifyPropertyChanged(BR.f10210);
    }

    @Bindable
    public String getF10296() {
        return f10296;
    }

    public void setF10296(String f10296) {
        if (this.f10296.equals(f10296)) return;     // For all checkboxes
        this.f10296 = f10296;
        setF10296x(f10296.equals("96") ? this.f10296x : "");
        notifyPropertyChanged(BR.f10296);
    }

    @Bindable
    public String getF10296x() {
        return f10296x;
    }

    public void setF10296x(String f10296x) {
        this.f10296x = f10296x;
        notifyPropertyChanged(BR.f10296x);
    }

    @Bindable
    public String getF103() {
        return f103;
    }

    public void setF103(String f103) {
        this.f103 = f103;
        notifyPropertyChanged(BR.f103);
    }

    @Bindable
    public String getF10301() {
        return f10301;
    }

    public void setF10301(String f10301) {
        if (this.f10301.equals(f10301)) return;     // For all checkboxes
        this.f10301 = f10301;
        notifyPropertyChanged(BR.f10301);
    }

    @Bindable
    public String getF10302() {
        return f10302;
    }

    public void setF10302(String f10302) {
        if (this.f10302.equals(f10302)) return;     // For all checkboxes
        this.f10302 = f10302;
        notifyPropertyChanged(BR.f10302);
    }

    @Bindable
    public String getF10303() {
        return f10303;
    }

    public void setF10303(String f10303) {
        if (this.f10303.equals(f10303)) return;     // For all checkboxes
        this.f10303 = f10303;
        notifyPropertyChanged(BR.f10303);
    }

    @Bindable
    public String getF10304() {
        return f10304;
    }

    public void setF10304(String f10304) {
        if (this.f10304.equals(f10304)) return;     // For all checkboxes
        this.f10304 = f10304;
        notifyPropertyChanged(BR.f10304);
    }

    @Bindable
    public String getF10305() {
        return f10305;
    }

    public void setF10305(String f10305) {
        if (this.f10305.equals(f10305)) return;     // For all checkboxes
        this.f10305 = f10305;
        notifyPropertyChanged(BR.f10305);
    }

    @Bindable
    public String getF107() {
        return f107;
    }

    public void setF107(String f107) {
        this.f107 = f107;
        setF10796x(f107.equals("96") ? this.f10796x : "");
        notifyPropertyChanged(BR.f107);
    }

    @Bindable
    public String getF10796x() {
        return f10796x;
    }

    public void setF10796x(String f10796x) {
        this.f10796x = f10796x;
        notifyPropertyChanged(BR.f10796x);
    }

    @Bindable
    public String getF108() {
        return f108;
    }

    public void setF108(String f108) {
        this.f108 = f108;
        setF108wx(f108.equals("1") ? this.f108wx : "");
        setF108mx(f108.equals("2") ? this.f108mx : "");

        notifyPropertyChanged(BR.f108);
    }

    @Bindable
    public String getF108wx() {
        return f108wx;
    }

    public void setF108wx(String f108wx) {
        this.f108wx = f108wx;
        notifyPropertyChanged(BR.f108wx);
    }

    @Bindable
    public String getF108mx() {
        return f108mx;
    }

    public void setF108mx(String f108mx) {
        this.f108mx = f108mx;
        notifyPropertyChanged(BR.f108mx);
    }

    @Bindable
    public String getF11001() {
        return f11001;
    }

    public void setF11001(String f11001) {
        this.f11001 = f11001;
        notifyPropertyChanged(BR.f11001);
    }

    @Bindable
    public String getF11002() {
        return f11002;
    }

    public void setF11002(String f11002) {
        this.f11002 = f11002;
        notifyPropertyChanged(BR.f11002);
    }

    @Bindable
    public String getF11003() {
        return f11003;
    }

    public void setF11003(String f11003) {
        this.f11003 = f11003;
        notifyPropertyChanged(BR.f11003);
    }

    @Bindable
    public String getF11004() {
        return f11004;
    }

    public void setF11004(String f11004) {
        this.f11004 = f11004;
        notifyPropertyChanged(BR.f11004);
    }

    @Bindable
    public String getF11005() {
        return f11005;
    }

    public void setF11005(String f11005) {
        this.f11005 = f11005;
        notifyPropertyChanged(BR.f11005);
    }

    @Bindable
    public String getF11006() {
        return f11006;
    }

    public void setF11006(String f11006) {
        this.f11006 = f11006;
        notifyPropertyChanged(BR.f11006);
    }

    @Bindable
    public String getF11007() {
        return f11007;
    }

    public void setF11007(String f11007) {
        this.f11007 = f11007;
        notifyPropertyChanged(BR.f11007);
    }

    @Bindable
    public String getF11008() {
        return f11008;
    }

    public void setF11008(String f11008) {
        this.f11008 = f11008;
        notifyPropertyChanged(BR.f11008);
    }

    @Bindable
    public String getF11009() {
        return f11009;
    }

    public void setF11009(String f11009) {
        this.f11009 = f11009;
        notifyPropertyChanged(BR.f11009);
    }

    @Bindable
    public String getF11096() {
        return f11096;
    }

    public void setF11096(String f11096) {
        this.f11096 = f11096;
        setF1109696x(f11096.equals("1") ? this.f1109696x : "");
        notifyPropertyChanged(BR.f11096);
    }

    @Bindable
    public String getF1109696x() {
        return f1109696x;
    }

    public void setF1109696x(String f1109696x) {
        this.f1109696x = f1109696x;
        notifyPropertyChanged(BR.f1109696x);
    }

    @Bindable
    public String getF111() {
        return f111;
    }

    public void setF111(String f111) {
        this.f111 = f111;
        notifyPropertyChanged(BR.f111);
    }

    @Bindable
    public String getF112() {
        return f112;
    }

    public void setF112(String f112) {
        this.f112 = f112;
        setF113(f112.equals("1") ? this.f113 : "");
        setF11301x(f112.equals("1") ? this.f11301x : "");
        notifyPropertyChanged(BR.f112);
    }

    @Bindable
    public String getF113() {
        return f113;
    }

    public void setF113(String f113) {
        this.f113 = f113;
        setF11301x(f113.equals("1") ? this.f11301x : "");
        notifyPropertyChanged(BR.f113);
    }

    @Bindable
    public String getF11301x() {
        return f11301x;
    }

    public void setF11301x(String f11301x) {
        this.f11301x = f11301x;
        notifyPropertyChanged(BR.f11301x);
    }

    @Bindable
    public String getF114() {
        return f114;
    }

    public void setF114(String f114) {
        this.f114 = f114;
        setF116(f114.equals("1") ? this.f116 : "");
        setF117(f114.equals("1") ? this.f117 : "");
        setF118m(f114.equals("1") ? this.f118m : "");
        setF118d(f114.equals("1") ? this.f118d : "");
        setF119(f114.equals("1") ? this.f119 : "");
        setF120(f114.equals("1") ? this.f120 : "");
        notifyPropertyChanged(BR.f114);
    }

    @Bindable
    public String getF116() {
        return f116;
    }

    public void setF116(String f116) {
        this.f116 = f116;
        notifyPropertyChanged(BR.f116);
    }

    @Bindable
    public String getF117() {
        return f117;
    }

    public void setF117(String f117) {
        this.f117 = f117;
        notifyPropertyChanged(BR.f117);
    }

    @Bindable
    public String getF118m() {
        return f118m;
    }

    public void setF118m(String f118m) {
        this.f118m = f118m;
        notifyPropertyChanged(BR.f118m);
    }

    @Bindable
    public String getF118d() {
        return f118d;
    }

    public void setF118d(String f118d) {
        this.f118d = f118d;
        notifyPropertyChanged(BR.f118d);
    }

    @Bindable
    public String getF119() {
        return f119;
    }

    public void setF119(String f119) {
        this.f119 = f119;
        setF120(f119.equals("1") ? this.f120 : "");
        notifyPropertyChanged(BR.f119);
    }

    @Bindable
    public String getF120() {
        return f120;
    }

    public void setF120(String f120) {
        setF12001x(f120.equals("1") ? this.f12001x : "");
        this.f120 = f120;
        notifyPropertyChanged(BR.f120);
    }

    @Bindable
    public String getF12001x() {
        return f12001x;
    }

    public void setF12001x(String f12001x) {
        this.f12001x = f12001x;
        notifyPropertyChanged(BR.f12001x);
    }

    @Bindable
    public String getF121a() {
        return f121a;
    }

    public void setF121a(String f121a) {
        this.f121a = f121a;
        setF121b(f121a.equals("1") ? "" : this.f121b);
        setF122(f121a.equals("2") ? "" : this.f122);
        setF12301(f121a.equals("2") ? "" : this.f12301);
        setF12302(f121a.equals("2") ? "" : this.f12302);
        setF12303(f121a.equals("2") ? "" : this.f12303);
        setF12304(f121a.equals("2") ? "" : this.f12304);
        setF12305(f121a.equals("2") ? "" : this.f12305);
        setF12306(f121a.equals("2") ? "" : this.f12306);
        setF12307(f121a.equals("2") ? "" : this.f12307);
        setF12308(f121a.equals("2") ? "" : this.f12308);
        setF12309(f121a.equals("2") ? "" : this.f12309);

        notifyPropertyChanged(BR.f121a);
    }

    @Bindable
    public String getF121b() {
        return f121b;
    }

    public void setF121b(String f121b) {
        this.f121b = f121b;
        notifyPropertyChanged(BR.f121b);
    }

    @Bindable
    public String getF121b96x() {
        return f121b96x;
    }

    public void setF121b96x(String f121b96x) {
        this.f121b96x = f121b96x;
        notifyPropertyChanged(BR.f121b96x);
    }

    @Bindable
    public String getF122() {
        return f122;
    }

    public void setF122(String f122) {
        this.f122 = f122;
        setF12201x(f122.equals("1") ? this.f12201x : "");
        notifyPropertyChanged(BR.f122);
    }

    @Bindable
    public String getF12201x() {
        return f12201x;
    }

    public void setF12201x(String f12201x) {
        this.f12201x = f12201x;
        notifyPropertyChanged(BR.f12201x);
    }

    @Bindable
    public String getF123() {
        return f123;
    }

    public void setF123(String f123) {
        this.f123 = f123;
        notifyPropertyChanged(BR.f123);
    }

    @Bindable
    public String getF12301() {
        return f12301;
    }

    public void setF12301(String f12301) {
        if (this.f12301.equals(f12301)) return;     // For all checkboxes
        this.f12301 = f12301;
        notifyPropertyChanged(BR.f12301);
    }

    @Bindable
    public String getF12302() {
        return f12302;
    }

    public void setF12302(String f12302) {
        if (this.f12302.equals(f12302)) return;     // For all checkboxes
        this.f12302 = f12302;
        notifyPropertyChanged(BR.f12302);
    }

    @Bindable
    public String getF12303() {
        return f12303;
    }

    public void setF12303(String f12303) {
        if (this.f12303.equals(f12303)) return;     // For all checkboxes
        this.f12303 = f12303;
        notifyPropertyChanged(BR.f12303);
    }

    @Bindable
    public String getF12304() {
        return f12304;
    }

    public void setF12304(String f12304) {
        if (this.f12304.equals(f12304)) return;     // For all checkboxes
        this.f12304 = f12304;
        notifyPropertyChanged(BR.f12304);
    }

    @Bindable
    public String getF12305() {
        return f12305;
    }

    public void setF12305(String f12305) {
        if (this.f12305.equals(f12305)) return;     // For all checkboxes
        this.f12305 = f12305;
        notifyPropertyChanged(BR.f12305);
    }

    @Bindable
    public String getF12306() {
        return f12306;
    }

    public void setF12306(String f12306) {
        if (this.f12306.equals(f12306)) return;     // For all checkboxes
        this.f12306 = f12306;
        notifyPropertyChanged(BR.f12306);
    }

    @Bindable
    public String getF12307() {
        return f12307;
    }

    public void setF12307(String f12307) {
        if (this.f12307.equals(f12307)) return;     // For all checkboxes
        this.f12307 = f12307;
        notifyPropertyChanged(BR.f12307);
    }

    @Bindable
    public String getF12308() {
        return f12308;
    }

    public void setF12308(String f12308) {
        if (this.f12308.equals(f12308)) return;     // For all checkboxes
        this.f12308 = f12308;
        notifyPropertyChanged(BR.f12308);
    }

    @Bindable
    public String getF12309() {
        return f12309;
    }

    public void setF12309(String f12309) {
        if (this.f12309.equals(f12309)) return;     // For all checkboxes
        this.f12309 = f12309;
        notifyPropertyChanged(BR.f12309);
    }

    @Bindable
    public String getF128() {
        return f128;
    }

    public void setF128(String f128) {
        this.f128 = f128;
        notifyPropertyChanged(BR.f128);
    }

    @Bindable
    public String getF12801() {
        return f12801;
    }

    public void setF12801(String f12801) {
        if (this.f12801.equals(f12801)) return;     // For all checkboxes
        this.f12801 = f12801;
        notifyPropertyChanged(BR.f12801);
    }

    @Bindable
    public String getF12802() {
        return f12802;
    }

    public void setF12802(String f12802) {
        if (this.f12802.equals(f12802)) return;     // For all checkboxes
        this.f12802 = f12802;
        notifyPropertyChanged(BR.f12802);
    }

    @Bindable
    public String getF12803() {
        return f12803;
    }

    public void setF12803(String f12803) {
        if (this.f12803.equals(f12803)) return;     // For all checkboxes
        this.f12803 = f12803;
        notifyPropertyChanged(BR.f12803);
    }

    @Bindable
    public String getF12804() {
        return f12804;
    }

    public void setF12804(String f12804) {
        if (this.f12804.equals(f12804)) return;     // For all checkboxes
        this.f12804 = f12804;
        notifyPropertyChanged(BR.f12804);
    }

    @Bindable
    public String getF12805() {
        return f12805;
    }

    public void setF12805(String f12805) {
        if (this.f12805.equals(f12805)) return;     // For all checkboxes
        this.f12805 = f12805;
        notifyPropertyChanged(BR.f12805);
    }

    @Bindable
    public String getF12806() {
        return f12806;
    }

    public void setF12806(String f12806) {
        if (this.f12806.equals(f12806)) return;     // For all checkboxes
        this.f12806 = f12806;
        notifyPropertyChanged(BR.f12806);
    }

    @Bindable
    public String getF12807() {
        return f12807;
    }

    public void setF12807(String f12807) {
        if (this.f12807.equals(f12807)) return;     // For all checkboxes
        this.f12807 = f12807;
        setF129(f12807.equals("7") ? "" : this.f129);
        setF12801(f12807.equals("7") ? "" : this.f12801);
        setF12802(f12807.equals("7") ? "" : this.f12802);
        setF12803(f12807.equals("7") ? "" : this.f12803);
        setF12804(f12807.equals("7") ? "" : this.f12804);
        setF12805(f12807.equals("7") ? "" : this.f12805);
        setF12806(f12807.equals("7") ? "" : this.f12806);
        setF13001(f12807.equals("7") ? "" : this.f13001);
        setF13002(f12807.equals("7") ? "" : this.f13002);
        setF13003(f12807.equals("7") ? "" : this.f13003);
        setF13004(f12807.equals("7") ? "" : this.f13004);
        setF13005(f12807.equals("7") ? "" : this.f13005);
        setF13006(f12807.equals("7") ? "" : this.f13006);
        setF13007(f12807.equals("7") ? "" : this.f13007);
        setF13008(f12807.equals("7") ? "" : this.f13008);
        setF13009(f12807.equals("7") ? "" : this.f13009);
        setF13010(f12807.equals("7") ? "" : this.f13010);
        setF13011(f12807.equals("7") ? "" : this.f13011);
        setF13012(f12807.equals("7") ? "" : this.f13012);
        setF13013(f12807.equals("7") ? "" : this.f13013);
        setF13014(f12807.equals("7") ? "" : this.f13014);
        setF13096(f12807.equals("7") ? "" : this.f13096);
        setF13096x(f12807.equals("7") ? "" : this.f13096x);
        notifyPropertyChanged(BR.f12807);
    }

    @Bindable
    public String getF129() {
        return f129;
    }

    public void setF129(String f129) {
        this.f129 = f129;
        setF13001(f129.equals("1") ? "" : this.f13001);
        setF13002(f129.equals("1") ? "" : this.f13002);
        setF13003(f129.equals("1") ? "" : this.f13003);
        setF13004(f129.equals("1") ? "" : this.f13004);
        setF13005(f129.equals("1") ? "" : this.f13005);
        setF13006(f129.equals("1") ? "" : this.f13006);
        setF13007(f129.equals("1") ? "" : this.f13007);
        setF13008(f129.equals("1") ? "" : this.f13008);
        setF13009(f129.equals("1") ? "" : this.f13009);
        setF13010(f129.equals("1") ? "" : this.f13010);
        setF13011(f129.equals("1") ? "" : this.f13011);
        setF13012(f129.equals("1") ? "" : this.f13012);
        setF13013(f129.equals("1") ? "" : this.f13013);
        setF13014(f129.equals("1") ? "" : this.f13014);
        setF13096(f129.equals("1") ? "" : this.f13096);
        setF13096x(f129.equals("1") ? "" : this.f13096x);
        notifyPropertyChanged(BR.f129);
    }

    @Bindable
    public String getF130() {
        return f130;
    }

    public void setF130(String f130) {
        this.f130 = f130;
        notifyPropertyChanged(BR.f130);
    }

    @Bindable
    public String getF13001() {
        return f13001;
    }

    public void setF13001(String f13001) {
        if (this.f13001.equals(f13001)) return;     // For all checkboxes
        this.f13001 = f13001;
        notifyPropertyChanged(BR.f13001);
    }

    @Bindable
    public String getF13002() {
        return f13002;
    }

    public void setF13002(String f13002) {
        if (this.f13002.equals(f13002)) return;     // For all checkboxes
        this.f13002 = f13002;
        notifyPropertyChanged(BR.f13002);
    }

    @Bindable
    public String getF13003() {
        return f13003;
    }

    public void setF13003(String f13003) {
        if (this.f13003.equals(f13003)) return;     // For all checkboxes
        this.f13003 = f13003;
        notifyPropertyChanged(BR.f13003);
    }

    @Bindable
    public String getF13004() {
        return f13004;
    }

    public void setF13004(String f13004) {
        if (this.f13004.equals(f13004)) return;     // For all checkboxes
        this.f13004 = f13004;
        notifyPropertyChanged(BR.f13004);
    }

    @Bindable
    public String getF13005() {
        return f13005;
    }

    public void setF13005(String f13005) {
        if (this.f13005.equals(f13005)) return;     // For all checkboxes
        this.f13005 = f13005;
        notifyPropertyChanged(BR.f13005);
    }

    @Bindable
    public String getF13006() {
        return f13006;
    }

    public void setF13006(String f13006) {
        if (this.f13006.equals(f13006)) return;     // For all checkboxes
        this.f13006 = f13006;
        notifyPropertyChanged(BR.f13006);
    }

    @Bindable
    public String getF13007() {
        return f13007;
    }

    public void setF13007(String f13007) {
        if (this.f13007.equals(f13007)) return;     // For all checkboxes
        this.f13007 = f13007;
        notifyPropertyChanged(BR.f13007);
    }

    @Bindable
    public String getF13008() {
        return f13008;
    }

    public void setF13008(String f13008) {
        if (this.f13008.equals(f13008)) return;     // For all checkboxes
        this.f13008 = f13008;
        notifyPropertyChanged(BR.f13008);
    }

    @Bindable
    public String getF13009() {
        return f13009;
    }

    public void setF13009(String f13009) {
        if (this.f13009.equals(f13009)) return;     // For all checkboxes
        this.f13009 = f13009;
        notifyPropertyChanged(BR.f13009);
    }

    @Bindable
    public String getF13010() {
        return f13010;
    }

    public void setF13010(String f13010) {
        if (this.f13010.equals(f13010)) return;     // For all checkboxes
        this.f13010 = f13010;
        notifyPropertyChanged(BR.f13010);
    }

    @Bindable
    public String getF13011() {
        return f13011;
    }

    public void setF13011(String f13011) {
        if (this.f13011.equals(f13011)) return;     // For all checkboxes
        this.f13011 = f13011;
        notifyPropertyChanged(BR.f13011);
    }

    @Bindable
    public String getF13012() {
        return f13012;
    }

    public void setF13012(String f13012) {
        if (this.f13012.equals(f13012)) return;     // For all checkboxes
        this.f13012 = f13012;
        notifyPropertyChanged(BR.f13012);
    }

    @Bindable
    public String getF13013() {
        return f13013;
    }

    public void setF13013(String f13013) {
        if (this.f13013.equals(f13013)) return;     // For all checkboxes
        this.f13013 = f13013;
        notifyPropertyChanged(BR.f13013);
    }

    @Bindable
    public String getF13014() {
        return f13014;
    }

    public void setF13014(String f13014) {
        if (this.f13014.equals(f13014)) return;     // For all checkboxes
        this.f13014 = f13014;
        notifyPropertyChanged(BR.f13014);
    }

    @Bindable
    public String getF13096() {
        return f13096;
    }

    public void setF13096(String f13096) {
        if (this.f13096.equals(f13096)) return;     // For all checkboxes
        this.f13096 = f13096;
        notifyPropertyChanged(BR.f13096);
    }

    @Bindable
    public String getF13096x() {
        return f13096x;
    }

    public void setF13096x(String f13096x) {
        this.f13096x = f13096x;
        notifyPropertyChanged(BR.f13096x);
    }

    @Bindable
    public String getF131() {
        return f131;
    }

    public void setF131(String f131) {
        this.f131 = f131;
        notifyPropertyChanged(BR.f131);
    }

    @Bindable
    public String getF131a() {
        return f131a;
    }

    public void setF131a(String f131a) {
        this.f131a = f131a;
        notifyPropertyChanged(BR.f131a);
    }

    @Bindable
    public String getF134() {
        return f134;
    }

    public void setF134(String f134) {
        this.f134 = f134;
        notifyPropertyChanged(BR.f134);
    }

    @Bindable
    public String getF13401() {
        return f13401;
    }

    public void setF13401(String f13401) {
        if (this.f13401.equals(f13401)) return;     // For all checkboxes
        this.f13401 = f13401;
        notifyPropertyChanged(BR.f13401);
    }

    @Bindable
    public String getF13402() {
        return f13402;
    }

    public void setF13402(String f13402) {
        if (this.f13402.equals(f13402)) return;     // For all checkboxes
        this.f13402 = f13402;
        notifyPropertyChanged(BR.f13402);
    }

    @Bindable
    public String getF13403() {
        return f13403;
    }

    public void setF13403(String f13403) {
        if (this.f13403.equals(f13403)) return;     // For all checkboxes
        this.f13403 = f13403;
        notifyPropertyChanged(BR.f13403);
    }

    @Bindable
    public String getF13404() {
        return f13404;
    }

    public void setF13404(String f13404) {
        if (this.f13404.equals(f13404)) return;     // For all checkboxes
        this.f13404 = f13404;
        notifyPropertyChanged(BR.f13404);
    }

    @Bindable
    public String getF13405() {
        return f13405;
    }

    public void setF13405(String f13405) {
        if (this.f13405.equals(f13405)) return;     // For all checkboxes
        this.f13405 = f13405;
        notifyPropertyChanged(BR.f13405);
    }

    @Bindable
    public String getF13406() {
        return f13406;
    }

    public void setF13406(String f13406) {
        if (this.f13406.equals(f13406)) return;     // For all checkboxes
        this.f13406 = f13406;
        notifyPropertyChanged(BR.f13406);
    }

    @Bindable
    public String getF13407() {
        return f13407;
    }

    public void setF13407(String f13407) {
        if (this.f13407.equals(f13407)) return;     // For all checkboxes
        this.f13407 = f13407;
        notifyPropertyChanged(BR.f13407);
    }

    @Bindable
    public String getF13408() {
        return f13408;
    }

    public void setF13408(String f13408) {
        if (this.f13408.equals(f13408)) return;     // For all checkboxes
        this.f13408 = f13408;
        notifyPropertyChanged(BR.f13408);
    }

    @Bindable
    public String getF13409() {
        return f13409;
    }

    public void setF13409(String f13409) {
        if (this.f13409.equals(f13409)) return;     // For all checkboxes
        this.f13409 = f13409;
        notifyPropertyChanged(BR.f13409);
    }

    @Bindable
    public String getG101() {
        return g101;
    }

    public void setG101(String g101) {
        this.g101 = g101;
        notifyPropertyChanged(BR.g101);
    }

    @Bindable
    public String getG102() {
        return g102;
    }

    public void setG102(String g102) {
        this.g102 = g102;
        setG10301(g102.equals("1") ? this.g10301 : "");
        setG10302(g102.equals("1") ? this.g10302 : "");
        setG10303(g102.equals("1") ? this.g10303 : "");
        setG10304(g102.equals("1") ? this.g10304 : "");
        setG10305(g102.equals("1") ? this.g10305 : "");
        setG10306(g102.equals("1") ? this.g10306 : "");
        setG10307(g102.equals("1") ? this.g10307 : "");
        setG10308(g102.equals("1") ? this.g10308 : "");
        setG10309(g102.equals("1") ? this.g10309 : "");
        setG10310(g102.equals("1") ? this.g10310 : "");
        setG10311(g102.equals("1") ? this.g10311 : "");
        setG10312(g102.equals("1") ? this.g10312 : "");
        setG10313(g102.equals("1") ? this.g10313 : "");
        setG10314(g102.equals("1") ? this.g10314 : "");
        setG10396(g102.equals("1") ? this.g10396 : "");
        setG105(g102.equals("1") ? this.g105 : "");
        setG106(g102.equals("1") ? this.g106 : "" );
        setG107(g102.equals("1") ? this.g107 : "");

        notifyPropertyChanged(BR.g102);
    }

    @Bindable
    public String getG103() {
        return g103;
    }

    public void setG103(String g103) {
        this.g103 = g103;
        notifyPropertyChanged(BR.g103);
    }

    @Bindable
    public String getG10301() {
        return g10301;
    }

    public void setG10301(String g10301) {
        if (this.g10301.equals(g10301)) return;     // For all checkboxes
        this.g10301 = g10301;
        notifyPropertyChanged(BR.g10301);
    }

    @Bindable
    public String getG10302() {
        return g10302;
    }

    public void setG10302(String g10302) {
        if (this.g10302.equals(g10302)) return;     // For all checkboxes
        this.g10302 = g10302;
        notifyPropertyChanged(BR.g10302);
    }

    @Bindable
    public String getG10303() {
        return g10303;
    }

    public void setG10303(String g10303) {
        if (this.g10303.equals(g10303)) return;     // For all checkboxes
        this.g10303 = g10303;
        notifyPropertyChanged(BR.g10303);
    }

    @Bindable
    public String getG10304() {
        return g10304;
    }

    public void setG10304(String g10304) {
        if (this.g10304.equals(g10304)) return;     // For all checkboxes
        this.g10304 = g10304;
        notifyPropertyChanged(BR.g10304);
    }

    @Bindable
    public String getG10305() {
        return g10305;
    }

    public void setG10305(String g10305) {
        if (this.g10305.equals(g10305)) return;     // For all checkboxes
        this.g10305 = g10305;
        notifyPropertyChanged(BR.g10305);
    }

    @Bindable
    public String getG10306() {
        return g10306;
    }

    public void setG10306(String g10306) {
        if (this.g10306.equals(g10306)) return;     // For all checkboxes
        this.g10306 = g10306;
        notifyPropertyChanged(BR.g10306);
    }

    @Bindable
    public String getG10307() {
        return g10307;
    }

    public void setG10307(String g10307) {
        if (this.g10307.equals(g10307)) return;     // For all checkboxes
        this.g10307 = g10307;
        notifyPropertyChanged(BR.g10307);
    }

    @Bindable
    public String getG10308() {
        return g10308;
    }

    public void setG10308(String g10308) {
        if (this.g10308.equals(g10308)) return;     // For all checkboxes
        this.g10308 = g10308;
        notifyPropertyChanged(BR.g10308);
    }

    @Bindable
    public String getG10309() {
        return g10309;
    }

    public void setG10309(String g10309) {
        if (this.g10309.equals(g10309)) return;     // For all checkboxes
        this.g10309 = g10309;
        notifyPropertyChanged(BR.g10309);
    }

    @Bindable
    public String getG10310() {
        return g10310;
    }

    public void setG10310(String g10310) {
        if (this.g10310.equals(g10310)) return;     // For all checkboxes
        this.g10310 = g10310;
        notifyPropertyChanged(BR.g10310);
    }

    @Bindable
    public String getG10311() {
        return g10311;
    }

    public void setG10311(String g10311) {
        if (this.g10311.equals(g10311)) return;     // For all checkboxes
        this.g10311 = g10311;
        notifyPropertyChanged(BR.g10311);
    }

    @Bindable
    public String getG10312() {
        return g10312;
    }

    public void setG10312(String g10312) {
        if (this.g10312.equals(g10312)) return;     // For all checkboxes
        this.g10312 = g10312;
        notifyPropertyChanged(BR.g10312);
    }

    @Bindable
    public String getG10313() {
        return g10313;
    }

    public void setG10313(String g10313) {
        if (this.g10313.equals(g10313)) return;     // For all checkboxes
        this.g10313 = g10313;
        notifyPropertyChanged(BR.g10313);
    }

    @Bindable
    public String getG10314() {
        return g10314;
    }

    public void setG10314(String g10314) {
        if (this.g10314.equals(g10314)) return;     // For all checkboxes
        this.g10314 = g10314;
        notifyPropertyChanged(BR.g10314);
    }

    @Bindable
    public String getG10396() {
        return g10396;
    }

    public void setG10396(String g10396) {
        if (this.g10396.equals(g10396)) return;     // For all checkboxes
        this.g10396 = g10396;
        setG10396x(g10396.equals("96") ? this.g10396x : "");
        notifyPropertyChanged(BR.g10396);
    }

    @Bindable
    public String getG10396x() {
        return g10396x;
    }

    public void setG10396x(String g10396x) {
        this.g10396x = g10396x;
        notifyPropertyChanged(BR.g10396x);
    }

    @Bindable
    public String getG104() {
        return g104;
    }

    public void setG104(String g104) {
        this.g104 = g104;
        notifyPropertyChanged(BR.g104);
    }

    @Bindable
    public String getG10496x() {
        return g10496x;
    }

    public void setG10496x(String g10496x) {
        this.g10496x = g10496x;
        notifyPropertyChanged(BR.g10496x);
    }

    @Bindable
    public String getG105() {
        return g105;
    }

    public void setG105(String g105) {
        this.g105 = g105;
        setG10501x(g105.equals("1") ? this.g10501x : "");
        notifyPropertyChanged(BR.g105);
    }

    @Bindable
    public String getG10501x() {
        return g10501x;
    }

    public void setG10501x(String g10501x) {
        this.g10501x = g10501x;
        notifyPropertyChanged(BR.g10501x);
    }

    @Bindable
    public String getG106() {
        return g106;
    }

    public void setG106(String g106) {
        this.g106 = g106;
        notifyPropertyChanged(BR.g106);
    }

    @Bindable
    public String getG107() {
        return g107;
    }

    public void setG107(String g107) {
        this.g107 = g107;
        setG10701x(g107.equals("1") ? this.g10701x : "");
        notifyPropertyChanged(BR.g107);
    }

    @Bindable
    public String getG10701x() {
        return g10701x;
    }

    public void setG10701x(String g10701x) {
        this.g10701x = g10701x;
        notifyPropertyChanged(BR.g10701x);
    }

    @Bindable
    public String getG108() {
        return g108;
    }

    public void setG108(String g108) {
        this.g108 = g108;
        notifyPropertyChanged(BR.g108);
    }

    @Bindable
    public String getG109() {
        return g109;
    }

    public void setG109(String g109) {
        this.g109 = g109;
        notifyPropertyChanged(BR.g109);
    }

    @Bindable
    public String getG110() {
        return g110;
    }

    public void setG110(String g110) {
        this.g110 = g110;
        setG126(g110.equals("1") ? this.g126 : "");
        notifyPropertyChanged(BR.g110);
    }

    @Bindable
    public String getG126() {
        return g126;
    }

    public void setG126(String g126) {
        this.g126 = g126;
        notifyPropertyChanged(BR.g126);
    }

    @Bindable
    public String getG113() {
        return g113;
    }

    public void setG113(String g113) {
        this.g113 = g113;
        setG114(g113.equals("1") ? this.g114 : "");
        setG115(g113.equals("1") ? this.g115 : "");
        setG116(g113.equals("1") ? this.g116 : "");
        notifyPropertyChanged(BR.g113);
    }

    @Bindable
    public String getG114() {
        return g114;
    }

    public void setG114(String g114) {
        this.g114 = g114;
        notifyPropertyChanged(BR.g114);
    }

    @Bindable
    public String getG11496x() {
        return g11496x;
    }

    public void setG11496x(String g11496x) {
        this.g11496x = g11496x;
        notifyPropertyChanged(BR.g11496x);
    }

    @Bindable
    public String getG115() {
        return g115;
    }

    public void setG115(String g115) {
        this.g115 = g115;
        setG116(g115.equals("1") ? this.g116 : "");
        notifyPropertyChanged(BR.g115);
    }

    @Bindable
    public String getG116() {
        return g116;
    }

    public void setG116(String g116) {
        this.g116 = g116;
        notifyPropertyChanged(BR.g116);
    }

    @Bindable
    public String getG117() {
        return g117;
    }

    public void setG117(String g117) {
        this.g117 = g117;
        setG117hx(g117.equals("1") ? this.g117hx : "");
        setG117mx(g117.equals("2") ? this.g117mx : "");
        setG117dx(g117.equals("3") ? this.g117dx : "");
        notifyPropertyChanged(BR.g117);
    }

    @Bindable
    public String getG117hx() {
        return g117hx;
    }

    public void setG117hx(String g117hx) {
        this.g117hx = g117hx;
        notifyPropertyChanged(BR.g117hx);
    }

    @Bindable
    public String getG117mx() {
        return g117mx;
    }

    public void setG117mx(String g117mx) {
        this.g117mx = g117mx;
        notifyPropertyChanged(BR.g117mx);
    }

    @Bindable
    public String getG117dx() {
        return g117dx;
    }

    public void setG117dx(String g117dx) {
        this.g117dx = g117dx;
        notifyPropertyChanged(BR.g117dx);
    }

    @Bindable
    public String getG118() {
        return g118;
    }

    public void setG118(String g118) {
        this.g118 = g118;
        notifyPropertyChanged(BR.g118);
    }

    @Bindable
    public String getG11801() {
        return g11801;
    }

    public void setG11801(String g11801) {
        if (this.g11801.equals(g11801)) return;     // For all checkboxes
        this.g11801 = g11801;
        setG11801x(g11801.equals("1") ? this.g11801x : "");
        notifyPropertyChanged(BR.g11801);
    }

    @Bindable
    public String getG11801x() {
        return g11801x;
    }

    public void setG11801x(String g11801x) {
        this.g11801x = g11801x;
        notifyPropertyChanged(BR.g11801x);
    }

    @Bindable
    public String getG11802() {
        return g11802;
    }

    public void setG11802(String g11802) {
        if (this.g11802.equals(g11802)) return;     // For all checkboxes
        this.g11802 = g11802;
        setG11802x(g11802.equals("2") ? this.g11802x : "");
        notifyPropertyChanged(BR.g11802);
    }

    @Bindable
    public String getG11802x() {
        return g11802x;
    }

    public void setG11802x(String g11802x) {

        this.g11802x = g11802x;
        notifyPropertyChanged(BR.g11802x);
    }

    @Bindable
    public String getG11803() {
        return g11803;
    }

    public void setG11803(String g11803) {
        if (this.g11803.equals(g11803)) return;     // For all checkboxes
        this.g11803 = g11803;
        setG11803x(g11803.equals("3") ? this.g11803x : "");
        notifyPropertyChanged(BR.g11803);
    }

    @Bindable
    public String getG11803x() {
        return g11803x;
    }

    public void setG11803x(String g11803x) {
        this.g11803x = g11803x;
        notifyPropertyChanged(BR.g11803x);
    }

    @Bindable
    public String getG11804() {
        return g11804;
    }

    public void setG11804(String g11804) {
        setG11804x(g11804.equals("4") ? this.g11804x : "");
        this.g11804 = g11804;
        notifyPropertyChanged(BR.g11804);
    }

    @Bindable
    public String getG11804x() {
        return g11804x;
    }

    public void setG11804x(String g11804x) {
        this.g11804x = g11804x;
        notifyPropertyChanged(BR.g11804x);
    }

    @Bindable
    public String getG11896() {
        return g11896;
    }

    public void setG11896(String g11896) {
        this.g11896 = g11896;
        setG11896x(g11896.equals("96") ? this.g11896x : "");
        notifyPropertyChanged(BR.g11896);
    }

    @Bindable
    public String getG11896x() {
        return g11896x;
    }

    public void setG11896x(String g11896x) {
        this.g11896x = g11896x;
        notifyPropertyChanged(BR.g11896x);
    }

    @Bindable
    public String getG11898() {
        return g11898;
    }

    public void setG11898(String g11898) {
        if (this.g11898.equals(g11898)) return;     // For all checkboxes
        this.g11898 = g11898;

        setG11801(g11898.equals("98") ? "" : this.g11801);
        setG11801x(g11898.equals("98") ? "" : this.g11801x);

        setG11802(g11898.equals("98") ? "" : this.g11802);
        setG11802x(g11898.equals("98") ? "" : this.g11802x);
        setG11803(g11898.equals("98") ? "" : this.g11803);
        setG11803x(g11898.equals("98") ? "" : this.g11803x);
        setG11804(g11898.equals("98") ? "" : this.g11804);
        setG11804x(g11898.equals("98") ? "" : this.g11804x);
        setG11896(g11898.equals("98") ? "" : this.g11896);
        setG11896x(g11898.equals("98") ? "" : this.g11896x);




        notifyPropertyChanged(BR.g11898);
    }

    @Bindable
    public String getG119() {
        return g119;
    }

    public void setG119(String g119) {
        this.g119 = g119;
        setG120(g119.equals("3") ? "" : this.g120);
        setG121(g119.equals("3") ? this.g121 : "");

        notifyPropertyChanged(BR.g119);
    }

    @Bindable
    public String getG120() {
        return g120;
    }

    public void setG120(String g120) {
        this.g120 = g120;
        setG12096x(g120.equals("96") ? this.g12096x : "");
        notifyPropertyChanged(BR.g120);
    }

    @Bindable
    public String getG12096x() {
        return g12096x;
    }

    public void setG12096x(String g12096x) {
        this.g12096x = g12096x;
        notifyPropertyChanged(BR.g12096x);
    }

    @Bindable
    public String getG121() {
        return g121;
    }

    public void setG121(String g121) {
        this.g121 = g121;
        setG12196x(g121.equals("96") ? this.g12196x : "");
        notifyPropertyChanged(BR.g121);
    }

    @Bindable
    public String getG12196x() {
        return g12196x;
    }

    public void setG12196x(String g12196x) {
        this.g12196x = g12196x;
        notifyPropertyChanged(BR.g12196x);
    }

    @Bindable
    public String getG124() {
        return g124;
    }

    public void setG124(String g124) {
        this.g124 = g124;
        notifyPropertyChanged(BR.g124);
    }

    @Bindable
    public String getG12401() {
        return g12401;
    }

    public void setG12401(String g12401) {
        if (this.g12401.equals(g12401)) return;     // For all checkboxes
        this.g12401 = g12401;
        notifyPropertyChanged(BR.g12401);
    }

    @Bindable
    public String getG12402() {
        return g12402;
    }

    public void setG12402(String g12402) {
        if (this.g12402.equals(g12402)) return;     // For all checkboxes
        this.g12402 = g12402;
        notifyPropertyChanged(BR.g12402);
    }

    @Bindable
    public String getG12403() {
        return g12403;
    }

    public void setG12403(String g12403) {
        if (this.g12403.equals(g12403)) return;     // For all checkboxes
        this.g12403 = g12403;
        notifyPropertyChanged(BR.g12403);
    }

    @Bindable
    public String getG12404() {
        return g12404;
    }

    public void setG12404(String g12404) {
        if (this.g12404.equals(g12404)) return;     // For all checkboxes
        this.g12404 = g12404;
        notifyPropertyChanged(BR.g12404);
    }

    @Bindable
    public String getG12405() {
        return g12405;
    }

    public void setG12405(String g12405) {
        if (this.g12405.equals(g12405)) return;     // For all checkboxes
        this.g12405 = g12405;
        notifyPropertyChanged(BR.g12405);
    }

    @Bindable
    public String getG12406() {
        return g12406;
    }

    public void setG12406(String g12406) {
        if (this.g12406.equals(g12406)) return;     // For all checkboxes
        this.g12406 = g12406;
        notifyPropertyChanged(BR.g12406);
    }

    @Bindable
    public String getG12407() {
        return g12407;
    }

    public void setG12407(String g12407) {
        if (this.g12407.equals(g12407)) return;     // For all checkboxes
        this.g12407 = g12407;
        notifyPropertyChanged(BR.g12407);
    }

    @Bindable
    public String getG12408() {
        return g12408;
    }

    public void setG12408(String g12408) {
        if (this.g12408.equals(g12408)) return;     // For all checkboxes
        this.g12408 = g12408;
        notifyPropertyChanged(BR.g12408);
    }

    @Bindable
    public String getG12409() {
        return g12409;
    }

    public void setG12409(String g12409) {
        if (this.g12409.equals(g12409)) return;     // For all checkboxes
        this.g12409 = g12409;
        notifyPropertyChanged(BR.g12409);
    }

    @Bindable
    public String getG12410() {
        return g12410;
    }

    public void setG12410(String g12410) {
        if (this.g12410.equals(g12410)) return;     // For all checkboxes
        this.g12410 = g12410;
        notifyPropertyChanged(BR.g12410);
    }

    @Bindable
    public String getG12411() {
        return g12411;
    }

    public void setG12411(String g12411) {
        if (this.g12411.equals(g12411)) return;     // For all checkboxes
        this.g12411 = g12411;
        notifyPropertyChanged(BR.g12411);
    }

    @Bindable
    public String getG12412() {
        return g12412;
    }

    public void setG12412(String g12412) {
        if (this.g12412.equals(g12412)) return;     // For all checkboxes
        this.g12412 = g12412;
        notifyPropertyChanged(BR.g12412);
    }

    @Bindable
    public String getG12413() {
        return g12413;
    }

    public void setG12413(String g12413) {
        if (this.g12413.equals(g12413)) return;     // For all checkboxes
        this.g12413 = g12413;
        notifyPropertyChanged(BR.g12413);
    }

    @Bindable
    public String getG128() {
        return g128;
    }

    public void setG128(String g128) {
        this.g128 = g128;
        notifyPropertyChanged(BR.g128);
    }

    @Bindable
    public String getG129() {
        return g129;
    }

    public void setG129(String g129) {
        this.g129 = g129;
        notifyPropertyChanged(BR.g129);
    }

    @Bindable
    public String getH101() {
        return h101;
    }

    public void setH101(String h101) {
        this.h101 = h101;
        setH101mx(h101.equals("1") ? this.h101mx : "");
        setH101wx(h101.equals("2") ? this.h101wx : "");
        notifyPropertyChanged(BR.h101);
    }

    @Bindable
    public String getH101mx() {
        return h101mx;
    }

    public void setH101mx(String h101mx) {
        this.h101mx = h101mx;
        notifyPropertyChanged(BR.h101mx);
    }

    @Bindable
    public String getH101wx() {
        return h101wx;
    }

    public void setH101wx(String h101wx) {
        this.h101wx = h101wx;
        notifyPropertyChanged(BR.h101wx);
    }

    @Bindable
    public String getH102() {
        return h102;
    }

    public void setH102(String h102) {
        this.h102 = h102;
        notifyPropertyChanged(BR.h102);
    }

    @Bindable
    public String getH103() {
        return h103;
    }

    public void setH103(String h103) {
        this.h103 = h103;
        notifyPropertyChanged(BR.h103);
    }

    @Bindable
    public String getH10401() {
        return h10401;
    }

    public void setH10401(String h10401) {
        if (this.h10401.equals(h10401)) return;
        this.h10401 = h10401;
        notifyPropertyChanged(BR.h10401);
    }

    @Bindable
    public String getH10402() {
        return h10402;
    }

    public void setH10402(String h10402) {
        if (this.h10402.equals(h10402)) return;
        this.h10402 = h10402;
        notifyPropertyChanged(BR.h10402);
    }

    @Bindable
    public String getH10403() {
        return h10403;
    }

    public void setH10403(String h10403) {
        if (this.h10403.equals(h10403)) return;
        this.h10403 = h10403;
        notifyPropertyChanged(BR.h10403);
    }

    @Bindable
    public String getH10496() {
        return h10496;
    }

    public void setH10496(String h10496) {
        if (this.h10496.equals(h10496)) return;
        this.h10496 = h10496;
        setH10496x(h10496.equals("96") ? this.h10496x : "");
        notifyPropertyChanged(BR.h10496);
    }

    @Bindable
    public String getH10496x() {
        return h10496x;
    }

    public void setH10496x(String h10496x) {
        this.h10496x = h10496x;
        notifyPropertyChanged(BR.h10496x);
    }

    @Bindable
    public String getH105() {
        return h105;
    }

    public void setH105(String h105) {
        this.h105 = h105;
        notifyPropertyChanged(BR.h105);
    }

    @Bindable
    public String getH106() {
        return h106;
    }

    public void setH106(String h106) {
        this.h106 = h106;
        setH1061x(h106.equals("1") ? this.h1061x : "");
        notifyPropertyChanged(BR.h106);
    }

    @Bindable
    public String getH1061x() {
        return h1061x;
    }

    public void setH1061x(String h1061x) {
        this.h1061x = h1061x;
        notifyPropertyChanged(BR.h1061x);
    }

    @Bindable
    public String getH107() {
        return h107;
    }

    public void setH107(String h107) {
        this.h107 = h107;
        notifyPropertyChanged(BR.h107);
    }

    @Bindable
    public String getH108() {
        return h108;
    }

    public void setH108(String h108) {
        this.h108 = h108;
        setH10896x(h108.equals("96") ? this.h10896x : "");
        notifyPropertyChanged(BR.h108);
    }

    @Bindable
    public String getH10896x() {
        return h10896x;
    }

    public void setH10896x(String h10896x) {
        this.h10896x = h10896x;
        notifyPropertyChanged(BR.h10896x);
    }

    @Bindable
    public String getH109() {
        return h109;
    }

    public void setH109(String h109) {
        this.h109 = h109;
        notifyPropertyChanged(BR.h109);
    }

    @Bindable
    public String getH10901() {
        return h10901;
    }

    public void setH10901(String h10901) {
        if (this.h10901.equals(h10901)) return;
        this.h10901 = h10901;
        notifyPropertyChanged(BR.h10901);
    }

    @Bindable
    public String getH10902() {
        return h10902;
    }

    public void setH10902(String h10902) {
        if (this.h10902.equals(h10902)) return;
        this.h10902 = h10902;
        notifyPropertyChanged(BR.h10902);
    }

    @Bindable
    public String getH10903() {
        return h10903;
    }

    public void setH10903(String h10903) {
        if (this.h10903.equals(h10903)) return;
        this.h10903 = h10903;
        notifyPropertyChanged(BR.h10903);
    }

    @Bindable
    public String getH10904() {
        return h10904;
    }

    public void setH10904(String h10904) {
        if (this.h10904.equals(h10904)) return;
        this.h10904 = h10904;
        notifyPropertyChanged(BR.h10904);
    }

    @Bindable
    public String getH10905() {
        return h10905;
    }

    public void setH10905(String h10905) {
        if (this.h10905.equals(h10905)) return;
        this.h10905 = h10905;
        notifyPropertyChanged(BR.h10905);
    }

    @Bindable
    public String getH10906() {
        return h10906;
    }

    public void setH10906(String h10906) {
        if (this.h10906.equals(h10906)) return;
        this.h10906 = h10906;
        notifyPropertyChanged(BR.h10906);
    }

    @Bindable
    public String getH10907() {
        return h10907;
    }

    public void setH10907(String h10907) {
        if (this.h10907.equals(h10907)) return;
        this.h10907 = h10907;
        notifyPropertyChanged(BR.h10907);
    }

    @Bindable
    public String getH10997() {
        return h10997;
    }

    public void setH10997(String h10997) {
        if (this.h10997.equals(h10997)) return;
        this.h10997 = h10997;
        setH10901(h10997.equals("97") ? "" : this.h10901);
        setH10902(h10997.equals("97") ? "" : this.h10902);
        setH10903(h10997.equals("97") ? "" : this.h10903);
        setH10904(h10997.equals("97") ? "" : this.h10904);
        setH10905(h10997.equals("97") ? "" : this.h10905);
        setH10906(h10997.equals("97") ? "" : this.h10906);
        setH10907(h10997.equals("97") ? "" : this.h10907);
        setH10996(h10997.equals("97") ? "" : this.h10996);
        notifyPropertyChanged(BR.h10997);
    }

    @Bindable
    public String getH10996() {
        return h10996;
    }

    public void setH10996(String h10996) {
        if (this.h10996.equals(h10996)) return;
        this.h10996 = h10996;
        setH10996x(h10996.equals("96") ? this.h10996x : "");
        notifyPropertyChanged(BR.h10996);
    }

    @Bindable
    public String getH10996x() {
        return h10996x;
    }

    public void setH10996x(String h10996x) {
        this.h10996x = h10996x;
        notifyPropertyChanged(BR.h10996x);
    }

    @Bindable
    public String getH110() {
        return h110;
    }

    public void setH110(String h110) {
        this.h110 = h110;
        notifyPropertyChanged(BR.h110);
    }

    @Bindable
    public String getH111() {
        return h111;
    }

    public void setH111(String h111) {
        this.h111 = h111;
        notifyPropertyChanged(BR.h111);
    }

    @Bindable
    public String getH112() {
        return h112;
    }

    public void setH112(String h112) {
        this.h112 = h112;
        notifyPropertyChanged(BR.h112);
    }

    @Bindable
    public String getH113() {
        return h113;
    }

    public void setH113(String h113) {
        this.h113 = h113;
        notifyPropertyChanged(BR.h113);
    }

    @Bindable
    public String getH114() {
        return h114;
    }

    public void setH114(String h114) {
        this.h114 = h114;
        notifyPropertyChanged(BR.h114);
    }

    @Bindable
    public String getH115() {
        return h115;
    }

    public void setH115(String h115) {
        this.h115 = h115;
        notifyPropertyChanged(BR.h115);
    }

    @Bindable
    public String getH11501() {
        return h11501;
    }

    public void setH11501(String h11501) {
        if (this.h11501.equals(h11501)) return;
        this.h11501 = h11501;
        notifyPropertyChanged(BR.h11501);
    }

    @Bindable
    public String getH11502() {
        return h11502;
    }

    public void setH11502(String h11502) {
        if (this.h11502.equals(h11502)) return;     // For all checkboxes
        this.h11502 = h11502;
        notifyPropertyChanged(BR.h11502);
    }

    @Bindable
    public String getH11503() {
        return h11503;
    }

    public void setH11503(String h11503) {
        if (this.h11503.equals(h11503)) return;     // For all checkboxes
        this.h11503 = h11503;
        notifyPropertyChanged(BR.h11503);
    }

    @Bindable
    public String getH11504() {
        return h11504;
    }

    public void setH11504(String h11504) {
        if (this.h11504.equals(h11504)) return;     // For all checkboxes
        this.h11504 = h11504;
        notifyPropertyChanged(BR.h11504);
    }

    @Bindable
    public String getH11505() {
        return h11505;
    }

    public void setH11505(String h11505) {
        if (this.h11505.equals(h11505)) return;     // For all checkboxes
        this.h11505 = h11505;
        notifyPropertyChanged(BR.h11505);
    }

    @Bindable
    public String getH11506() {
        return h11506;
    }

    public void setH11506(String h11506) {
        if (this.h11506.equals(h11506)) return;     // For all checkboxes
        this.h11506 = h11506;
        notifyPropertyChanged(BR.h11506);
    }

    @Bindable
    public String getH11507() {
        return h11507;
    }

    public void setH11507(String h11507) {
        if (this.h11507.equals(h11507)) return;     // For all checkboxes
        this.h11507 = h11507;
        notifyPropertyChanged(BR.h11507);
    }

    @Bindable
    public String getH11508() {
        return h11508;
    }

    public void setH11508(String h11508) {
        if (this.h11508.equals(h11508)) return;     // For all checkboxes
        this.h11508 = h11508;
        notifyPropertyChanged(BR.h11508);
    }

    @Bindable
    public String getH11509() {
        return h11509;
    }

    public void setH11509(String h11509) {
        if (this.h11509.equals(h11509)) return;     // For all checkboxes
        this.h11509 = h11509;
        notifyPropertyChanged(BR.h11509);
    }

    @Bindable
    public String getH11596() {
        return h11596;
    }

    public void setH11596(String h11596) {
        if (this.h11596.equals(h11596)) return;     // For all checkboxes
        this.h11596 = h11596;
        setH11596x(h11596.equals("96") ? this.h11596x : "");
        notifyPropertyChanged(BR.h11596);
    }

    @Bindable
    public String getH11596x() {
        return h11596x;
    }

    public void setH11596x(String h11596x) {
        this.h11596x = h11596x;
        notifyPropertyChanged(BR.h11596x);
    }

    @Bindable
    public String getH116() {
        return h116;
    }

    public void setH116(String h116) {
        this.h116 = h116;
        notifyPropertyChanged(BR.h116);
    }

    @Bindable
    public String getH11701() {
        return h11701;
    }

    public void setH11701(String h11701) {
        this.h11701 = h11701;
        notifyPropertyChanged(BR.h11701);
    }

    @Bindable
    public String getH118() {
        return h118;
    }

    public void setH118(String h118) {
        this.h118 = h118;
        notifyPropertyChanged(BR.h118);
    }

    @Bindable
    public String getH119() {
        return h119;
    }

    public void setH119(String h119) {
        this.h119 = h119;
        notifyPropertyChanged(BR.h119);
    }

    @Bindable
    public String getH120() {
        return h120;
    }

    public void setH120(String h120) {
        this.h120 = h120;
        notifyPropertyChanged(BR.h120);
    }

    @Bindable
    public String getH121() {
        return h121;
    }

    public void setH121(String h121) {
        this.h121 = h121;
        notifyPropertyChanged(BR.h121);
    }

    @Bindable
    public String getH122() {
        return h122;
    }

    public void setH122(String h122) {
        this.h122 = h122;
        setH1221x(h122.equals("1") ? this.h1221x : "");
        notifyPropertyChanged(BR.h122);
    }

    @Bindable
    public String getH1221x() {
        return h1221x;
    }

    public void setH1221x(String h1221x) {
        this.h1221x = h1221x;
        notifyPropertyChanged(BR.h1221x);
    }

    @Bindable
    public String getH123() {
        return h123;
    }

    public void setH123(String h123) {
        this.h123 = h123;
        notifyPropertyChanged(BR.h123);
    }

    @Bindable
    public String getH124() {
        return h124;
    }

    public void setH124(String h124) {
        this.h124 = h124;
        notifyPropertyChanged(BR.h124);
    }

    @Bindable
    public String getH125() {
        return h125;
    }

    public void setH125(String h125) {
        this.h125 = h125;
        notifyPropertyChanged(BR.h125);
    }

    @Bindable
    public String getH126() {
        return h126;
    }

    public void setH126(String h126) {
        this.h126 = h126;
        notifyPropertyChanged(BR.h126);
    }

    @Bindable
    public String getH127() {
        return h127;
    }

    public void setH127(String h127) {
        this.h127 = h127;
        notifyPropertyChanged(BR.h127);
    }

    @Bindable
    public String getH128() {
        return h128;
    }

    public void setH128(String h128) {
        this.h128 = h128;
        notifyPropertyChanged(BR.h128);
    }

    @Bindable
    public String getH12896x() {
        return h12896x;
    }

    public void setH12896x(String h12896x) {
        this.h12896x = h12896x;
        notifyPropertyChanged(BR.h12896x);
    }

    @Bindable
    public String getH12901() {
        return h12901;
    }

    public void setH12901(String h12901) {
        this.h12901 = h12901;
        notifyPropertyChanged(BR.h12901);
    }

    @Bindable
    public String getH12902() {
        return h12902;
    }

    public void setH12902(String h12902) {
        this.h12902 = h12902;
        notifyPropertyChanged(BR.h12902);
    }

    @Bindable
    public String getH12903() {
        return h12903;
    }

    public void setH12903(String h12903) {
        this.h12903 = h12903;
        notifyPropertyChanged(BR.h12903);
    }

    @Bindable
    public String getH12904() {
        return h12904;
    }

    public void setH12904(String h12904) {
        this.h12904 = h12904;
        notifyPropertyChanged(BR.h12904);
    }

    @Bindable
    public String getH12905() {
        return h12905;
    }

    public void setH12905(String h12905) {
        this.h12905 = h12905;
        notifyPropertyChanged(BR.h12905);
    }

    @Bindable
    public String getH12906() {
        return h12906;
    }

    public void setH12906(String h12906) {
        this.h12906 = h12906;
        notifyPropertyChanged(BR.h12906);
    }

    @Bindable
    public String getH132() {
        return h132;
    }

    public void setH132(String h132) {
        this.h132 = h132;
        notifyPropertyChanged(BR.h132);
    }

    @Bindable
    public String getH132a() {
        return h132a;
    }

    public void setH132a(String h132a) {
        this.h132a = h132a;
        setH132a96x(h132a.equals("96") ? this.h132a96x : "");
        notifyPropertyChanged(BR.h132a);
    }

    @Bindable
    public String getH132a96x() {
        return h132a96x;
    }

    public void setH132a96x(String h132a96x) {
        this.h132a96x = h132a96x;
        notifyPropertyChanged(BR.h132a96x);
    }

    @Bindable
    public String getH133() {
        return h133;
    }

    public void setH133(String h133) {
        this.h133 = h133;
        notifyPropertyChanged(BR.h133);
    }

    @Bindable
    public String getH13301() {
        return h13301;
    }

    public void setH13301(String h13301) {
        if (this.h13301.equals(h13301)) return;     // For all checkboxes
        this.h13301 = h13301;
        notifyPropertyChanged(BR.h13301);
    }

    @Bindable
    public String getH13302() {
        return h13302;
    }

    public void setH13302(String h13302) {
        if (this.h13302.equals(h13302)) return;     // For all checkboxes
        this.h13302 = h13302;
        notifyPropertyChanged(BR.h13302);
    }

    @Bindable
    public String getH13303() {
        return h13303;
    }

    public void setH13303(String h13303) {
        if (this.h13303.equals(h13303)) return;     // For all checkboxes
        this.h13303 = h13303;
        notifyPropertyChanged(BR.h13303);
    }

    @Bindable
    public String getH13304() {
        return h13304;
    }

    public void setH13304(String h13304) {
        if (this.h13304.equals(h13304)) return;     // For all checkboxes
        this.h13304 = h13304;
        notifyPropertyChanged(BR.h13304);
    }

    @Bindable
    public String getH13305() {
        return h13305;
    }

    public void setH13305(String h13305) {
        if (this.h13305.equals(h13305)) return;     // For all checkboxes
        this.h13305 = h13305;
        notifyPropertyChanged(BR.h13305);
    }

    @Bindable
    public String getH13306() {
        return h13306;
    }

    public void setH13306(String h13306) {
        if (this.h13306.equals(h13306)) return;     // For all checkboxes
        this.h13306 = h13306;
        notifyPropertyChanged(BR.h13306);
    }

    @Bindable
    public String getH13307() {
        return h13307;
    }

    public void setH13307(String h13307) {
        if (this.h13307.equals(h13307)) return;     // For all checkboxes
        this.h13307 = h13307;
        notifyPropertyChanged(BR.h13307);
    }

    @Bindable
    public String getH13308() {
        return h13308;
    }

    public void setH13308(String h13308) {
        if (this.h13308.equals(h13308)) return;     // For all checkboxes
        this.h13308 = h13308;
        notifyPropertyChanged(BR.h13308);
    }

    @Bindable
    public String getH13309() {
        return h13309;
    }

    public void setH13309(String h13309) {
        if (this.h13309.equals(h13309)) return;     // For all checkboxes
        this.h13309 = h13309;
        notifyPropertyChanged(BR.h13309);
    }

    @Bindable
    public String getH135() {
        return h135;
    }

    public void setH135(String h135) {
        this.h135 = h135;
        notifyPropertyChanged(BR.h135);
    }

    @Bindable
    public String getH13501() {
        return h13501;
    }

    public void setH13501(String h13501) {
        if (this.h13501.equals(h13501)) return;     // For all checkboxes
        this.h13501 = h13501;
        notifyPropertyChanged(BR.h13501);
    }

    @Bindable
    public String getH13502() {
        return h13502;
    }

    public void setH13502(String h13502) {
        if (this.h13502.equals(h13502)) return;     // For all checkboxes
        this.h13502 = h13502;
        notifyPropertyChanged(BR.h13502);
    }

    @Bindable
    public String getH13503() {
        return h13503;
    }

    public void setH13503(String h13503) {
        if (this.h13503.equals(h13503)) return;     // For all checkboxes
        this.h13503 = h13503;
        notifyPropertyChanged(BR.h13503);
    }

    @Bindable
    public String getH13504() {
        return h13504;
    }

    public void setH13504(String h13504) {
        if (this.h13504.equals(h13504)) return;     // For all checkboxes
        this.h13504 = h13504;
        notifyPropertyChanged(BR.h13504);
    }

    @Bindable
    public String getH13505() {
        return h13505;
    }

    public void setH13505(String h13505) {
        if (this.h13505.equals(h13505)) return;     // For all checkboxes
        this.h13505 = h13505;
        notifyPropertyChanged(BR.h13505);
    }

    @Bindable
    public String getH13506() {
        return h13506;
    }

    public void setH13506(String h13506) {
        if (this.h13506.equals(h13506)) return;     // For all checkboxes
        this.h13506 = h13506;
        notifyPropertyChanged(BR.h13506);
    }

    @Bindable
    public String getH13507() {
        return h13507;
    }

    public void setH13507(String h13507) {
        if (this.h13507.equals(h13507)) return;     // For all checkboxes
        this.h13507 = h13507;
        notifyPropertyChanged(BR.h13507);
    }

    @Bindable
    public String getH13508() {
        return h13508;
    }

    public void setH13508(String h13508) {
        if (this.h13508.equals(h13508)) return;     // For all checkboxes
        this.h13508 = h13508;
        notifyPropertyChanged(BR.h13508);
    }

    @Bindable
    public String getH13509() {
        return h13509;
    }

    public void setH13509(String h13509) {
        if (this.h13509.equals(h13509)) return;     // For all checkboxes
        this.h13509 = h13509;
        notifyPropertyChanged(BR.h13509);
    }

    @Bindable
    public String getH13598() {
        return h13598;
    }

    public void setH13598(String h13598) {
        if (this.h13598.equals(h13598)) return;     // For all checkboxes
        this.h13598 = h13598;
        setH13501(h13598.equals("98") ? "" : this.h13501);
        setH13502(h13598.equals("98") ? "" : this.h13502);
        setH13503(h13598.equals("98") ? "" : this.h13503);
        setH13504(h13598.equals("98") ? "" : this.h13504);
        setH13505(h13598.equals("98") ? "" : this.h13505);
        setH13506(h13598.equals("98") ? "" : this.h13506);
        setH13507(h13598.equals("98") ? "" : this.h13507);
        setH13508(h13598.equals("98") ? "" : this.h13508);
        setH13509(h13598.equals("98") ? "" : this.h13509);
        notifyPropertyChanged(BR.h13598);
    }

    @Bindable
    public String getH136() {
        return h136;
    }

    public void setH136(String h136) {
        this.h136 = h136;
        notifyPropertyChanged(BR.h136);
    }

    @Bindable
    public String getH13601() {
        return h13601;
    }

    public void setH13601(String h13601) {
        if (this.h13601.equals(h13601)) return;     // For all checkboxes
        this.h13601 = h13601;
        notifyPropertyChanged(BR.h13601);
    }

    @Bindable
    public String getH13602() {
        return h13602;
    }

    public void setH13602(String h13602) {
        if (this.h13602.equals(h13602)) return;     // For all checkboxes
        this.h13602 = h13602;
        notifyPropertyChanged(BR.h13602);
    }

    @Bindable
    public String getH13603() {
        return h13603;
    }

    public void setH13603(String h13603) {
        if (this.h13603.equals(h13603)) return;     // For all checkboxes
        this.h13603 = h13603;
        notifyPropertyChanged(BR.h13603);
    }

    @Bindable
    public String getH13604() {
        return h13604;
    }

    public void setH13604(String h13604) {
        if (this.h13604.equals(h13604)) return;     // For all checkboxes
        this.h13604 = h13604;
        notifyPropertyChanged(BR.h13604);
    }

    @Bindable
    public String getH13605() {
        return h13605;
    }

    public void setH13605(String h13605) {
        if (this.h13605.equals(h13605)) return;     // For all checkboxes
        this.h13605 = h13605;
        notifyPropertyChanged(BR.h13605);
    }

    @Bindable
    public String getH13606() {
        return h13606;
    }

    public void setH13606(String h13606) {
        if (this.h13606.equals(h13606)) return;     // For all checkboxes
        this.h13606 = h13606;
        notifyPropertyChanged(BR.h13606);
    }

    @Bindable
    public String getH13696() {
        return h13696;
    }

    public void setH13696(String h13696) {
        if (this.h13696.equals(h13696)) return;
        this.h13696 = h13696;
        setH13696x(h13696.equals("96") ? this.h13696x : "");
        notifyPropertyChanged(BR.h13696);
    }

    @Bindable
    public String getH13696x() {
        return h13696x;
    }

    public void setH13696x(String h13696x) {
        this.h13696x = h13696x;
        notifyPropertyChanged(BR.h13696x);
    }

    @Bindable
    public String getH137() {
        return h137;
    }

    public void setH137(String h137) {
        this.h137 = h137;
        notifyPropertyChanged(BR.h137);
    }

    @Bindable
    public String getH137a() {
        return h137a;
    }

    public void setH137a(String h137a) {
        this.h137a = h137a;
        setH137a96x(h137a.equals("96") ? this.h137a96x : "");
        notifyPropertyChanged(BR.h137a);
    }

    @Bindable
    public String getH137a96x() {
        return h137a96x;
    }

    public void setH137a96x(String h137a96x) {
        this.h137a96x = h137a96x;
        notifyPropertyChanged(BR.h137a96x);
    }

    @Bindable
    public String getH137b() {
        return h137b;
    }

    public void setH137b(String h137b) {
        this.h137b = h137b;
        setH137b96x(h137b.equals("96") ? this.h137b96x : "");
        notifyPropertyChanged(BR.h137b);
    }

    @Bindable
    public String getH137b96x() {
        return h137b96x;
    }

    public void setH137b96x(String h137b96x) {
        this.h137b96x = h137b96x;
        notifyPropertyChanged(BR.h137b96x);
    }

    @Bindable
    public String getH137c() {
        return h137c;
    }

    public void setH137c(String h137c) {
        this.h137c = h137c;
        setH137c96x(h137c.equals("96") ? this.h137c96x : "");
        notifyPropertyChanged(BR.h137c);
    }

    @Bindable
    public String getH137c96x() {
        return h137c96x;
    }

    public void setH137c96x(String h137c96x) {
        this.h137c96x = h137c96x;
        notifyPropertyChanged(BR.h137c96x);
    }

    @Bindable
    public String getH201() {
        return h201;
    }

    public void setH201(String h201) {
        this.h201 = h201;
        setH201hx(h201.equals("1") ? this.h201hx : "");
        setH201dx(h201.equals("2") ? this.h201dx : "");
        setH201wx(h201.equals("3") ? this.h201wx : "");
        notifyPropertyChanged(BR.h201);
    }

    @Bindable
    public String getH201hx() {
        return h201hx;
    }

    public void setH201hx(String h201hx) {
        this.h201hx = h201hx;
        notifyPropertyChanged(BR.h201hx);
    }

    @Bindable
    public String getH201dx() {
        return h201dx;
    }

    public void setH201dx(String h201dx) {
        this.h201dx = h201dx;
        notifyPropertyChanged(BR.h201dx);
    }

    @Bindable
    public String getH201wx() {
        return h201wx;
    }

    public void setH201wx(String h201wx) {
        this.h201wx = h201wx;
        notifyPropertyChanged(BR.h201wx);
    }

    @Bindable
    public String getH202() {
        return h202;
    }

    public void setH202(String h202) {
        this.h202 = h202;
        notifyPropertyChanged(BR.h202);
    }

    @Bindable
    public String getH203h() {
        return h203h;
    }

    public void setH203h(String h203h) {
        this.h203h = h203h;
        notifyPropertyChanged(BR.h203h);
    }

    @Bindable
    public String getH203d() {
        return h203d;
    }

    public void setH203d(String h203d) {
        this.h203d = h203d;
        notifyPropertyChanged(BR.h203d);
    }

    @Bindable
    public String getH203w() {
        return h203w;
    }

    public void setH203w(String h203w) {
        this.h203w = h203w;
        notifyPropertyChanged(BR.h203w);
    }

    @Bindable
    public String getH204() {
        return h204;
    }

    public void setH204(String h204) {
        this.h204 = h204;
        notifyPropertyChanged(BR.h204);
    }

    @Bindable
    public String getH205() {
        return h205;
    }

    public void setH205(String h205) {
        this.h205 = h205;
        setH20596x(h205.equals("96") ? this.h20596x : "");
        notifyPropertyChanged(BR.h205);
    }

    @Bindable
    public String getH20596x() {
        return h20596x;
    }

    public void setH20596x(String h20596x) {
        this.h20596x = h20596x;
        notifyPropertyChanged(BR.h20596x);
    }

    @Bindable
    public String getH207() {
        return h207;
    }

    public void setH207(String h207) {
        this.h207 = h207;
        notifyPropertyChanged(BR.h207);
    }

    @Bindable
    public String getH20701() {
        return h20701;
    }

    public void setH20701(String h20701) {
        if (this.h20701.equals(h20701)) return;     // For all checkboxes
        this.h20701 = h20701;
        notifyPropertyChanged(BR.h20701);
    }

    @Bindable
    public String getH20702() {
        return h20702;
    }

    public void setH20702(String h20702) {
        if (this.h20702.equals(h20702)) return;     // For all checkboxes
        this.h20702 = h20702;
        notifyPropertyChanged(BR.h20702);
    }

    @Bindable
    public String getH20703() {
        return h20703;
    }

    public void setH20703(String h20703) {
        if (this.h20703.equals(h20703)) return;     // For all checkboxes
        this.h20703 = h20703;
        notifyPropertyChanged(BR.h20703);
    }

    @Bindable
    public String getH20704() {
        return h20704;
    }

    public void setH20704(String h20704) {
        if (this.h20704.equals(h20704)) return;     // For all checkboxes
        this.h20704 = h20704;
        notifyPropertyChanged(BR.h20704);
    }

    @Bindable
    public String getH20705() {
        return h20705;
    }

    public void setH20705(String h20705) {
        if (this.h20705.equals(h20705)) return;     // For all checkboxes
        this.h20705 = h20705;
        notifyPropertyChanged(BR.h20705);
    }

    @Bindable
    public String getH20706() {
        return h20706;
    }

    public void setH20706(String h20706) {
        if (this.h20706.equals(h20706)) return;     // For all checkboxes
        this.h20706 = h20706;
        notifyPropertyChanged(BR.h20706);
    }

    @Bindable
    public String getH20707() {
        return h20707;
    }

    public void setH20707(String h20707) {
        if (this.h20707.equals(h20707)) return;     // For all checkboxes
        this.h20707 = h20707;
        notifyPropertyChanged(BR.h20707);
    }

    @Bindable
    public String getH20708() {
        return h20708;
    }

    public void setH20708(String h20708) {
        if (this.h20708.equals(h20708)) return;     // For all checkboxes
        this.h20708 = h20708;
        notifyPropertyChanged(BR.h20708);
    }

    @Bindable
    public String getH20798() {
        return h20798;
    }

    public void setH20798(String h20798) {
        if (this.h20798.equals(h20798)) return;     // For all checkboxes
        this.h20798 = h20798;
        notifyPropertyChanged(BR.h20798);
    }

    @Bindable
    public String getH208() {
        return h208;
    }

    public void setH208(String h208) {
        this.h208 = h208;
        notifyPropertyChanged(BR.h208);
    }

    @Bindable
    public String getH20801() {
        return h20801;
    }

    public void setH20801(String h20801) {
        if (this.h20801.equals(h20801)) return;     // For all checkboxes
        this.h20801 = h20801;
        notifyPropertyChanged(BR.h20801);
    }

    @Bindable
    public String getH20802() {
        return h20802;
    }

    public void setH20802(String h20802) {
        if (this.h20802.equals(h20802)) return;     // For all checkboxes
        this.h20802 = h20802;
        notifyPropertyChanged(BR.h20802);
    }

    @Bindable
    public String getH20803() {
        return h20803;
    }

    public void setH20803(String h20803) {
        if (this.h20803.equals(h20803)) return;     // For all checkboxes
        this.h20803 = h20803;
        notifyPropertyChanged(BR.h20803);
    }

    @Bindable
    public String getH20804() {
        return h20804;
    }

    public void setH20804(String h20804) {
        if (this.h20804.equals(h20804)) return;     // For all checkboxes
        this.h20804 = h20804;
        notifyPropertyChanged(BR.h20804);
    }

    @Bindable
    public String getH20805() {
        return h20805;
    }

    public void setH20805(String h20805) {
        if (this.h20805.equals(h20805)) return;     // For all checkboxes
        this.h20805 = h20805;
        notifyPropertyChanged(BR.h20805);
    }

    @Bindable
    public String getH20806() {
        return h20806;
    }

    public void setH20806(String h20806) {
        if (this.h20806.equals(h20806)) return;     // For all checkboxes
        this.h20806 = h20806;
        notifyPropertyChanged(BR.h20806);
    }

    @Bindable
    public String getH20896() {
        return h20896;
    }

    public void setH20896(String h20896) {
        if (this.h20896.equals(h20896)) return;     // For all checkboxes
        this.h20896 = h20896;
        notifyPropertyChanged(BR.h20896);
    }

    @Bindable
    public String getH209() {
        return h209;
    }

    public void setH209(String h209) {
        this.h209 = h209;
        notifyPropertyChanged(BR.h209);
    }

    @Bindable
    public String getH209a() {
        return h209a;
    }

    public void setH209a(String h209a) {
        this.h209a = h209a;
        notifyPropertyChanged(BR.h209a);
    }

    @Bindable
    public String getH210() {
        return h210;
    }

    public void setH210(String h210) {
        this.h210 = h210;
        notifyPropertyChanged(BR.h210);
    }

    @Bindable
    public String getH211() {
        return h211;
    }

    public void setH211(String h211) {
        this.h211 = h211;
        notifyPropertyChanged(BR.h211);
    }

    @Bindable
    public String getH212() {
        return h212;
    }

    public void setH212(String h212) {
        this.h212 = h212;
        notifyPropertyChanged(BR.h212);
    }

    @Bindable
    public String getH213() {
        return h213;
    }

    public void setH213(String h213) {
        this.h213 = h213;
        notifyPropertyChanged(BR.h213);
    }

    @Bindable
    public String getH214() {
        return h214;
    }

    public void setH214(String h214) {
        this.h214 = h214;
        notifyPropertyChanged(BR.h214);
    }

    @Bindable
    public String getH214a() {
        return h214a;
    }

    public void setH214a(String h214a) {
        this.h214a = h214a;
        notifyPropertyChanged(BR.h214a);
    }

    @Bindable
    public String getH214b() {
        return h214b;
    }

    public void setH214b(String h214b) {
        this.h214b = h214b;
        notifyPropertyChanged(BR.h214b);
    }

    @Bindable
    public String getH214b01() {
        return h214b01;
    }

    public void setH214b01(String h214b01) {
        if (this.h214b01.equals(h214b01)) return;     // For all checkboxes
        this.h214b01 = h214b01;
        notifyPropertyChanged(BR.h214b01);
    }

    @Bindable
    public String getH214b02() {
        return h214b02;
    }

    public void setH214b02(String h214b02) {
        if (this.h214b02.equals(h214b02)) return;     // For all checkboxes
        this.h214b02 = h214b02;
        notifyPropertyChanged(BR.h214b02);
    }

    @Bindable
    public String getH214b03() {
        return h214b03;
    }

    public void setH214b03(String h214b03) {
        if (this.h214b03.equals(h214b03)) return;     // For all checkboxes
        this.h214b03 = h214b03;
        notifyPropertyChanged(BR.h214b03);
    }

    @Bindable
    public String getH214b04() {
        return h214b04;
    }

    public void setH214b04(String h214b04) {
        if (this.h214b04.equals(h214b04)) return;     // For all checkboxes
        this.h214b04 = h214b04;
        notifyPropertyChanged(BR.h214b04);
    }

    @Bindable
    public String getH214b05() {
        return h214b05;
    }

    public void setH214b05(String h214b05) {
        if (this.h214b05.equals(h214b05)) return;     // For all checkboxes
        this.h214b05 = h214b05;
        notifyPropertyChanged(BR.h214b05);
    }

    @Bindable
    public String getH214b06() {
        return h214b06;
    }

    public void setH214b06(String h214b06) {
        if (this.h214b06.equals(h214b06)) return;     // For all checkboxes
        this.h214b06 = h214b06;
        notifyPropertyChanged(BR.h214b06);
    }

    @Bindable
    public String getH214b96() {
        return h214b96;
    }

    public void setH214b96(String h214b96) {
        if (this.h214b96.equals(h214b96)) return;     // For all checkboxes
        this.h214b96 = h214b96;
        notifyPropertyChanged(BR.h214b96);
    }

    @Bindable
    public String getH214b96x() {
        return h214b96x;
    }

    public void setH214b96x(String h214b96x) {
        this.h214b96x = h214b96x;
        notifyPropertyChanged(BR.h214b96x);
    }

    @Bindable
    public String getH214b98() {
        return h214b98;
    }

    public void setH214b98(String h214b98) {
        if (this.h214b98.equals(h214b98)) return;     // For all checkboxes
        this.h214b98 = h214b98;
        notifyPropertyChanged(BR.h214b98);
    }

    @Bindable
    public String getH215() {
        return h215;
    }

    public void setH215(String h215) {
        this.h215 = h215;
        notifyPropertyChanged(BR.h215);
    }

    @Bindable
    public String getH216() {
        return h216;
    }

    public void setH216(String h216) {
        this.h216 = h216;
        notifyPropertyChanged(BR.h216);
    }

    @Bindable
    public String getH216a() {
        return h216a;
    }

    public void setH216a(String h216a) {
        this.h216a = h216a;
        notifyPropertyChanged(BR.h216a);
    }

    @Bindable
    public String getH216a96x() {
        return h216a96x;
    }

    public void setH216a96x(String h216a96x) {
        this.h216a96x = h216a96x;
        notifyPropertyChanged(BR.h216a96x);
    }

    @Bindable
    public String getH217() {
        return h217;
    }

    public void setH217(String h217) {
        this.h217 = h217;
        notifyPropertyChanged(BR.h217);
    }

    @Bindable
    public String getH21701() {
        return h21701;
    }

    public void setH21701(String h21701) {
        if (this.h21701.equals(h21701)) return;     // For all checkboxes
        this.h21701 = h21701;
        notifyPropertyChanged(BR.h21701);
    }

    @Bindable
    public String getH21702() {
        return h21702;
    }

    public void setH21702(String h21702) {
        if (this.h21702.equals(h21702)) return;     // For all checkboxes
        this.h21702 = h21702;
        notifyPropertyChanged(BR.h21702);
    }

    @Bindable
    public String getH21703() {
        return h21703;
    }

    public void setH21703(String h21703) {
        if (this.h21703.equals(h21703)) return;     // For all checkboxes
        this.h21703 = h21703;
        notifyPropertyChanged(BR.h21703);
    }

    @Bindable
    public String getH21704() {
        return h21704;
    }

    public void setH21704(String h21704) {
        if (this.h21704.equals(h21704)) return;     // For all checkboxes
        this.h21704 = h21704;
        notifyPropertyChanged(BR.h21704);
    }

    @Bindable
    public String getH21705() {
        return h21705;
    }

    public void setH21705(String h21705) {
        if (this.h21705.equals(h21705)) return;     // For all checkboxes
        this.h21705 = h21705;
        notifyPropertyChanged(BR.h21705);
    }

    @Bindable
    public String getH21706() {
        return h21706;
    }

    public void setH21706(String h21706) {
        if (this.h21706.equals(h21706)) return;     // For all checkboxes
        this.h21706 = h21706;
        notifyPropertyChanged(BR.h21706);
    }

    @Bindable
    public String getH21796() {
        return h21796;
    }

    public void setH21796(String h21796) {
        if (this.h21796.equals(h21796)) return;     // For all checkboxes
        this.h21796 = h21796;
        notifyPropertyChanged(BR.h21796);
    }

    @Bindable
    public String getH21796x() {
        return h21796x;
    }

    public void setH21796x(String h21796x) {
        this.h21796x = h21796x;
        notifyPropertyChanged(BR.h21796x);
    }

    @Bindable
    public String getH218() {
        return h218;
    }

    public void setH218(String h218) {
        this.h218 = h218;
        notifyPropertyChanged(BR.h218);
    }

    @Bindable
    public String getH219() {
        return h219;
    }

    public void setH219(String h219) {
        this.h219 = h219;
        notifyPropertyChanged(BR.h219);
    }

    @Bindable
    public String getH21996x() {
        return h21996x;
    }

    public void setH21996x(String h21996x) {
        this.h21996x = h21996x;
        notifyPropertyChanged(BR.h21996x);
    }

    @Bindable
    public String getH220() {
        return h220;
    }

    public void setH220(String h220) {
        this.h220 = h220;
        notifyPropertyChanged(BR.h220);
    }

    @Bindable
    public String getH2201() {
        return h2201;
    }

    public void setH2201(String h2201) {
        if (this.h2201.equals(h2201)) return;     // For all checkboxes
        this.h2201 = h2201;
        notifyPropertyChanged(BR.h2201);
    }

    @Bindable
    public String getH2201x() {
        return h2201x;
    }

    public void setH2201x(String h2201x) {
        this.h2201x = h2201x;
        notifyPropertyChanged(BR.h2201x);
    }

    @Bindable
    public String getH2202() {
        return h2202;
    }

    public void setH2202(String h2202) {
        if (this.h2202.equals(h2202)) return;     // For all checkboxes
        this.h2202 = h2202;
        notifyPropertyChanged(BR.h2202);
    }

    @Bindable
    public String getH2202x() {
        return h2202x;
    }

    public void setH2202x(String h2202x) {
        this.h2202x = h2202x;
        notifyPropertyChanged(BR.h2202x);
    }

    @Bindable
    public String getH2203() {
        return h2203;
    }

    public void setH2203(String h2203) {
        if (this.h2203.equals(h2203)) return;     // For all checkboxes
        this.h2203 = h2203;
        notifyPropertyChanged(BR.h2203);
    }

    @Bindable
    public String getH2203x() {
        return h2203x;
    }

    public void setH2203x(String h2203x) {
        this.h2203x = h2203x;
        notifyPropertyChanged(BR.h2203x);
    }

    @Bindable
    public String getH2204() {
        return h2204;
    }

    public void setH2204(String h2204) {
        if (this.h2204.equals(h2204)) return;     // For all checkboxes
        this.h2204 = h2204;
        notifyPropertyChanged(BR.h2204);
    }

    @Bindable
    public String getH2204x() {
        return h2204x;
    }

    public void setH2204x(String h2204x) {
        this.h2204x = h2204x;
        notifyPropertyChanged(BR.h2204x);
    }

    @Bindable
    public String getH2205() {
        return h2205;
    }

    public void setH2205(String h2205) {
        if (this.h2205.equals(h2205)) return;     // For all checkboxes
        this.h2205 = h2205;
        notifyPropertyChanged(BR.h2205);
    }

    @Bindable
    public String getH2205x() {
        return h2205x;
    }

    public void setH2205x(String h2205x) {
        this.h2205x = h2205x;
        notifyPropertyChanged(BR.h2205x);
    }

    @Bindable
    public String getH2206() {
        return h2206;
    }

    public void setH2206(String h2206) {
        if (this.h2206.equals(h2206)) return;     // For all checkboxes
        this.h2206 = h2206;
        notifyPropertyChanged(BR.h2206);
    }

    @Bindable
    public String getH2206x() {
        return h2206x;
    }

    public void setH2206x(String h2206x) {
        this.h2206x = h2206x;
        notifyPropertyChanged(BR.h2206x);
    }

    @Bindable
    public String getH22096() {
        return h22096;
    }

    public void setH22096(String h22096) {
        if (this.h22096.equals(h22096)) return;     // For all checkboxes
        this.h22096 = h22096;
        notifyPropertyChanged(BR.h22096);
    }

    @Bindable
    public String getH22096x() {
        return h22096x;
    }

    public void setH22096x(String h22096x) {
        this.h22096x = h22096x;
        notifyPropertyChanged(BR.h22096x);
    }

    @Bindable
    public String getH221() {
        return h221;
    }

    public void setH221(String h221) {
        this.h221 = h221;
        notifyPropertyChanged(BR.h221);
    }

    @Bindable
    public String getH222() {
        return h222;
    }

    public void setH222(String h222) {
        this.h222 = h222;
        notifyPropertyChanged(BR.h222);
    }

    @Bindable
    public String getH223() {
        return h223;
    }

    public void setH223(String h223) {
        this.h223 = h223;
        notifyPropertyChanged(BR.h223);
    }

    @Bindable
    public String getK101() {
        return k101;
    }

    public void setK101(String k101) {
        this.k101 = k101;
        setK101a01(k101.equals("1") ? this.k101a01 : "");
        setK101a02(k101.equals("1") ? this.k101a02 : "");
        setK101a03(k101.equals("1") ? this.k101a03 : "");
        setK101a04(k101.equals("1") ? this.k101a04 : "");
        setK101a05(k101.equals("1") ? this.k101a05 : "");
        setK101a06(k101.equals("1") ? this.k101a06 : "");
        setK101a07(k101.equals("1") ? this.k101a07 : "");
        setK101a08(k101.equals("1") ? this.k101a08 : "");
        setK101a09(k101.equals("1") ? this.k101a09 : "");
        setK101a10(k101.equals("1") ? this.k101a10 : "");
        setK101a11(k101.equals("1") ? this.k101a11 : "");
        setK101a12(k101.equals("1") ? this.k101a12 : "");
        setK101a13(k101.equals("1") ? this.k101a13 : "");
        setK101a96(k101.equals("1") ? this.k101a96 : "");
        notifyPropertyChanged(BR.k101);
    }

    @Bindable
    public String getK101a() {
        return k101a;
    }

    public void setK101a(String k101a) {
        this.k101a = k101a;
        notifyPropertyChanged(BR.k101a);
    }

    @Bindable
    public String getK101a01() {
        return k101a01;
    }

    public void setK101a01(String k101a01) {
        if (this.k101a01.equals(k101a01)) return; // for all checkboxes
        this.k101a01 = k101a01;
        notifyPropertyChanged(BR.k101a01);
    }

    @Bindable
    public String getK101a02() {
        return k101a02;
    }

    public void setK101a02(String k101a02) {
        if (this.k101a02.equals(k101a02)) return; // for all checkboxes
        this.k101a02 = k101a02;
        notifyPropertyChanged(BR.k101a02);
    }

    @Bindable
    public String getK101a03() {
        return k101a03;
    }

    public void setK101a03(String k101a03) {
        if (this.k101a03.equals(k101a03)) return; // for all checkboxes
        this.k101a03 = k101a03;
        notifyPropertyChanged(BR.k101a03);
    }

    @Bindable
    public String getK101a04() {
        return k101a04;
    }

    public void setK101a04(String k101a04) {
        if (this.k101a04.equals(k101a04)) return; // for all checkboxes
        this.k101a04 = k101a04;
        notifyPropertyChanged(BR.k101a04);
    }

    @Bindable
    public String getK101a05() {
        return k101a05;
    }

    public void setK101a05(String k101a05) {
        if (this.k101a05.equals(k101a05)) return; // for all checkboxes
        this.k101a05 = k101a05;
        notifyPropertyChanged(BR.k101a05);
    }

    @Bindable
    public String getK101a06() {
        return k101a06;
    }

    public void setK101a06(String k101a06) {
        if (this.k101a06.equals(k101a06)) return; // for all checkboxes
        this.k101a06 = k101a06;
        notifyPropertyChanged(BR.k101a06);
    }

    @Bindable
    public String getK101a07() {
        return k101a07;
    }

    public void setK101a07(String k101a07) {
        if (this.k101a07.equals(k101a07)) return; // for all checkboxes
        this.k101a07 = k101a07;
        notifyPropertyChanged(BR.k101a07);
    }

    @Bindable
    public String getK101a08() {
        return k101a08;
    }

    public void setK101a08(String k101a08) {
        if (this.k101a08.equals(k101a08)) return; // for all checkboxes
        this.k101a08 = k101a08;
        notifyPropertyChanged(BR.k101a08);
    }

    @Bindable
    public String getK101a09() {
        return k101a09;
    }

    public void setK101a09(String k101a09) {
        if (this.k101a09.equals(k101a09)) return; // for all checkboxes
        this.k101a09 = k101a09;
        notifyPropertyChanged(BR.k101a09);
    }

    @Bindable
    public String getK101a10() {
        return k101a10;
    }

    public void setK101a10(String k101a10) {
        if (this.k101a10.equals(k101a10)) return; // for all checkboxes
        this.k101a10 = k101a10;
        notifyPropertyChanged(BR.k101a10);
    }

    @Bindable
    public String getK101a11() {
        return k101a11;
    }

    public void setK101a11(String k101a11) {
        if (this.k101a11.equals(k101a11)) return; // for all checkboxes
        this.k101a11 = k101a11;
        notifyPropertyChanged(BR.k101a11);
    }

    @Bindable
    public String getK101a12() {
        return k101a12;
    }

    public void setK101a12(String k101a12) {
        if (this.k101a12.equals(k101a12)) return; // for all checkboxes
        this.k101a12 = k101a12;
        notifyPropertyChanged(BR.k101a12);
    }

    @Bindable
    public String getK101a13() {
        return k101a13;
    }

    public void setK101a13(String k101a13) {
        if (this.k101a13.equals(k101a13)) return; // for all checkboxes
        this.k101a13 = k101a13;
        notifyPropertyChanged(BR.k101a13);
    }

    @Bindable
    public String getK101a96() {
        return k101a96;
    }

    public void setK101a96(String k101a96) {
        if (this.k101a96.equals(k101a96)) return; // for all checkboxes
        this.k101a96 = k101a96;
        setK101a96x(k101a96.equals("96") ? this.k101a96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k101a96);
    }

    @Bindable
    public String getK101a96x() {
        return k101a96x;
    }

    public void setK101a96x(String k101a96x) {
        this.k101a96x = k101a96x;
        notifyPropertyChanged(BR.k101a96x);
    }

    @Bindable
    public String getK102() {
        return k102;
    }

    public void setK102(String k102) {
        this.k102 = k102;
        setK104a01(k102.equals("1") ? this.k104a01 : "");
        setK104a02(k102.equals("1") ? this.k104a02 : "");
        setK104a03(k102.equals("1") ? this.k104a03 : "");
        setK104a04(k102.equals("1") ? this.k104a04 : "");
        setK104a05(k102.equals("1") ? this.k104a05 : "");
        setK104a06(k102.equals("1") ? this.k104a06 : "");
        setK104a77(k102.equals("1") ? this.k104a77 : "");
        setK104a08(k102.equals("1") ? this.k104a08 : "");
        setK104a09(k102.equals("1") ? this.k104a09 : "");
        setK104a10(k102.equals("1") ? this.k104a10 : "");
        setK104a11(k102.equals("1") ? this.k104a11 : "");
        setK104a12(k102.equals("1") ? this.k104a12 : "");
        setK104a13(k102.equals("1") ? this.k104a13 : "");

        setK103(k102.equals("1") ? this.k103 : "");

        setK104b01(k102.equals("1") ? this.k104b01 : "");
        setK104b02(k102.equals("1") ? this.k104b02 : "");
        setK104b03(k102.equals("1") ? this.k104b03 : "");
        setK104b04(k102.equals("1") ? this.k104b04 : "");
        setK104b05(k102.equals("1") ? this.k104b05 : "");
        setK104b06(k102.equals("1") ? this.k104b06 : "");
        setK104b07(k102.equals("1") ? this.k104b07 : "");
        setK104b08(k102.equals("1") ? this.k104b08 : "");
        setK104b09(k102.equals("1") ? this.k104b09 : "");
        setK104b10(k102.equals("1") ? this.k104b10 : "");
        setK104b11(k102.equals("1") ? this.k104b11 : "");
        setK104b12(k102.equals("1") ? this.k104b12 : "");
        setK104b13(k102.equals("1") ? this.k104b13 : "");

        setK105(k102.equals("1") ? this.k105 : "");
        setK105a(k102.equals("1") ? this.k105a : "");
        notifyPropertyChanged(BR.k102);
    }

    @Bindable
    public String getK104a() {
        return k104a;
    }

    public void setK104a(String k104a) {
        this.k104a = k104a;
        notifyPropertyChanged(BR.k104a);
    }

    @Bindable
    public String getK104a01() {
        return k104a01;
    }

    public void setK104a01(String k104a01) {
        if (this.k104a01.equals(k104a01)) return; // for all checkboxes
        this.k104a01 = k104a01;
        notifyPropertyChanged(BR.k104a01);
    }

    @Bindable
    public String getK104a02() {
        return k104a02;
    }

    public void setK104a02(String k104a02) {
        if (this.k104a02.equals(k104a02)) return; // for all checkboxes
        this.k104a02 = k104a02;
        notifyPropertyChanged(BR.k104a02);
    }

    @Bindable
    public String getK104a03() {
        return k104a03;
    }

    public void setK104a03(String k104a03) {
        if (this.k104a03.equals(k104a03)) return; // for all checkboxes
        this.k104a03 = k104a03;
        notifyPropertyChanged(BR.k104a03);
    }

    @Bindable
    public String getK104a04() {
        return k104a04;
    }

    public void setK104a04(String k104a04) {
        if (this.k104a04.equals(k104a04)) return; // for all checkboxes
        this.k104a04 = k104a04;
        notifyPropertyChanged(BR.k104a04);
    }

    @Bindable
    public String getK104a05() {
        return k104a05;
    }

    public void setK104a05(String k104a05) {
        if (this.k104a05.equals(k104a05)) return; // for all checkboxes
        this.k104a05 = k104a05;
        notifyPropertyChanged(BR.k104a05);
    }

    @Bindable
    public String getK104a06() {
        return k104a06;
    }

    public void setK104a06(String k104a06) {
        if (this.k104a06.equals(k104a06)) return; // for all checkboxes
        this.k104a06 = k104a06;
        notifyPropertyChanged(BR.k104a06);
    }

    @Bindable
    public String getK104a77() {
        return k104a77;
    }

    public void setK104a77(String k104a77) {
        if (this.k104a77.equals(k104a77)) return; // for all checkboxes
        this.k104a77 = k104a77;
        notifyPropertyChanged(BR.k104a77);
    }

    @Bindable
    public String getK104a08() {
        return k104a08;
    }

    public void setK104a08(String k104a08) {
        if (this.k104a08.equals(k104a08)) return; // for all checkboxes
        this.k104a08 = k104a08;
        notifyPropertyChanged(BR.k104a08);
    }

    @Bindable
    public String getK104a09() {
        return k104a09;
    }

    public void setK104a09(String k104a09) {
        if (this.k104a09.equals(k104a09)) return; // for all checkboxes
        this.k104a09 = k104a09;
        notifyPropertyChanged(BR.k104a09);
    }

    @Bindable
    public String getK104a10() {
        return k104a10;
    }

    public void setK104a10(String k104a10) {
        if (this.k104a10.equals(k104a10)) return; // for all checkboxes
        this.k104a10 = k104a10;
        notifyPropertyChanged(BR.k104a10);
    }

    @Bindable
    public String getK104a11() {
        return k104a11;
    }

    public void setK104a11(String k104a11) {
        if (this.k104a11.equals(k104a11)) return; // for all checkboxes
        this.k104a11 = k104a11;
        notifyPropertyChanged(BR.k104a11);
    }

    @Bindable
    public String getK104a12() {
        return k104a12;
    }

    public void setK104a12(String k104a12) {
        if (this.k104a12.equals(k104a12)) return; // for all checkboxes
        this.k104a12 = k104a12;
        notifyPropertyChanged(BR.k104a12);
    }

    @Bindable
    public String getK104a13() {
        return k104a13;
    }

    public void setK104a13(String k104a13) {
        if (this.k104a13.equals(k104a13)) return; // for all checkboxes
        this.k104a13 = k104a13;
        notifyPropertyChanged(BR.k104a13);
    }

    @Bindable
    public String getK103() {
        return k103;
    }

    public void setK103(String k103) {
        this.k103 = k103;
        notifyPropertyChanged(BR.k103);
    }

    @Bindable
    public String getK104b() {
        return k104b;
    }

    public void setK104b(String k104b) {
        this.k104b = k104b;
        notifyPropertyChanged(BR.k104b);
    }

    @Bindable
    public String getK104b01() {
        return k104b01;
    }

    public void setK104b01(String k104b01) {
        if (this.k104b01.equals(k104b01)) return; // for all checkboxes
        this.k104b01 = k104b01;
        notifyPropertyChanged(BR.k104b01);
    }

    @Bindable
    public String getK104b02() {
        return k104b02;
    }

    public void setK104b02(String k104b02) {
        if (this.k104b02.equals(k104b02)) return; // for all checkboxes
        this.k104b02 = k104b02;
        notifyPropertyChanged(BR.k104b02);
    }

    @Bindable
    public String getK104b03() {
        return k104b03;
    }

    public void setK104b03(String k104b03) {
        if (this.k104b03.equals(k104b03)) return; // for all checkboxes
        this.k104b03 = k104b03;
        notifyPropertyChanged(BR.k104b03);
    }

    @Bindable
    public String getK104b04() {
        return k104b04;
    }

    public void setK104b04(String k104b04) {
        if (this.k104b04.equals(k104b04)) return; // for all checkboxes
        this.k104b04 = k104b04;
        notifyPropertyChanged(BR.k104b04);
    }

    @Bindable
    public String getK104b05() {
        return k104b05;
    }

    public void setK104b05(String k104b05) {
        if (this.k104b05.equals(k104b05)) return; // for all checkboxes
        this.k104b05 = k104b05;
        notifyPropertyChanged(BR.k104b05);
    }

    @Bindable
    public String getK104b06() {
        return k104b06;
    }

    public void setK104b06(String k104b06) {
        if (this.k104b06.equals(k104b06)) return; // for all checkboxes
        this.k104b06 = k104b06;
        notifyPropertyChanged(BR.k104b06);
    }

    @Bindable
    public String getK104b07() {
        return k104b07;
    }

    public void setK104b07(String k104b07) {
        if (this.k104b07.equals(k104b07)) return; // for all checkboxes
        this.k104b07 = k104b07;
        notifyPropertyChanged(BR.k104b07);
    }

    @Bindable
    public String getK104b08() {
        return k104b08;
    }

    public void setK104b08(String k104b08) {
        if (this.k104b08.equals(k104b08)) return; // for all checkboxes
        this.k104b08 = k104b08;
        notifyPropertyChanged(BR.k104b08);
    }

    @Bindable
    public String getK104b09() {
        return k104b09;
    }

    public void setK104b09(String k104b09) {
        if (this.k104b09.equals(k104b09)) return; // for all checkboxes
        this.k104b09 = k104b09;
        notifyPropertyChanged(BR.k104b09);
    }

    @Bindable
    public String getK104b10() {
        return k104b10;
    }

    public void setK104b10(String k104b10) {
        if (this.k104b10.equals(k104b10)) return; // for all checkboxes
        this.k104b10 = k104b10;
        notifyPropertyChanged(BR.k104b10);
    }

    @Bindable
    public String getK104b11() {
        return k104b11;
    }

    public void setK104b11(String k104b11) {
        if (this.k104b11.equals(k104b11)) return; // for all checkboxes
        this.k104b11 = k104b11;
        notifyPropertyChanged(BR.k104b11);
    }

    @Bindable
    public String getK104b12() {
        return k104b12;
    }

    public void setK104b12(String k104b12) {
        if (this.k104b12.equals(k104b12)) return; // for all checkboxes
        this.k104b12 = k104b12;
        notifyPropertyChanged(BR.k104b12);
    }

    @Bindable
    public String getK104b13() {
        return k104b13;
    }

    public void setK104b13(String k104b13) {
        if (this.k104b13.equals(k104b13)) return; // for all checkboxes
        this.k104b13 = k104b13;
        notifyPropertyChanged(BR.k104b13);
    }

    @Bindable
    public String getK105() {
        return k105;
    }

    public void setK105(String k105) {
        this.k105 = k105;
        notifyPropertyChanged(BR.k105);
    }

    @Bindable
    public String getK105a() {
        return k105a;
    }

    public void setK105a(String k105a) {
        this.k105a = k105a;
        setK105a01x(k105a.equals("1") ? this.k105a01x : ""); // for all skips, mention all skipped questions
        setK105a02x(k105a.equals("2") ? this.k105a02x : ""); // for all skips, mention all skipped questions

        setK10601(k105a.equals("3") ? this.k10601 : "");
        setK10602(k105a.equals("3") ? this.k10602 : "");
        setK10603(k105a.equals("3") ? this.k10603 : "");
        setK10604(k105a.equals("3") ? this.k10604 : "");
        setK10605(k105a.equals("3") ? this.k10605 : "");
        setK10606(k105a.equals("3") ? this.k10606 : "");
        setK10607(k105a.equals("3") ? this.k10607 : "");
        setK10608(k105a.equals("3") ? this.k10608 : "");
        setK10696(k105a.equals("3") ? this.k10696 : "");
        notifyPropertyChanged(BR.k105a);
    }

    @Bindable
    public String getK105a01x() {
        return k105a01x;
    }

    public void setK105a01x(String k105a01x) {
        this.k105a01x = k105a01x;
        notifyPropertyChanged(BR.k105a01x);
    }

    @Bindable
    public String getK105a02x() {
        return k105a02x;
    }

    public void setK105a02x(String k105a02x) {
        this.k105a02x = k105a02x;
        notifyPropertyChanged(BR.k105a02x);
    }

    @Bindable
    public String getK106() {
        return k106;
    }

    public void setK106(String k106) {
        this.k106 = k106;
        notifyPropertyChanged(BR.k106);
    }

    @Bindable
    public String getK10601() {
        return k10601;
    }

    public void setK10601(String k10601) {
        if (this.k10601.equals(k10601)) return; // for all checkboxes
        this.k10601 = k10601;
        notifyPropertyChanged(BR.k10601);
    }

    @Bindable
    public String getK10602() {
        return k10602;
    }

    public void setK10602(String k10602) {
        if (this.k10602.equals(k10602)) return; // for all checkboxes
        this.k10602 = k10602;
        notifyPropertyChanged(BR.k10602);
    }

    @Bindable
    public String getK10603() {
        return k10603;
    }

    public void setK10603(String k10603) {
        if (this.k10603.equals(k10603)) return; // for all checkboxes
        this.k10603 = k10603;
        notifyPropertyChanged(BR.k10603);
    }

    @Bindable
    public String getK10604() {
        return k10604;
    }

    public void setK10604(String k10604) {
        if (this.k10604.equals(k10604)) return; // for all checkboxes
        this.k10604 = k10604;
        notifyPropertyChanged(BR.k10604);
    }

    @Bindable
    public String getK10605() {
        return k10605;
    }

    public void setK10605(String k10605) {
        if (this.k10605.equals(k10605)) return; // for all checkboxes
        this.k10605 = k10605;
        notifyPropertyChanged(BR.k10605);
    }

    @Bindable
    public String getK10606() {
        return k10606;
    }

    public void setK10606(String k10606) {
        if (this.k10606.equals(k10606)) return; // for all checkboxes
        this.k10606 = k10606;
        notifyPropertyChanged(BR.k10606);
    }

    @Bindable
    public String getK10607() {
        return k10607;
    }

    public void setK10607(String k10607) {
        if (this.k10607.equals(k10607)) return; // for all checkboxes
        this.k10607 = k10607;
        notifyPropertyChanged(BR.k10607);
    }

    @Bindable
    public String getK10608() {
        return k10608;
    }

    public void setK10608(String k10608) {
        if (this.k10608.equals(k10608)) return; // for all checkboxes
        this.k10608 = k10608;
        notifyPropertyChanged(BR.k10608);
    }

    @Bindable
    public String getK10696() {
        return k10696;
    }

    public void setK10696(String k10696) {
        if (this.k10696.equals(k10696)) return; // for all checkboxes
        this.k10696 = k10696;
        setK10696x(k10696.equals("96") ? this.k10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k10696);
    }

    @Bindable
    public String getK10696x() {
        return k10696x;
    }

    public void setK10696x(String k10696x) {
        this.k10696x = k10696x;
        notifyPropertyChanged(BR.k10696x);
    }

    @Bindable
    public String getK107() {
        return k107;
    }

    public void setK107(String k107) {
        this.k107 = k107;
        setK107a(k107.equals("2") ? this.k107a : "");
        notifyPropertyChanged(BR.k107);
    }

    @Bindable
    public String getK107a() {
        return k107a;
    }

    public void setK107a(String k107a) {
        this.k107a = k107a;
        setK107a96x(k107a.equals("96") ? this.k107a96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.k107a);
    }

    @Bindable
    public String getK107a96x() {
        return k107a96x;
    }

    public void setK107a96x(String k107a96x) {
        this.k107a96x = k107a96x;
        notifyPropertyChanged(BR.k107a96x);
    }

    @Bindable
    public String getL101() {
        return l101;
    }

    public void setL101(String l101) {
        this.l101 = l101;
        notifyPropertyChanged(BR.l101);
    }

    @Bindable
    public String getL102() {
        return l102;
    }

    public void setL102(String l102) {
        this.l102 = l102;
        setL102a(l102.equals("1") ? this.l102a : "");
        setL103(l102.equals("1") ? this.l103 : "");
        notifyPropertyChanged(BR.l102);
    }

    @Bindable
    public String getL102a() {
        return l102a;
    }

    public void setL102a(String l102a) {
        this.l102a = l102a;
        setL102a96x(l102a.equals("96") ? this.l102a96x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l102a);
    }

    @Bindable
    public String getL102a96x() {
        return l102a96x;
    }

    public void setL102a96x(String l102a96x) {
        this.l102a96x = l102a96x;
        notifyPropertyChanged(BR.l102a96x);
    }

    @Bindable
    public String getL103() {
        return l103;
    }

    public void setL103(String l103) {
        this.l103 = l103;
        setL104(l103.equals("1") ? this.l104 : "");
        setL105(l103.equals("1") ? this.l105 : "");
        setL106(l103.equals("1") ? this.l106 : "");
        notifyPropertyChanged(BR.l103);
    }

    @Bindable
    public String getL104() {
        return l104;
    }

    public void setL104(String l104) {
        this.l104 = l104;
        setL10496x(l104.equals("96") ? this.l10496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l104);
    }

    @Bindable
    public String getL10496x() {
        return l10496x;
    }

    public void setL10496x(String l10496x) {
        this.l10496x = l10496x;
        notifyPropertyChanged(BR.l10496x);
    }

    @Bindable
    public String getL105() {
        return l105;
    }

    public void setL105(String l105) {
        this.l105 = l105;
        setL106(l105.equals("3") ? this.l106 : "");
        setL107(l105.equals("3") ? this.l107 : "");
        notifyPropertyChanged(BR.l105);
    }

    @Bindable
    public String getL106() {
        return l106;
    }

    public void setL106(String l106) {
        this.l106 = l106;
        setL10696x(l106.equals("96") ? this.l10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l106);
    }

    @Bindable
    public String getL10696x() {
        return l10696x;
    }

    public void setL10696x(String l10696x) {
        this.l10696x = l10696x;
        notifyPropertyChanged(BR.l10696x);
    }

    @Bindable
    public String getL107() {
        return l107;
    }

    public void setL107(String l107) {
        this.l107 = l107;
        setL10796x(l107.equals("96") ? this.l10796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l107);
    }

    @Bindable
    public String getL10796x() {
        return l10796x;
    }

    public void setL10796x(String l10796x) {
        this.l10796x = l10796x;
        notifyPropertyChanged(BR.l10796x);
    }

    @Bindable
    public String getL108() {
        return l108;
    }

    public void setL108(String l108) {
        this.l108 = l108;
        setL10896x(l108.equals("96") ? this.l10896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l108);
    }

    @Bindable
    public String getL10896x() {
        return l10896x;
    }

    public void setL10896x(String l10896x) {
        this.l10896x = l10896x;
        notifyPropertyChanged(BR.l10896x);
    }

    @Bindable
    public String getL109() {
        return l109;
    }

    public void setL109(String l109) {
        this.l109 = l109;
        setL10996x(l109.equals("96") ? this.l10996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l109);
    }

    @Bindable
    public String getL10996x() {
        return l10996x;
    }

    public void setL10996x(String l10996x) {
        this.l10996x = l10996x;
        notifyPropertyChanged(BR.l10996x);
    }

    @Bindable
    public String getL110() {
        return l110;
    }

    public void setL110(String l110) {
        this.l110 = l110;
        notifyPropertyChanged(BR.l110);
    }

    @Bindable
    public String getL111() {
        return l111;
    }

    public void setL111(String l111) {
        this.l111 = l111;
        notifyPropertyChanged(BR.l111);
    }

    @Bindable
    public String getL1121() {
        return l1121;
    }

    public void setL1121(String l1121) {
        this.l1121 = l1121;
        notifyPropertyChanged(BR.l1121);
    }

    @Bindable
    public String getL1122() {
        return l1122;
    }

    public void setL1122(String l1122) {
        this.l1122 = l1122;
        notifyPropertyChanged(BR.l1122);
    }

    @Bindable
    public String getL1123() {
        return l1123;
    }

    public void setL1123(String l1123) {
        this.l1123 = l1123;
        notifyPropertyChanged(BR.l1123);
    }

    @Bindable
    public String getL1124() {
        return l1124;
    }

    public void setL1124(String l1124) {
        this.l1124 = l1124;
        notifyPropertyChanged(BR.l1124);
    }

    @Bindable
    public String getL1125() {
        return l1125;
    }

    public void setL1125(String l1125) {
        this.l1125 = l1125;
        notifyPropertyChanged(BR.l1125);
    }

    @Bindable
    public String getL1131() {
        return l1131;
    }

    public void setL1131(String l1131) {
        this.l1131 = l1131;
        notifyPropertyChanged(BR.l1131);
    }

    @Bindable
    public String getL1132() {
        return l1132;
    }

    public void setL1132(String l1132) {
        this.l1132 = l1132;
        notifyPropertyChanged(BR.l1132);
    }

    @Bindable
    public String getL1133() {
        return l1133;
    }

    public void setL1133(String l1133) {
        this.l1133 = l1133;
        notifyPropertyChanged(BR.l1133);
    }

    @Bindable
    public String getL1134() {
        return l1134;
    }

    public void setL1134(String l1134) {
        this.l1134 = l1134;
        notifyPropertyChanged(BR.l1134);
    }

    @Bindable
    public String getL114() {
        return l114;
    }

    public void setL114(String l114) {
        this.l114 = l114;
        setL11496x(l114.equals("96") ? this.l11496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l114);
    }

    @Bindable
    public String getL11496x() {
        return l11496x;
    }

    public void setL11496x(String l11496x) {
        this.l11496x = l11496x;
        notifyPropertyChanged(BR.l11496x);
    }

    @Bindable
    public String getL115() {
        return l115;
    }

    public void setL115(String l115) {
        this.l115 = l115;
        setL11596x(l115.equals("96") ? this.l11596x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l115);
    }

    @Bindable
    public String getL11596x() {
        return l11596x;
    }

    public void setL11596x(String l11596x) {
        this.l11596x = l11596x;
        notifyPropertyChanged(BR.l11596x);
    }

    @Bindable
    public String getL116() {
        return l116;
    }

    public void setL116(String l116) {
        this.l116 = l116;
        setL11696x(l116.equals("96") ? this.l11696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l116);
    }

    @Bindable
    public String getL11696x() {
        return l11696x;
    }

    public void setL11696x(String l11696x) {
        this.l11696x = l11696x;
        notifyPropertyChanged(BR.l11696x);
    }

    @Bindable
    public String getL117() {
        return l117;
    }

    public void setL117(String l117) {
        this.l117 = l117;
        setL11796x(l117.equals("96") ? this.l11796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.l117);
    }

    @Bindable
    public String getL11796x() {
        return l11796x;
    }

    public void setL11796x(String l11796x) {
        this.l11796x = l11796x;
        notifyPropertyChanged(BR.l11796x);
    }


    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.MwraTable.COLUMN_ID, this.id);
        json.put(TableContracts.MwraTable.COLUMN_UID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_PROJECT_NAME, this.projectName);

        json.put(TableContracts.MwraTable.COLUMN_UUID, this.uid);
        json.put(TableContracts.MwraTable.COLUMN_HHID, this.hhid);
        // json.put(TableContracts.MwraTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.MwraTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.MwraTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.MwraTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.MwraTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.MwraTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.MwraTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.MwraTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.MwraTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.MwraTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.MwraTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.MwraTable.COLUMN_SF, new JSONObject(sFtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SG, new JSONObject(sGtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SH1, new JSONObject(sH1toString()));
        json.put(TableContracts.MwraTable.COLUMN_SH2, new JSONObject(sH2toString()));
        json.put(TableContracts.MwraTable.COLUMN_SK, new JSONObject(sKtoString()));
        json.put(TableContracts.MwraTable.COLUMN_SL, new JSONObject(sLtoString()));

        return json;
    }


    public String sFtoString() throws JSONException {
        Log.d(TAG, "sFtoString: ");
        JSONObject json = new JSONObject();
        json.put("f101", f101)
                .put("f101a01", f101a01)
                .put("f101a02", f101a02)
                .put("f101a03", f101a03)
                .put("f101a04", f101a04)
                .put("f101a05", f101a05)
                .put("f101a06", f101a06)
                .put("f101a07", f101a07)
                .put("f101a08", f101a08)
                .put("f101a09", f101a09)
                .put("f101a10", f101a10)
                .put("f101a11", f101a11)
                .put("f101a12", f101a12)
                .put("f101a13", f101a13)
                .put("f101a14", f101a14)
                .put("f101a96", f101a96)
                .put("f101b", f101b)
                .put("f101b01x", f101b01x)
                .put("f10201", f10201)
                .put("f10202", f10202)
                .put("f10203", f10203)
                .put("f10204", f10204)
                .put("f10205", f10205)
                .put("f10206", f10206)
                .put("f10207", f10207)
                .put("f10208", f10208)
                .put("f10209", f10209)
                .put("f10210", f10210)
                .put("f10296", f10296)
                .put("f10296x", f10296x)
                .put("f10301", f10301)
                .put("f10302", f10302)
                .put("f10303", f10303)
                .put("f10304", f10304)
                .put("f10305", f10305)
                .put("f107", f107)
                .put("f10796x", f10796x)
                .put("f108", f108)
                .put("f108wx", f108wx)
                .put("f108mx", f108mx)
                .put("f11001", f11001)
                .put("f11002", f11002)
                .put("f11003", f11003)
                .put("f11004", f11004)
                .put("f11005", f11005)
                .put("f11006", f11006)
                .put("f11007", f11007)
                .put("f11008", f11008)
                .put("f11009", f11009)
                .put("f11096", f11096)
                .put("f1109696x", f1109696x)
                .put("f111", f111)
                .put("f112", f112)
                .put("f113", f113)
                .put("f11301x", f11301x)
                .put("f114", f114)
                .put("f116", f116)
                .put("f117", f117)
                .put("f118m", f118m)
                .put("f118d", f118d)
                .put("f119", f119)
                .put("f120", f120)
                .put("f12001x", f12001x)
                .put("f121a", f121a)
                .put("f121b", f121b)
                .put("f121b96x", f121b96x)
                .put("f122", f122)
                .put("f12201x", f12201x)
                .put("f12301", f12301)
                .put("f12302", f12302)
                .put("f12303", f12303)
                .put("f12304", f12304)
                .put("f12305", f12305)
                .put("f12306", f12306)
                .put("f12307", f12307)
                .put("f12308", f12308)
                .put("f12309", f12309)
                .put("f12801", f12801)
                .put("f12802", f12802)
                .put("f12803", f12803)
                .put("f12804", f12804)
                .put("f12805", f12805)
                .put("f12806", f12806)
                .put("f12807", f12807)
                .put("f129", f129)
                .put("f13001", f13001)
                .put("f13002", f13002)
                .put("f13003", f13003)
                .put("f13004", f13004)
                .put("f13005", f13005)
                .put("f13006", f13006)
                .put("f13007", f13007)
                .put("f13008", f13008)
                .put("f13009", f13009)
                .put("f13010", f13010)
                .put("f13011", f13011)
                .put("f13012", f13012)
                .put("f13013", f13013)
                .put("f13014", f13014)
                .put("f13096", f13096)
                .put("f13096x", f13096x)
                .put("f131", f131)
                .put("f131a", f131a)
                .put("f13401", f13401)
                .put("f13402", f13402)
                .put("f13403", f13403)
                .put("f13404", f13404)
                .put("f13405", f13405)
                .put("f13406", f13406)
                .put("f13407", f13407)
                .put("f13408", f13408)
                .put("f13409", f13409);
        return json.toString();
    }

    public String sGtoString() throws JSONException {
        Log.d(TAG, "sGtoString: ");
        JSONObject json = new JSONObject();
        json.put("g101", g101)
                .put("g102", g102)
                .put("g10301", g10301)
                .put("g10302", g10302)
                .put("g10303", g10303)
                .put("g10304", g10304)
                .put("g10305", g10305)
                .put("g10306", g10306)
                .put("g10307", g10307)
                .put("g10308", g10308)
                .put("g10309", g10309)
                .put("g10310", g10310)
                .put("g10311", g10311)
                .put("g10312", g10312)
                .put("g10313", g10313)
                .put("g10314", g10314)
                .put("g10396", g10396)
                .put("g10396x", g10396x)
                .put("g104", g104)
                .put("g10496x", g10496x)
                .put("g105", g105)
                .put("g10501x", g10501x)
                .put("g106", g106)
                .put("g107", g107)
                .put("g10701x", g10701x)
                .put("g108", g108)
                .put("g109", g109)
                .put("g110", g110)
                .put("g126", g126)
                .put("g113", g113)
                .put("g114", g114)
                .put("g11496x", g11496x)
                .put("g115", g115)
                .put("g116", g116)
                .put("g117", g117)
                .put("g117hx", g117hx)
                .put("g117mx", g117mx)
                .put("g117dx", g117dx)
                .put("g11801", g11801)
                .put("g11801x", g11801x)
                .put("g11802", g11802)
                .put("g11802x", g11802x)
                .put("g11803", g11803)
                .put("g11803x", g11803x)
                .put("g11804", g11804)
                .put("g11804x", g11804x)
                .put("g11896", g11896)
                .put("g11896x", g11896x)
                .put("g11898", g11898)
                .put("g119", g119)
                .put("g120", g120)
                .put("g12096x", g12096x)
                .put("g121", g121)
                .put("g12196x", g12196x)
                .put("g12401", g12401)
                .put("g12402", g12402)
                .put("g12403", g12403)
                .put("g12404", g12404)
                .put("g12405", g12405)
                .put("g12406", g12406)
                .put("g12407", g12407)
                .put("g12408", g12408)
                .put("g12409", g12409)
                .put("g12410", g12410)
                .put("g12411", g12411)
                .put("g12412", g12412)
                .put("g12413", g12413)
                .put("g128", g128)
                .put("g129", g129);
        return json.toString();
    }

    public String sH1toString() throws JSONException {
        Log.d(TAG, "sH1toString: ");
        JSONObject json = new JSONObject();
        json.put("h101", h101)
                .put("h101mx", h101mx)
                .put("h101wx", h101wx)
                .put("h102", h102)
                .put("h103", h103)
                .put("h10401", h10401)
                .put("h10402", h10402)
                .put("h10403", h10403)
                .put("h10496", h10496)
                .put("h10496x", h10496x)
                .put("h105", h105)
                .put("h106", h106)
                .put("h1061x", h1061x)
                .put("h107", h107)
                .put("h108", h108)
                .put("h10896x", h10896x)
                .put("h10901", h10901)
                .put("h10902", h10902)
                .put("h10903", h10903)
                .put("h10904", h10904)
                .put("h10905", h10905)
                .put("h10906", h10906)
                .put("h10907", h10907)
                .put("h10997", h10997)
                .put("h10996", h10996)
                .put("h10996x", h10996x)
                .put("h110", h110)
                .put("h111", h111)
                .put("h112", h112)
                .put("h113", h113)
                .put("h114", h114)
                .put("h11501", h11501)
                .put("h11502", h11502)
                .put("h11503", h11503)
                .put("h11504", h11504)
                .put("h11505", h11505)
                .put("h11506", h11506)
                .put("h11507", h11507)
                .put("h11508", h11508)
                .put("h11509", h11509)
                .put("h11596", h11596)
                .put("h11596x", h11596x)
                .put("h116", h116)
                .put("h11701", h11701)
                .put("h118", h118)
                .put("h119", h119)
                .put("h120", h120)
                .put("h121", h121)
                .put("h122", h122)
                .put("h1221x", h1221x)
                .put("h123", h123)
                .put("h124", h124)
                .put("h125", h125)
                .put("h126", h126)
                .put("h127", h127)
                .put("h128", h128)
                .put("h12896x", h12896x)
                .put("h12901", h12901)
                .put("h12902", h12902)
                .put("h12903", h12903)
                .put("h12904", h12904)
                .put("h12905", h12905)
                .put("h12906", h12906)
                .put("h132", h132)
                .put("h132a", h132a)
                .put("h132a96x", h132a96x)
                .put("h13301", h13301)
                .put("h13302", h13302)
                .put("h13303", h13303)
                .put("h13304", h13304)
                .put("h13305", h13305)
                .put("h13306", h13306)
                .put("h13307", h13307)
                .put("h13308", h13308)
                .put("h13309", h13309)
                .put("h13501", h13501)
                .put("h13502", h13502)
                .put("h13503", h13503)
                .put("h13504", h13504)
                .put("h13505", h13505)
                .put("h13506", h13506)
                .put("h13507", h13507)
                .put("h13508", h13508)
                .put("h13509", h13509)
                .put("h13598", h13598)
                .put("h13601", h13601)
                .put("h13602", h13602)
                .put("h13603", h13603)
                .put("h13604", h13604)
                .put("h13605", h13605)
                .put("h13606", h13606)
                .put("h13696", h13696)
                .put("h13696x", h13696x)
                .put("h137", h137)
                .put("h137a", h137a)
                .put("h137a96x", h137a96x)
                .put("h137b", h137b)
                .put("h137b96x", h137b96x)
                .put("h137c", h137c)
                .put("h137c96x", h137c96x);
        return json.toString();
    }

    public String sH2toString() throws JSONException {
        Log.d(TAG, "sH2toString: ");
        JSONObject json = new JSONObject();
        json.put("h201", h201)
                .put("h201hx", h201hx)
                .put("h201dx", h201dx)
                .put("h201wx", h201wx)
                .put("h202", h202)
                .put("h203h", h203h)
                .put("h203d", h203d)
                .put("h203w", h203w)
                .put("h204", h204)
                .put("h205", h205)
                .put("h20596x", h20596x)
                .put("h20701", h20701)
                .put("h20702", h20702)
                .put("h20703", h20703)
                .put("h20704", h20704)
                .put("h20705", h20705)
                .put("h20706", h20706)
                .put("h20707", h20707)
                .put("h20708", h20708)
                .put("h20798", h20798)
                .put("h20801", h20801)
                .put("h20802", h20802)
                .put("h20803", h20803)
                .put("h20804", h20804)
                .put("h20805", h20805)
                .put("h20806", h20806)
                .put("h20896", h20896)
                .put("h209", h209)
                .put("h209a", h209a)
                .put("h210", h210)
                .put("h211", h211)
                .put("h212", h212)
                .put("h213", h213)
                .put("h214", h214)
                .put("h214a", h214a)
                .put("h214b01", h214b01)
                .put("h214b02", h214b02)
                .put("h214b03", h214b03)
                .put("h214b04", h214b04)
                .put("h214b05", h214b05)
                .put("h214b06", h214b06)
                .put("h214b96", h214b96)
                .put("h214b96x", h214b96x)
                .put("h214b98", h214b98)
                .put("h215", h215)
                .put("h216", h216)
                .put("h216a", h216a)
                .put("h216a96x", h216a96x)
                .put("h21701", h21701)
                .put("h21702", h21702)
                .put("h21703", h21703)
                .put("h21704", h21704)
                .put("h21705", h21705)
                .put("h21706", h21706)
                .put("h21796", h21796)
                .put("h21796x", h21796x)
                .put("h218", h218)
                .put("h219", h219)
                .put("h21996x", h21996x)
                .put("h2201", h2201)
                .put("h2201x", h2201x)
                .put("h2202", h2202)
                .put("h2202x", h2202x)
                .put("h2203", h2203)
                .put("h2203x", h2203x)
                .put("h2204", h2204)
                .put("h2204x", h2204x)
                .put("h2205", h2205)
                .put("h2205x", h2205x)
                .put("h2206", h2206)
                .put("h2206x", h2206x)
                .put("h22096", h22096)
                .put("h22096x", h22096x)
                .put("h221", h221)
                .put("h222", h222)
                .put("h223", h223);
        return json.toString();
    }

    public String sKtoString() throws JSONException {
        Log.d(TAG, "sKtoString: ");
        JSONObject json = new JSONObject();
        json.put("k101", k101)
                .put("k101a01", k101a01)
                .put("k101a02", k101a02)
                .put("k101a03", k101a03)
                .put("k101a04", k101a04)
                .put("k101a05", k101a05)
                .put("k101a06", k101a06)
                .put("k101a07", k101a07)
                .put("k101a08", k101a08)
                .put("k101a09", k101a09)
                .put("k101a10", k101a10)
                .put("k101a11", k101a11)
                .put("k101a12", k101a12)
                .put("k101a13", k101a13)
                .put("k101a96", k101a96)
                .put("k101a96x", k101a96x)
                .put("k102", k102)
                .put("k104a01", k104a01)
                .put("k104a02", k104a02)
                .put("k104a03", k104a03)
                .put("k104a04", k104a04)
                .put("k104a05", k104a05)
                .put("k104a06", k104a06)
                .put("k104a77", k104a77)
                .put("k104a08", k104a08)
                .put("k104a09", k104a09)
                .put("k104a10", k104a10)
                .put("k104a11", k104a11)
                .put("k104a12", k104a12)
                .put("k104a13", k104a13)
                .put("k103", k103)
                .put("k104b01", k104b01)
                .put("k104b02", k104b02)
                .put("k104b03", k104b03)
                .put("k104b04", k104b04)
                .put("k104b05", k104b05)
                .put("k104b06", k104b06)
                .put("k104b07", k104b07)
                .put("k104b08", k104b08)
                .put("k104b09", k104b09)
                .put("k104b10", k104b10)
                .put("k104b11", k104b11)
                .put("k104b12", k104b12)
                .put("k104b13", k104b13)
                .put("k105", k105)
                .put("k105a", k105a)
                .put("k105a01x", k105a01x)
                .put("k105a02x", k105a02x)
                .put("k10601", k10601)
                .put("k10602", k10602)
                .put("k10603", k10603)
                .put("k10604", k10604)
                .put("k10605", k10605)
                .put("k10606", k10606)
                .put("k10607", k10607)
                .put("k10608", k10608)
                .put("k10696", k10696)
                .put("k10696x", k10696x)
                .put("k107", k107)
                .put("k107a", k107a)
                .put("k107a96x", k107a96x);
        return json.toString();
    }

    public String sLtoString() throws JSONException {
        Log.d(TAG, "sLtoString: ");
        JSONObject json = new JSONObject();
        json.put("l101", l101)
                .put("l102", l102)
                .put("l102a", l102a)
                .put("l102a96x", l102a96x)
                .put("l103", l103)
                .put("l104", l104)
                .put("l10496x", l10496x)
                .put("l105", l105)
                .put("l106", l106)
                .put("l10696x", l10696x)
                .put("l107", l107)
                .put("l10796x", l10796x)
                .put("l108", l108)
                .put("l10896x", l10896x)
                .put("l109", l109)
                .put("l10996x", l10996x)
                .put("l110", l110)
                .put("l111", l111)
                .put("l1121", l1121)
                .put("l1122", l1122)
                .put("l1123", l1123)
                .put("l1124", l1124)
                .put("l1125", l1125)
                .put("l1131", l1131)
                .put("l1132", l1132)
                .put("l1133", l1133)
                .put("l1134", l1134)
                .put("l114", l114)
                .put("l11496x", l11496x)
                .put("l115", l115)
                .put("l11596x", l11596x)
                .put("l116", l116)
                .put("l11696x", l11696x)
                .put("l117", l117)
                .put("l11796x", l11796x);
        return json.toString();
    }

    public MWRA Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_UUID));
        // this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_MUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_FMUID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PROJECT_NAME));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_HHID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_INDEXED));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SYNCED_DATE));


        sFHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SF)));
        sGHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SG)));
        sH1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SH1)));
        sH2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SH2)));
        sKHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SK)));
        sLHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.MwraTable.COLUMN_SL)));

        return this;
    }

    public void sFHydrate(String string) throws JSONException {
        Log.d(TAG, "sFHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.f101 = json.getString("f101");
            this.f101a01 = json.getString("f101a01");
            this.f101a02 = json.getString("f101a02");
            this.f101a03 = json.getString("f101a03");
            this.f101a04 = json.getString("f101a04");
            this.f101a05 = json.getString("f101a05");
            this.f101a06 = json.getString("f101a06");
            this.f101a07 = json.getString("f101a07");
            this.f101a08 = json.getString("f101a08");
            this.f101a09 = json.getString("f101a09");
            this.f101a10 = json.getString("f101a10");
            this.f101a11 = json.getString("f101a11");
            this.f101a12 = json.getString("f101a12");
            this.f101a13 = json.getString("f101a13");
            this.f101a14 = json.getString("f101a14");
            this.f101a96 = json.getString("f101a96");
            this.f101b = json.getString("f101b");
            this.f101b01x = json.getString("f101b01x");
            this.f10201 = json.getString("f10201");
            this.f10202 = json.getString("f10202");
            this.f10203 = json.getString("f10203");
            this.f10204 = json.getString("f10204");
            this.f10205 = json.getString("f10205");
            this.f10206 = json.getString("f10206");
            this.f10207 = json.getString("f10207");
            this.f10208 = json.getString("f10208");
            this.f10209 = json.getString("f10209");
            this.f10210 = json.getString("f10210");
            this.f10296 = json.getString("f10296");
            this.f10296x = json.getString("f10296x");
            this.f10301 = json.getString("f10301");
            this.f10302 = json.getString("f10302");
            this.f10303 = json.getString("f10303");
            this.f10304 = json.getString("f10304");
            this.f10305 = json.getString("f10305");
            this.f107 = json.getString("f107");
            this.f10796x = json.getString("f10796x");
            this.f108 = json.getString("f108");
            this.f108wx = json.getString("f108wx");
            this.f108mx = json.getString("f108mx");
            this.f11001 = json.getString("f11001");
            this.f11002 = json.getString("f11002");
            this.f11003 = json.getString("f11003");
            this.f11004 = json.getString("f11004");
            this.f11005 = json.getString("f11005");
            this.f11006 = json.getString("f11006");
            this.f11007 = json.getString("f11007");
            this.f11008 = json.getString("f11008");
            this.f11009 = json.getString("f11009");
            this.f11096 = json.getString("f11096");
            this.f1109696x = json.getString("f1109696x");
            this.f111 = json.getString("f111");
            this.f112 = json.getString("f112");
            this.f113 = json.getString("f113");
            this.f11301x = json.getString("f11301x");
            this.f114 = json.getString("f114");
            this.f116 = json.getString("f116");
            this.f117 = json.getString("f117");
            this.f118m = json.getString("f118m");
            this.f118d = json.getString("f118d");
            this.f119 = json.getString("f119");
            this.f120 = json.getString("f120");
            this.f12001x = json.getString("f12001x");
            this.f121a = json.getString("f121a");
            this.f121b = json.getString("f121b");
            this.f121b96x = json.getString("f121b96x");
            this.f122 = json.getString("f122");
            this.f12201x = json.getString("f12201x");
            this.f12301 = json.getString("f12301");
            this.f12302 = json.getString("f12302");
            this.f12303 = json.getString("f12303");
            this.f12304 = json.getString("f12304");
            this.f12305 = json.getString("f12305");
            this.f12306 = json.getString("f12306");
            this.f12307 = json.getString("f12307");
            this.f12308 = json.getString("f12308");
            this.f12309 = json.getString("f12309");
            this.f12801 = json.getString("f12801");
            this.f12802 = json.getString("f12802");
            this.f12803 = json.getString("f12803");
            this.f12804 = json.getString("f12804");
            this.f12805 = json.getString("f12805");
            this.f12806 = json.getString("f12806");
            this.f12807 = json.getString("f12807");
            this.f129 = json.getString("f129");
            this.f13001 = json.getString("f13001");
            this.f13002 = json.getString("f13002");
            this.f13003 = json.getString("f13003");
            this.f13004 = json.getString("f13004");
            this.f13005 = json.getString("f13005");
            this.f13006 = json.getString("f13006");
            this.f13007 = json.getString("f13007");
            this.f13008 = json.getString("f13008");
            this.f13009 = json.getString("f13009");
            this.f13010 = json.getString("f13010");
            this.f13011 = json.getString("f13011");
            this.f13012 = json.getString("f13012");
            this.f13013 = json.getString("f13013");
            this.f13014 = json.getString("f13014");
            this.f13096 = json.getString("f13096");
            this.f13096x = json.getString("f13096x");
            this.f131 = json.getString("f131");
            this.f131a = json.getString("f131a");
            this.f13401 = json.getString("f13401");
            this.f13402 = json.getString("f13402");
            this.f13403 = json.getString("f13403");
            this.f13404 = json.getString("f13404");
            this.f13405 = json.getString("f13405");
            this.f13406 = json.getString("f13406");
            this.f13407 = json.getString("f13407");
            this.f13408 = json.getString("f13408");
            this.f13409 = json.getString("f13409");

        }
    }

    public void sGHydrate(String string) throws JSONException {
        Log.d(TAG, "sGHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.g101 = json.getString("g101");
            this.g102 = json.getString("g102");
            this.g10301 = json.getString("g10301");
            this.g10302 = json.getString("g10302");
            this.g10303 = json.getString("g10303");
            this.g10304 = json.getString("g10304");
            this.g10305 = json.getString("g10305");
            this.g10306 = json.getString("g10306");
            this.g10307 = json.getString("g10307");
            this.g10308 = json.getString("g10308");
            this.g10309 = json.getString("g10309");
            this.g10310 = json.getString("g10310");
            this.g10311 = json.getString("g10311");
            this.g10312 = json.getString("g10312");
            this.g10313 = json.getString("g10313");
            this.g10314 = json.getString("g10314");
            this.g10396 = json.getString("g10396");
            this.g10396x = json.getString("g10396x");
            this.g104 = json.getString("g104");
            this.g10496x = json.getString("g10496x");
            this.g105 = json.getString("g105");
            this.g10501x = json.getString("g10501x");
            this.g106 = json.getString("g106");
            this.g107 = json.getString("g107");
            this.g10701x = json.getString("g10701x");
            this.g108 = json.getString("g108");
            this.g109 = json.getString("g109");
            this.g110 = json.getString("g110");
            this.g126 = json.getString("g126");
            this.g113 = json.getString("g113");
            this.g114 = json.getString("g114");
            this.g11496x = json.getString("g11496x");
            this.g115 = json.getString("g115");
            this.g116 = json.getString("g116");
            this.g117 = json.getString("g117");
            this.g117hx = json.getString("g117hx");
            this.g117mx = json.getString("g117mx");
            this.g117dx = json.getString("g117dx");
            this.g11801 = json.getString("g11801");
            this.g11801x = json.getString("g11801x");
            this.g11802 = json.getString("g11802");
            this.g11802x = json.getString("g11802x");
            this.g11803 = json.getString("g11803");
            this.g11803x = json.getString("g11803x");
            this.g11804 = json.getString("g11804");
            this.g11804x = json.getString("g11804x");
            this.g11896 = json.getString("g11896");
            this.g11896x = json.getString("g11896x");
            this.g11898 = json.getString("g11898");
            this.g119 = json.getString("g119");
            this.g120 = json.getString("g120");
            this.g12096x = json.getString("g12096x");
            this.g121 = json.getString("g121");
            this.g12196x = json.getString("g12196x");
            this.g12401 = json.getString("g12401");
            this.g12402 = json.getString("g12402");
            this.g12403 = json.getString("g12403");
            this.g12404 = json.getString("g12404");
            this.g12405 = json.getString("g12405");
            this.g12406 = json.getString("g12406");
            this.g12407 = json.getString("g12407");
            this.g12408 = json.getString("g12408");
            this.g12409 = json.getString("g12409");
            this.g12410 = json.getString("g12410");
            this.g12411 = json.getString("g12411");
            this.g12412 = json.getString("g12412");
            this.g12413 = json.getString("g12413");
            this.g128 = json.getString("g128");
            this.g129 = json.getString("g129");

        }
    }

    public void sH1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h101 = json.getString("h101");
            this.h101mx = json.getString("h101mx");
            this.h101wx = json.getString("h101wx");
            this.h102 = json.getString("h102");
            this.h103 = json.getString("h103");
            this.h10401 = json.getString("h10401");
            this.h10402 = json.getString("h10402");
            this.h10403 = json.getString("h10403");
            this.h10496 = json.getString("h10496");
            this.h10496x = json.getString("h10496x");
            this.h105 = json.getString("h105");
            this.h106 = json.getString("h106");
            this.h1061x = json.getString("h1061x");
            this.h107 = json.getString("h107");
            this.h108 = json.getString("h108");
            this.h10896x = json.getString("h10896x");
            this.h10901 = json.getString("h10901");
            this.h10902 = json.getString("h10902");
            this.h10903 = json.getString("h10903");
            this.h10904 = json.getString("h10904");
            this.h10905 = json.getString("h10905");
            this.h10906 = json.getString("h10906");
            this.h10907 = json.getString("h10907");
            this.h10997 = json.getString("h10997");
            this.h10996 = json.getString("h10996");
            this.h10996x = json.getString("h10996x");
            this.h110 = json.getString("h110");
            this.h111 = json.getString("h111");
            this.h112 = json.getString("h112");
            this.h113 = json.getString("h113");
            this.h114 = json.getString("h114");
            this.h11501 = json.getString("h11501");
            this.h11502 = json.getString("h11502");
            this.h11503 = json.getString("h11503");
            this.h11504 = json.getString("h11504");
            this.h11505 = json.getString("h11505");
            this.h11506 = json.getString("h11506");
            this.h11507 = json.getString("h11507");
            this.h11508 = json.getString("h11508");
            this.h11509 = json.getString("h11509");
            this.h11596 = json.getString("h11596");
            this.h11596x = json.getString("h11596x");
            this.h116 = json.getString("h116");
            this.h11701 = json.getString("h11701");
            this.h118 = json.getString("h118");
            this.h119 = json.getString("h119");
            this.h120 = json.getString("h120");
            this.h121 = json.getString("h121");
            this.h122 = json.getString("h122");
            this.h1221x = json.getString("h1221x");
            this.h123 = json.getString("h123");
            this.h124 = json.getString("h124");
            this.h125 = json.getString("h125");
            this.h126 = json.getString("h126");
            this.h127 = json.getString("h127");
            this.h128 = json.getString("h128");
            this.h12896x = json.getString("h12896x");
            this.h12901 = json.getString("h12901");
            this.h12902 = json.getString("h12902");
            this.h12903 = json.getString("h12903");
            this.h12904 = json.getString("h12904");
            this.h12905 = json.getString("h12905");
            this.h12906 = json.getString("h12906");
            this.h132 = json.getString("h132");
            this.h132a = json.getString("h132a");
            this.h132a96x = json.getString("h132a96x");
            this.h13301 = json.getString("h13301");
            this.h13302 = json.getString("h13302");
            this.h13303 = json.getString("h13303");
            this.h13304 = json.getString("h13304");
            this.h13305 = json.getString("h13305");
            this.h13306 = json.getString("h13306");
            this.h13307 = json.getString("h13307");
            this.h13308 = json.getString("h13308");
            this.h13309 = json.getString("h13309");
            this.h13501 = json.getString("h13501");
            this.h13502 = json.getString("h13502");
            this.h13503 = json.getString("h13503");
            this.h13504 = json.getString("h13504");
            this.h13505 = json.getString("h13505");
            this.h13506 = json.getString("h13506");
            this.h13507 = json.getString("h13507");
            this.h13508 = json.getString("h13508");
            this.h13509 = json.getString("h13509");
            this.h13598 = json.getString("h13598");
            this.h13601 = json.getString("h13601");
            this.h13602 = json.getString("h13602");
            this.h13603 = json.getString("h13603");
            this.h13604 = json.getString("h13604");
            this.h13605 = json.getString("h13605");
            this.h13606 = json.getString("h13606");
            this.h13696 = json.getString("h13696");
            this.h13696x = json.getString("h13696x");
            this.h137 = json.getString("h137");
            this.h137a = json.getString("h137a");
            this.h137a96x = json.getString("h137a96x");
            this.h137b = json.getString("h137b");
            this.h137b96x = json.getString("h137b96x");
            this.h137c = json.getString("h137c");
            this.h137c96x = json.getString("h137c96x");

        }
    }

    public void sH2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sH2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.h201 = json.getString("h201");
            this.h201hx = json.getString("h201hx");
            this.h201dx = json.getString("h201dx");
            this.h201wx = json.getString("h201wx");
            this.h202 = json.getString("h202");
            this.h203h = json.getString("h203h");
            this.h203d = json.getString("h203d");
            this.h203w = json.getString("h203w");
            this.h204 = json.getString("h204");
            this.h205 = json.getString("h205");
            this.h20596x = json.getString("h20596x");
            this.h20701 = json.getString("h20701");
            this.h20702 = json.getString("h20702");
            this.h20703 = json.getString("h20703");
            this.h20704 = json.getString("h20704");
            this.h20705 = json.getString("h20705");
            this.h20706 = json.getString("h20706");
            this.h20707 = json.getString("h20707");
            this.h20708 = json.getString("h20708");
            this.h20798 = json.getString("h20798");
            this.h20801 = json.getString("h20801");
            this.h20802 = json.getString("h20802");
            this.h20803 = json.getString("h20803");
            this.h20804 = json.getString("h20804");
            this.h20805 = json.getString("h20805");
            this.h20806 = json.getString("h20806");
            this.h20896 = json.getString("h20896");
            this.h209 = json.getString("h209");
            this.h209a = json.getString("h209a");
            this.h210 = json.getString("h210");
            this.h211 = json.getString("h211");
            this.h212 = json.getString("h212");
            this.h213 = json.getString("h213");
            this.h214 = json.getString("h214");
            this.h214a = json.getString("h214a");
            this.h214b01 = json.getString("h214b01");
            this.h214b02 = json.getString("h214b02");
            this.h214b03 = json.getString("h214b03");
            this.h214b04 = json.getString("h214b04");
            this.h214b05 = json.getString("h214b05");
            this.h214b06 = json.getString("h214b06");
            this.h214b96 = json.getString("h214b96");
            this.h214b96x = json.getString("h214b96x");
            this.h214b98 = json.getString("h214b98");
            this.h215 = json.getString("h215");
            this.h216 = json.getString("h216");
            this.h216a = json.getString("h216a");
            this.h216a96x = json.getString("h216a96x");
            this.h21701 = json.getString("h21701");
            this.h21702 = json.getString("h21702");
            this.h21703 = json.getString("h21703");
            this.h21704 = json.getString("h21704");
            this.h21705 = json.getString("h21705");
            this.h21706 = json.getString("h21706");
            this.h21796 = json.getString("h21796");
            this.h21796x = json.getString("h21796x");
            this.h218 = json.getString("h218");
            this.h219 = json.getString("h219");
            this.h21996x = json.getString("h21996x");
            this.h2201 = json.getString("h2201");
            this.h2201x = json.getString("h2201x");
            this.h2202 = json.getString("h2202");
            this.h2202x = json.getString("h2202x");
            this.h2203 = json.getString("h2203");
            this.h2203x = json.getString("h2203x");
            this.h2204 = json.getString("h2204");
            this.h2204x = json.getString("h2204x");
            this.h2205 = json.getString("h2205");
            this.h2205x = json.getString("h2205x");
            this.h2206 = json.getString("h2206");
            this.h2206x = json.getString("h2206x");
            this.h22096 = json.getString("h22096");
            this.h22096x = json.getString("h22096x");
            this.h221 = json.getString("h221");
            this.h222 = json.getString("h222");
            this.h223 = json.getString("h223");

        }
    }

    public void sKHydrate(String string) throws JSONException {
        Log.d(TAG, "sKHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.k101 = json.getString("k101");
            this.k101a01 = json.getString("k101a01");
            this.k101a02 = json.getString("k101a02");
            this.k101a03 = json.getString("k101a03");
            this.k101a04 = json.getString("k101a04");
            this.k101a05 = json.getString("k101a05");
            this.k101a06 = json.getString("k101a06");
            this.k101a07 = json.getString("k101a07");
            this.k101a08 = json.getString("k101a08");
            this.k101a09 = json.getString("k101a09");
            this.k101a10 = json.getString("k101a10");
            this.k101a11 = json.getString("k101a11");
            this.k101a12 = json.getString("k101a12");
            this.k101a13 = json.getString("k101a13");
            this.k101a96 = json.getString("k101a96");
            this.k101a96x = json.getString("k101a96x");
            this.k102 = json.getString("k102");
            this.k104a01 = json.getString("k104a01");
            this.k104a02 = json.getString("k104a02");
            this.k104a03 = json.getString("k104a03");
            this.k104a04 = json.getString("k104a04");
            this.k104a05 = json.getString("k104a05");
            this.k104a06 = json.getString("k104a06");
            this.k104a77 = json.getString("k104a77");
            this.k104a08 = json.getString("k104a08");
            this.k104a09 = json.getString("k104a09");
            this.k104a10 = json.getString("k104a10");
            this.k104a11 = json.getString("k104a11");
            this.k104a12 = json.getString("k104a12");
            this.k104a13 = json.getString("k104a13");
            this.k103 = json.getString("k103");
            this.k104b01 = json.getString("k104b01");
            this.k104b02 = json.getString("k104b02");
            this.k104b03 = json.getString("k104b03");
            this.k104b04 = json.getString("k104b04");
            this.k104b05 = json.getString("k104b05");
            this.k104b06 = json.getString("k104b06");
            this.k104b07 = json.getString("k104b07");
            this.k104b08 = json.getString("k104b08");
            this.k104b09 = json.getString("k104b09");
            this.k104b10 = json.getString("k104b10");
            this.k104b11 = json.getString("k104b11");
            this.k104b12 = json.getString("k104b12");
            this.k104b13 = json.getString("k104b13");
            this.k105 = json.getString("k105");
            this.k105a = json.getString("k105a");
            this.k105a01x = json.getString("k105a01x");
            this.k105a02x = json.getString("k105a02x");
            this.k10601 = json.getString("k10601");
            this.k10602 = json.getString("k10602");
            this.k10603 = json.getString("k10603");
            this.k10604 = json.getString("k10604");
            this.k10605 = json.getString("k10605");
            this.k10606 = json.getString("k10606");
            this.k10607 = json.getString("k10607");
            this.k10608 = json.getString("k10608");
            this.k10696 = json.getString("k10696");
            this.k10696x = json.getString("k10696x");
            this.k107 = json.getString("k107");
            this.k107a = json.getString("k107a");
            this.k107a96x = json.getString("k107a96x");

        }
    }

    public void sLHydrate(String string) throws JSONException {
        Log.d(TAG, "sLHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.l101 = json.getString("l101");
            this.l102 = json.getString("l102");
            this.l102a = json.getString("l102a");
            this.l102a96x = json.getString("l102a96x");
            this.l103 = json.getString("l103");
            this.l104 = json.getString("l104");
            this.l10496x = json.getString("l10496x");
            this.l105 = json.getString("l105");
            this.l106 = json.getString("l106");
            this.l10696x = json.getString("l10696x");
            this.l107 = json.getString("l107");
            this.l10796x = json.getString("l10796x");
            this.l108 = json.getString("l108");
            this.l10896x = json.getString("l10896x");
            this.l109 = json.getString("l109");
            this.l10996x = json.getString("l10996x");
            this.l110 = json.getString("l110");
            this.l111 = json.getString("l111");
            this.l1121 = json.getString("l1121");
            this.l1122 = json.getString("l1122");
            this.l1123 = json.getString("l1123");
            this.l1124 = json.getString("l1124");
            this.l1125 = json.getString("l1125");
            this.l1131 = json.getString("l1131");
            this.l1132 = json.getString("l1132");
            this.l1133 = json.getString("l1133");
            this.l1134 = json.getString("l1134");
            this.l114 = json.getString("l114");
            this.l11496x = json.getString("l11496x");
            this.l115 = json.getString("l115");
            this.l11596x = json.getString("l11596x");
            this.l116 = json.getString("l116");
            this.l11696x = json.getString("l11696x");
            this.l117 = json.getString("l117");
            this.l11796x = json.getString("l11796x");

        }
    }
}
