package android.cloudpoint.com.christ24;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainMenuActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView = null;
    Toolbar toolbar = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        HomeFragment home = new HomeFragment();
        android.support.v4.app.FragmentTransaction transaction =
                getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, home);
        transaction.commit();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);

        if (id == R.id.nav_home) {
            HomeFragment home = new HomeFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction.add(home, "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, home);
            transaction.commit();

        } else if (id == R.id.nav_live) {
            LiveShowFragment liveShowFragment = new LiveShowFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction
                    .add(new HomeFragment(), "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, liveShowFragment);
            transaction.commit();

        } else if (id == R.id.nav_programme) {
            ProgrammeFragment programme = new ProgrammeFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction
                    .add(new HomeFragment(), "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, programme);
            transaction.commit();

        } else if (id == R.id.nav_recorded) {
            RecordedFragment recorded = new RecordedFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction
                    .add(new HomeFragment(), "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, recorded);
            transaction.commit();

        } else if (id == R.id.nav_schedule) {
            ScheduleFragment schedule = new ScheduleFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction
                    .add(new HomeFragment(), "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, schedule);
            transaction.commit();

        } else if (id == R.id.nav_settings) {
            SettingsFragment settings = new SettingsFragment();
            android.support.v4.app.FragmentTransaction transaction =
                    getSupportFragmentManager().beginTransaction();
            transaction
                    .add(new HomeFragment(), "HomeFragment")
                    .addToBackStack("HomeFragment")
                    .replace(R.id.fragment_container, settings);
            transaction.commit();

        } else if (id == R.id.nav_log_out) {

        } else if (id == R.id.nav_donate) {
            Toast.makeText(this, "Link not connected", Toast.LENGTH_LONG).show();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
