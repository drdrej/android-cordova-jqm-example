package com.touchableheroes;

import org.apache.cordova.DroidGap;

import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;

public class BasicAppWebViewClient extends
		org.apache.cordova.CordovaWebViewClient {

	private static final String URL_PREFIX = "call://";
	private static final String LOG_TAG = "kaeltebus";
	private final DroidGap ctx;

	public BasicAppWebViewClient(final DroidGap ctx) {
		super(ctx);
		this.ctx = ctx;
	}

	@Override
	public boolean shouldOverrideUrlLoading(final WebView view, final String url) {
		if (url.startsWith(URL_PREFIX)) {
			final String telStr = url.substring(URL_PREFIX.length());
			Log.v(LOG_TAG, "call: " + telStr);

			final String number = "tel:" + telStr;
			final Intent callIntent = new Intent(Intent.ACTION_CALL,
					Uri.parse(number));

			this.ctx.startActivity(callIntent);

			return true;
		}

		return super.shouldOverrideUrlLoading(view, url);
	}
}