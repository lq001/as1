package lq.fuelapptest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class EditActivity extends AppCompatActivity {
    /**private static final String FILENAME = "file.sav";
    private EditText dateText;
    private EditText stationText;
    private EditText meterText;
    private EditText amountText;
    private EditText gradeText;
    private EditText unitText;
    private ListView oldTweetsList;
    private ArrayList<Add> tweets = new ArrayList<Add>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_add);
        oldTweetsList = (ListView) findViewById(R.id.oldTweetsList);
        dateText = (EditText) findViewById(R.id.mDate);
        stationText = (EditText) findViewById(R.id.mstation);
        meterText = (EditText) findViewById(R.id.mOdometer);
        amountText = (EditText) findViewById(R.id.mAmount);
        gradeText = (EditText) findViewById(R.id.mGrade);
        unitText = (EditText) findViewById(R.id.mUnit);
        oldTweetsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                AlertDialog.Builder adb = new AlertDialog.Builder(ViewActivity.this);
                adb.setMessage("Do you want to edit it?");
                adb.setCancelable(true);
                final int finalPosition = position;
                adb.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // String datee = String.valueOf(logentries.get(finalPosition).entryDate);
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                        Date d = tweets.get(finalPosition).getDate();
                        String datee = df.format(d);
                        String station = tweets.get(finalPosition).getStation();
                        String odometer = tweets.get(finalPosition).getOdometer();
                        String FuelGrade = tweets.get(finalPosition).getFuelGrade();
                        String FuelAmount = tweets.get(finalPosition).getFuelAmount();
                        String FuelUnitCost = tweets.get(finalPosition).getFuelUnitCost();

                        Intent intent = new Intent(ViewActivity.this, EditActivity.class);
                        intent.putExtra("finalposition",finalPosition);
                        intent.putExtra("datee",datee);
                        intent.putExtra("station",station);
                        intent.putExtra("odometer",odometer);
                        intent.putExtra("fuelgrade",FuelGrade);
                        intent.putExtra("fuelamount",FuelAmount);
                        intent.putExtra("fuelunitcost",FuelUnitCost);
                        startActivity(intent);
                        Toast.makeText(ViewLogEntriesActivity.this,"edit this log entry",Toast.LENGTH_SHORT).show();
                    }
                });
                adb.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                adb.show();
            }
        });


    }*/
}
