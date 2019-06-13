package com.example.myappproject;

import android.view.View;
import android.widget.TextView;

public class DriveHolder {
    TextView animal_name;

    DriveHolder(View convertView){
        animal_name = convertView.findViewById(R.id.animal_name);
    }
}
