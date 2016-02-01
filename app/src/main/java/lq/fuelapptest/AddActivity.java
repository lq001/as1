package lq.fuelapptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AddActivity extends Activity {

    /**
     * Initialize all variables
     */
    private Button backwardButton;
    private static final String FILENAME = "file.sav";
    private EditText dateText;
    private EditText stationText;
    private EditText meterText;
    private EditText amountText;
    private EditText gradeText;
    private EditText unitText;

   // private ListView oldTweetsList;


    private ArrayList<Add> tweets = new ArrayList<Add>();
    private ArrayAdapter<Add> adapter;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_add);

        dateText = (EditText) findViewById(R.id.mDate);
        stationText = (EditText) findViewById(R.id.mstation);
        meterText = (EditText) findViewById(R.id.mOdometer);
        amountText = (EditText) findViewById(R.id.mAmount);
        gradeText = (EditText) findViewById(R.id.mGrade);
        unitText = (EditText) findViewById(R.id.mUnit);


        Button saveButton = (Button) findViewById(R.id.save);

        //oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
        backwardButton = (Button) findViewById(R.id.backButton);
        backwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent MainActivity = new Intent(AddActivity.this, MainActivity.class);
                startActivity(MainActivity);*/
                finish();
            }
        });


        saveButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                setResult(RESULT_OK);
                String text1 = dateText.getText().toString();
                String text2 = stationText.getText().toString();
                String text3 = meterText.getText().toString();
                String text4 = gradeText.getText().toString();
                String text5 = amountText.getText().toString();
                String text6 = unitText.getText().toString();
                Add newestAdd = new Add(text1,text2,text3,text4,text5,text6);

                tweets.add(newestAdd);
                adapter.notifyDataSetChanged();
                saveInFile();
                finish();

            }

        });

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        loadFromFile();
        adapter = new ArrayAdapter<Add>(this,
                R.layout.list_item, tweets);
        //oldTweetsList.setAdapter(adapter);
    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            Gson gson = new Gson();

            //took from https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/Gson.html Jan-21-2015
            Type listType = new TypeToken<ArrayList<Add>>() {}.getType();
            tweets = gson.fromJson(in, listType);


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            tweets = new ArrayList<Add>();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        }
    }

    private void saveInFile() {
        try {
            FileOutputStream fos = openFileOutput(FILENAME,
                    0);//Context.MODE_PRIVATE <> 0

            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));
            Gson gson = new Gson();
            gson.toJson(tweets, out);
            out.flush();

            fos.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException();
        }
    }
}


