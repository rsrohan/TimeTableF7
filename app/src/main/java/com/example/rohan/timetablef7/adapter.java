package com.example.rohan.timetablef7;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class adapter extends ArrayAdapter<String> {
    Activity act;
    String[] subject, time, venue, teacher;
    public adapter(Activity a, String[] sub, String[] t, String[] v, String[] teach) {
        super(a, R.layout.listview, sub);
        act=a;
        subject=sub;
        time=t;
        venue=v;
        teacher=teach;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater li=act.getLayoutInflater();
        View v=li.inflate(R.layout.listview, null, true);
        TextView t1=v.findViewById(R.id.textView1),
                t2=v.findViewById(R.id.textView2),
                t3=v.findViewById(R.id.textView3),
                t4=v.findViewById(R.id.textView4);
        t1.setText(subject[position]);
        t2.setText(time[position]);
        t3.setText(venue[position]);
        t4.setText(teacher[position]);

        return v;
    }
}
