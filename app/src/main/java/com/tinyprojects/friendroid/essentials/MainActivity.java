package com.tinyprojects.friendroid.essentials;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] title = {"রূপচর্চা ও অন্যান্য", "সুস্বাস্থ রক্ষার্থে করনীয়", "রান্না-বান্না রেসিপি", "আচার-আচরণ"};
    String[] description = {"শারীরিক সৌন্দর্য বৃদ্ধি করার উপায়সমূহ", "সুস্থ থাকতে করনীয় ও বর্জনীয়",
            "মজাদার রান্না করার রেসিপিসনূহ", "সমাজে করনীয় ও বারণ যে সকল কাজ"};
    int[] icons = {R.drawable.beauty, R.drawable.health, R.drawable.cook, R.drawable.meet};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyListAdapter adapter = new MyListAdapter(this, title, description, icons);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {
                    Intent intent = new Intent(MainActivity.this, BeautyActivity.class);
                    startActivity(intent);
                } else if (i == 1) {
                    Intent intent = new Intent(MainActivity.this, HealthActivity.class);
                    startActivity(intent);
                } else if (i == 2) {
                    Intent intent = new Intent(MainActivity.this, CookActivity.class);
                    startActivity(intent);
                } else if (i == 3) {
                    Intent intent = new Intent(MainActivity.this, MeetActivity.class);
                    startActivity(intent);
                }


            }
        });
    }
}
