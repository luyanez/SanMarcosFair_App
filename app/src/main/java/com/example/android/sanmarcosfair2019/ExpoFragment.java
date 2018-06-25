package com.example.android.sanmarcosfair2019;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExpoFragment extends Fragment {


    public ExpoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);

        // Create a list of events
        final ArrayList<EventInfo> events = new ArrayList<EventInfo>();

        int image = R.drawable.ic_expos_icon;

        String monthA = getString(R.string.April);

        events.add(new EventInfo(getString(R.string.pabellonT),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.pabellonA),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.pabellonM),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.expo_agropecuaria),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.pabellon_aguas),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.expo_industrial),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.pabellon_flor_real),monthA,14,5,image));

        EventInfoAdapter adapter = new EventInfoAdapter(getActivity(), events, R.color.category_expos);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        // Set a click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                EventInfo event = events.get(position);

                Intent intent = new Intent(getActivity(), DetailActivity.class);
                intent.putExtra(getString(R.string.event_name), event.getmEventName());
                intent.putExtra(getString(R.string.event_day), event.getmEventDay());
                intent.putExtra(getString(R.string.event_month), event.getmEventMonth());
                intent.putExtra(getString(R.string.event_day_letters),event.getmEventDayLetters());
                intent.putExtra(getString(R.string.event_image), R.drawable.expo);


                startActivity(intent);

            }
        });

        return rootView;
    }

}
