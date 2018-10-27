package org.psiada.app.phunc;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


//import static org.psiada.app.phunc.R.id.fab;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, weekend_schedule.OnFragmentInteractionListener, Announcements.OnFragmentInteractionListener,
        Resources.OnFragmentInteractionListener, Guides.OnFragmentInteractionListener, Contact.OnFragmentInteractionListener, Feedback.OnFragmentInteractionListener,
        Restaurants.OnFragmentInteractionListener, Coffee.OnFragmentInteractionListener, Bars.OnFragmentInteractionListener, Schedule.OnFragmentInteractionListener,
        Rooms.OnFragmentInteractionListener, Resources_guide.OnFragmentInteractionListener, Transportation.OnFragmentInteractionListener, Charity.OnFragmentInteractionListener,
        Merchandise.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Fragment fragment = null;
        Class fragmentClass = null;

        try{
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }

        if (savedInstanceState == null) {
            fragment = null;
            fragmentClass = null;
            fragmentClass = Announcements.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        //getMenuInflater().inflate(R.menu.main, menu);
        return false;
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
        Fragment fragment = null;
        Class fragmentClass = null;

        if (id == R.id.nav_announcements) {
           //handle a click on announcements
            fragmentClass = Announcements.class;

        } else if (id == R.id.nav_schedule) {
            //handle a click on schedule

            fragmentClass = weekend_schedule.class;

        } else if (id == R.id.nav_resources) {
            // handle a click on resources

            fragmentClass = Resources.class;

        } else if (id == R.id.nav_restaurant_guide) {
            // handle a click on restaurant guide

            fragmentClass = Guides.class;

        } else if (id == R.id.nav_contact) {
            //handle a click on contact

            fragmentClass = Contact.class;


        } else if (id == R.id.nav_transportation) {
            //handle a click on contact

            fragmentClass = Transportation.class;


        } else if (id == R.id.nav_charity) {
            //handle a click on contact

            fragmentClass = Charity.class;


        } else if (id == R.id.nav_merchandise) {
            //handle a click on contact

            fragmentClass = Merchandise.class;


        } else if (id == R.id.nav_feedback) {
            //handle a click on feedback

            fragmentClass = Feedback.class;

        }

        try{
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e){
            e.printStackTrace();
        }




        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).addToBackStack("").commit();



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
