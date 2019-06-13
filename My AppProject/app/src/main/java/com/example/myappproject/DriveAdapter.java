package com.example.myappproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class DriveAdapter  extends ArrayAdapter<Drive> {
    Context context;
    int layoutid;
    ArrayList<Drive> datas;

    public DriveAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Drive> objects) {
        super(context, resource, objects);
        this.context = context;
        layoutid = resource;
        datas = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        if (convertView ==null) {
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item,null);
            DriveHolder holder = new DriveHolder(convertView);
            convertView.setTag(holder);
        }
        DriveHolder holder = (DriveHolder)convertView.getTag();

        final Drive drive = datas.get(position);
        holder.animal_name.setText(drive.name);





        return convertView;
    }


    @Override
    public int getCount() {
        return datas.size();
    }
}
