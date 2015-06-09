package com.nothing.mark.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showMessage(CharSequence appName) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + appName + "!";
        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void handleSpotifyStreamerApp(View view) {
        showMessage("spotify streamer");
    }

    public void handleScoresApp(View view) {
        showMessage("scores app");
    }

    public void handleLibraryApp(View view) {
        showMessage("library app");
    }

    public void handleBuildItBiggerApp(View view) {
        showMessage("build it bigger app");
    }

    public void handleXYZReaderApp(View view) {
        showMessage("xyz reader app");
    }

    public void handleCapstoneApp(View view) {
        showMessage("capstone my own app");
    }
}
