package lq.fuelapptest;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by qliang on 2/1/16.
 */
public class Add{
    private String date;
    private String station;
    private String meter;
    private String grade;
    private String amount;
    private String unit;
    private String cost;

    public Add(String date, String station, String meter, String grade, String amount, String unit) {
        this.date = date;
        this.station = station;
        this.meter = meter;
        this.grade = grade;
        this.amount = amount;
        this.unit = unit;
        this.cost = String.valueOf(Float.valueOf(unit) * Float.valueOf(amount));
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getMeter() {
        return meter;
    }

    public void setMeter(String meter) {
        this.meter = meter;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public  String toString(){
        return date + " " + station + " " + meter + " " + grade + " " + amount + " " + unit + " " + cost;
    }
}
