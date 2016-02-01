package lq.fuelapptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button mNewEntryButton;
    private Button mSeeAllEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNewEntryButton = (Button) findViewById(R.id.newEntryButton);

        mSeeAllEntries = (Button) findViewById(R.id.seeAllEntries);

        mNewEntryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddActivity = new Intent(MainActivity.this, AddActivity.class);
                startActivity(AddActivity);
            }
        });


        mSeeAllEntries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ViewActivity = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(ViewActivity);
            }
        });
    }

}