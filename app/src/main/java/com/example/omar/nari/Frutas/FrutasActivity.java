package com.example.omar.nari.Frutas;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.example.omar.nari.Inicio;
import com.example.omar.nari.R;
import com.example.omar.nari.colo.NarangaFragment;

public class FrutasActivity extends AppCompatActivity implements AguacateFragment.OnFragmentInteractionListener,ChicharoFragment.OnFragmentInteractionListener,ChileFragment.OnFragmentInteractionListener,
CocoFragment.OnFragmentInteractionListener,DuraznoFragment.OnFragmentInteractionListener,EloteFragment.OnFragmentInteractionListener,FresaFragment.OnFragmentInteractionListener,GranadaFragment.OnFragmentInteractionListener,
HongosFragment.OnFragmentInteractionListener,JitomateFragment.OnFragmentInteractionListener,LimaFragment.OnFragmentInteractionListener,ManzanaFragment.OnFragmentInteractionListener,NaranjaFragment.OnFragmentInteractionListener,
PapaFragment.OnFragmentInteractionListener,PeraFragment.OnFragmentInteractionListener,RabanosFragment.OnFragmentInteractionListener,SandiaFragment.OnFragmentInteractionListener,zanahoriaFragment.OnFragmentInteractionListener
{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_frutas, menu);
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
            Intent x=new Intent(getApplicationContext(),Inicio.class);
            startActivity(x);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static Fragment newInstance(int sectionNumber) {
            Fragment fragment = null;
           switch (sectionNumber){

               case 1:fragment=new AguacateFragment();
                        break;
               case 2:fragment=new ChicharoFragment();
                        break;
               case 3:fragment=new ChileFragment();
                        break;
               case 4:fragment=new CocoFragment();
                        break;
               case 5:fragment=new DuraznoFragment();
                        break;
               case 6:fragment=new EloteFragment();
                        break;
               case 7:fragment=new FresaFragment();
                        break;
               case 8:fragment=new GranadaFragment();
                        break;
               case 9:fragment=new HongosFragment();
                        break;
               case 10:fragment=new JitomateFragment();
                        break;
               case 11:fragment=new LimaFragment();
                        break;
               case 12:fragment=new MandarinaFragment();
                        break;
               case 13:fragment=new ManzanaFragment();
                        break;
               case 14:fragment=new NarangaFragment();
                        break;
               case 15:fragment=new PapaFragment();
                        break;
               case 16:fragment=new PeraFragment();
                        break;
               case 17:fragment=new RabanosFragment();
                        break;
               case 18:fragment=new SandiaFragment();
                        break;
               case 19:fragment=new zanahoriaFragment();
                        break;

           }
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_frutas, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 19;
        }
    }
}
