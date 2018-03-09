package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class DungeomMap extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String res = MainActivity.dungeon;
        ZoomControls mZoomControls;
        int file= getResources().getIdentifier(res,"drawable",getPackageName());
        setContentView(R.layout.dungeonmapviever);
        ImageView Map= (ImageView) findViewById(R.id.mapviewer);
        Map.setImageResource(file);
    }
}
