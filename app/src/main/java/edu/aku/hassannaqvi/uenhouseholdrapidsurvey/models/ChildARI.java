package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models;

import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.PROJECT_NAME;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp._EMPTY_;
import static edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp.selectedChild;
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

public class ChildARI extends BaseObservable implements Observable {

    private final String TAG = "Form";
    private final transient PropertyChangeRegistry propertyChangeRegistry = new PropertyChangeRegistry();
    // APP VARIABLES
    private String projectName = MainApp.PROJECT_NAME;
    // APP VARIABLES
    private String id = _EMPTY_;
    private String uid = _EMPTY_;
    private String uuid = _EMPTY_;
    private String fmuid = _EMPTY_;
    private String muid = _EMPTY_;
    private String userName = _EMPTY_;
    private String sysDate = _EMPTY_;
    private String indexed = _EMPTY_;
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


    // Field Variables
    private String i101 = _EMPTY_;
    private String i10201 = _EMPTY_;
    private String i102a = _EMPTY_;
    private String i102ano = _EMPTY_;
    private String i102b = _EMPTY_;
    private String i102c = _EMPTY_;
    private String i102cno = _EMPTY_;
    private String i103 = _EMPTY_;
    private String i10301x = _EMPTY_;
    private String i104 = _EMPTY_;
    private String i105 = _EMPTY_;
    private String i106 = _EMPTY_;
    private String i10696x = _EMPTY_;
    private String i107 = _EMPTY_;
    private String i108 = _EMPTY_;
    private String i111 = _EMPTY_;
    private String i11196x = _EMPTY_;
    private String i112 = _EMPTY_;
    private String i11201 = _EMPTY_;
    private String i11202 = _EMPTY_;
    private String i11203 = _EMPTY_;
    private String i11204 = _EMPTY_;
    private String i11205 = _EMPTY_;
    private String i11206 = _EMPTY_;
    private String i11207 = _EMPTY_;
    private String i11208 = _EMPTY_;
    private String i11209 = _EMPTY_;
    private String i11210 = _EMPTY_;
    private String i11211 = _EMPTY_;
    private String i113 = _EMPTY_;
    private String i115 = _EMPTY_;
    private String i116 = _EMPTY_;
    private String i11601x = _EMPTY_;
    private String i11602x = _EMPTY_;
    private String i117 = _EMPTY_;
    private String i11701 = _EMPTY_;
    private String i11702 = _EMPTY_;
    private String i11703 = _EMPTY_;
    private String i11704 = _EMPTY_;
    private String i11705 = _EMPTY_;
    private String i11706 = _EMPTY_;
    private String i11707 = _EMPTY_;
    private String i11708 = _EMPTY_;
    private String i11796 = _EMPTY_;
    private String i11796x = _EMPTY_;
    private String i118 = _EMPTY_;
    private String i11801 = _EMPTY_;
    private String i11801x = _EMPTY_;
    private String i11802 = _EMPTY_;
    private String i11802x = _EMPTY_;
    private String i11803 = _EMPTY_;
    private String i11803x = _EMPTY_;
    private String i11896 = _EMPTY_;
    private String i11896x = _EMPTY_;
    private String i11898 = _EMPTY_;
    private String i119 = _EMPTY_;
    private String i120 = _EMPTY_;
    private String i121 = _EMPTY_;
    private String i122 = _EMPTY_;
    private String i12201 = _EMPTY_;
    private String i12202 = _EMPTY_;
    private String i12203 = _EMPTY_;
    private String i12204 = _EMPTY_;
    private String i12205 = _EMPTY_;
    private String i12206 = _EMPTY_;
    private String i12207 = _EMPTY_;
    private String i12208 = _EMPTY_;
    private String i123 = _EMPTY_;
    private String i124 = _EMPTY_;
    private String i12496x = _EMPTY_;
    private String i125 = _EMPTY_;
    private String i12501 = _EMPTY_;
    private String i12502 = _EMPTY_;
    private String i12503 = _EMPTY_;
    private String i12504 = _EMPTY_;
    private String i12505 = _EMPTY_;
    private String i201 = _EMPTY_;
    private String i20201 = _EMPTY_;
    private String i202a = _EMPTY_;
    private String i202ano = _EMPTY_;
    private String i202b = _EMPTY_;
    private String i202c = _EMPTY_;
    private String i202cno = _EMPTY_;
    private String i203 = _EMPTY_;
    private String i205 = _EMPTY_;
    private String i206 = _EMPTY_;
    private String i20601x = _EMPTY_;
    private String i207 = _EMPTY_;
    private String i208 = _EMPTY_;
    private String i20896x = _EMPTY_;
    private String i211 = _EMPTY_;
    private String i212 = _EMPTY_;
    private String i213 = _EMPTY_;
    private String i214 = _EMPTY_;
    private String i215 = _EMPTY_;
    private String i216 = _EMPTY_;
    private String i21601x = _EMPTY_;
    private String i217 = _EMPTY_;
    private String i218 = _EMPTY_;
    private String i21896x = _EMPTY_;
    private String i219 = _EMPTY_;
    private String i21901 = _EMPTY_;
    private String i21901x = _EMPTY_;
    private String i21902 = _EMPTY_;
    private String i21902x = _EMPTY_;
    private String i21903 = _EMPTY_;
    private String i21903x = _EMPTY_;
    private String i21904 = _EMPTY_;
    private String i21904x = _EMPTY_;
    private String i21905 = _EMPTY_;
    private String i21905x = _EMPTY_;
    private String i21996 = _EMPTY_;
    private String i21996x = _EMPTY_;
    private String i21998 = _EMPTY_;
    private String i220 = _EMPTY_;
    private String i22001 = _EMPTY_;
    private String i22002 = _EMPTY_;
    private String i22003 = _EMPTY_;
    private String i22004 = _EMPTY_;
    private String i22005 = _EMPTY_;
    private String i22006 = _EMPTY_;
    private String i22007 = _EMPTY_;
    private String i221 = _EMPTY_;
    private String i22101 = _EMPTY_;
    private String i22102 = _EMPTY_;
    private String i22103 = _EMPTY_;
    private String i22104 = _EMPTY_;
    private String i22105 = _EMPTY_;
    private String i22106 = _EMPTY_;
    private String i22196 = _EMPTY_;
    private String i22196x = _EMPTY_;
    private String i222 = _EMPTY_;
    private String i223 = _EMPTY_;
    private String i22396x = _EMPTY_;
    private String i224 = _EMPTY_;
    private String i22401 = _EMPTY_;
    private String i22402 = _EMPTY_;
    private String i22403 = _EMPTY_;
    private String i22404 = _EMPTY_;
    private String i22405 = _EMPTY_;
    private String i22406 = _EMPTY_;
    private String i22496 = _EMPTY_;
    private String i22496x = _EMPTY_;

    public void Child() {


    }


