package com.example.omar.nari;

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

public class  abcActivity extends AppCompatActivity implements aFragment.OnFragmentInteractionListener,
BFragment.OnFragmentInteractionListener,CFragment.OnFragmentInteractionListener,DFragment.OnFragmentInteractionListener,EFragment.OnFragmentInteractionListener,FFragment.OnFragmentInteractionListener,GFragment.OnFragmentInteractionListener,
HFragment.OnFragmentInteractionListener,IFragment.OnFragmentInteractionListener,JFragment.OnFragmentInteractionListener,KFragment.OnFragmentInteractionListener,LFragment.OnFragmentInteractionListener,MFragment.OnFragmentInteractionListener,
NFragment.OnFragmentInteractionListener,OFragment.OnFragmentInteractionListener,PFragment.OnFragmentInteractionListener,QFragment.OnFragmentInteractionListener,RFragment.OnFragmentInteractionListener,SFragment.OnFragmentInteractionListener,
TFragment.OnFragmentInteractionListener,UFragment.OnFragmentInteractionListener,VFragment.OnFragmentInteractionListener,WFragment.OnFragmentInteractionListener,XFragment.OnFragmentInteractionListener,YFragment.OnFragmentInteractionListener,
ZFragment.OnFragmentInteractionListener{

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
        setContentView(R.layout.activity_abc);

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
        getMenuInflater().inflate(R.menu.menu_abc, menu);
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
            Intent x= new Intent(getApplicationContext(),Inicio.class);
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
             Fragment fragment=null;
             switch (sectionNumber){
                 case 1:fragment=new aFragment();
                 break;
                 case 2:fragment=new BFragment();
                 break;
                 case 3:fragment=new CFragment();
                 break;
                 case 4:fragment=new DFragment();
                     break;
                 case 5: fragment=new EFragment();
                     break;
                 case 6:fragment=new FFragment();
                     break;
                 case 7:fragment=new GFragment();
                     break;
                 case 8: fragment=new HFragment();
                     break;
                 case 9:fragment=new IFragment();
                     break;
                 case 10:fragment=new JFragment();
                     break;
                 case 11: fragment=new KFragment();
                     break;
                 case 12:fragment=new LFragment();
                     break;
                 case 13:fragment=new MFragment();
                     break;
                 case 14: fragment=new NFragment();
                     break;
                 case 15:fragment=new OFragment();
                     break;
                 case 16:fragment=new PFragment();
                     break;
                 case 17: fragment=new QFragment();
                     break;
                 case 18:fragment=new RFragment();
                     break;
                 case 19:fragment=new SFragment();
                     break;
                 case 20: fragment=new TFragment();
                     break;
                 case 21:fragment=new UFragment();
                     break;
                 case 22:fragment=new VFragment();
                     break;
                 case 23: fragment=new WFragment();
                     break;
                 case 24:fragment=new XFragment();
                     break;
                 case 25: fragment=new YFragment();
                     break;
                 case 26:fragment=new ZFragment();




             }

            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_abc, container, false);
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
            return 26;
        }
        
    }
}
