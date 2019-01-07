package com.example.rohan.timetablef7;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab1 extends Fragment {
    adapter a1;
    ListView list;
    String[] subject ={
            "[TUTE]CONTEMPORARY FORM OF LITERATURE",
            "[TUTE]INDUSTRIAL ECONOMICS",
            "[LEC]HUMAN RESOURCE MANAGEMENT",
            "[LEC]FINANCIAL MANAGEMENT",
            "[TUTE]Probability and Random processes",
            "[LEC]Probability and Random processes",
            "[LEC]Operating Systems and System Programming",
            "[LEC]Algorithms and Problem Solving",
            "[TUTE]FUZZY LOGIC AND NEURAL NETWORKS"
    };
    String[] time1 ={
            "9:00-9:50",
            "9:00-9:50",
            "9:55-10:45",
            "9:55-10:45",
            "11:45-12:35",
            "1:35-2:25",
            "2:30-3:20",
            "3:25-4:15",
            "4:20-5:10"

    };
    String[] venue ={
            "126",
            "121",
            "117",
            "148",
            "113",
            "254",
            "254",
            "148",
            "121"
    };
    String[] teacher ={
            "EKTA",
            "AA",
            "PRV",
            "SKVA",
            "PKS",
            "PKS",
            "NFCS1",
            "MS",
            "MS"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab1, null);
        list= v.findViewById(R.id.t1);
        a1= new adapter(getActivity(), subject, time1, venue, teacher);
        list.setAdapter(a1);
        return v;

    }
}
