package com.megster.cordova;

import android.Manifest;
import android.content.pm.PackageManager;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PendingResponseCaller {

	private Thread pendingResponseThread;
	
	public PendingResponseCaller(Thread pendingResponseThread){
		this.pendingResponseThread = pendingResponseThread;
	}

	public void setPendingResponseThread(Thread pendingResponseThread){
		this.pendingResponseThread = pendingResponseThread;
	}

	public void startThread(){
		this.pendingResponseThread.start();
	}

}