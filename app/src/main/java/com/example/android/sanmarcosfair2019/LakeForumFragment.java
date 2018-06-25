package com.example.android.sanmarcosfair2019;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LakeForumFragment extends Fragment {


    public LakeForumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);

        // Create a list of events
        final ArrayList<EventInfo> events = new ArrayList<EventInfo>();

        int image = R.drawable.ic_lakeforum_icon;

        String monthA = getString(R.string.April);
        String monthM = getString(R.string.May);

        events.add(new EventInfo(getString(R.string.jazz_company),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.hello_seahorse),monthA,15,6,image));
        events.add(new EventInfo(getString(R.string.paco_maria),monthA,16,0,image));
        events.add(new EventInfo(getString(R.string.tropikal_forever),monthA,17,1,image));
        events.add(new EventInfo(getString(R.string.union),monthA,18,2,image));
        events.add(new EventInfo(getString(R.string.milonga_brava_nomada),monthA,19,3,image));
        events.add(new EventInfo(getString(R.string.sole_gimenez),monthA,20,4,image));
        events.add(new EventInfo(getString(R.string.haydee_milanes),monthA,21,5,image));
        events.add(new EventInfo(getString(R.string.pedro_aznar),monthA,22,6,image));
        events.add(new EventInfo(getString(R.string.antonio_sanchez),monthA,23,0,image));
        events.add(new EventInfo(getString(R.string.banda_el_mexicano),monthA,24,1,image));
        events.add(new EventInfo(getString(R.string.cohiba_orquesta),monthA,25,2,image));
        events.add(new EventInfo(getString(R.string.orquesta_perez_prado),monthA,26,3,image));
        events.add(new EventInfo(getString(R.string.pedro_infante),monthA,27,4,image));
        events.add(new EventInfo(getString(R.string.classic_dance),monthA,28,5,image));
        events.add(new EventInfo(getString(R.string.grupo_florclorico),monthA,29,6,image));
        events.add(new EventInfo(getString(R.string.patita_de_perro),monthA,30,0,image));


        events.add(new EventInfo(getString(R.string.timothy_brownie),monthM,1,1,image));
        events.add(new EventInfo(getString(R.string.capicua),monthM,2,2,image));
        events.add(new EventInfo(getString(R.string.festival_metal),monthM,3,3,image));
        events.add(new EventInfo(getString(R.string.bowie_rock_sinfonico),monthM,4,4,image));
        events.add(new EventInfo(getString(R.string.ara_malikian),monthM,5,5,image));
        events.add(new EventInfo(getString(R.string.jarabe_palo),monthM,6,6,image));


        EventInfoAdapter adapter = new EventInfoAdapter(getActivity(), events, R.color.category_lakeForum);

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
                intent.putExtra(getString(R.string.event_image), R.drawable.lake_forum);
                startActivity(intent);

            }
        });

        return rootView;

    }

}
