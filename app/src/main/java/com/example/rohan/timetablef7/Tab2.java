package com.example.rohan.timetablef7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab2 extends Fragment {
    adapter a2;
    ListView list;
    String[] sub={
            "[LEC]Algorithms and Problem Solving",
            "[LEC]Probability and Random processes",
            "[LEC]CONTEMPORARY FORM OF LITERATURE",
            "[LEC]SOCIOLOGY OF MEDIA",
            "[LEC]INDUSTRIAL ECONOMICS",
            "[LEC]FUZZY LOGIC AND NEURAL NETWORKS",
            "[LEC]DATA WAREHOUSE AND DATA MINING",
            "[LEC]Operating Systems and System Programming",
            "[TUTE]Operating Systems and System Programming",
            "[TUTE]HUMAN RESOURCE MANAGEMENT"



    };
    String[] time1={
            "9:00-9:50",
            "9:55-10:45",
            "10:50-11:40",
            "10:50-11:40",
            "10:50-11:40",
            "11:45-12:35",
            "11:45-12:35",
            "1:35-2:25",
            "3:25-4:15",
            "4:20-5:10"

    };
    String[] venue={
            "254",
            "254",
            "148",
            "254",
            "153",
            "117",
            "254",
            "254",
            "137",
            "230"
    };
    String[] teacher={
            "MS",
            "PKS",
            "EKTA",
            "ALKA",
            "AA",
            "MS",
            "AVP",
            "NFCS1",
            "CG",
            "PRV"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab2, null);
        list = v.findViewById(R.id.t2);
        a2= new adapter(getActivity(), sub, time1, venue, teacher);
        list.setAdapter(a2);
        return v;
    }
}
