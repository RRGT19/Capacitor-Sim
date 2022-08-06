package com.capacitorjs.plugins.sim;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Sim")
public class SimPlugin extends Plugin {

    private Sim implementation;

    @Override
    public void load() {
        implementation = new Sim(getContext());
    }

    @PluginMethod
    public void getInfo(PluginCall call) {
        JSObject res = new JSObject();

        res.put("carrierId", implementation.getSimCarrierId());
        res.put("carrierIdName", implementation.getSimCarrierIdName());
        res.put("countryIso", implementation.getSimCountryIso());
        res.put("operator", implementation.getSimOperator());
        res.put("operatorName", implementation.getSimOperatorName());

        call.resolve(res);
    }
}
