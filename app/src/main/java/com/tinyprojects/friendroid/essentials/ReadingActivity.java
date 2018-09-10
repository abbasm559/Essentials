package com.tinyprojects.friendroid.essentials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class ReadingActivity extends AppCompatActivity {
    TextView textViewTitle, textViewDescription;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reading);
        textViewTitle = findViewById(R.id.tvLargeRead);
        textViewDescription = findViewById(R.id.tvSmallRead);
        textViewTitle.setText(getIntent().getExtras().getString("Title"));
        textViewDescription.setText(getIntent().getExtras().getString("Description"));

        MobileAds.initialize(this,"ca-app-pub-3484830642419938~2336741770");
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }
}
