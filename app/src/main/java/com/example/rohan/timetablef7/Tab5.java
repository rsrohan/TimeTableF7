package com.example.rohan.timetablef7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab5 extends Fragment {
    adapter a5;
    ListView list;
    String[] sub={
            "[LEC]Operating Systems and System Programming",
            "[LEC]FUZZY LOGIC AND NEURAL NETWORKS",
            "[LEC]DATA WAREHOUSE AND DATA MINING",
            "[LEC]Environmental Science",
            "[LEC]HUMAN RESOURCE MANAGEMENT",
            "[LEC]FINANCIAL MANAGEMENT",
            "[LAB]ALGORITHMS AND PROBLEM SOLVING LAB"

    };
    String[] time1={
            "9:00-9:50",
            "9:55-10:45",
            "9:55-10:45",
            "10:50-11:40",
            "2:30-3:20",
            "2:30-3:20",
            "3:25-5:10"

    };
    String[] venue={
            "148",
            "118A",
            "148",
            "254",
            "117",
            "148",
            "132"

    };
    String[] teacher={
            "NFCS1",
            "MS",
            "AVP",
            "MANISHA",
            "PRV",
            "SKVA",
            "NEERAJ/SANDHYA"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.tab5, null);
        list= v.findViewById(R.id.t5);
        a5= new adapter(getActivity(), sub, time1, venue, teacher);
        list.setAdapter(a5);
        return  v;
    }
}
