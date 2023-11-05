package com.example.cvuxdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter
{

    Context context;
    String projectList[];
    int projectImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String[] projectList, int[] projectImages)
    {
        this.context = ctx;
        this.projectList = projectList;
        this.projectImages = projectImages;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount()
    {
        return projectList.length;
    }

    @Override
    public Object getItem(int i)
    {
        return null;
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view = inflater.inflate(R.layout.activity_custom_list_view, null);

        ImageView img = view.findViewById(R.id.imageIcon);
        img.setImageResource(projectImages[i]);

        TextView projectTitle = view.findViewById(R.id.projectTitleList);
        TextView projectDescription = view.findViewById(R.id.projectDescriptionList);
        TextView projectYear = view.findViewById(R.id.projectYearText);

        switch(i)
        {
            case 0:
                projectTitle.setText(R.string.weatherstation);
                projectDescription.setText(R.string.weatherstation_description);
                projectYear.setText("2022");
                break;
            case 1:
                projectTitle.setText(R.string.avg);
                projectDescription.setText(R.string.avg_description);
                projectYear.setText("2022");
                break;
            case 2:
                projectTitle.setText(R.string.festivalplanner);
                projectDescription.setText(R.string.festivalplanner_description);
                projectYear.setText("2023");
                break;
            case 3:
                projectTitle.setText(R.string.resume_app);
                projectDescription.setText(R.string.resume_app_description);
                projectYear.setText("2023");
                break;
            default:
                break;
        }
        return view;
    }
}
