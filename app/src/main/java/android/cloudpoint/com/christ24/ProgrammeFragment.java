package android.cloudpoint.com.christ24;


import android.cloudpoint.com.christ24.Adapters.VideoAdapter;
import android.cloudpoint.com.christ24.model.Video;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProgrammeFragment extends Fragment {


    private final String ACTIVITY_TITLE = "Programme";
    List<Video> videoList;
    public ProgrammeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainMenuActivity)getActivity()).setActionBarTitle(ACTIVITY_TITLE);

        videoList = new ArrayList<>();
        videoList.add(new Video("The Vegetarian", "Category Book", "Description Book",
                R.drawable.thevigitarian));
        videoList.add(new Video("The Wild Robot", "Category Book", "Description Book",
                R.drawable.thewildrobot));
        videoList.add(new Video("Maria Samples", "Category Book", "Description Book",
                R.drawable.mariasemples));
        videoList.add(new Video("He Died with....", "Category Book", "Description Book",
                R.drawable.hediedwith));
        videoList.add(new Video("The Vegetarian", "Category Book", "Description Book",
                R.drawable.thevigitarian));
        videoList.add(new Video("The Wild Robot", "Category Book", "Description Book",
                R.drawable.thewildrobot));
        videoList.add(new Video("Maria Samples", "Category Book", "Description Book",
                R.drawable.mariasemples));
        videoList.add(new Video("He Died with....", "Category Book", "Description Book",
                R.drawable.hediedwith));
        videoList.add(new Video("The Vegetarian", "Category Book", "Description Book",
                R.drawable.thevigitarian));
        videoList.add(new Video("The Wild Robot", "Category Book", "Description Book",
                R.drawable.thewildrobot));
        videoList.add(new Video("Maria Samples", "Category Book", "Description Book",
                R.drawable.mariasemples));
        videoList.add(new Video("He Died with....", "Category Book", "Description Book",
                R.drawable.hediedwith));

        View view = inflater.inflate(R.layout.fragment_programme, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_program);
        VideoAdapter adapter = new VideoAdapter(videoList);
        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(manager);

        return view;
    }

}
