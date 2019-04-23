package android.cloudpoint.com.christ24;


import android.cloudpoint.com.christ24.Adapters.RecyclerViewAdapter;
import android.cloudpoint.com.christ24.model.SectionDataModel;
import android.cloudpoint.com.christ24.model.Video;
import android.os.Bundle;
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
public class ScheduleFragment extends Fragment {

    private final String ACTIVITY_TITLE = "Schedule";
    private ArrayList<SectionDataModel> allSampleData;

    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainMenuActivity)getActivity()).setActionBarTitle(ACTIVITY_TITLE);
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        allSampleData = new ArrayList<>();

        createDummyData();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.main_recyclerview);
        recyclerView.setHasFixedSize(true);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(allSampleData, getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }

    private void createDummyData() {
        for (int i = 1; i <= 7; i++) {
            SectionDataModel dm = new SectionDataModel();
            dm.setSectionTitle("Section " + i);
            ArrayList<Video> singleItemModels = new ArrayList<>();
            for (int j = 1; j <= 20; j++) {
                singleItemModels.add(new Video("Title " + j, "Category " + j));
            }
            dm.setVideoList(singleItemModels);
            allSampleData.add(dm);
        }
    }

}
