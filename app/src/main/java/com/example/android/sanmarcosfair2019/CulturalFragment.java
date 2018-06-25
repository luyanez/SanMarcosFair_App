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
public class CulturalFragment extends Fragment {


    public CulturalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);

        // Create a list of events
        final ArrayList<EventInfo> events = new ArrayList<EventInfo>();
        int image = R.drawable.ic_cultural_icon;

        String monthA = getString(R.string.April);

        events.add(new EventInfo(getString(R.string.conjunto_coral),monthA,16,0,image));
        events.add(new EventInfo(getString(R.string.orquesta_sinfonica_juvenil),monthA,17,1,image));
        events.add(new EventInfo(getString(R.string.ensamble_de_guitarras),monthA,18,2,image));
        events.add(new EventInfo(getString(R.string.quinteto_villanueva),monthA,19,3,image));
        events.add(new EventInfo(getString(R.string.quinteto_saturnino),monthA,20,4,image));
        events.add(new EventInfo(getString(R.string.orquesta_coro_camara),monthA,23,0,image));
        events.add(new EventInfo(getString(R.string.orquesta_tipica_burros),monthA,25,3,image));

        EventInfoAdapter adapter = new EventInfoAdapter(getActivity(), events, R.color.category_cultural);

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
                intent.putExtra(getString(R.string.event_image), R.drawable.cultural);


                startActivity(intent);

            }
        });

        return rootView;

    }

}
