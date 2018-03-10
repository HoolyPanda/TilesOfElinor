package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class DungeomMap extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String res = MainActivity.dungeon;
        String toMap = "file:///android_asset/" + res+".html";
        setContentView(R.layout.webmap);
        WebView Map = findViewById(R.id.goweb);
        Map.getSettings().setSupportZoom(true);
        Map.getSettings().setBuiltInZoomControls(true);
        Map.loadUrl(toMap);
    }
}
