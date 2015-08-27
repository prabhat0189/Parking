package com.as.parking.navigation;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.as.parking.R;

/**
 * Created by PRABHAT on 8/26/2015.
 */
public class NavigationDrawerUtil {

    private CharSequence mTitle;

    private ListView mDrawerListView;
    private ActionBarDrawerToggle mDrawerToggle;
    private DrawerLayout mDrawerLayout;

    private ActionBarActivity mActivity;

    public NavigationDrawerUtil(ActionBarActivity activity) {
        mActivity = activity;

        initializeNavigationDrawer();
    }

    public void postCreate() {
        mDrawerToggle.syncState();
    }

    public boolean optionItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return false;
    }

    private void initializeNavigationDrawer() {

        String navList[]  = {"HOME"};

        NavigationDrawerAdapter adapter = new NavigationDrawerAdapter(mActivity,
                R.layout.drawer_list_item, navList);

        mDrawerListView = (ListView)mActivity.findViewById(R.id.navigation_list);
        mDrawerLayout = (DrawerLayout)mActivity. findViewById(R.id.drawer_layout);

        mDrawerListView.setAdapter(adapter);
        mDrawerListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectItem(position);
            }
        });

        mActivity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mActivity.getSupportActionBar().setHomeButtonEnabled(true);

        mDrawerToggle = new ActionBarDrawerToggle(mActivity, mDrawerLayout,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close) {

            public void onDrawerOpened(View drawerView) {
                mActivity.invalidateOptionsMenu();
                //mDrawerToggle.setDrawerIndicatorEnabled(true);
                //Utils.closeKeyboard(this, getWindow().);
            }

            public void onDrawerClosed(View view) {
                mActivity.invalidateOptionsMenu();
                syncActionBarArrowState();
            }
        };

        mDrawerToggle.setDrawerIndicatorEnabled(true);
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        selectItem(0);
    }

    private void syncActionBarArrowState() {
        /*int backStackEntryCount =
                mActivity.getSupportFragmentManager().getBackStackEntryCount();
        mDrawerToggle.setDrawerIndicatorEnabled(backStackEntryCount == 0);*/
    }

    private void selectItem(int position) {
        if (mDrawerListView != null) {
            mDrawerListView.setItemChecked(position, true);
        }
        if (mDrawerLayout != null) {
            mDrawerLayout.closeDrawer(mDrawerListView);
        }
        onNavigationDrawerItemSelected(position);
    }



    public void onNavigationDrawerItemSelected(int position) {

    }
}