    public void populateMeta() {

        setSysDate(MainApp.form.getSysDate());
        setUserName(MainApp.user.getUserName());
        setDeviceId(MainApp.deviceid);
        setUuid(MainApp.form.getUid());  // not applicable in Form table
        setFmuid(MainApp.familyList.get(Integer.parseInt(selectedChild)).getUid()); //// not applicable in Form table
        setMuid(MainApp.familyList.get(Integer.parseInt(selectedMWRA)).getUid());  // not applicable in Form table
        setSno(selectedChild + 1);
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

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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


    @Bindable
    public String getI101() {
        return i101;
    }

    public void setI101(String i101) {
        this.i101 = i101;
        setI10201(i101.equals("1") ? this.i10201 : "");
        setI102a(i101.equals("1") ? this.i102a : "");
        setI102ano(i101.equals("1") ? this.i102ano : "");
        setI102b(i101.equals("1") ? this.i102b : "");
        setI102c(i101.equals("1") ? this.i102c : "");
        setI102cno(i101.equals("1") ? this.i102cno : "");
        setI103(i101.equals("1") ? this.i103 : "");
        setI104(i101.equals("1") ? this.i104 : "");
        setI105(i101.equals("1") ? this.i105 : "");
        setI106(i101.equals("1") ? this.i106 : "");
        setI107(i101.equals("1") ? this.i107 : "");
        setI108(i101.equals("1") ? this.i108 : "");
        setI111(i101.equals("1") ? this.i111 : "");

        setI11201(i101.equals("1") ? this.i11201 : "");
        setI11202(i101.equals("1") ? this.i11202 : "");
        setI11203(i101.equals("1") ? this.i11203 : "");
        setI11204(i101.equals("1") ? this.i11204 : "");
        setI11205(i101.equals("1") ? this.i11205 : "");
        setI11206(i101.equals("1") ? this.i11206 : "");
        setI11207(i101.equals("1") ? this.i11207 : "");
        setI11208(i101.equals("1") ? this.i11208 : "");
        setI11209(i101.equals("1") ? this.i11209 : "");
        setI11210(i101.equals("1") ? this.i11210 : "");
        setI11211(i101.equals("1") ? this.i11211 : "");

        setI113(i101.equals("1") ? this.i113 : "");
        setI115(i101.equals("1") ? this.i115 : "");
        setI116(i101.equals("1") ? this.i116 : "");

        setI11701(i101.equals("1") ? this.i11701 : "");
        setI11702(i101.equals("1") ? this.i11702 : "");
        setI11703(i101.equals("1") ? this.i11703 : "");
        setI11704(i101.equals("1") ? this.i11704 : "");
        setI11705(i101.equals("1") ? this.i11705 : "");
        setI11706(i101.equals("1") ? this.i11706 : "");
        setI11707(i101.equals("1") ? this.i11707 : "");
        setI11708(i101.equals("1") ? this.i11708 : "");
        setI11796(i101.equals("1") ? this.i11796 : "");

        setI11801(i101.equals("1") ? this.i11801 : "");
        setI11802(i101.equals("1") ? this.i11802 : "");
        setI11803(i101.equals("1") ? this.i11803 : "");
        setI11896(i101.equals("1") ? this.i11896 : "");

        setI119(i101.equals("1") ? this.i119 : "");
        setI120(i101.equals("1") ? this.i120 : "");
        setI121(i101.equals("1") ? this.i121 : "");

        notifyPropertyChanged(BR.i101);
    }

    @Bindable
    public String getI10201() {
        return i10201;
    }

    public void setI10201(String i10201) {
        this.i10201 = i10201;
        notifyPropertyChanged(BR.i10201);
    }

    @Bindable
    public String getI102a() {
        return i102a;
    }

    public void setI102a(String i102a) {
        this.i102a = i102a;
        notifyPropertyChanged(BR.i102a);
    }

    @Bindable
    public String getI102ano() {
        return i102ano;
    }

    public void setI102ano(String i102ano) {
        this.i102ano = i102ano;
        notifyPropertyChanged(BR.i102ano);
    }

    @Bindable
    public String getI102b() {
        return i102b;
    }

    public void setI102b(String i102b) {
        this.i102b = i102b;
        setI102c(i102b.equals("2") ? this.i102c : "");
        setI102cno(i102b.equals("2") ? this.i102cno : "");
        notifyPropertyChanged(BR.i102b);
    }

    @Bindable
    public String getI102c() {
        return i102c;
    }

    public void setI102c(String i102c) {
        this.i102c = i102c;
        notifyPropertyChanged(BR.i102c);
    }

    @Bindable
    public String getI102cno() {
        return i102cno;
    }

    public void setI102cno(String i102cno) {
        this.i102cno = i102cno;
        notifyPropertyChanged(BR.i102cno);
    }

    @Bindable
    public String getI103() {
        return i103;
    }

    public void setI103(String i103) {
        this.i103 = i103;
        setI10301x(i103.equals("1") ? this.i10301x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i103);
    }

    @Bindable
    public String getI10301x() {
        return i10301x;
    }

    public void setI10301x(String i10301x) {
        this.i10301x = i10301x;
        notifyPropertyChanged(BR.i10301x);
    }

    @Bindable
    public String getI104() {
        return i104;
    }

    public void setI104(String i104) {
        this.i104 = i104;
        notifyPropertyChanged(BR.i104);
    }

    @Bindable
    public String getI105() {
        return i105;
    }

    public void setI105(String i105) {
        this.i105 = i105;
        setI106(i105.equals("2") ? this.i106 : "");
        notifyPropertyChanged(BR.i105);
    }

    @Bindable
    public String getI106() {
        return i106;
    }

    public void setI106(String i106) {
        this.i106 = i106;
        setI10696x(i106.equals("96") ? this.i10696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i106);
    }

    @Bindable
    public String getI10696x() {
        return i10696x;
    }

    public void setI10696x(String i10696x) {
        this.i10696x = i10696x;
        notifyPropertyChanged(BR.i10696x);
    }

    @Bindable
    public String getI107() {
        return i107;
    }

    public void setI107(String i107) {
        this.i107 = i107;
        notifyPropertyChanged(BR.i107);
    }

    @Bindable
    public String getI108() {
        return i108;
    }

    public void setI108(String i108) {
        this.i108 = i108;
        notifyPropertyChanged(BR.i108);
    }

    @Bindable
    public String getI111() {
        return i111;
    }

    public void setI111(String i111) {
        this.i111 = i111;
        setI11196x(i111.equals("96") ? this.i11196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i111);
    }

    @Bindable
    public String getI11196x() {
        return i11196x;
    }

    public void setI11196x(String i11196x) {
        this.i11196x = i11196x;
        notifyPropertyChanged(BR.i11196x);
    }

    @Bindable
    public String getI112() {
        return i112;
    }

    public void setI112(String i112) {
        this.i112 = i112;
        notifyPropertyChanged(BR.i112);
    }

    @Bindable
    public String getI11201() {
        return i11201;
    }

    public void setI11201(String i11201) {
        if (this.i11201.equals(i11201)) return; // for all checkboxes
        this.i11201 = i11201;
        notifyPropertyChanged(BR.i11201);
    }

    @Bindable
    public String getI11202() {
        return i11202;
    }

    public void setI11202(String i11202) {
        if (this.i11202.equals(i11202)) return; // for all checkboxes
        this.i11202 = i11202;
        notifyPropertyChanged(BR.i11202);
    }

    @Bindable
    public String getI11203() {
        return i11203;
    }

    public void setI11203(String i11203) {
        if (this.i11203.equals(i11203)) return; // for all checkboxes
        this.i11203 = i11203;
        notifyPropertyChanged(BR.i11203);
    }

    @Bindable
    public String getI11204() {
        return i11204;
    }

    public void setI11204(String i11204) {
        if (this.i11204.equals(i11204)) return; // for all checkboxes
        this.i11204 = i11204;
        notifyPropertyChanged(BR.i11204);
    }

    @Bindable
    public String getI11205() {
        return i11205;
    }

    public void setI11205(String i11205) {
        if (this.i11205.equals(i11205)) return; // for all checkboxes
        this.i11205 = i11205;
        notifyPropertyChanged(BR.i11205);
    }

    @Bindable
    public String getI11206() {
        return i11206;
    }

    public void setI11206(String i11206) {
        if (this.i11206.equals(i11206)) return; // for all checkboxes
        this.i11206 = i11206;
        notifyPropertyChanged(BR.i11206);
    }

    @Bindable
    public String getI11207() {
        return i11207;
    }

    public void setI11207(String i11207) {
        if (this.i11207.equals(i11207)) return; // for all checkboxes
        this.i11207 = i11207;
        notifyPropertyChanged(BR.i11207);
    }

    @Bindable
    public String getI11208() {
        return i11208;
    }

    public void setI11208(String i11208) {
        if (this.i11208.equals(i11208)) return; // for all checkboxes
        this.i11208 = i11208;
        notifyPropertyChanged(BR.i11208);
    }

    @Bindable
    public String getI11209() {
        return i11209;
    }

    public void setI11209(String i11209) {
        if (this.i11209.equals(i11209)) return; // for all checkboxes
        this.i11209 = i11209;
        notifyPropertyChanged(BR.i11209);
    }

    @Bindable
    public String getI11210() {
        return i11210;
    }

    public void setI11210(String i11210) {
        if (this.i11210.equals(i11210)) return; // for all checkboxes
        this.i11210 = i11210;
        notifyPropertyChanged(BR.i11210);
    }

    @Bindable
    public String getI11211() {
        return i11211;
    }

    public void setI11211(String i11211) {
        if (this.i11211.equals(i11211)) return; // for all checkboxes
        this.i11211 = i11211;
        notifyPropertyChanged(BR.i11211);
    }

    @Bindable
    public String getI113() {
        return i113;
    }

    public void setI113(String i113) {
        this.i113 = i113;
        setI115(i113.equals("1") ? this.i115 : "");
        setI116(i113.equals("1") ? this.i116 : "");
        notifyPropertyChanged(BR.i113);
    }

    @Bindable
    public String getI115() {
        return i115;
    }

    public void setI115(String i115) {
        this.i115 = i115;
        notifyPropertyChanged(BR.i115);
    }

    @Bindable
    public String getI116() {
        return i116;
    }

    public void setI116(String i116) {
        this.i116 = i116;
        setI11601x(i116.equals("1") ? this.i11601x : ""); // for all skips, mention all skipped questions
        setI11602x(i116.equals("1") ? this.i11602x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i116);
    }

    @Bindable
    public String getI11601x() {
        return i11601x;
    }

    public void setI11601x(String i11601x) {
        this.i11601x = i11601x;
        notifyPropertyChanged(BR.i11601x);
    }

    @Bindable
    public String getI11602x() {
        return i11602x;
    }

    public void setI11602x(String i11602x) {
        this.i11602x = i11602x;
        notifyPropertyChanged(BR.i11602x);
    }

    @Bindable
    public String getI117() {
        return i117;
    }

    public void setI117(String i117) {
        this.i117 = i117;
        notifyPropertyChanged(BR.i117);
    }

    @Bindable
    public String getI11701() {
        return i11701;
    }

    public void setI11701(String i11701) {
        if (this.i11701.equals(i11701)) return; // for all checkboxes
        this.i11701 = i11701;
        notifyPropertyChanged(BR.i11701);
    }

    @Bindable
    public String getI11702() {
        return i11702;
    }

    public void setI11702(String i11702) {
        if (this.i11702.equals(i11702)) return; // for all checkboxes
        this.i11702 = i11702;
        notifyPropertyChanged(BR.i11702);
    }

    @Bindable
    public String getI11703() {
        return i11703;
    }

    public void setI11703(String i11703) {
        if (this.i11703.equals(i11703)) return; // for all checkboxes
        this.i11703 = i11703;
        notifyPropertyChanged(BR.i11703);
    }

    @Bindable
    public String getI11704() {
        return i11704;
    }

    public void setI11704(String i11704) {
        if (this.i11704.equals(i11704)) return; // for all checkboxes
        this.i11704 = i11704;
        notifyPropertyChanged(BR.i11704);
    }

    @Bindable
    public String getI11705() {
        return i11705;
    }

    public void setI11705(String i11705) {
        if (this.i11705.equals(i11705)) return; // for all checkboxes
        this.i11705 = i11705;
        notifyPropertyChanged(BR.i11705);
    }

    @Bindable
    public String getI11706() {
        return i11706;
    }

    public void setI11706(String i11706) {
        if (this.i11706.equals(i11706)) return; // for all checkboxes
        this.i11706 = i11706;
        notifyPropertyChanged(BR.i11706);
    }

    @Bindable
    public String getI11707() {
        return i11707;
    }

    public void setI11707(String i11707) {
        if (this.i11707.equals(i11707)) return; // for all checkboxes
        this.i11707 = i11707;
        notifyPropertyChanged(BR.i11707);
    }

    @Bindable
    public String getI11708() {
        return i11708;
    }

    public void setI11708(String i11708) {
        if (this.i11708.equals(i11708)) return; // for all checkboxes
        this.i11708 = i11708;
        notifyPropertyChanged(BR.i11708);
    }

    @Bindable
    public String getI11796() {
        return i11796;
    }

    public void setI11796(String i11796) {
        if (this.i11796.equals(i11796)) return; // for all checkboxes
        this.i11796 = i11796;
        setI11796x(i11796.equals("96") ? this.i11796x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i11796);
    }

    @Bindable
    public String getI11796x() {
        return i11796x;
    }

    public void setI11796x(String i11796x) {
        this.i11796x = i11796x;
        notifyPropertyChanged(BR.i11796x);
    }

    @Bindable
    public String getI118() {
        return i118;
    }

    public void setI118(String i118) {
        this.i118 = i118;
        notifyPropertyChanged(BR.i118);
    }

    @Bindable
    public String getI11801() {
        return i11801;
    }

    public void setI11801(String i11801) {
        if (this.i11801.equals(i11801)) return; // for all checkboxes
        this.i11801 = i11801;
        setI11801x(i11801.equals("1") ? this.i11801x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i11801);
    }

    @Bindable
    public String getI11801x() {
        return i11801x;
    }

    public void setI11801x(String i11801x) {
        this.i11801x = i11801x;
        notifyPropertyChanged(BR.i11801x);
    }

    @Bindable
    public String getI11802() {
        return i11802;
    }

    public void setI11802(String i11802) {
        if (this.i11802.equals(i11802)) return; // for all checkboxes
        this.i11802 = i11802;
        setI11802x(i11802.equals("2") ? this.i11802x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i11802);
    }

    @Bindable
    public String getI11802x() {
        return i11802x;
    }

    public void setI11802x(String i11802x) {
        this.i11802x = i11802x;
        notifyPropertyChanged(BR.i11802x);
    }

    @Bindable
    public String getI11803() {
        return i11803;
    }

    public void setI11803(String i11803) {
        if (this.i11803.equals(i11803)) return; // for all checkboxes
        this.i11803 = i11803;
        setI11803x(i11803.equals("3") ? this.i11803x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i11803);
    }

    @Bindable
    public String getI11803x() {
        return i11803x;
    }

    public void setI11803x(String i11803x) {
        this.i11803x = i11803x;
        notifyPropertyChanged(BR.i11803x);
    }

    @Bindable
    public String getI11896() {
        return i11896;
    }

    public void setI11896(String i11896) {
        if (this.i11896.equals(i11896)) return; // for all checkboxes
        this.i11896 = i11896;
        setI11896x(i11896.equals("96") ? this.i11896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i11896);
    }

    @Bindable
    public String getI11896x() {
        return i11896x;
    }

    public void setI11896x(String i11896x) {
        this.i11896x = i11896x;
        notifyPropertyChanged(BR.i11896x);
    }

    @Bindable
    public String getI11898() {
        return i11898;
    }

    public void setI11898(String i11898) {
        this.i11898 = i11898;
        notifyPropertyChanged(BR.i11898);
    }

    @Bindable
    public String getI119() {
        return i119;
    }

    public void setI119(String i119) {
        this.i119 = i119;
        setI120(i119.equals("1") ? this.i120 : "");
        setI121(i119.equals("1") ? this.i121 : "");
        notifyPropertyChanged(BR.i119);
    }

    @Bindable
    public String getI120() {
        return i120;
    }

    public void setI120(String i120) {
        this.i120 = i120;
        setI121(i120.equals("1") ? this.i121 : "");
        notifyPropertyChanged(BR.i120);
    }

    @Bindable
    public String getI121() {
        return i121;
    }

    public void setI121(String i121) {
        this.i121 = i121;
        notifyPropertyChanged(BR.i121);
    }

    @Bindable
    public String getI122() {
        return i122;
    }

    public void setI122(String i122) {
        this.i122 = i122;
        notifyPropertyChanged(BR.i122);
    }

    @Bindable
    public String getI12201() {
        return i12201;
    }

    public void setI12201(String i12201) {
        if (this.i12201.equals(i12201)) return; // for all checkboxes
        this.i12201 = i12201;
        notifyPropertyChanged(BR.i12201);
    }

    @Bindable
    public String getI12202() {
        return i12202;
    }

    public void setI12202(String i12202) {
        if (this.i12202.equals(i12202)) return; // for all checkboxes
        this.i12202 = i12202;
        notifyPropertyChanged(BR.i12202);
    }

    @Bindable
    public String getI12203() {
        return i12203;
    }

    public void setI12203(String i12203) {
        if (this.i12203.equals(i12203)) return; // for all checkboxes
        this.i12203 = i12203;
        notifyPropertyChanged(BR.i12203);
    }

    @Bindable
    public String getI12204() {
        return i12204;
    }

    public void setI12204(String i12204) {
        if (this.i12204.equals(i12204)) return; // for all checkboxes
        this.i12204 = i12204;
        notifyPropertyChanged(BR.i12204);
    }

    @Bindable
    public String getI12205() {
        return i12205;
    }

    public void setI12205(String i12205) {
        if (this.i12205.equals(i12205)) return; // for all checkboxes
        this.i12205 = i12205;
        notifyPropertyChanged(BR.i12205);
    }

    @Bindable
    public String getI12206() {
        return i12206;
    }

    public void setI12206(String i12206) {
        if (this.i12206.equals(i12206)) return; // for all checkboxes
        this.i12206 = i12206;
        notifyPropertyChanged(BR.i12206);
    }

    @Bindable
    public String getI12207() {
        return i12207;
    }

    public void setI12207(String i12207) {
        if (this.i12207.equals(i12207)) return; // for all checkboxes
        this.i12207 = i12207;
        notifyPropertyChanged(BR.i12207);
    }

    @Bindable
    public String getI12208() {
        return i12208;
    }

    public void setI12208(String i12208) {
        if (this.i12208.equals(i12208)) return; // for all checkboxes
        this.i12208 = i12208;
        notifyPropertyChanged(BR.i12208);
    }

    @Bindable
    public String getI123() {
        return i123;
    }

    public void setI123(String i123) {
        this.i123 = i123;
        setI124(i123.equals("2") ? this.i124 : "");
        setI12501(i123.equals("1") ? this.i12501 : "");
        setI12502(i123.equals("1") ? this.i12502 : "");
        setI12503(i123.equals("1") ? this.i12503 : "");
        setI12504(i123.equals("1") ? this.i12504 : "");
        setI12505(i123.equals("1") ? this.i12505 : "");
        notifyPropertyChanged(BR.i123);
    }

    @Bindable
    public String getI124() {
        return i124;
    }

    public void setI124(String i124) {
        this.i124 = i124;
        setI12496x(i124.equals("96") ? this.i12496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i124);
    }

    @Bindable
    public String getI12496x() {
        return i12496x;
    }

    public void setI12496x(String i12496x) {
        this.i12496x = i12496x;
        notifyPropertyChanged(BR.i12496x);
    }

    @Bindable
    public String getI125() {
        return i125;
    }

    public void setI125(String i125) {
        this.i125 = i125;
        notifyPropertyChanged(BR.i125);
    }

    @Bindable
    public String getI12501() {
        return i12501;
    }

    public void setI12501(String i12501) {
        if (this.i12501.equals(i12501)) return; // for all checkboxes
        this.i12501 = i12501;
        notifyPropertyChanged(BR.i12501);
    }

    @Bindable
    public String getI12502() {
        return i12502;
    }

    public void setI12502(String i12502) {
        if (this.i12502.equals(i12502)) return; // for all checkboxes
        this.i12502 = i12502;
        notifyPropertyChanged(BR.i12502);
    }

    @Bindable
    public String getI12503() {
        return i12503;
    }

    public void setI12503(String i12503) {
        if (this.i12503.equals(i12503)) return; // for all checkboxes
        this.i12503 = i12503;
        notifyPropertyChanged(BR.i12503);
    }

    @Bindable
    public String getI12504() {
        return i12504;
    }

    public void setI12504(String i12504) {
        if (this.i12504.equals(i12504)) return; // for all checkboxes
        this.i12504 = i12504;
        notifyPropertyChanged(BR.i12504);
    }

    @Bindable
    public String getI12505() {
        return i12505;
    }

    public void setI12505(String i12505) {
        if (this.i12505.equals(i12505)) return; // for all checkboxes
        this.i12505 = i12505;
        notifyPropertyChanged(BR.i12505);
    }

    @Bindable
    public String getI201() {
        return i201;
    }

    public void setI201(String i201) {
        this.i201 = i201;
        notifyPropertyChanged(BR.i201);
    }

    @Bindable
    public String getI20201() {
        return i20201;
    }

    public void setI20201(String i20201) {
        this.i20201 = i20201;
        notifyPropertyChanged(BR.i20201);
    }

    @Bindable
    public String getI202a() {
        return i202a;
    }

    public void setI202a(String i202a) {
        this.i202a = i202a;
        notifyPropertyChanged(BR.i202a);
    }

    @Bindable
    public String getI202ano() {
        return i202ano;
    }

    public void setI202ano(String i202ano) {
        this.i202ano = i202ano;
        notifyPropertyChanged(BR.i202ano);
    }

    @Bindable
    public String getI202b() {
        return i202b;
    }

    public void setI202b(String i202b) {
        this.i202b = i202b;
        setI202c(i202b.equals("1") ? this.i202c : "");
        setI202cno(i202b.equals("1") ? this.i202cno : "");
        notifyPropertyChanged(BR.i202b);
    }

    @Bindable
    public String getI202c() {
        return i202c;
    }

    public void setI202c(String i202c) {
        this.i202c = i202c;
        notifyPropertyChanged(BR.i202c);
    }

    @Bindable
    public String getI202cno() {
        return i202cno;
    }

    public void setI202cno(String i202cno) {
        this.i202cno = i202cno;
        notifyPropertyChanged(BR.i202cno);
    }

    @Bindable
    public String getI203() {
        return i203;
    }

    public void setI203(String i203) {
        this.i203 = i203;
        notifyPropertyChanged(BR.i203);
    }

    @Bindable
    public String getI205() {
        return i205;
    }

    public void setI205(String i205) {
        this.i205 = i205;
        notifyPropertyChanged(BR.i205);
    }

    @Bindable
    public String getI206() {
        return i206;
    }

    public void setI206(String i206) {
        this.i206 = i206;
        setI20601x(i206.equals("1") ? this.i20601x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i206);
    }

    @Bindable
    public String getI20601x() {
        return i20601x;
    }

    public void setI20601x(String i20601x) {
        this.i20601x = i20601x;
        notifyPropertyChanged(BR.i20601x);
    }

    @Bindable
    public String getI207() {
        return i207;
    }

    public void setI207(String i207) {
        this.i207 = i207;
        setI208(i207.equals("2") ? this.i208 : "");

        setI211(i207.equals("1") ? this.i211 : "");
        setI212(i207.equals("1") ? this.i212 : "");
        setI213(i207.equals("1") ? this.i213 : "");
        setI214(i207.equals("1") ? this.i214 : "");
        setI215(i207.equals("1") ? this.i215 : "");
        setI216(i207.equals("1") ? this.i216 : "");
        setI217(i207.equals("1") ? this.i217 : "");
        setI218(i207.equals("1") ? this.i218 : "");
        setI21901(i207.equals("1") ? this.i21901 : "");
        setI21902(i207.equals("1") ? this.i21902 : "");
        setI21903(i207.equals("1") ? this.i21903 : "");
        setI21904(i207.equals("1") ? this.i21904 : "");
        setI21905(i207.equals("1") ? this.i21905 : "");
        setI21996(i207.equals("1") ? this.i21996 : "");
        setI21998(i207.equals("1") ? this.i21998 : "");

        setI22001(i207.equals("1") ? this.i22001 : "");
        setI22002(i207.equals("1") ? this.i22002 : "");
        setI22003(i207.equals("1") ? this.i22003 : "");
        setI22004(i207.equals("1") ? this.i22004 : "");
        setI22005(i207.equals("1") ? this.i22005 : "");
        setI22006(i207.equals("1") ? this.i22006 : "");
        setI22007(i207.equals("1") ? this.i22007 : "");

        setI22101(i207.equals("1") ? this.i22101 : "");
        setI22102(i207.equals("1") ? this.i22102 : "");
        setI22103(i207.equals("1") ? this.i22103 : "");
        setI22104(i207.equals("1") ? this.i22104 : "");
        setI22105(i207.equals("1") ? this.i22105 : "");
        setI22106(i207.equals("1") ? this.i22106 : "");
        setI22196(i207.equals("1") ? this.i22196 : "");

        setI222(i207.equals("1") ? this.i222 : "");
        notifyPropertyChanged(BR.i207);
    }

    @Bindable
    public String getI208() {
        return i208;
    }

    public void setI208(String i208) {
        this.i208 = i208;
        setI20896x(i208.equals("96") ? this.i20896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i208);
    }

    @Bindable
    public String getI20896x() {
        return i20896x;
    }

    public void setI20896x(String i20896x) {
        this.i20896x = i20896x;
        notifyPropertyChanged(BR.i20896x);
    }

    @Bindable
    public String getI211() {
        return i211;
    }

    public void setI211(String i211) {
        this.i211 = i211;
        setI212(i211.equals("1") ? "" : this.i212);
        setI213(i211.equals("1") ? "" : this.i213);
        setI214(i211.equals("1") ? "" : this.i214);
        setI215(i211.equals("1") ? "" : this.i215);
        setI216(i211.equals("1") ? "" : this.i216);
        setI217(i211.equals("1") ? "" : this.i217);
        notifyPropertyChanged(BR.i211);
    }

    @Bindable
    public String getI212() {
        return i212;
    }

    public void setI212(String i212) {
        this.i212 = i212;
        notifyPropertyChanged(BR.i212);
    }

    @Bindable
    public String getI213() {
        return i213;
    }

    public void setI213(String i213) {
        this.i213 = i213;
        notifyPropertyChanged(BR.i213);
    }

    @Bindable
    public String getI214() {
        return i214;
    }

    public void setI214(String i214) {
        this.i214 = i214;
        setI215(i214.equals("2") ? "" : this.i215);
        setI216(i214.equals("2") ? "" : this.i216);
        setI217(i214.equals("2") ? "" : this.i217);
        notifyPropertyChanged(BR.i214);
    }

    @Bindable
    public String getI215() {
        return i215;
    }

    public void setI215(String i215) {
        this.i215 = i215;
        notifyPropertyChanged(BR.i215);
    }

    @Bindable
    public String getI216() {
        return i216;
    }

    public void setI216(String i216) {
        this.i216 = i216;
        setI21601x(i216.equals("1") ? this.i21601x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i216);
    }

    @Bindable
    public String getI21601x() {
        return i21601x;
    }

    public void setI21601x(String i21601x) {
        this.i21601x = i21601x;
        notifyPropertyChanged(BR.i21601x);
    }

    @Bindable
    public String getI217() {
        return i217;
    }

    public void setI217(String i217) {
        this.i217 = i217;
        notifyPropertyChanged(BR.i217);
    }

    @Bindable
    public String getI218() {
        return i218;
    }

    public void setI218(String i218) {
        this.i218 = i218;
        setI21896x(i218.equals("96") ? this.i21896x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i218);
    }

    @Bindable
    public String getI21896x() {
        return i21896x;
    }

    public void setI21896x(String i21896x) {
        this.i21896x = i21896x;
        notifyPropertyChanged(BR.i21896x);
    }

    @Bindable
    public String getI219() {
        return i219;
    }

    public void setI219(String i219) {
        this.i219 = i219;
        notifyPropertyChanged(BR.i219);
    }

    @Bindable
    public String getI21901() {
        return i21901;
    }

    public void setI21901(String i21901) {
        if (this.i21901.equals(i21901)) return; // for all checkboxes
        this.i21901 = i21901;
        setI21901x(i21901.equals("1") ? this.i21901x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21901);
    }

    @Bindable
    public String getI21901x() {
        return i21901x;
    }

    public void setI21901x(String i21901x) {
        this.i21901x = i21901x;
        notifyPropertyChanged(BR.i21901x);
    }

    @Bindable
    public String getI21902() {
        return i21902;
    }

    public void setI21902(String i21902) {
        if (this.i21902.equals(i21902)) return; // for all checkboxes
        this.i21902 = i21902;
        setI21902x(i21902.equals("2") ? this.i21902x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21902);
    }

    @Bindable
    public String getI21902x() {
        return i21902x;
    }

    public void setI21902x(String i21902x) {
        this.i21902x = i21902x;
        notifyPropertyChanged(BR.i21902x);
    }

    @Bindable
    public String getI21903() {
        return i21903;
    }

    public void setI21903(String i21903) {
        if (this.i21903.equals(i21903)) return; // for all checkboxes
        this.i21903 = i21903;
        setI21903x(i21903.equals("3") ? this.i21903x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21903);
    }

    @Bindable
    public String getI21903x() {
        return i21903x;
    }

    public void setI21903x(String i21903x) {
        this.i21903x = i21903x;
        notifyPropertyChanged(BR.i21903x);
    }

    @Bindable
    public String getI21904() {
        return i21904;
    }

    public void setI21904(String i21904) {
        if (this.i21904.equals(i21904)) return; // for all checkboxes
        this.i21904 = i21904;
        setI21904x(i21904.equals("4") ? this.i21904x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21904);
    }

    @Bindable
    public String getI21904x() {
        return i21904x;
    }

    public void setI21904x(String i21904x) {
        this.i21904x = i21904x;
        notifyPropertyChanged(BR.i21904x);
    }

    @Bindable
    public String getI21905() {
        return i21905;
    }

    public void setI21905(String i21905) {
        if (this.i21905.equals(i21905)) return; // for all checkboxes
        this.i21905 = i21905;
        setI21905x(i21905.equals("5") ? this.i21905x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21905);
    }

    @Bindable
    public String getI21905x() {
        return i21905x;
    }

    public void setI21905x(String i21905x) {
        this.i21905x = i21905x;
        notifyPropertyChanged(BR.i21905x);
    }

    @Bindable
    public String getI21996() {
        return i21996;
    }

    public void setI21996(String i21996) {
        if (this.i21996.equals(i21996)) return; // for all checkboxes
        this.i21996 = i21996;
        setI21996x(i21996.equals("96") ? this.i21996x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i21996);
    }

    @Bindable
    public String getI21996x() {
        return i21996x;
    }

    public void setI21996x(String i21996x) {
        this.i21996x = i21996x;
        notifyPropertyChanged(BR.i21996x);
    }

    @Bindable
    public String getI21998() {
        return i21998;
    }

    public void setI21998(String i21998) {
        if (this.i21998.equals(i21998)) return; // for all checkboxes
        this.i21998 = i21998;
        setI22101(i21998.equals("98") ? "" : this.i22101);
        setI22102(i21998.equals("98") ? "" : this.i22102);
        setI22103(i21998.equals("98") ? "" : this.i22103);
        setI22104(i21998.equals("98") ? "" : this.i22104);
        setI22105(i21998.equals("98") ? "" : this.i22105);
        setI22106(i21998.equals("98") ? "" : this.i22106);
        setI22196(i21998.equals("98") ? "" : this.i22196);
        notifyPropertyChanged(BR.i21998);
    }

    @Bindable
    public String getI220() {
        return i220;
    }

    public void setI220(String i220) {
        this.i220 = i220;
        notifyPropertyChanged(BR.i220);
    }

    @Bindable
    public String getI22001() {
        return i22001;
    }

    public void setI22001(String i22001) {
        this.i22001 = i22001;
        notifyPropertyChanged(BR.i22001);
    }

    @Bindable
    public String getI22002() {
        return i22002;
    }

    public void setI22002(String i22002) {
        this.i22002 = i22002;
        notifyPropertyChanged(BR.i22002);
    }

    @Bindable
    public String getI22003() {
        return i22003;
    }

    public void setI22003(String i22003) {
        this.i22003 = i22003;
        notifyPropertyChanged(BR.i22003);
    }

    @Bindable
    public String getI22004() {
        return i22004;
    }

    public void setI22004(String i22004) {
        this.i22004 = i22004;
        notifyPropertyChanged(BR.i22004);
    }

    @Bindable
    public String getI22005() {
        return i22005;
    }

    public void setI22005(String i22005) {
        this.i22005 = i22005;
        notifyPropertyChanged(BR.i22005);
    }

    @Bindable
    public String getI22006() {
        return i22006;
    }

    public void setI22006(String i22006) {
        this.i22006 = i22006;
        notifyPropertyChanged(BR.i22006);
    }

    @Bindable
    public String getI22007() {
        return i22007;
    }

    public void setI22007(String i22007) {
        this.i22007 = i22007;
        notifyPropertyChanged(BR.i22007);
    }

    @Bindable
    public String getI221() {
        return i221;
    }

    public void setI221(String i221) {
        this.i221 = i221;
        notifyPropertyChanged(BR.i221);
    }

    @Bindable
    public String getI22101() {
        return i22101;
    }

    public void setI22101(String i22101) {
        if (this.i22101.equals(i22101)) return; // for all checkboxes
        this.i22101 = i22101;
        notifyPropertyChanged(BR.i22101);
    }

    @Bindable
    public String getI22102() {
        return i22102;
    }

    public void setI22102(String i22102) {
        if (this.i22102.equals(i22102)) return; // for all checkboxes
        this.i22102 = i22102;
        notifyPropertyChanged(BR.i22102);
    }

    @Bindable
    public String getI22103() {
        return i22103;
    }

    public void setI22103(String i22103) {
        if (this.i22103.equals(i22103)) return; // for all checkboxes
        this.i22103 = i22103;
        notifyPropertyChanged(BR.i22103);
    }

    @Bindable
    public String getI22104() {
        return i22104;
    }

    public void setI22104(String i22104) {
        if (this.i22104.equals(i22104)) return; // for all checkboxes
        this.i22104 = i22104;
        notifyPropertyChanged(BR.i22104);
    }

    @Bindable
    public String getI22105() {
        return i22105;
    }

    public void setI22105(String i22105) {
        if (this.i22105.equals(i22105)) return; // for all checkboxes
        this.i22105 = i22105;
        notifyPropertyChanged(BR.i22105);
    }

    @Bindable
    public String getI22106() {
        return i22106;
    }

    public void setI22106(String i22106) {
        if (this.i22106.equals(i22106)) return; // for all checkboxes
        this.i22106 = i22106;
        notifyPropertyChanged(BR.i22106);
    }

    @Bindable
    public String getI22196() {
        return i22196;
    }

    public void setI22196(String i22196) {
        if (this.i22196.equals(i22196)) return; // for all checkboxes
        this.i22196 = i22196;
        setI22196x(i22196.equals("96") ? this.i22196x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i22196);
    }

    @Bindable
    public String getI22196x() {
        return i22196x;
    }

    public void setI22196x(String i22196x) {
        this.i22196x = i22196x;
        notifyPropertyChanged(BR.i22196x);
    }

    @Bindable
    public String getI222() {
        return i222;
    }

    public void setI222(String i222) {
        this.i222 = i222;
        setI223(i222.equals("1") ? this.i223 : "");
        setI22401(i222.equals("1") ? this.i22401 : "");
        setI22402(i222.equals("1") ? this.i22402 : "");
        setI22403(i222.equals("1") ? this.i22403 : "");
        setI22404(i222.equals("1") ? this.i22404 : "");
        setI22405(i222.equals("1") ? this.i22405 : "");
        setI22406(i222.equals("1") ? this.i22406 : "");
        setI22496(i222.equals("1") ? this.i22496 : "");
        notifyPropertyChanged(BR.i222);
    }

    @Bindable
    public String getI223() {
        return i223;
    }

    public void setI223(String i223) {
        this.i223 = i223;
        setI22396x(i223.equals("96") ? this.i22396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i223);
    }

    @Bindable
    public String getI22396x() {
        return i22396x;
    }

    public void setI22396x(String i22396x) {
        this.i22396x = i22396x;
        notifyPropertyChanged(BR.i22396x);
    }

    @Bindable
    public String getI224() {
        return i224;
    }

    public void setI224(String i224) {
        this.i224 = i224;
        notifyPropertyChanged(BR.i224);
    }

    @Bindable
    public String getI22401() {
        return i22401;
    }

    public void setI22401(String i22401) {
        if (this.i22401.equals(i22401)) return; // for all checkboxes
        this.i22401 = i22401;
        notifyPropertyChanged(BR.i22401);
    }

    @Bindable
    public String getI22402() {
        return i22402;
    }

    public void setI22402(String i22402) {
        if (this.i22402.equals(i22402)) return; // for all checkboxes
        this.i22402 = i22402;
        notifyPropertyChanged(BR.i22402);
    }

    @Bindable
    public String getI22403() {
        return i22403;
    }

    public void setI22403(String i22403) {
        if (this.i22403.equals(i22403)) return; // for all checkboxes
        this.i22403 = i22403;
        notifyPropertyChanged(BR.i22403);
    }

    @Bindable
    public String getI22404() {
        return i22404;
    }

    public void setI22404(String i22404) {
        if (this.i22404.equals(i22404)) return; // for all checkboxes
        this.i22404 = i22404;
        notifyPropertyChanged(BR.i22404);
    }

    @Bindable
    public String getI22405() {
        return i22405;
    }

    public void setI22405(String i22405) {
        if (this.i22405.equals(i22405)) return; // for all checkboxes
        this.i22405 = i22405;
        notifyPropertyChanged(BR.i22405);
    }

    @Bindable
    public String getI22406() {
        return i22406;
    }

    public void setI22406(String i22406) {
        if (this.i22406.equals(i22406)) return; // for all checkboxes
        this.i22406 = i22406;
        notifyPropertyChanged(BR.i22406);
    }

    @Bindable
    public String getI22496() {
        return i22496;
    }

    public void setI22496(String i22496) {
        if (this.i22496.equals(i22496)) return; // for all checkboxes
        this.i22496 = i22496;
        setI22496x(i22496.equals("96") ? this.i22496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.i22496);
    }

    @Bindable
    public String getI22496x() {
        return i22496x;
    }

    public void setI22496x(String i22496x) {
        this.i22496x = i22496x;
        notifyPropertyChanged(BR.i22496x);
    }

    public ChildARI Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_INDEXED));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SYNCED_DATE));

        sI1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SI1)));
        sI2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildARITable.COLUMN_SI2)));

        return this;
    }

    public void sI1Hydrate(String string) throws JSONException {
        Log.d(TAG, "sI1Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.i101 = json.getString("i101");
            this.i10201 = json.getString("i10201");
            this.i102a = json.getString("i102a");
            this.i102ano = json.getString("i102ano");
            this.i102b = json.getString("i102b");
            this.i102c = json.getString("i102c");
            this.i102cno = json.getString("i102cno");
            this.i103 = json.getString("i103");
            this.i10301x = json.getString("i10301x");
            this.i104 = json.getString("i104");
            this.i105 = json.getString("i105");
            this.i106 = json.getString("i106");
            this.i10696x = json.getString("i10696x");
            this.i107 = json.getString("i107");
            this.i108 = json.getString("i108");
            this.i111 = json.getString("i111");
            this.i11196x = json.getString("i11196x");
            this.i11201 = json.getString("i11201");
            this.i11202 = json.getString("i11202");
            this.i11203 = json.getString("i11203");
            this.i11204 = json.getString("i11204");
            this.i11205 = json.getString("i11205");
            this.i11206 = json.getString("i11206");
            this.i11207 = json.getString("i11207");
            this.i11208 = json.getString("i11208");
            this.i11209 = json.getString("i11209");
            this.i11210 = json.getString("i11210");
            this.i11211 = json.getString("i11211");
            this.i113 = json.getString("i113");
            this.i115 = json.getString("i115");
            this.i116 = json.getString("i116");
            this.i11601x = json.getString("i11601x");
            this.i11602x = json.getString("i11602x");
            this.i11701 = json.getString("i11701");
            this.i11702 = json.getString("i11702");
            this.i11703 = json.getString("i11703");
            this.i11704 = json.getString("i11704");
            this.i11705 = json.getString("i11705");
            this.i11706 = json.getString("i11706");
            this.i11707 = json.getString("i11707");
            this.i11708 = json.getString("i11708");
            this.i11796 = json.getString("i11796");
            this.i11796x = json.getString("i11796x");
            this.i11801 = json.getString("i11801");
            this.i11801x = json.getString("i11801x");
            this.i11802 = json.getString("i11802");
            this.i11802x = json.getString("i11802x");
            this.i11803 = json.getString("i11803");
            this.i11803x = json.getString("i11803x");
            this.i11896 = json.getString("i11896");
            this.i11896x = json.getString("i11896x");
            this.i11898 = json.getString("i11898");
            this.i119 = json.getString("i119");
            this.i120 = json.getString("i120");
            this.i121 = json.getString("i121");
            this.i12201 = json.getString("i12201");
            this.i12202 = json.getString("i12202");
            this.i12203 = json.getString("i12203");
            this.i12204 = json.getString("i12204");
            this.i12205 = json.getString("i12205");
            this.i12206 = json.getString("i12206");
            this.i12207 = json.getString("i12207");
            this.i12208 = json.getString("i12208");
            this.i123 = json.getString("i123");
            this.i124 = json.getString("i124");
            this.i12496x = json.getString("i12496x");
            this.i12501 = json.getString("i12501");
            this.i12502 = json.getString("i12502");
            this.i12503 = json.getString("i12503");
            this.i12504 = json.getString("i12504");
            this.i12505 = json.getString("i12505");
        }
    }

    public void sI2Hydrate(String string) throws JSONException {
        Log.d(TAG, "sI2Hydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.i201 = json.getString("i201");
            this.i20201 = json.getString("i20201");
            this.i202a = json.getString("i202a");
            this.i202ano = json.getString("i202ano");
            this.i202b = json.getString("i202b");
            this.i202c = json.getString("i202c");
            this.i202cno = json.getString("i202cno");
            this.i203 = json.getString("i203");
            this.i205 = json.getString("i205");
            this.i206 = json.getString("i206");
            this.i20601x = json.getString("i20601x");
            this.i207 = json.getString("i207");
            this.i208 = json.getString("i208");
            this.i20896x = json.getString("i20896x");
            this.i211 = json.getString("i211");
            this.i212 = json.getString("i212");
            this.i213 = json.getString("i213");
            this.i214 = json.getString("i214");
            this.i215 = json.getString("i215");
            this.i216 = json.getString("i216");
            this.i21601x = json.getString("i21601x");
            this.i217 = json.getString("i217");
            this.i218 = json.getString("i218");
            this.i21896x = json.getString("i21896x");
            this.i21901 = json.getString("i21901");
            this.i21901x = json.getString("i21901x");
            this.i21902 = json.getString("i21902");
            this.i21902x = json.getString("i21902x");
            this.i21903 = json.getString("i21903");
            this.i21903x = json.getString("i21903x");
            this.i21904 = json.getString("i21904");
            this.i21904x = json.getString("i21904x");
            this.i21905 = json.getString("i21905");
            this.i21905x = json.getString("i21905x");
            this.i21996 = json.getString("i21996");
            this.i21996x = json.getString("i21996x");
            this.i21998 = json.getString("i21998");
            this.i22001 = json.getString("i22001");
            this.i22002 = json.getString("i22002");
            this.i22003 = json.getString("i22003");
            this.i22004 = json.getString("i22004");
            this.i22005 = json.getString("i22005");
            this.i22006 = json.getString("i22006");
            this.i22007 = json.getString("i22007");
            this.i22101 = json.getString("i22101");
            this.i22102 = json.getString("i22102");
            this.i22103 = json.getString("i22103");
            this.i22104 = json.getString("i22104");
            this.i22105 = json.getString("i22105");
            this.i22106 = json.getString("i22106");
            this.i22196 = json.getString("i22196");
            this.i22196x = json.getString("i22196x");
            this.i222 = json.getString("i222");
            this.i223 = json.getString("i223");
            this.i22396x = json.getString("i22396x");
            this.i22401 = json.getString("i22401");
            this.i22402 = json.getString("i22402");
            this.i22403 = json.getString("i22403");
            this.i22404 = json.getString("i22404");
            this.i22405 = json.getString("i22405");
            this.i22406 = json.getString("i22406");
            this.i22496 = json.getString("i22496");
            this.i22496x = json.getString("i22496x");
        }
    }

    public String sI1toString() throws JSONException {
        Log.d(TAG, "sI1toString: ");
        JSONObject json = new JSONObject();
        json.put("i101", i101)
                .put("i10201", i10201)
                .put("i102a", i102a)
                .put("i102ano", i102ano)
                .put("i102b", i102b)
                .put("i102c", i102c)
                .put("i102cno", i102cno)
                .put("i103", i103)
                .put("i10301x", i10301x)
                .put("i104", i104)
                .put("i105", i105)
                .put("i106", i106)
                .put("i10696x", i10696x)
                .put("i107", i107)
                .put("i108", i108)
                .put("i111", i111)
                .put("i11196x", i11196x)
                .put("i11201", i11201)
                .put("i11202", i11202)
                .put("i11203", i11203)
                .put("i11204", i11204)
                .put("i11205", i11205)
                .put("i11206", i11206)
                .put("i11207", i11207)
                .put("i11208", i11208)
                .put("i11209", i11209)
                .put("i11210", i11210)
                .put("i11211", i11211)
                .put("i113", i113)
                .put("i115", i115)
                .put("i116", i116)
                .put("i11601x", i11601x)
                .put("i11602x", i11602x)
                .put("i11701", i11701)
                .put("i11702", i11702)
                .put("i11703", i11703)
                .put("i11704", i11704)
                .put("i11705", i11705)
                .put("i11706", i11706)
                .put("i11707", i11707)
                .put("i11708", i11708)
                .put("i11796", i11796)
                .put("i11796x", i11796x)
                .put("i11801", i11801)
                .put("i11801x", i11801x)
                .put("i11802", i11802)
                .put("i11802x", i11802x)
                .put("i11803", i11803)
                .put("i11803x", i11803x)
                .put("i11896", i11896)
                .put("i11896x", i11896x)
                .put("i11898", i11898)
                .put("i119", i119)
                .put("i120", i120)
                .put("i121", i121)
                .put("i12201", i12201)
                .put("i12202", i12202)
                .put("i12203", i12203)
                .put("i12204", i12204)
                .put("i12205", i12205)
                .put("i12206", i12206)
                .put("i12207", i12207)
                .put("i12208", i12208)
                .put("i123", i123)
                .put("i124", i124)
                .put("i12496x", i12496x)
                .put("i12501", i12501)
                .put("i12502", i12502)
                .put("i12503", i12503)
                .put("i12504", i12504)
                .put("i12505", i12505);
        return json.toString();
    }

    public String sI2toString() throws JSONException {
        Log.d(TAG, "sI2toString: ");
        JSONObject json = new JSONObject();
        json.put("i201", i201)
                .put("i20201", i20201)
                .put("i202a", i202a)
                .put("i202ano", i202ano)
                .put("i202b", i202b)
                .put("i202c", i202c)
                .put("i202cno", i202cno)
                .put("i203", i203)
                .put("i205", i205)
                .put("i206", i206)
                .put("i20601x", i20601x)
                .put("i207", i207)
                .put("i208", i208)
                .put("i20896x", i20896x)
                .put("i211", i211)
                .put("i212", i212)
                .put("i213", i213)
                .put("i214", i214)
                .put("i215", i215)
                .put("i216", i216)
                .put("i21601x", i21601x)
                .put("i217", i217)
                .put("i218", i218)
                .put("i21896x", i21896x)
                .put("i21901", i21901)
                .put("i21901x", i21901x)
                .put("i21902", i21902)
                .put("i21902x", i21902x)
                .put("i21903", i21903)
                .put("i21903x", i21903x)
                .put("i21904", i21904)
                .put("i21904x", i21904x)
                .put("i21905", i21905)
                .put("i21905x", i21905x)
                .put("i21996", i21996)
                .put("i21996x", i21996x)
                .put("i21998", i21998)
                .put("i22001", i22001)
                .put("i22002", i22002)
                .put("i22003", i22003)
                .put("i22004", i22004)
                .put("i22005", i22005)
                .put("i22006", i22006)
                .put("i22007", i22007)
                .put("i22101", i22101)
                .put("i22102", i22102)
                .put("i22103", i22103)
                .put("i22104", i22104)
                .put("i22105", i22105)
                .put("i22106", i22106)
                .put("i22196", i22196)
                .put("i22196x", i22196x)
                .put("i222", i222)
                .put("i223", i223)
                .put("i22396x", i22396x)
                .put("i22401", i22401)
                .put("i22402", i22402)
                .put("i22403", i22403)
                .put("i22404", i22404)
                .put("i22405", i22405)
                .put("i22406", i22406)
                .put("i22496", i22496)
                .put("i22496x", i22496x);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildARITable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildARITable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildARITable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.ChildARITable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildARITable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildARITable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildARITable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.ChildARITable.COLUMN_MUID, this.muid);
        json.put(TableContracts.ChildARITable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.ChildARITable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildARITable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildARITable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildARITable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildARITable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildARITable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.ChildARITable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildARITable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.ChildARITable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildARITable.COLUMN_SI1, new JSONObject(sI1toString()));
        json.put(TableContracts.ChildARITable.COLUMN_SI2, new JSONObject(sI2toString()));

        return json;
    }

}
