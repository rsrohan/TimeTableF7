package com.example.rohan.timetablef7;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Tab6 extends Fragment {
    adapter a6;
    ListView list;
    String[] sub={
            "[LEC]Environmental Science"
    };
    String[] time1={

            "10:50-11:40"
    };
    String[] venue={
            "254"
    };
    String[] teacher={
            "MANISHA"
    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.tab6, null);
        list= v.findViewById(R.id.t6);
        a6= new adapter(getActivity(), sub, time1, venue, teacher);
        list.setAdapter(a6);

        return v;
    }
}
