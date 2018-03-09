package com.bignerdranch.android.tilesofelinor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    public static  String dungeon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        //ImageView Map= (ImageView) findViewById(R.id.Map);
        // Map.setImageResource(R.drawable.sky);
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
                ToDungeon();
            }
        });
    }
    public void ToDungeon(){
        Intent intent = new Intent(MainActivity.this, WelcomeToTheDungeon.class);
        startActivity(intent);
    }
}
