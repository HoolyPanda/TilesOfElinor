package com.bignerdranch.android.tilesofelinor;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    public static  String dungeon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
       ListView DungeonList = findViewById(R.id.dungeonlist) ;
       String[] Dungeons = getResources().getStringArray(R.array.Dungeons);
       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, Dungeons);
       DungeonList.setAdapter(adapter);
        Main(DungeonList);
    }
    public void Main(ListView DungeonList){
        DungeonList .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                TextView tv = (TextView) itemClicked ;
                dungeon = tv.getText().toString();
                if (dungeon == "Подземелье1"){
                    dungeon= "K";
                }else{dungeon= "F";}
           ToDungeon();
            }
        });
    }
    public void ToDungeon(){
        Intent intent = new Intent(MainActivity.this, WelcomeToTheDungeon.class);
        startActivity(intent);
    }
}
