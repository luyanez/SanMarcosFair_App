package com.example.android.sanmarcosfair2019;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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
public class SportsFragment extends Fragment {


    public SportsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);

        // Create a list of events
        final ArrayList<EventInfo> events = new ArrayList<EventInfo>();

        int image = R.drawable.ic_sports_icon;

        String monthA = getString(R.string.April);
        String monthM = getString(R.string.May);

        events.add(new EventInfo(getString(R.string.beach_volleyball_tour),monthA,13,4,image));
        events.add(new EventInfo(getString(R.string.squash_national_tournament),monthA,5,3,image));
        events.add(new EventInfo(getString(R.string.basketball_national_tournament),monthA,11,2,image));
        events.add(new EventInfo(getString(R.string.tennis_annual_tournament),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.ferrocarrilero),monthA,15,6,image));
        events.add(new EventInfo(getString(R.string.half_marathon),monthA,15,6,image));
        events.add(new EventInfo(getString(R.string.frontenis_tournament),monthA,19,3,image));
        events.add(new EventInfo(getString(R.string.golf_tournament),monthA,21,5,image));
        events.add(new EventInfo(getString(R.string.fishing_tournament),monthA,21,5,image));
        events.add(new EventInfo(getString(R.string.archery_tournament),monthA,22,6,image));
        events.add(new EventInfo(getString(R.string.fishing_tournament_san_marcos),monthA,21,5,image));
        events.add(new EventInfo(getString(R.string.international_box),monthA,28,5,image));
        events.add(new EventInfo(getString(R.string.lucha_libre),monthA,29,6,image));
        events.add(new EventInfo(getString(R.string.san_marcos_race),monthM,6,6,image));


        EventInfoAdapter adapter = new EventInfoAdapter(getActivity(), events, R.color.category_sports);

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
                intent.putExtra(getString(R.string.event_image), R.drawable.sports);


                startActivity(intent);

            }
        });

        return rootView;

    }


}
