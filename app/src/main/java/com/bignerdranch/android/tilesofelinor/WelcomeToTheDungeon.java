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
    String[] Rooms= new String[0];
    String dungeon=MainActivity .dungeon ;
    int i=0;

    boolean equals;
    //DungeonList = getResources().getStringArray(R.array.Dungeons);
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


        Check();
        switch (i){
            case (0):{
                Rooms = getResources().getStringArray(R.array.K );
                break;}
            case (1):{
                Rooms = getResources().getStringArray(R.array.F );
                break;}
        }
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
              /*  if (room == 1){
                    room=2;
                    textView1.setText(Rooms[room]);
                }
                else {}*/
                room= room+(room-1);
                GoLeft(textView1,Rooms);
            }
        });
        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* if (room == 1){
                    room=2;
                    textView1.setText(Rooms[room]);
                }else{} */
                room=(room+room);
                GoRight(textView1,Rooms);
            }});
    }
    public  void   Check(){
        boolean equality= false;
        String[] DungeonList=  new String[0];
        DungeonList = getResources().getStringArray(R.array.Dungeons);
        while((equality !=true)|(i>DungeonList.length )){
            equality = dungeon.equals(DungeonList[i]);
            if (equality == false){
                i++;
            }

        }
    }
    public void GoLeft (TextView textView1, String[] Rooms){textView1.setText(Rooms[room]);}
    public void GoRight(TextView textView1, String[] Rooms){textView1.setText(Rooms[room]);}
}
