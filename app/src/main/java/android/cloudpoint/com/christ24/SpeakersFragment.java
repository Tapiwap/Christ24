package android.cloudpoint.com.christ24;


import android.cloudpoint.com.christ24.Adapters.SpeakersAdapter;
import android.cloudpoint.com.christ24.model.Speaker;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpeakersFragment extends Fragment {

    private ArrayList<Speaker> speakers;
    private RecyclerView recyclerView;

    public SpeakersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_speakers, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.speakers_frag_recyclerview);
        SpeakersAdapter adapter = new SpeakersAdapter(speakers, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        speakers = new ArrayList<>();
        speakers.add(new Speaker("John Doe", "08 00 hrs - 09 30 hrs", R.drawable.hediedwith));
        speakers.add(new Speaker("Jane Doe", "08 00 hrs - 09 30 hrs", R.drawable.mariasemples));
        speakers.add(new Speaker("Kim Doe", "08 00 hrs - 09 30 hrs", R.drawable.thewildrobot));
        speakers.add(new Speaker("Jamie Doe", "08 00 hrs - 09 30 hrs", R.drawable.themartian));
    }
}
