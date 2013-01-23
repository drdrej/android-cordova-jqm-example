package com.touchableheroes;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class StartActivity extends DroidGap {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		super.setIntegerProperty("splashscreen", R.drawable.splashscreen);
		super.loadUrl("file:///android_asset/www/index.html", 2000);
	}

//	@Override
//	public void init() {
//		final CordovaWebView webView = new CordovaWebView(this);
//		final CordovaWebViewClient webClient = new BasicAppWebViewClient(this);
//		final CordovaChromeClient chromeClient = new CordovaChromeClient(this);
//		
//		super.init(webView, webClient, chromeClient);
//	}
}
