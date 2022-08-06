package com.capacitorjs.plugins.sim;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;

public class Sim {

    private final TelephonyManager telephonyManager;

    public Sim(Context context) {
        this.telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
    }

    public int getSimCarrierId() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return telephonyManager.getSimCarrierId();
        } else {
            return -1;
        }
    }

    public String getSimCarrierIdName() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            return telephonyManager.getSimCarrierIdName().toString();
        } else {
            return "";
        }
    }

    public String getSimCountryIso() {
        return telephonyManager.getSimCountryIso();
    }

    public String getSimOperator() {
        return telephonyManager.getSimOperator();
    }

    public String getSimOperatorName() {
        return telephonyManager.getSimOperatorName();
    }

}
