package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Pavlo on 08.03.2018.
 */

public class WelcomeToTheDungeon extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dungeonback);

        Main();
    }
    public void Main(){
        int room=1;
       String dungeon= MainActivity .dungeon ;
        TextView textView1= findViewById(R.id.textView1) ;

        textView1.setText(dungeon+room);
    }
}

