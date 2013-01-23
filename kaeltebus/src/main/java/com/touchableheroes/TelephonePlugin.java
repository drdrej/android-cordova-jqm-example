package com.touchableheroes;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class TelephonePlugin extends CordovaPlugin {

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		 try {
			 
	            if (action.equals("makePhoneCall")) {
	                final String echo = args.getString(0); 
	                if (echo != null && echo.length() > 0) { 
	                    return true;
//	                    		new PluginResult(PluginResult.Status.OK, echo);
	                } else {
	                    return false;
//	                    new PluginResult(PluginResult.Status.ERROR);
	                }
	            } else {
	                return false;
//	                		
//	                		new PluginResult(PluginResult.Status.INVALID_ACTION);
	            }
	        } catch (JSONException e) {
	            return false;
//	            		new PluginResult(PluginResult.Status.JSON_EXCEPTION);
	        }
	}
}
