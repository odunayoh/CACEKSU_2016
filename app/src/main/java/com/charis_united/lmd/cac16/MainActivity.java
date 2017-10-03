package com.charis_united.lmd.cac16;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.charis_united.lmd.cac16.FireBase.Online_Chat;
import com.charis_united.lmd.cac16.Fragment.Carousel;
import com.charis_united.lmd.cac16.Fragment.GradFragment;
import com.charis_united.lmd.cac16.Fragment.MyFragPagerAdapter;
import com.charis_united.lmd.cac16.Fragment.SlideShow;
import com.charis_united.lmd.cac16.Recycler.MyRecyclerAdapter;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
  private MyRecyclerAdapter adapter;

    //dfinal static String DB_URL = "";
  //  Firebase firebase;



   // SearchView sv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //insert this just under your setConview(R.layout.activity_main)
      //  Firebase.setAndroidContext(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.getDefault());
        SimpleDateFormat df = new SimpleDateFormat("EEE MMM d, yyyy");
        String currentDate = df.format(calendar.getTime());
        getSupportActionBar().setTitle(currentDate);

        //create an instance of the fire base url
//        firebase = new Firebase(DB_URL);

      /***  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });**/
      //  sv = (SearchView) findViewById(R.id.mSearch);


//Adapter

     //MyRecyclerAdapter adapter = new MyRecyclerAdapter(this.getMovies());


        ViewPager vp = (ViewPager) findViewById(R.id.view_pager_ID);
        this.addPages(vp);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.mTab_ID);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(vp);
        tabLayout.setOnTabSelectedListener(listener(vp) );

        tabLayout.getTabAt(0).setIcon(R.drawable.home);
       tabLayout.getTabAt(1).setIcon(R.drawable.analytics);
        tabLayout.getTabAt(2).setIcon(R.drawable.face);

        //SEAECh

    /** sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {

                //filter as you type

            // adapter.getFilter().filter(query);

                return false;
            }
        });**/

    }




    //add all pages

    private void addPages(ViewPager pager)
    {
        MyFragPagerAdapter adapter = new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.addPage(new GradFragment());
        adapter.addPage(new Carousel());
       adapter.addPage(new SlideShow());
        pager.setAdapter(adapter);

    }

    private TabLayout.OnTabSelectedListener listener(final ViewPager pager)
    {
        return new TabLayout.OnTabSelectedListener()
        {

            @Override
            public void onTabSelected(TabLayout.Tab tab)

            {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.Online_Chat)
        {
            Intent intent = new Intent(MainActivity.this, Online_Chat.class);
            startActivity(intent);
            return true;
        }


        if (id == R.id.chairman_speech)
        {
            Intent intenty = new Intent(MainActivity.this,Chairman_Speech.class);
            startActivity(intenty);
            return true;
        }



        if (id == R.id.about_us)
        {
            Intent intentyy = new Intent(MainActivity.this,About.class);
            startActivity(intentyy);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    public static class MyFirebaseMessagingService extends FirebaseMessagingService {
        private static final String TAG = "FCM Service";
        @Override
        public void onMessageReceived(RemoteMessage remoteMessage)
        {
            // TODO: Handle FCM messages here.
            // If the application is in the foreground handle both data and notification messages here.
            // Also if you intend on generating your own notifications as a result of a received FCM
            // message, here is where that should be initiated.
            Log.d(TAG, "From: " + remoteMessage.getFrom());
            Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
        }
    }


    public static class FirebaseIDService extends FirebaseInstanceIdService {
        private static final String TAG = "FirebaseIDService";

        @Override

        public void onTokenRefresh()
        {
            // Get updated InstanceID token.
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
            Log.d(TAG, "Refreshed token: " + refreshedToken);
            // TODO: Implement this method to send any registration to your app's servers.
            //sendRegistrationToServer(refreshedToken);
        }

    }
}
