package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;


public class WelcomeToTheDungeon extends Activity {
    int room=1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dungeonback);
        Main();
    }
    public void Main(){
        Button Left,Right;
        Left = findViewById(R.id.totheleft);
        Right= findViewById(R.id.totheright);
        String dungeon= "@string-array/"+MainActivity .dungeon ;
       final String[] Rooms;
        Rooms = getResources().getStringArray(R.array.K);

        final TextView textView1= findViewById(R.id.textView1) ;
        textView1.setText(Rooms[room]);
        Left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (room == 1){
                   room=2;
                   textView1.setText(Rooms[room]);
               }
               else {room= room+(room-1);}
                GoLeft(textView1,Rooms);
            }
        });
        Right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (room == 1){
                    room=2;
                    textView1.setText(Rooms[room]);
                }else{room=(room+room);}
                GoRight(textView1,Rooms);
            }});
        }

   public void GoLeft (TextView textView1, String[] Rooms){
    //room= room+room-1;
    textView1.setText(Rooms[room]);
   }
    public void GoRight(TextView textView1, String[] Rooms){
      textView1.setText(Rooms[room]);
    }
}





