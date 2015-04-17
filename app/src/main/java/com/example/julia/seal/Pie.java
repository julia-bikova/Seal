package com.example.julia.seal;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Pie extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
//        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ROOT);
//        Date current = new Date();
//        Date meeting_date = null;
//        try {
//            meeting_date = format.parse("13.10.2010");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        long difference = current.getTime() - (meeting_date != null ? meeting_date.getTime() : 0);
//        long days =  difference / (24 * 60 * 60 * 1000);
//        TextView t = (TextView) findViewById(R.id.counter);
//        t.setText(days+"");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pie, menu);
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
}
