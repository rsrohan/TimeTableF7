package com.example.rohan.timetablef7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab4 extends Fragment {
    adapter a4;
    ListView list;
    String[] sub={
            "[LEC]FUZZY LOGIC AND NEURAL NETWORKS",
            "[LEC]DATA WAREHOUSE AND DATA MINING",
            "[LEC]Environmental Science",
            "[LEC]Probability and Random processes",
            "[TUTE]FINANCIAL MANAGEMENT",
            "NSS ACTIVITY",
            "[LAB]ALGORITHMS AND PROBLEM SOLVING LAB"

    };
    String[] time1={
            "9:00-9:50",
            "9:00-9:50",
            "10:50-11:40",
            "11:45-12:35",
            "12:40-1:30",
            "1:35-3:20",
            "3:25-5:10"

    };
    String[] venue={
            "148",
            "226",
            "153",
            "254",
            "226",
            "118A",
            "132"

    };
    String[] teacher={
            "MS",
            "AVP",
            "MANISHA",
            "PKS",
            "SKVA",
            "KRITIKA",
            "NEERAJ/SANDHYA"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.tab4, null);
        list= v.findViewById(R.id.t4);
        a4=new adapter(getActivity(), sub, time1, venue, teacher);
        list.setAdapter(a4);
        return  v;
    }
}
