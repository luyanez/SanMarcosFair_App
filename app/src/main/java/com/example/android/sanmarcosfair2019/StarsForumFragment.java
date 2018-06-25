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
public class StarsForumFragment extends Fragment {


    public StarsForumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.event_list, container, false);


        // Create a list of words
        final ArrayList<EventInfo> events = new ArrayList<EventInfo>();
        int image = R.drawable.ic_starsforum_icon;

        String monthA = getString(R.string.April);
        String monthM = getString(R.string.May);

        events.add(new EventInfo(getString(R.string.ricardo_montaner),monthA,14,5,image));
        events.add(new EventInfo(getString(R.string.kabah),monthA,15,6,image));
        events.add(new EventInfo(getString(R.string.juanes),monthA,16,0,image));
        events.add(new EventInfo(getString(R.string.zoe),monthA,17,1,image));
        events.add(new EventInfo(getString(R.string.cristian_castro),monthA,18,2,image));
        events.add(new EventInfo(getString(R.string.alex_syntek),monthA,18,2,image));
        events.add(new EventInfo(getString(R.string.bunbury),monthA,19,3,image));
        events.add(new EventInfo(getString(R.string.intocable),monthA,20,4,image));
        events.add(new EventInfo(getString(R.string.ana_torroja),monthA,21,5,image));
        events.add(new EventInfo(getString(R.string.garibaldi),monthA,22,6,image));
        events.add(new EventInfo(getString(R.string.maria_jose),monthA,23,0,image));
        events.add(new EventInfo(getString(R.string.ov7),monthA,24,1,image));
        events.add(new EventInfo(getString(R.string.sonora_santanita),monthA,25,2,image));
        events.add(new EventInfo(getString(R.string.kinky),monthA,26,3,image));
        events.add(new EventInfo(getString(R.string.caifanes),monthA,27,4,image));
        events.add(new EventInfo(getString(R.string.lila_downs),monthA,28,5,image));
        events.add(new EventInfo(getString(R.string.lucha_libre_stars),monthA,29,6,image));
        events.add(new EventInfo(getString(R.string.molotov),monthA,30,0,image));

        events.add(new EventInfo(getString(R.string.la_adictiva),monthM,1,1,image));
        events.add(new EventInfo(getString(R.string.yuridia),monthM,2,2,image));
        events.add(new EventInfo(getString(R.string.coque_muniz),monthM,3,3,image));
        events.add(new EventInfo(getString(R.string.francisco_cespedes),monthM,3,3,image));
        events.add(new EventInfo(getString(R.string.carlos_cuevas),monthM,3,3,image));
        events.add(new EventInfo(getString(R.string.manuel_turizo),monthM,4,4,image));
        events.add(new EventInfo(getString(R.string.ilse), monthM,5,5,image));
        events.add(new EventInfo(getString(R.string.ivonne), monthM,5,5,image));
        events.add(new EventInfo(getString(R.string.mimy), monthM,5,5,image));
        events.add(new EventInfo(getString(R.string.los_angeles_azules),monthM,6,6,image));


        EventInfoAdapter adapter = new EventInfoAdapter(getActivity(), events, R.color.category_starsForum);

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
                intent.putExtra(getString(R.string.event_image), R.drawable.stars_forum);

                startActivity(intent);

            }
        });

        return rootView;
    }

}
