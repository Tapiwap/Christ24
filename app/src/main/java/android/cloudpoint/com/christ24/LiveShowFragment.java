package android.cloudpoint.com.christ24;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class LiveShowFragment extends Fragment {


    private final String ACTIVITY_TITLE = "Live Show";
    public LiveShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainMenuActivity)getActivity()).setActionBarTitle(ACTIVITY_TITLE);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_live_show, container, false);
    }

}
