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

public class Child extends BaseObservable implements Observable {

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
    private String im01 = _EMPTY_;
    private String im02 = _EMPTY_;
    private String im03 = _EMPTY_;
    private String im0396x = _EMPTY_;
    private String im04d = _EMPTY_;
    private String im04m = _EMPTY_;
    private String im04y = _EMPTY_;
    private String im0501d = _EMPTY_;
    private String im0501m = _EMPTY_;
    private String im0501y = _EMPTY_;
    private String im0502d = _EMPTY_;
    private String im0502m = _EMPTY_;
    private String im0502y = _EMPTY_;
    private String im0503d = _EMPTY_;
    private String im0503m = _EMPTY_;
    private String im0503y = _EMPTY_;
    private String im0504d = _EMPTY_;
    private String im0504m = _EMPTY_;
    private String im0504y = _EMPTY_;
    private String im0505d = _EMPTY_;
    private String im0505m = _EMPTY_;
    private String im0505y = _EMPTY_;
    private String im0506d = _EMPTY_;
    private String im0506m = _EMPTY_;
    private String im0506y = _EMPTY_;
    private String im0507d = _EMPTY_;
    private String im0507m = _EMPTY_;
    private String im0507y = _EMPTY_;
    private String im0508d = _EMPTY_;
    private String im0508m = _EMPTY_;
    private String im0508y = _EMPTY_;
    private String im0509d = _EMPTY_;
    private String im0509m = _EMPTY_;
    private String im0509y = _EMPTY_;
    private String im0510d = _EMPTY_;
    private String im0510m = _EMPTY_;
    private String im0510y = _EMPTY_;
    private String im0511d = _EMPTY_;
    private String im0511m = _EMPTY_;
    private String im0511y = _EMPTY_;
    private String im0512d = _EMPTY_;
    private String im0512m = _EMPTY_;
    private String im0512y = _EMPTY_;
    private String im0513d = _EMPTY_;
    private String im0513m = _EMPTY_;
    private String im0513y = _EMPTY_;
    private String im0514d = _EMPTY_;
    private String im0514m = _EMPTY_;
    private String im0514y = _EMPTY_;
    private String im0515d = _EMPTY_;
    private String im0515m = _EMPTY_;
    private String im0515y = _EMPTY_;
    private String im0516d = _EMPTY_;
    private String im0516m = _EMPTY_;
    private String im0516y = _EMPTY_;
    private String im07 = _EMPTY_;
    private String im08 = _EMPTY_;
    private String im09 = _EMPTY_;
    private String im10 = _EMPTY_;
    private String im11 = _EMPTY_;
    private String im12 = _EMPTY_;
    private String im1201x = _EMPTY_;
    private String im14 = _EMPTY_;
    private String im15 = _EMPTY_;
    private String im1501x = _EMPTY_;
    private String im16 = _EMPTY_;
    private String im17 = _EMPTY_;
    private String im1701x = _EMPTY_;
    private String im18 = _EMPTY_;
    private String im19 = _EMPTY_;
    private String im1901x = _EMPTY_;
    private String im20 = _EMPTY_;
    private String im21 = _EMPTY_;
    private String im22 = _EMPTY_;
    private String im2201x = _EMPTY_;
    private String im23 = _EMPTY_;
    private String im2396x = _EMPTY_;
    private String im24 = _EMPTY_;
    private String im2496x = _EMPTY_;
    private String im25 = _EMPTY_;
    private String im2501x = _EMPTY_;
    private String im2502x = _EMPTY_;
    private String im26 = _EMPTY_;
    private String im2601 = _EMPTY_;
    private String im2602 = _EMPTY_;
    private String im2603 = _EMPTY_;
    private String im2604 = _EMPTY_;
    private String im2605 = _EMPTY_;
    private String im2606 = _EMPTY_;
    private String im2607 = _EMPTY_;
    private String im2608 = _EMPTY_;
    private String im2609 = _EMPTY_;
    private String im2610 = _EMPTY_;
    private String im2611 = _EMPTY_;
    private String im2612 = _EMPTY_;
    private String im2613 = _EMPTY_;
    private String im2614 = _EMPTY_;
    private String im2615 = _EMPTY_;
    private String im2616 = _EMPTY_;
    private String im2617 = _EMPTY_;
    private String im2698 = _EMPTY_;
    private String im2696 = _EMPTY_;
    private String im2696x = _EMPTY_;
    private String im27 = _EMPTY_;
    private String im28 = _EMPTY_;
    private String im29 = _EMPTY_;
    private String im2901x = _EMPTY_;
    private String im30 = _EMPTY_;
    private String im31 = _EMPTY_;
    private String im32 = _EMPTY_;
    private String im3201 = _EMPTY_;
    private String im3202 = _EMPTY_;
    private String im3203 = _EMPTY_;
    private String im3204 = _EMPTY_;
    private String im3205 = _EMPTY_;
    private String im3206 = _EMPTY_;
    private String im3207 = _EMPTY_;
    private String im3208 = _EMPTY_;
    private String im3209 = _EMPTY_;
    private String im3210 = _EMPTY_;
    private String im3211 = _EMPTY_;
    private String im3212 = _EMPTY_;
    private String im3213 = _EMPTY_;
    private String im3298 = _EMPTY_;
    private String im3296 = _EMPTY_;
    private String im3296x = _EMPTY_;

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
        notifyPropertyChanged(BR.i105);
    }

    @Bindable
    public String getI106() {
        return i106;
    }

    public void setI106(String i106) {
        this.i106 = i106;
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
        this.i11201 = i11201;
        notifyPropertyChanged(BR.i11201);
    }

    @Bindable
    public String getI11202() {
        return i11202;
    }

    public void setI11202(String i11202) {
        this.i11202 = i11202;
        notifyPropertyChanged(BR.i11202);
    }

    @Bindable
    public String getI11203() {
        return i11203;
    }

    public void setI11203(String i11203) {
        this.i11203 = i11203;
        notifyPropertyChanged(BR.i11203);
    }

    @Bindable
    public String getI11204() {
        return i11204;
    }

    public void setI11204(String i11204) {
        this.i11204 = i11204;
        notifyPropertyChanged(BR.i11204);
    }

    @Bindable
    public String getI11205() {
        return i11205;
    }

    public void setI11205(String i11205) {
        this.i11205 = i11205;
        notifyPropertyChanged(BR.i11205);
    }

    @Bindable
    public String getI11206() {
        return i11206;
    }

    public void setI11206(String i11206) {
        this.i11206 = i11206;
        notifyPropertyChanged(BR.i11206);
    }

    @Bindable
    public String getI11207() {
        return i11207;
    }

    public void setI11207(String i11207) {
        this.i11207 = i11207;
        notifyPropertyChanged(BR.i11207);
    }

    @Bindable
    public String getI11208() {
        return i11208;
    }

    public void setI11208(String i11208) {
        this.i11208 = i11208;
        notifyPropertyChanged(BR.i11208);
    }

    @Bindable
    public String getI11209() {
        return i11209;
    }

    public void setI11209(String i11209) {
        this.i11209 = i11209;
        notifyPropertyChanged(BR.i11209);
    }

    @Bindable
    public String getI11210() {
        return i11210;
    }

    public void setI11210(String i11210) {
        this.i11210 = i11210;
        notifyPropertyChanged(BR.i11210);
    }

    @Bindable
    public String getI11211() {
        return i11211;
    }

    public void setI11211(String i11211) {
        this.i11211 = i11211;
        notifyPropertyChanged(BR.i11211);
    }

    @Bindable
    public String getI113() {
        return i113;
    }

    public void setI113(String i113) {
        this.i113 = i113;
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
        this.i11701 = i11701;
        notifyPropertyChanged(BR.i11701);
    }

    @Bindable
    public String getI11702() {
        return i11702;
    }

    public void setI11702(String i11702) {
        this.i11702 = i11702;
        notifyPropertyChanged(BR.i11702);
    }

    @Bindable
    public String getI11703() {
        return i11703;
    }

    public void setI11703(String i11703) {
        this.i11703 = i11703;
        notifyPropertyChanged(BR.i11703);
    }

    @Bindable
    public String getI11704() {
        return i11704;
    }

    public void setI11704(String i11704) {
        this.i11704 = i11704;
        notifyPropertyChanged(BR.i11704);
    }

    @Bindable
    public String getI11705() {
        return i11705;
    }

    public void setI11705(String i11705) {
        this.i11705 = i11705;
        notifyPropertyChanged(BR.i11705);
    }

    @Bindable
    public String getI11706() {
        return i11706;
    }

    public void setI11706(String i11706) {
        this.i11706 = i11706;
        notifyPropertyChanged(BR.i11706);
    }

    @Bindable
    public String getI11707() {
        return i11707;
    }

    public void setI11707(String i11707) {
        this.i11707 = i11707;
        notifyPropertyChanged(BR.i11707);
    }

    @Bindable
    public String getI11708() {
        return i11708;
    }

    public void setI11708(String i11708) {
        this.i11708 = i11708;
        notifyPropertyChanged(BR.i11708);
    }

    @Bindable
    public String getI11796() {
        return i11796;
    }

    public void setI11796(String i11796) {
        this.i11796 = i11796;
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
        this.i11801 = i11801;
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
        this.i11802 = i11802;
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
        this.i11803 = i11803;
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
        this.i11896 = i11896;
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
        notifyPropertyChanged(BR.i119);
    }

    @Bindable
    public String getI120() {
        return i120;
    }

    public void setI120(String i120) {
        this.i120 = i120;
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
        this.i12201 = i12201;
        notifyPropertyChanged(BR.i12201);
    }

    @Bindable
    public String getI12202() {
        return i12202;
    }

    public void setI12202(String i12202) {
        this.i12202 = i12202;
        notifyPropertyChanged(BR.i12202);
    }

    @Bindable
    public String getI12203() {
        return i12203;
    }

    public void setI12203(String i12203) {
        this.i12203 = i12203;
        notifyPropertyChanged(BR.i12203);
    }

    @Bindable
    public String getI12204() {
        return i12204;
    }

    public void setI12204(String i12204) {
        this.i12204 = i12204;
        notifyPropertyChanged(BR.i12204);
    }

    @Bindable
    public String getI12205() {
        return i12205;
    }

    public void setI12205(String i12205) {
        this.i12205 = i12205;
        notifyPropertyChanged(BR.i12205);
    }

    @Bindable
    public String getI12206() {
        return i12206;
    }

    public void setI12206(String i12206) {
        this.i12206 = i12206;
        notifyPropertyChanged(BR.i12206);
    }

    @Bindable
    public String getI12207() {
        return i12207;
    }

    public void setI12207(String i12207) {
        this.i12207 = i12207;
        notifyPropertyChanged(BR.i12207);
    }

    @Bindable
    public String getI12208() {
        return i12208;
    }

    public void setI12208(String i12208) {
        this.i12208 = i12208;
        notifyPropertyChanged(BR.i12208);
    }

    @Bindable
    public String getI123() {
        return i123;
    }

    public void setI123(String i123) {
        this.i123 = i123;
        notifyPropertyChanged(BR.i123);
    }

    @Bindable
    public String getI124() {
        return i124;
    }

    public void setI124(String i124) {
        this.i124 = i124;
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
        this.i12501 = i12501;
        notifyPropertyChanged(BR.i12501);
    }

    @Bindable
    public String getI12502() {
        return i12502;
    }

    public void setI12502(String i12502) {
        this.i12502 = i12502;
        notifyPropertyChanged(BR.i12502);
    }

    @Bindable
    public String getI12503() {
        return i12503;
    }

    public void setI12503(String i12503) {
        this.i12503 = i12503;
        notifyPropertyChanged(BR.i12503);
    }

    @Bindable
    public String getI12504() {
        return i12504;
    }

    public void setI12504(String i12504) {
        this.i12504 = i12504;
        notifyPropertyChanged(BR.i12504);
    }

    @Bindable
    public String getI12505() {
        return i12505;
    }

    public void setI12505(String i12505) {
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
        notifyPropertyChanged(BR.i207);
    }

    @Bindable
    public String getI208() {
        return i208;
    }

    public void setI208(String i208) {
        this.i208 = i208;
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
        this.i21901 = i21901;
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
        this.i21902 = i21902;
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
        this.i21903 = i21903;
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
        this.i21904 = i21904;
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
        this.i21905 = i21905;
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
        this.i21996 = i21996;
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
        this.i21998 = i21998;
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
        this.i22101 = i22101;
        notifyPropertyChanged(BR.i22101);
    }

    @Bindable
    public String getI22102() {
        return i22102;
    }

    public void setI22102(String i22102) {
        this.i22102 = i22102;
        notifyPropertyChanged(BR.i22102);
    }

    @Bindable
    public String getI22103() {
        return i22103;
    }

    public void setI22103(String i22103) {
        this.i22103 = i22103;
        notifyPropertyChanged(BR.i22103);
    }

    @Bindable
    public String getI22104() {
        return i22104;
    }

    public void setI22104(String i22104) {
        this.i22104 = i22104;
        notifyPropertyChanged(BR.i22104);
    }

    @Bindable
    public String getI22105() {
        return i22105;
    }

    public void setI22105(String i22105) {
        this.i22105 = i22105;
        notifyPropertyChanged(BR.i22105);
    }

    @Bindable
    public String getI22106() {
        return i22106;
    }

    public void setI22106(String i22106) {
        this.i22106 = i22106;
        notifyPropertyChanged(BR.i22106);
    }

    @Bindable
    public String getI22196() {
        return i22196;
    }

    public void setI22196(String i22196) {
        this.i22196 = i22196;
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
        notifyPropertyChanged(BR.i222);
    }

    @Bindable
    public String getI223() {
        return i223;
    }

    public void setI223(String i223) {
        this.i223 = i223;
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
        this.i22401 = i22401;
        notifyPropertyChanged(BR.i22401);
    }

    @Bindable
    public String getI22402() {
        return i22402;
    }

    public void setI22402(String i22402) {
        this.i22402 = i22402;
        notifyPropertyChanged(BR.i22402);
    }

    @Bindable
    public String getI22403() {
        return i22403;
    }

    public void setI22403(String i22403) {
        this.i22403 = i22403;
        notifyPropertyChanged(BR.i22403);
    }

    @Bindable
    public String getI22404() {
        return i22404;
    }

    public void setI22404(String i22404) {
        this.i22404 = i22404;
        notifyPropertyChanged(BR.i22404);
    }

    @Bindable
    public String getI22405() {
        return i22405;
    }

    public void setI22405(String i22405) {
        this.i22405 = i22405;
        notifyPropertyChanged(BR.i22405);
    }

    @Bindable
    public String getI22406() {
        return i22406;
    }

    public void setI22406(String i22406) {
        this.i22406 = i22406;
        notifyPropertyChanged(BR.i22406);
    }

    @Bindable
    public String getI22496() {
        return i22496;
    }

    public void setI22496(String i22496) {
        this.i22496 = i22496;
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

    @Bindable
    public String getIm01() {
        return im01;
    }

    public void setIm01(String im01) {
        this.im01 = im01;
        notifyPropertyChanged(BR.im01);
    }

    @Bindable
    public String getIm02() {
        return im02;
    }

    public void setIm02(String im02) {
        this.im02 = im02;
        notifyPropertyChanged(BR.im02);
    }

    @Bindable
    public String getIm03() {
        return im03;
    }

    public void setIm03(String im03) {
        this.im03 = im03;
        setIm0396x(im03.equals("96") ? this.im0396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im03);
    }

    @Bindable
    public String getIm0396x() {
        return im0396x;
    }

    public void setIm0396x(String im0396x) {
        this.im0396x = im0396x;
        notifyPropertyChanged(BR.im0396x);
    }

    @Bindable
    public String getIm04d() {
        return im04d;
    }

    public void setIm04d(String im04d) {
        this.im04d = im04d;
        notifyPropertyChanged(BR.im04d);
    }

    @Bindable
    public String getIm04m() {
        return im04m;
    }

    public void setIm04m(String im04m) {
        this.im04m = im04m;
        notifyPropertyChanged(BR.im04m);
    }

    @Bindable
    public String getIm04y() {
        return im04y;
    }

    public void setIm04y(String im04y) {
        this.im04y = im04y;
        notifyPropertyChanged(BR.im04y);
    }

    @Bindable
    public String getIm0501d() {
        return im0501d;
    }

    public void setIm0501d(String im0501d) {
        this.im0501d = im0501d;
        notifyPropertyChanged(BR.im0501d);
    }

    @Bindable
    public String getIm0501m() {
        return im0501m;
    }

    public void setIm0501m(String im0501m) {
        this.im0501m = im0501m;
        notifyPropertyChanged(BR.im0501m);
    }

    @Bindable
    public String getIm0501y() {
        return im0501y;
    }

    public void setIm0501y(String im0501y) {
        this.im0501y = im0501y;
        notifyPropertyChanged(BR.im0501y);
    }

    @Bindable
    public String getIm0502d() {
        return im0502d;
    }

    public void setIm0502d(String im0502d) {
        this.im0502d = im0502d;
        notifyPropertyChanged(BR.im0502d);
    }

    @Bindable
    public String getIm0502m() {
        return im0502m;
    }

    public void setIm0502m(String im0502m) {
        this.im0502m = im0502m;
        notifyPropertyChanged(BR.im0502m);
    }

    @Bindable
    public String getIm0502y() {
        return im0502y;
    }

    public void setIm0502y(String im0502y) {
        this.im0502y = im0502y;
        notifyPropertyChanged(BR.im0502y);
    }

    @Bindable
    public String getIm0503d() {
        return im0503d;
    }

    public void setIm0503d(String im0503d) {
        this.im0503d = im0503d;
        notifyPropertyChanged(BR.im0503d);
    }

    @Bindable
    public String getIm0503m() {
        return im0503m;
    }

    public void setIm0503m(String im0503m) {
        this.im0503m = im0503m;
        notifyPropertyChanged(BR.im0503m);
    }

    @Bindable
    public String getIm0503y() {
        return im0503y;
    }

    public void setIm0503y(String im0503y) {
        this.im0503y = im0503y;
        notifyPropertyChanged(BR.im0503y);
    }

    @Bindable
    public String getIm0504d() {
        return im0504d;
    }

    public void setIm0504d(String im0504d) {
        this.im0504d = im0504d;
        notifyPropertyChanged(BR.im0504d);
    }

    @Bindable
    public String getIm0504m() {
        return im0504m;
    }

    public void setIm0504m(String im0504m) {
        this.im0504m = im0504m;
        notifyPropertyChanged(BR.im0504m);
    }

    @Bindable
    public String getIm0504y() {
        return im0504y;
    }

    public void setIm0504y(String im0504y) {
        this.im0504y = im0504y;
        notifyPropertyChanged(BR.im0504y);
    }

    @Bindable
    public String getIm0505d() {
        return im0505d;
    }

    public void setIm0505d(String im0505d) {
        this.im0505d = im0505d;
        notifyPropertyChanged(BR.im0505d);
    }

    @Bindable
    public String getIm0505m() {
        return im0505m;
    }

    public void setIm0505m(String im0505m) {
        this.im0505m = im0505m;
        notifyPropertyChanged(BR.im0505m);
    }

    @Bindable
    public String getIm0505y() {
        return im0505y;
    }

    public void setIm0505y(String im0505y) {
        this.im0505y = im0505y;
        notifyPropertyChanged(BR.im0505y);
    }

    @Bindable
    public String getIm0506d() {
        return im0506d;
    }

    public void setIm0506d(String im0506d) {
        this.im0506d = im0506d;
        notifyPropertyChanged(BR.im0506d);
    }

    @Bindable
    public String getIm0506m() {
        return im0506m;
    }

    public void setIm0506m(String im0506m) {
        this.im0506m = im0506m;
        notifyPropertyChanged(BR.im0506m);
    }

    @Bindable
    public String getIm0506y() {
        return im0506y;
    }

    public void setIm0506y(String im0506y) {
        this.im0506y = im0506y;
        notifyPropertyChanged(BR.im0506y);
    }

    @Bindable
    public String getIm0507d() {
        return im0507d;
    }

    public void setIm0507d(String im0507d) {
        this.im0507d = im0507d;
        notifyPropertyChanged(BR.im0507d);
    }

    @Bindable
    public String getIm0507m() {
        return im0507m;
    }

    public void setIm0507m(String im0507m) {
        this.im0507m = im0507m;
        notifyPropertyChanged(BR.im0507m);
    }

    @Bindable
    public String getIm0507y() {
        return im0507y;
    }

    public void setIm0507y(String im0507y) {
        this.im0507y = im0507y;
        notifyPropertyChanged(BR.im0507y);
    }

    @Bindable
    public String getIm0508d() {
        return im0508d;
    }

    public void setIm0508d(String im0508d) {
        this.im0508d = im0508d;
        notifyPropertyChanged(BR.im0508d);
    }

    @Bindable
    public String getIm0508m() {
        return im0508m;
    }

    public void setIm0508m(String im0508m) {
        this.im0508m = im0508m;
        notifyPropertyChanged(BR.im0508m);
    }

    @Bindable
    public String getIm0508y() {
        return im0508y;
    }

    public void setIm0508y(String im0508y) {
        this.im0508y = im0508y;
        notifyPropertyChanged(BR.im0508y);
    }

    @Bindable
    public String getIm0509d() {
        return im0509d;
    }

    public void setIm0509d(String im0509d) {
        this.im0509d = im0509d;
        notifyPropertyChanged(BR.im0509d);
    }

    @Bindable
    public String getIm0509m() {
        return im0509m;
    }

    public void setIm0509m(String im0509m) {
        this.im0509m = im0509m;
        notifyPropertyChanged(BR.im0509m);
    }

    @Bindable
    public String getIm0509y() {
        return im0509y;
    }

    public void setIm0509y(String im0509y) {
        this.im0509y = im0509y;
        notifyPropertyChanged(BR.im0509y);
    }

    @Bindable
    public String getIm0510d() {
        return im0510d;
    }

    public void setIm0510d(String im0510d) {
        this.im0510d = im0510d;
        notifyPropertyChanged(BR.im0510d);
    }

    @Bindable
    public String getIm0510m() {
        return im0510m;
    }

    public void setIm0510m(String im0510m) {
        this.im0510m = im0510m;
        notifyPropertyChanged(BR.im0510m);
    }

    @Bindable
    public String getIm0510y() {
        return im0510y;
    }

    public void setIm0510y(String im0510y) {
        this.im0510y = im0510y;
        notifyPropertyChanged(BR.im0510y);
    }

    @Bindable
    public String getIm0511d() {
        return im0511d;
    }

    public void setIm0511d(String im0511d) {
        this.im0511d = im0511d;
        notifyPropertyChanged(BR.im0511d);
    }

    @Bindable
    public String getIm0511m() {
        return im0511m;
    }

    public void setIm0511m(String im0511m) {
        this.im0511m = im0511m;
        notifyPropertyChanged(BR.im0511m);
    }

    @Bindable
    public String getIm0511y() {
        return im0511y;
    }

    public void setIm0511y(String im0511y) {
        this.im0511y = im0511y;
        notifyPropertyChanged(BR.im0511y);
    }

    @Bindable
    public String getIm0512d() {
        return im0512d;
    }

    public void setIm0512d(String im0512d) {
        this.im0512d = im0512d;
        notifyPropertyChanged(BR.im0512d);
    }

    @Bindable
    public String getIm0512m() {
        return im0512m;
    }

    public void setIm0512m(String im0512m) {
        this.im0512m = im0512m;
        notifyPropertyChanged(BR.im0512m);
    }

    @Bindable
    public String getIm0512y() {
        return im0512y;
    }

    public void setIm0512y(String im0512y) {
        this.im0512y = im0512y;
        notifyPropertyChanged(BR.im0512y);
    }

    @Bindable
    public String getIm0513d() {
        return im0513d;
    }

    public void setIm0513d(String im0513d) {
        this.im0513d = im0513d;
        notifyPropertyChanged(BR.im0513d);
    }

    @Bindable
    public String getIm0513m() {
        return im0513m;
    }

    public void setIm0513m(String im0513m) {
        this.im0513m = im0513m;
        notifyPropertyChanged(BR.im0513m);
    }

    @Bindable
    public String getIm0513y() {
        return im0513y;
    }

    public void setIm0513y(String im0513y) {
        this.im0513y = im0513y;
        notifyPropertyChanged(BR.im0513y);
    }

    @Bindable
    public String getIm0514d() {
        return im0514d;
    }

    public void setIm0514d(String im0514d) {
        this.im0514d = im0514d;
        notifyPropertyChanged(BR.im0514d);
    }

    @Bindable
    public String getIm0514m() {
        return im0514m;
    }

    public void setIm0514m(String im0514m) {
        this.im0514m = im0514m;
        notifyPropertyChanged(BR.im0514m);
    }

    @Bindable
    public String getIm0514y() {
        return im0514y;
    }

    public void setIm0514y(String im0514y) {
        this.im0514y = im0514y;
        notifyPropertyChanged(BR.im0514y);
    }

    @Bindable
    public String getIm0515d() {
        return im0515d;
    }

    public void setIm0515d(String im0515d) {
        this.im0515d = im0515d;
        notifyPropertyChanged(BR.im0515d);
    }

    @Bindable
    public String getIm0515m() {
        return im0515m;
    }

    public void setIm0515m(String im0515m) {
        this.im0515m = im0515m;
        notifyPropertyChanged(BR.im0515m);
    }

    @Bindable
    public String getIm0515y() {
        return im0515y;
    }

    public void setIm0515y(String im0515y) {
        this.im0515y = im0515y;
        notifyPropertyChanged(BR.im0515y);
    }

    @Bindable
    public String getIm0516d() {
        return im0516d;
    }

    public void setIm0516d(String im0516d) {
        this.im0516d = im0516d;
        notifyPropertyChanged(BR.im0516d);
    }

    @Bindable
    public String getIm0516m() {
        return im0516m;
    }

    public void setIm0516m(String im0516m) {
        this.im0516m = im0516m;
        notifyPropertyChanged(BR.im0516m);
    }

    @Bindable
    public String getIm0516y() {
        return im0516y;
    }

    public void setIm0516y(String im0516y) {
        this.im0516y = im0516y;
        notifyPropertyChanged(BR.im0516y);
    }

    @Bindable
    public String getIm07() {
        return im07;
    }

    public void setIm07(String im07) {
        this.im07 = im07;
        notifyPropertyChanged(BR.im07);
    }

    @Bindable
    public String getIm08() {
        return im08;
    }

    public void setIm08(String im08) {
        this.im08 = im08;
        notifyPropertyChanged(BR.im08);
    }

    @Bindable
    public String getIm09() {
        return im09;
    }

    public void setIm09(String im09) {
        this.im09 = im09;
        notifyPropertyChanged(BR.im09);
    }

    @Bindable
    public String getIm10() {
        return im10;
    }

    public void setIm10(String im10) {
        this.im10 = im10;
        notifyPropertyChanged(BR.im10);
    }

    @Bindable
    public String getIm11() {
        return im11;
    }

    public void setIm11(String im11) {
        this.im11 = im11;
        notifyPropertyChanged(BR.im11);
    }

    @Bindable
    public String getIm12() {
        return im12;
    }

    public void setIm12(String im12) {
        this.im12 = im12;
        setIm1201x(im12.equals("1") ? this.im1201x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im12);
    }

    @Bindable
    public String getIm1201x() {
        return im1201x;
    }

    public void setIm1201x(String im1201x) {
        this.im1201x = im1201x;
        notifyPropertyChanged(BR.im1201x);
    }

    @Bindable
    public String getIm14() {
        return im14;
    }

    public void setIm14(String im14) {
        this.im14 = im14;
        notifyPropertyChanged(BR.im14);
    }

    @Bindable
    public String getIm15() {
        return im15;
    }

    public void setIm15(String im15) {
        this.im15 = im15;
        setIm1501x(im15.equals("1") ? this.im1501x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im15);
    }

    @Bindable
    public String getIm1501x() {
        return im1501x;
    }

    public void setIm1501x(String im1501x) {
        this.im1501x = im1501x;
        notifyPropertyChanged(BR.im1501x);
    }

    @Bindable
    public String getIm16() {
        return im16;
    }

    public void setIm16(String im16) {
        this.im16 = im16;
        notifyPropertyChanged(BR.im16);
    }

    @Bindable
    public String getIm17() {
        return im17;
    }

    public void setIm17(String im17) {
        this.im17 = im17;
        setIm1701x(im17.equals("1") ? this.im1701x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im17);
    }

    @Bindable
    public String getIm1701x() {
        return im1701x;
    }

    public void setIm1701x(String im1701x) {
        this.im1701x = im1701x;
        notifyPropertyChanged(BR.im1701x);
    }

    @Bindable
    public String getIm18() {
        return im18;
    }

    public void setIm18(String im18) {
        this.im18 = im18;
        notifyPropertyChanged(BR.im18);
    }

    @Bindable
    public String getIm19() {
        return im19;
    }

    public void setIm19(String im19) {
        this.im19 = im19;
        setIm1901x(im19.equals("1") ? this.im1901x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im19);
    }

    @Bindable
    public String getIm1901x() {
        return im1901x;
    }

    public void setIm1901x(String im1901x) {
        this.im1901x = im1901x;
        notifyPropertyChanged(BR.im1901x);
    }

    @Bindable
    public String getIm20() {
        return im20;
    }

    public void setIm20(String im20) {
        this.im20 = im20;
        notifyPropertyChanged(BR.im20);
    }

    @Bindable
    public String getIm21() {
        return im21;
    }

    public void setIm21(String im21) {
        this.im21 = im21;
        notifyPropertyChanged(BR.im21);
    }

    @Bindable
    public String getIm22() {
        return im22;
    }

    public void setIm22(String im22) {
        this.im22 = im22;
        setIm2201x(im22.equals("1") ? this.im2201x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im22);
    }

    @Bindable
    public String getIm2201x() {
        return im2201x;
    }

    public void setIm2201x(String im2201x) {
        this.im2201x = im2201x;
        notifyPropertyChanged(BR.im2201x);
    }

    @Bindable
    public String getIm23() {
        return im23;
    }

    public void setIm23(String im23) {
        this.im23 = im23;
        setIm2396x(im23.equals("96") ? this.im2396x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im23);
    }

    @Bindable
    public String getIm2396x() {
        return im2396x;
    }

    public void setIm2396x(String im2396x) {
        this.im2396x = im2396x;
        notifyPropertyChanged(BR.im2396x);
    }

    @Bindable
    public String getIm24() {
        return im24;
    }

    public void setIm24(String im24) {
        this.im24 = im24;
        setIm2496x(im24.equals("96") ? this.im2496x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im24);
    }

    @Bindable
    public String getIm2496x() {
        return im2496x;
    }

    public void setIm2496x(String im2496x) {
        this.im2496x = im2496x;
        notifyPropertyChanged(BR.im2496x);
    }

    @Bindable
    public String getIm25() {
        return im25;
    }

    public void setIm25(String im25) {
        this.im25 = im25;
        setIm2501x(im25.equals("1") ? this.im2501x : ""); // for all skips, mention all skipped questions
        setIm2502x(im25.equals("2") ? this.im2502x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im25);
    }

    @Bindable
    public String getIm2501x() {
        return im2501x;
    }

    public void setIm2501x(String im2501x) {
        this.im2501x = im2501x;
        notifyPropertyChanged(BR.im2501x);
    }

    @Bindable
    public String getIm2502x() {
        return im2502x;
    }

    public void setIm2502x(String im2502x) {
        this.im2502x = im2502x;
        notifyPropertyChanged(BR.im2502x);
    }

    @Bindable
    public String getIm26() {
        return im26;
    }

    public void setIm26(String im26) {
        this.im26 = im26;
        notifyPropertyChanged(BR.im26);
    }

    @Bindable
    public String getIm2601() {
        return im2601;
    }

    public void setIm2601(String im2601) {
        if (this.im2601.equals(im2601)) return; // for all checkboxes
        this.im2601 = im2601;
        notifyPropertyChanged(BR.im2601);
    }

    @Bindable
    public String getIm2602() {
        return im2602;
    }

    public void setIm2602(String im2602) {
        if (this.im2602.equals(im2602)) return; // for all checkboxes
        this.im2602 = im2602;
        notifyPropertyChanged(BR.im2602);
    }

    @Bindable
    public String getIm2603() {
        return im2603;
    }

    public void setIm2603(String im2603) {
        if (this.im2603.equals(im2603)) return; // for all checkboxes
        this.im2603 = im2603;
        notifyPropertyChanged(BR.im2603);
    }

    @Bindable
    public String getIm2604() {
        return im2604;
    }

    public void setIm2604(String im2604) {
        if (this.im2604.equals(im2604)) return; // for all checkboxes
        this.im2604 = im2604;
        notifyPropertyChanged(BR.im2604);
    }

    @Bindable
    public String getIm2605() {
        return im2605;
    }

    public void setIm2605(String im2605) {
        if (this.im2605.equals(im2605)) return; // for all checkboxes
        this.im2605 = im2605;
        notifyPropertyChanged(BR.im2605);
    }

    @Bindable
    public String getIm2606() {
        return im2606;
    }

    public void setIm2606(String im2606) {
        if (this.im2606.equals(im2606)) return; // for all checkboxes
        this.im2606 = im2606;
        notifyPropertyChanged(BR.im2606);
    }

    @Bindable
    public String getIm2607() {
        return im2607;
    }

    public void setIm2607(String im2607) {
        if (this.im2607.equals(im2607)) return; // for all checkboxes
        this.im2607 = im2607;
        notifyPropertyChanged(BR.im2607);
    }

    @Bindable
    public String getIm2608() {
        return im2608;
    }

    public void setIm2608(String im2608) {
        if (this.im2608.equals(im2608)) return; // for all checkboxes
        this.im2608 = im2608;
        notifyPropertyChanged(BR.im2608);
    }

    @Bindable
    public String getIm2609() {
        return im2609;
    }

    public void setIm2609(String im2609) {
        if (this.im2609.equals(im2609)) return; // for all checkboxes
        this.im2609 = im2609;
        notifyPropertyChanged(BR.im2609);
    }

    @Bindable
    public String getIm2610() {
        return im2610;
    }

    public void setIm2610(String im2610) {
        if (this.im2610.equals(im2610)) return; // for all checkboxes
        this.im2610 = im2610;
        notifyPropertyChanged(BR.im2610);
    }

    @Bindable
    public String getIm2611() {
        return im2611;
    }

    public void setIm2611(String im2611) {
        if (this.im2611.equals(im2611)) return; // for all checkboxes
        this.im2611 = im2611;
        notifyPropertyChanged(BR.im2611);
    }

    @Bindable
    public String getIm2612() {
        return im2612;
    }

    public void setIm2612(String im2612) {
        if (this.im2612.equals(im2612)) return; // for all checkboxes
        this.im2612 = im2612;
        notifyPropertyChanged(BR.im2612);
    }

    @Bindable
    public String getIm2613() {
        return im2613;
    }

    public void setIm2613(String im2613) {
        if (this.im2613.equals(im2613)) return; // for all checkboxes
        this.im2613 = im2613;
        notifyPropertyChanged(BR.im2613);
    }

    @Bindable
    public String getIm2614() {
        return im2614;
    }

    public void setIm2614(String im2614) {
        if (this.im2614.equals(im2614)) return; // for all checkboxes
        this.im2614 = im2614;
        notifyPropertyChanged(BR.im2614);
    }

    @Bindable
    public String getIm2615() {
        return im2615;
    }

    public void setIm2615(String im2615) {
        if (this.im2615.equals(im2615)) return; // for all checkboxes
        this.im2615 = im2615;
        notifyPropertyChanged(BR.im2615);
    }

    @Bindable
    public String getIm2616() {
        return im2616;
    }

    public void setIm2616(String im2616) {
        if (this.im2616.equals(im2616)) return; // for all checkboxes
        this.im2616 = im2616;
        notifyPropertyChanged(BR.im2616);
    }

    @Bindable
    public String getIm2617() {
        return im2617;
    }

    public void setIm2617(String im2617) {
        if (this.im2617.equals(im2617)) return; // for all checkboxes
        this.im2617 = im2617;
        notifyPropertyChanged(BR.im2617);
    }

    @Bindable
    public String getIm2698() {
        return im2698;
    }

    public void setIm2698(String im2698) {
        if (this.im2698.equals(im2698)) return; // for all checkboxes
        this.im2698 = im2698;
        setIm2601(im2698.equals("98") ? "" : this.im2601);
        setIm2602(im2698.equals("98") ? "" : this.im2602);
        setIm2603(im2698.equals("98") ? "" : this.im2603);
        setIm2604(im2698.equals("98") ? "" : this.im2604);
        setIm2605(im2698.equals("98") ? "" : this.im2605);
        setIm2606(im2698.equals("98") ? "" : this.im2606);
        setIm2607(im2698.equals("98") ? "" : this.im2607);
        setIm2608(im2698.equals("98") ? "" : this.im2608);
        setIm2609(im2698.equals("98") ? "" : this.im2609);
        setIm2610(im2698.equals("98") ? "" : this.im2610);
        setIm2611(im2698.equals("98") ? "" : this.im2611);
        setIm2612(im2698.equals("98") ? "" : this.im2612);
        setIm2613(im2698.equals("98") ? "" : this.im2613);
        setIm2614(im2698.equals("98") ? "" : this.im2614);
        setIm2615(im2698.equals("98") ? "" : this.im2615);
        setIm2616(im2698.equals("98") ? "" : this.im2616);
        setIm2617(im2698.equals("98") ? "" : this.im2617);
        setIm2696(im2698.equals("98") ? "" : this.im2696);
        notifyPropertyChanged(BR.im2698);
    }

    @Bindable
    public String getIm2696() {
        return im2696;
    }

    public void setIm2696(String im2696) {
        if (this.im2696.equals(im2696)) return; // for all checkboxes
        this.im2696 = im2696;
        setIm2696x(im2696.equals("96") ? this.im2696x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im2696);
    }

    @Bindable
    public String getIm2696x() {
        return im2696x;
    }

    public void setIm2696x(String im2696x) {
        this.im2696x = im2696x;
        notifyPropertyChanged(BR.im2696x);
    }

    @Bindable
    public String getIm27() {
        return im27;
    }

    public void setIm27(String im27) {
        this.im27 = im27;
        notifyPropertyChanged(BR.im27);
    }

    @Bindable
    public String getIm28() {
        return im28;
    }

    public void setIm28(String im28) {
        this.im28 = im28;
        notifyPropertyChanged(BR.im28);
    }

    @Bindable
    public String getIm29() {
        return im29;
    }

    public void setIm29(String im29) {
        this.im29 = im29;
        setIm2901x(im29.equals("1") ? this.im2901x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im29);
    }

    @Bindable
    public String getIm2901x() {
        return im2901x;
    }

    public void setIm2901x(String im2901x) {
        this.im2901x = im2901x;
        notifyPropertyChanged(BR.im2901x);
    }

    @Bindable
    public String getIm30() {
        return im30;
    }

    public void setIm30(String im30) {
        this.im30 = im30;
        notifyPropertyChanged(BR.im30);
    }

    @Bindable
    public String getIm31() {
        return im31;
    }

    public void setIm31(String im31) {
        this.im31 = im31;
        notifyPropertyChanged(BR.im31);
    }

    @Bindable
    public String getIm32() {
        return im32;
    }

    public void setIm32(String im32) {
        this.im32 = im32;
        notifyPropertyChanged(BR.im32);
    }

    @Bindable
    public String getIm3201() {
        return im3201;
    }

    public void setIm3201(String im3201) {
        if (this.im3201.equals(im3201)) return; // for all checkboxes
        this.im3201 = im3201;
        notifyPropertyChanged(BR.im3201);
    }

    @Bindable
    public String getIm3202() {
        return im3202;
    }

    public void setIm3202(String im3202) {
        if (this.im3202.equals(im3202)) return; // for all checkboxes
        this.im3202 = im3202;
        notifyPropertyChanged(BR.im3202);
    }

    @Bindable
    public String getIm3203() {
        return im3203;
    }

    public void setIm3203(String im3203) {
        if (this.im3203.equals(im3203)) return; // for all checkboxes
        this.im3203 = im3203;
        notifyPropertyChanged(BR.im3203);
    }

    @Bindable
    public String getIm3204() {
        return im3204;
    }

    public void setIm3204(String im3204) {
        if (this.im3204.equals(im3204)) return; // for all checkboxes
        this.im3204 = im3204;
        notifyPropertyChanged(BR.im3204);
    }

    @Bindable
    public String getIm3205() {
        return im3205;
    }

    public void setIm3205(String im3205) {
        if (this.im3205.equals(im3205)) return; // for all checkboxes
        this.im3205 = im3205;
        notifyPropertyChanged(BR.im3205);
    }

    @Bindable
    public String getIm3206() {
        return im3206;
    }

    public void setIm3206(String im3206) {
        if (this.im3206.equals(im3206)) return; // for all checkboxes
        this.im3206 = im3206;
        notifyPropertyChanged(BR.im3206);
    }

    @Bindable
    public String getIm3207() {
        return im3207;
    }

    public void setIm3207(String im3207) {
        if (this.im3207.equals(im3207)) return; // for all checkboxes
        this.im3207 = im3207;
        notifyPropertyChanged(BR.im3207);
    }

    @Bindable
    public String getIm3208() {
        return im3208;
    }

    public void setIm3208(String im3208) {
        if (this.im3208.equals(im3208)) return; // for all checkboxes
        this.im3208 = im3208;
        notifyPropertyChanged(BR.im3208);
    }

    @Bindable
    public String getIm3209() {
        return im3209;
    }

    public void setIm3209(String im3209) {
        if (this.im3209.equals(im3209)) return; // for all checkboxes
        this.im3209 = im3209;
        notifyPropertyChanged(BR.im3209);
    }

    @Bindable
    public String getIm3210() {
        return im3210;
    }

    public void setIm3210(String im3210) {
        if (this.im3210.equals(im3210)) return; // for all checkboxes
        this.im3210 = im3210;
        notifyPropertyChanged(BR.im3210);
    }

    @Bindable
    public String getIm3211() {
        return im3211;
    }

    public void setIm3211(String im3211) {
        if (this.im3211.equals(im3211)) return; // for all checkboxes
        this.im3211 = im3211;
        notifyPropertyChanged(BR.im3211);
    }

    @Bindable
    public String getIm3212() {
        return im3212;
    }

    public void setIm3212(String im3212) {
        if (this.im3212.equals(im3212)) return; // for all checkboxes
        this.im3212 = im3212;
        notifyPropertyChanged(BR.im3212);
    }

    @Bindable
    public String getIm3213() {
        return im3213;
    }

    public void setIm3213(String im3213) {
        if (this.im3213.equals(im3213)) return; // for all checkboxes
        this.im3213 = im3213;
        notifyPropertyChanged(BR.im3213);
    }

    @Bindable
    public String getIm3298() {
        return im3298;
    }

    public void setIm3298(String im3298) {
        if (this.im3298.equals(im3298)) return; // for all checkboxes
        this.im3298 = im3298;
        setIm3201(im3298.equals("98") ? "" : this.im3201);
        setIm3202(im3298.equals("98") ? "" : this.im3202);
        setIm3203(im3298.equals("98") ? "" : this.im3203);
        setIm3204(im3298.equals("98") ? "" : this.im3204);
        setIm3205(im3298.equals("98") ? "" : this.im3205);
        setIm3206(im3298.equals("98") ? "" : this.im3206);
        setIm3207(im3298.equals("98") ? "" : this.im3207);
        setIm3208(im3298.equals("98") ? "" : this.im3208);
        setIm3209(im3298.equals("98") ? "" : this.im3209);
        setIm3210(im3298.equals("98") ? "" : this.im3210);
        setIm3211(im3298.equals("98") ? "" : this.im3211);
        setIm3212(im3298.equals("98") ? "" : this.im3212);
        setIm3213(im3298.equals("98") ? "" : this.im3213);
        setIm3296(im3298.equals("98") ? "" : this.im3296);
        notifyPropertyChanged(BR.im3298);
    }

    @Bindable
    public String getIm3296() {
        return im3296;
    }

    public void setIm3296(String im3296) {
        if (this.im3296.equals(im3296)) return; // for all checkboxes
        this.im3296 = im3296;
        setIm3296x(im3296.equals("96") ? this.im3296x : ""); // for all skips, mention all skipped questions
        notifyPropertyChanged(BR.im3296);
    }

    @Bindable
    public String getIm3296x() {
        return im3296x;
    }

    public void setIm3296x(String im3296x) {
        this.im3296x = im3296x;
        notifyPropertyChanged(BR.im3296x);
    }

    public Child Hydrate(Cursor cursor) throws JSONException {
        this.id = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ID));
        this.uid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UID));
        this.uuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_UUID));
        this.fmuid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_FMUID));
        this.muid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_MUID));
        this.indexed = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_INDEXED));
        this.psuCode = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PSU_CODE));
        this.hhid = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_HHID));
        this.projectName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_PROJECT_NAME));
        this.sno = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SNO));
        this.userName = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_USERNAME));
        this.sysDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYSDATE));
        this.deviceId = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICEID));
        this.deviceTag = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_DEVICETAGID));
        this.appver = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_APPVERSION));
        this.iStatus = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_ISTATUS));
        this.synced = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED));
        this.syncDate = cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SYNCED_DATE));

        sI1Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SI1)));
        sI2Hydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SI2)));
        sIMHydrate(cursor.getString(cursor.getColumnIndexOrThrow(TableContracts.ChildTable.COLUMN_SIM)));

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

    public void sIMHydrate(String string) throws JSONException {
        Log.d(TAG, "sIMHydrate: " + string);
        if (string != null) {
            JSONObject json = null;
            json = new JSONObject(string);
            this.im01 = json.getString("im01");
            this.im02 = json.getString("im02");
            this.im03 = json.getString("im03");
            this.im0396x = json.getString("im0396x");
            this.im04d = json.getString("im04d");
            this.im04m = json.getString("im04m");
            this.im04y = json.getString("im04y");
            this.im0501d = json.getString("im0501d");
            this.im0501m = json.getString("im0501m");
            this.im0501y = json.getString("im0501y");
            this.im0502d = json.getString("im0502d");
            this.im0502m = json.getString("im0502m");
            this.im0502y = json.getString("im0502y");
            this.im0503d = json.getString("im0503d");
            this.im0503m = json.getString("im0503m");
            this.im0503y = json.getString("im0503y");
            this.im0504d = json.getString("im0504d");
            this.im0504m = json.getString("im0504m");
            this.im0504y = json.getString("im0504y");
            this.im0505d = json.getString("im0505d");
            this.im0505m = json.getString("im0505m");
            this.im0505y = json.getString("im0505y");
            this.im0506d = json.getString("im0506d");
            this.im0506m = json.getString("im0506m");
            this.im0506y = json.getString("im0506y");
            this.im0507d = json.getString("im0507d");
            this.im0507m = json.getString("im0507m");
            this.im0507y = json.getString("im0507y");
            this.im0508d = json.getString("im0508d");
            this.im0508m = json.getString("im0508m");
            this.im0508y = json.getString("im0508y");
            this.im0509d = json.getString("im0509d");
            this.im0509m = json.getString("im0509m");
            this.im0509y = json.getString("im0509y");
            this.im0510d = json.getString("im0510d");
            this.im0510m = json.getString("im0510m");
            this.im0510y = json.getString("im0510y");
            this.im0511d = json.getString("im0511d");
            this.im0511m = json.getString("im0511m");
            this.im0511y = json.getString("im0511y");
            this.im0512d = json.getString("im0512d");
            this.im0512m = json.getString("im0512m");
            this.im0512y = json.getString("im0512y");
            this.im0513d = json.getString("im0513d");
            this.im0513m = json.getString("im0513m");
            this.im0513y = json.getString("im0513y");
            this.im0514d = json.getString("im0514d");
            this.im0514m = json.getString("im0514m");
            this.im0514y = json.getString("im0514y");
            this.im0515d = json.getString("im0515d");
            this.im0515m = json.getString("im0515m");
            this.im0515y = json.getString("im0515y");
            this.im0516d = json.getString("im0516d");
            this.im0516m = json.getString("im0516m");
            this.im0516y = json.getString("im0516y");
            this.im07 = json.getString("im07");
            this.im08 = json.getString("im08");
            this.im09 = json.getString("im09");
            this.im10 = json.getString("im10");
            this.im11 = json.getString("im11");
            this.im12 = json.getString("im12");
            this.im1201x = json.getString("im1201x");
            this.im14 = json.getString("im14");
            this.im15 = json.getString("im15");
            this.im1501x = json.getString("im1501x");
            this.im16 = json.getString("im16");
            this.im17 = json.getString("im17");
            this.im1701x = json.getString("im1701x");
            this.im18 = json.getString("im18");
            this.im19 = json.getString("im19");
            this.im1901x = json.getString("im1901x");
            this.im20 = json.getString("im20");
            this.im21 = json.getString("im21");
            this.im22 = json.getString("im22");
            this.im2201x = json.getString("im2201x");
            this.im23 = json.getString("im23");
            this.im2396x = json.getString("im2396x");
            this.im24 = json.getString("im24");
            this.im2496x = json.getString("im2496x");
            this.im25 = json.getString("im25");
            this.im2501x = json.getString("im2501x");
            this.im2502x = json.getString("im2502x");
            this.im2601 = json.getString("im2601");
            this.im2602 = json.getString("im2602");
            this.im2603 = json.getString("im2603");
            this.im2604 = json.getString("im2604");
            this.im2605 = json.getString("im2605");
            this.im2606 = json.getString("im2606");
            this.im2607 = json.getString("im2607");
            this.im2608 = json.getString("im2608");
            this.im2609 = json.getString("im2609");
            this.im2610 = json.getString("im2610");
            this.im2611 = json.getString("im2611");
            this.im2612 = json.getString("im2612");
            this.im2613 = json.getString("im2613");
            this.im2614 = json.getString("im2614");
            this.im2615 = json.getString("im2615");
            this.im2616 = json.getString("im2616");
            this.im2617 = json.getString("im2617");
            this.im2698 = json.getString("im2698");
            this.im2696 = json.getString("im2696");
            this.im2696x = json.getString("im2696x");
            this.im27 = json.getString("im27");
            this.im28 = json.getString("im28");
            this.im29 = json.getString("im29");
            this.im2901x = json.getString("im2901x");
            this.im30 = json.getString("im30");
            this.im31 = json.getString("im31");
            this.im3201 = json.getString("im3201");
            this.im3202 = json.getString("im3202");
            this.im3203 = json.getString("im3203");
            this.im3204 = json.getString("im3204");
            this.im3205 = json.getString("im3205");
            this.im3206 = json.getString("im3206");
            this.im3207 = json.getString("im3207");
            this.im3208 = json.getString("im3208");
            this.im3209 = json.getString("im3209");
            this.im3210 = json.getString("im3210");
            this.im3211 = json.getString("im3211");
            this.im3212 = json.getString("im3212");
            this.im3213 = json.getString("im3213");
            this.im3298 = json.getString("im3298");
            this.im3296 = json.getString("im3296");
            this.im3296x = json.getString("im3296x");
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

    public String sIMtoString() throws JSONException {
        Log.d(TAG, "sIMtoString: ");
        JSONObject json = new JSONObject();
        json.put("im01", im01)
                .put("im02", im02)
                .put("im03", im03)
                .put("im0396x", im0396x)
                .put("im04d", im04d)
                .put("im04m", im04m)
                .put("im04y", im04y)
                .put("im0501d", im0501d)
                .put("im0501m", im0501m)
                .put("im0501y", im0501y)
                .put("im0502d", im0502d)
                .put("im0502m", im0502m)
                .put("im0502y", im0502y)
                .put("im0503d", im0503d)
                .put("im0503m", im0503m)
                .put("im0503y", im0503y)
                .put("im0504d", im0504d)
                .put("im0504m", im0504m)
                .put("im0504y", im0504y)
                .put("im0505d", im0505d)
                .put("im0505m", im0505m)
                .put("im0505y", im0505y)
                .put("im0506d", im0506d)
                .put("im0506m", im0506m)
                .put("im0506y", im0506y)
                .put("im0507d", im0507d)
                .put("im0507m", im0507m)
                .put("im0507y", im0507y)
                .put("im0508d", im0508d)
                .put("im0508m", im0508m)
                .put("im0508y", im0508y)
                .put("im0509d", im0509d)
                .put("im0509m", im0509m)
                .put("im0509y", im0509y)
                .put("im0510d", im0510d)
                .put("im0510m", im0510m)
                .put("im0510y", im0510y)
                .put("im0511d", im0511d)
                .put("im0511m", im0511m)
                .put("im0511y", im0511y)
                .put("im0512d", im0512d)
                .put("im0512m", im0512m)
                .put("im0512y", im0512y)
                .put("im0513d", im0513d)
                .put("im0513m", im0513m)
                .put("im0513y", im0513y)
                .put("im0514d", im0514d)
                .put("im0514m", im0514m)
                .put("im0514y", im0514y)
                .put("im0515d", im0515d)
                .put("im0515m", im0515m)
                .put("im0515y", im0515y)
                .put("im0516d", im0516d)
                .put("im0516m", im0516m)
                .put("im0516y", im0516y)
                .put("im07", im07)
                .put("im08", im08)
                .put("im09", im09)
                .put("im10", im10)
                .put("im11", im11)
                .put("im12", im12)
                .put("im1201x", im1201x)
                .put("im14", im14)
                .put("im15", im15)
                .put("im1501x", im1501x)
                .put("im16", im16)
                .put("im17", im17)
                .put("im1701x", im1701x)
                .put("im18", im18)
                .put("im19", im19)
                .put("im1901x", im1901x)
                .put("im20", im20)
                .put("im21", im21)
                .put("im22", im22)
                .put("im2201x", im2201x)
                .put("im23", im23)
                .put("im2396x", im2396x)
                .put("im24", im24)
                .put("im2496x", im2496x)
                .put("im25", im25)
                .put("im2501x", im2501x)
                .put("im2502x", im2502x)
                .put("im2601", im2601)
                .put("im2602", im2602)
                .put("im2603", im2603)
                .put("im2604", im2604)
                .put("im2605", im2605)
                .put("im2606", im2606)
                .put("im2607", im2607)
                .put("im2608", im2608)
                .put("im2609", im2609)
                .put("im2610", im2610)
                .put("im2611", im2611)
                .put("im2612", im2612)
                .put("im2613", im2613)
                .put("im2614", im2614)
                .put("im2615", im2615)
                .put("im2616", im2616)
                .put("im2617", im2617)
                .put("im2698", im2698)
                .put("im2696", im2696)
                .put("im2696x", im2696x)
                .put("im27", im27)
                .put("im28", im28)
                .put("im29", im29)
                .put("im2901x", im2901x)
                .put("im30", im30)
                .put("im31", im31)
                .put("im3201", im3201)
                .put("im3202", im3202)
                .put("im3203", im3203)
                .put("im3204", im3204)
                .put("im3205", im3205)
                .put("im3206", im3206)
                .put("im3207", im3207)
                .put("im3208", im3208)
                .put("im3209", im3209)
                .put("im3210", im3210)
                .put("im3211", im3211)
                .put("im3212", im3212)
                .put("im3213", im3213)
                .put("im3298", im3298)
                .put("im3296", im3296)
                .put("im3296x", im3296x);
        return json.toString();
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(TableContracts.ChildTable.COLUMN_ID, this.id);
        json.put(TableContracts.ChildTable.COLUMN_UID, this.uid);
        json.put(TableContracts.ChildTable.COLUMN_PSU_CODE, this.psuCode);
        json.put(TableContracts.ChildTable.COLUMN_HHID, this.hhid);
        json.put(TableContracts.ChildTable.COLUMN_PROJECT_NAME, this.projectName);
        json.put(TableContracts.ChildTable.COLUMN_UUID, this.uuid);
        json.put(TableContracts.ChildTable.COLUMN_FMUID, this.fmuid);
        json.put(TableContracts.ChildTable.COLUMN_MUID, this.muid);
        json.put(TableContracts.ChildTable.COLUMN_INDEXED, this.indexed);
        json.put(TableContracts.ChildTable.COLUMN_SNO, this.sno);
        json.put(TableContracts.ChildTable.COLUMN_USERNAME, this.userName);
        json.put(TableContracts.ChildTable.COLUMN_SYSDATE, this.sysDate);
        json.put(TableContracts.ChildTable.COLUMN_DEVICEID, this.deviceId);
        json.put(TableContracts.ChildTable.COLUMN_DEVICETAGID, this.deviceTag);
        json.put(TableContracts.ChildTable.COLUMN_ISTATUS, this.iStatus);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED, this.synced);
        json.put(TableContracts.ChildTable.COLUMN_SYNCED_DATE, this.syncDate);
        json.put(TableContracts.ChildTable.COLUMN_APPVERSION, this.appver);
        json.put(TableContracts.ChildTable.COLUMN_SI1, new JSONObject(sI1toString()));
        json.put(TableContracts.ChildTable.COLUMN_SI2, new JSONObject(sI2toString()));
        json.put(TableContracts.ChildTable.COLUMN_SIM, new JSONObject(sIMtoString()));

        return json;
    }

}
