package com.example.rohan.timetablef7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab3 extends Fragment {
    adapter a3;
    ListView list;
    String[] sub={
            "[LEC]Algorithms and Problem Solving",
            "[LEC]INDUSTRIAL ECONOMICS",
            "[LEC]CONTEMPORARY FORM OF LITERATURE",
            "[LEC]SOCIOLOGY OF MEDIA",
            "[TUTE]HUMAN RESOURCE MANAGEMENT",
            "[LAB]OPERATING SYSTEM LAB",
            "[TUTE]Algorithms and Problem Solving",
            "[LEC]DATA WAREHOUSE AND DATA MINING"

    };
    String[] time1={
            "9:00-9:50",
            "10:50-11:40",
            "10:50-11:40",
            "10:50-11:40",
            "11:45-12:35",
            "1:35-3:20",
            "3:25-4:15",
            "4:20-5:10"

    };
    String[] venue={
            "148",
            "118B",
            "148",
            "254",
            "118A",
            "*",
            "123",
            "CL3"

    };
    String[] teacher={
            "MS",
            "AA",
            "EKTA",
            "ALKA",
            "PRV",
            "*",
            "PM",
            "AVP"

    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab3, null);
        list= v.findViewById(R.id.t3);
        a3= new adapter(getActivity(), sub, time1, venue, teacher);
        list.setAdapter(a3);
        return v;
    }
}
