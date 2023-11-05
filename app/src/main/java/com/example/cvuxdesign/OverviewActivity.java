package com.example.cvuxdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

public class OverviewActivity extends AppCompatActivity
{
//    String projectList[] = {"Internet Weather Station", "Automated Guided Vehicle", "Festival Planner", "Resume App"};
    String projectList[] = {"0", "1", "2", "3"};
    int projectImages[] = {R.drawable.weatherstation, R.drawable.avg, R.drawable.festivalplanner, R.drawable.resume_app};

    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(e ->
        {
            Intent intent = new Intent(OverviewActivity.this,MainActivity.class);
            startActivity(intent);
        });

        ListView listView = (ListView) findViewById(R.id.projectList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), projectList, projectImages);
        listView.setAdapter(customBaseAdapter);
        listView.setOnItemClickListener((adapterView, view, i, l) ->
        {
            switch (i)
            {
                case 0:
                    message= "0";
                    break;
                case 1:
                    message = "1";
                    break;
                case 2:
                    message = "2";
                    break;
                case 3:
                    message = "3";
                    break;
                default:
                    break;
            }
            Intent intent = new Intent(OverviewActivity.this, ProjectActivity.class);
            intent.putExtra("message", message);
            startActivity(intent);
        });
    }
}