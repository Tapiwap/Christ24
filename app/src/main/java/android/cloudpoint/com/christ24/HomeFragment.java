package android.cloudpoint.com.christ24;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener {


    private final String ACTIVITY_TITLE = "Home";
    private CardView recordedCardView, liveCardView, programmeCardView, scheduleCardView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainMenuActivity) getActivity()).setActionBarTitle(ACTIVITY_TITLE);
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recordedCardView = (CardView) view.findViewById(R.id.recordedCard);
        liveCardView = (CardView) view.findViewById(R.id.liveCard);
        programmeCardView = (CardView) view.findViewById(R.id.programmeCard);
        scheduleCardView = (CardView) view.findViewById(R.id.scheduleCard);

        recordedCardView.setOnClickListener(this);
        liveCardView.setOnClickListener(this);
        programmeCardView.setOnClickListener(this);
        scheduleCardView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        android.support.v4.app.FragmentTransaction transaction;
        Intent intent;

        switch (view.getId()) {
            case R.id.liveCard:
                /*DrawerLayout drawer = (DrawerLayout) view.findViewById(R.id.drawer_layout);
                NavigationView navigationView = (NavigationView) view.findViewById(R.id.nav_view);
                navigationView.getMenu().findItem(R.id.nav_live).setChecked(true);*/

                LiveShowFragment liveShowFragment = new LiveShowFragment();
                transaction =
                        getFragmentManager().beginTransaction();
                transaction.add(new HomeFragment(), "HomeFragment")
                        .addToBackStack("HomeFragment")
                        .replace(R.id.fragment_container, liveShowFragment).commit();
                break;
            case R.id.programmeCard:
                ProgrammeFragment programme = new ProgrammeFragment();
                transaction =
                        getFragmentManager().beginTransaction();
                transaction.add(new HomeFragment(), "HomeFragment")
                        .addToBackStack("HomeFragment")
                        .replace(R.id.fragment_container, programme).commit();
                break;
            case R.id.recordedCard:
                RecordedFragment recorded = new RecordedFragment();
                transaction =
                        getFragmentManager().beginTransaction();
                transaction.add(new HomeFragment(), "HomeFragment")
                        .addToBackStack("HomeFragment")
                        .replace(R.id.fragment_container, recorded).commit();
                break;
            case R.id.scheduleCard:
                ScheduleFragment schedule = new ScheduleFragment();
                transaction = getFragmentManager().beginTransaction();
                transaction.add(new HomeFragment(), "HomeFragment")
                        .addToBackStack("HomeFragment")
                        .replace(R.id.fragment_container, schedule).commit();
                break;
            default:
                break;
        }
    }
}
