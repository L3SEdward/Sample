package com.slack.mu_ideas.road;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class librarytime extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_librarytime);
    }
    public void back(View View) {
        Intent backToDate = new Intent(this, library.class);
        startActivity(backToDate);
    }

}
