package edu.aku.hassannaqvi.uenhouseholdrapidsurvey.models

import android.database.Cursor
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.contracts.TableContracts.VillagesTable
import edu.aku.hassannaqvi.uenhouseholdrapidsurvey.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Villages {
    var ID: Long = 0
    var country: String = _EMPTY_
    var ccode: String = _EMPTY_
    var province: String = _EMPTY_
    var provcode: String = _EMPTY_
    var districtName: String = _EMPTY_
    var dcode: String = _EMPTY_
    var tehsilName: String = _EMPTY_
    var tcode: String = _EMPTY_
    var ucName: String = _EMPTY_
    var uccode: String = _EMPTY_
    var village: String = _EMPTY_
    var vcode: String = _EMPTY_
    var psucode: String = _EMPTY_


    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Villages {
        country = jsonObject.getString(VillagesTable.COLUMN_COUNTRY)
        ccode = jsonObject.getString(VillagesTable.COLUMN_CCODE)
        province = jsonObject.getString(VillagesTable.COLUMN_PROVINCE)
        provcode = jsonObject.getString(VillagesTable.COLUMN_PROVCODE)
        districtName = jsonObject.getString(VillagesTable.COLUMN_DISTRICT_NAME)
        dcode = jsonObject.getString(VillagesTable.COLUMN_DCODE)
        tehsilName = jsonObject.getString(VillagesTable.COLUMN_TEHSIL_NAME)
        tcode = jsonObject.getString(VillagesTable.COLUMN_TCODE)
        ucName = jsonObject.getString(VillagesTable.COLUMN_UC_NAME)
        uccode = jsonObject.getString(VillagesTable.COLUMN_UC_CODE)
        village = jsonObject.getString(VillagesTable.COLUMN_VILLAGE)
        vcode = jsonObject.getString(VillagesTable.COLUMN_VCODE)
        psucode = jsonObject.getString(VillagesTable.COLUMN_PSUCODE)

        return this
    }

    fun hydrate(cursor: Cursor): Villages {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_ID))
        country = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_COUNTRY))
        ccode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_CCODE))
        province = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_PROVINCE))
        provcode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_PROVCODE))
        districtName =
            cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_DISTRICT_NAME))
        dcode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_DCODE))
        tehsilName =
            cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_TEHSIL_NAME))
        tcode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_TCODE))
        ucName = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_UC_NAME))
        uccode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_UC_CODE))
        village = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_VILLAGE))
        vcode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_VCODE))
        psucode = cursor.getString(cursor.getColumnIndexOrThrow(VillagesTable.COLUMN_PSUCODE))

        return this
    }


}