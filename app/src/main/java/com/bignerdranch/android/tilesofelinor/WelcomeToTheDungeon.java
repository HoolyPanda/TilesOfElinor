package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeToTheDungeon extends Activity {
    int room=2;


    int i=0;

    boolean equals;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dungeonback);
        Main();
    }
    void Main(){
        Button Left,Right;
        FloatingActionButton tomap= findViewById(R.id.gomap);
        Left = findViewById(R.id.totheleft);
        Right= findViewById(R.id.totheright);
        final TextView textView1= findViewById(R.id.textView1) ;
        String dungeon = MainActivity.dungeon ;
        int file= getResources().getIdentifier(dungeon,"array",getPackageName());
        final String[] Rooms = getResources().getStringArray(file);
        textView1.setText(Rooms[room]);



        tomap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeToTheDungeon.this, DungeomMap.class);
                startActivity(intent);
            }
        });

        Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               room= room+(room-1);
               if (room>8) {
                   room = 0;
               }
               Go(textView1,Rooms);
            }
        });
        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                room=(room+room);
                if(room>8){
                    room=0;
                }
               Go(textView1,Rooms);
            }});
    }
    public void Go (TextView textView1, String[] Rooms){
        try {textView1.setText(Rooms[room]);}
        catch (UnknownError e){textView1.setText(Rooms[0]);}}
}
