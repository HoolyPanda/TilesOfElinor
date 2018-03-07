package com.bignerdranch.android.tilesofelinor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String dungeon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

       ListView DungeonList = findViewById(R.id.dungeonlist) ;
        String[] Dungeons = getResources().getStringArray(R.array.Dungeons);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, Dungeons);
        DungeonList.setAdapter(adapter);
        Main(DungeonList );
    }
    public void Main(ListView DungeonList){
       //final TextView textView1= findViewById(R.id.textView1 ) ;
        DungeonList .setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),Toast.LENGTH_SHORT).show();
                TextView tv = (TextView) itemClicked ;
               // TextView textView1= findViewById(R.id.textView1) ;
                setContentView(R.layout.dungeonback );
                 // textView1.setText(((TextView) itemClicked).getText()) ;
                //dungeon= String.valueOf(((TextView) itemClicked).getText() );
               // R.string.buffer = (dungeon.toString()) ;
               dungeon = tv.getText().toString();
               // textView1.setText(tv.getText().toString()) ;
                ToDungeon();
            }
        });

    }
    public void ToDungeon(){
         TextView textView1= findViewById(R.id.textView1) ;
        textView1.setText(dungeon);
    }
}
