package com.example.android.sanmarcosfair2019;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String eventName = "";
        int eventImage = 0;
        int eventDay = 0;
        String eventMonth = "";
        String eventDayLetters = "";

        Intent intent = getIntent();

        if (null != intent) {
            eventName = intent.getStringExtra(getString(R.string.event_name));
            eventImage = intent.getIntExtra(getString(R.string.event_image), 0);
            eventDay = intent.getIntExtra(getString(R.string.event_day),0);
            eventMonth = intent.getStringExtra(getString(R.string.event_month));
            eventDayLetters = intent.getStringExtra(getString(R.string.event_day_letters));

        }

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar = findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(eventName);

        final ImageView imageView = findViewById(R.id.backdrop);
        Glide.with(this).load(eventImage).apply(RequestOptions.centerCropTransform()).into(imageView);

        TextView info = findViewById(R.id.info_event_detail);
        info.setText(eventMonth + " " + eventDayLetters + " " + Integer.toString(eventDay) +
                    "\n"+ getString(R.string.event_info_text));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
