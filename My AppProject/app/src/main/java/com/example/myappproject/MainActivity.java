package com.example.myappproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.list);



        ArrayList<Drive> datas = new ArrayList<Drive>();
        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db= helper.getReadableDatabase();
        String selectSql = "select * from tb_drive ";
        Cursor cursor =  db.rawQuery(selectSql,null);

        while (cursor.moveToNext()){
            Drive drive = new Drive();
            drive.name = cursor.getString(1);
            datas.add(drive);
        }

        DriveAdapter adapter = new DriveAdapter(this,R.layout.item,datas);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ExplainActivity.class);
                startActivity(intent);
            }
        });

    }
}
