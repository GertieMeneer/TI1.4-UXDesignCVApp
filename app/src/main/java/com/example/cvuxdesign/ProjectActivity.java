package com.example.cvuxdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProjectActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        TextView titleTextView = findViewById(R.id.titleTextView);
        ImageView projectImageView = findViewById(R.id.projectImageView);
        TextView infoTextView = findViewById(R.id.infoTextView);

        String info = getIntent().getStringExtra("message");

        switch(info)
        {
            case "0":
                titleTextView.setText(R.string.weatherstation);
                projectImageView.setImageResource(R.drawable.weatherstation);
                infoTextView.setText(R.string.weather_station_summary);
                break;
            case "1":
                titleTextView.setText(R.string.avg);
                projectImageView.setImageResource(R.drawable.avg);
                infoTextView.setText(R.string.avg_summary);
                break;
            case "2":
                titleTextView.setText("Festival Planner");
                projectImageView.setImageResource(R.drawable.festivalplanner);
                infoTextView.setText(R.string.festivalplanner_summary);
                break;
            case "3":
                titleTextView.setText(R.string.resume_app);
                projectImageView.setImageResource(R.drawable.resume_app);
                infoTextView.setText(R.string.resume_app_summary);
        }

        Button backButton = findViewById(R.id.backButton1);
        backButton.setOnClickListener(e ->
        {
            Intent intent = new Intent(ProjectActivity.this, OverviewActivity.class);
            startActivity(intent);
        });
    }
}