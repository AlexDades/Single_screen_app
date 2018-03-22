package com.example.adades.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void webAddress (View view){
        Intent linkIntent = new Intent();
        linkIntent.setAction(Intent.ACTION_VIEW);
        linkIntent.setData(Uri.parse("http://tigrulma.com"));
        startActivity(linkIntent);
    }
    public void location (View view){
        Intent locationIntent = new Intent();
        locationIntent.setAction(Intent.ACTION_VIEW);
        locationIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "geo:44.4, 26.1");
        startActivity(locationIntent);
    }
    public void phoneCall (View view){
        Intent intentCall = new Intent(Intent.ACTION_DIAL);
        intentCall.setData(Uri.parse("tel:0741 598 883"));
        if (intentCall.resolveActivity(getPackageManager()) != null) {
            startActivity(intentCall);
        }
    }
}
