/*
Mr. Train Schedule App
This app helps to know the next train schedule.

Codes are HIGHLY INSPIRED from these post and other stack Overflow and other websites posts.
//http://stackoverflow.com/questions/7478941/implementing-a-while-loop-in-android

A global array is made for time schedule.
This code get the current time of the smarphone
and display the time of different train Lines.

現在の時刻に応じて、次回の電車の時刻が表示される。
Global.javaに時刻を書き込み、平日と祝日の２パターンで、
次回の電車の時刻が表示される。

Created: Nov 13, 2013
Github upload: Jun 6, 2021

 */

package com.mrtrain.mrtrainsch;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Mr. Train Schedule App\n" +
                        "This app helps to know the next train.\n"
                        , Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        //Assign the button to a variable
        Button button1 = findViewById(R.id.button1);


        Global.nishikasaiToNakanotv = findViewById(R.id.nishikasaiToNakano);
        Global.nihonbashiToShibuyatv = findViewById(R.id.nihonbashiToShibuya);
        Global.shinbashiToOofunatv = findViewById(R.id.shinbashiToOofuna);
        Global.musashikosugiToToukyoutv = findViewById(R.id.musashikosugiToToukyou);
        Global.shinbashiToAsakusatv = findViewById(R.id.shinbashiToAsakusa);
        Global.nihonbashiToNishiFunabashitv = findViewById(R.id.nihonbashiToNishiFunabashi);


        //@Override
        Runnable myRunnable = () -> {
            int testByte = 0;
            while (testByte == 0) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } // Waits for 1 second (1000 milliseconds)


                final TextView nisihikasaiToNakanotv = (TextView)findViewById(R.id.nishikasaiToNakano);

                //strnishikasaiToNakano="西葛西To中野 - " + showSchedule(Global.nishikasaiToNakano);

                nisihikasaiToNakanotv.post(new Runnable(){
                    //@Override
                    public void run(){
                        callfunc();
                    }
                });

            }
        };


        Thread myThread = new Thread(myRunnable);
        myThread.start();

        //Assign it a new OnClickListener
        button1.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {
                //imageView.setVisibility(View.VISIBLE);
                callfunc();
            }
        });
    }

    public void callfunc(){

        Calendar c = Calendar.getInstance();
        int strDay = c.get(Calendar.DAY_OF_WEEK);

        String strnishikasaiToNakano ="";
        if(strDay>=2 && strDay<=6){
            //Log.d("dd",Integer.toString(strDay));
            //to OFF
            strnishikasaiToNakano="西葛西To中野 - " + showSchedule(Global.nishikasaiToNakano);
            String strnihonbashiToShibuya="";
            strnihonbashiToShibuya="日本橋To渋谷 - " + showSchedule(Global.nihonbashiToShibuya);
            String strshinbashiToOofuna;
            strshinbashiToOofuna="新橋To大船 - " + showSchedule(Global.shinbashiToOofuna);

            //To home
            String strmusashikosugiToToukyou;
            strmusashikosugiToToukyou="武蔵小杉To東京 - " + showSchedule(Global.musashikosugiToToukyou);
            String strshinbashiToAsakusa="";
            strshinbashiToAsakusa="新橋To浅草 - " + showSchedule(Global.shinbashiToAsakusa);
            String strnihonbashiToNishiFunabashi;
            strnihonbashiToNishiFunabashi="日本橋To西船橋 - " + showSchedule(Global.nihonbashiToNishiFunabashi);



            Global.nishikasaiToNakanotv.setText(strnishikasaiToNakano);
            Global.nihonbashiToShibuyatv.setText(strnihonbashiToShibuya);
            Global.shinbashiToOofunatv.setText(strshinbashiToOofuna);
            Global.musashikosugiToToukyoutv.setText(strmusashikosugiToToukyou);
            Global.shinbashiToAsakusatv.setText(strshinbashiToAsakusa);
            Global.nihonbashiToNishiFunabashitv.setText(strnihonbashiToNishiFunabashi);
        }
        else{
            //Log.d("dd",Integer.toString(strDay));
            //to OFF H
            strnishikasaiToNakano ="西葛西To中野 - " + showSchedule(Global.nishikasaiToNakanoH);
            String strnihonbashiToShibuyaH="";
            strnihonbashiToShibuyaH="日本橋To渋谷 - " + showSchedule(Global.nihonbashiToShibuyaH);
            String strshinbashiToOofunaH;
            strshinbashiToOofunaH="新橋To大船 - " + showSchedule(Global.shinbashiToOofunaH);

            //To Home H
            String strmusashikosugiToToukyouH;
            strmusashikosugiToToukyouH="武蔵小杉To東京 - " + showSchedule(Global.musashikosugiToToukyouH);
            String strshinbashiToAsakusaH;
            strshinbashiToAsakusaH="新橋To浅草 - " + showSchedule(Global.shinbashiToAsakusaH);
            String strnihonbashiToNishiFunabashiH="";
            strnihonbashiToNishiFunabashiH="日本橋To西船橋 - " + showSchedule(Global.nihonbashiToNishiFunabashiH);


            Global.nishikasaiToNakanotv.setText(strnishikasaiToNakano);
            Global.nihonbashiToShibuyatv.setText(strnihonbashiToShibuyaH);
            Global.shinbashiToOofunatv.setText(strshinbashiToOofunaH);
            Global.musashikosugiToToukyoutv.setText(strmusashikosugiToToukyouH);
            Global.shinbashiToAsakusatv.setText(strshinbashiToAsakusaH);
            Global.nihonbashiToNishiFunabashitv.setText(strnihonbashiToNishiFunabashiH);
        }


    }// end callfunc


    @SuppressLint({"SimpleDateFormat", "DefaultLocale"})
    public String showSchedule(int[][] gArray){
        Calendar c = Calendar.getInstance();
        int hours = c.get(Calendar.HOUR);
        int minutes = c.get(Calendar.MINUTE);
        int seconds = c.get(Calendar.SECOND);
        int a = c.get(Calendar.AM_PM);
        //int strDay = c.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String dayOfTheWeek = sdf.format(d);

        final TextView timetv = findViewById(R.id.TimesTextView01);
        //timetv.setText(Integer.toString(hours) + ":" + Integer.toString(minutes) + ":" + Integer.toString(seconds) + " "+ (a==0?"AM":"PM"));

        timetv.setText(String.format("%02d:%02d:%02d", hours,minutes,seconds) + " "+ (a==0?"AM":"PM") + "  " + dayOfTheWeek);

        StringBuilder string1= new StringBuilder();

        for(int i = 0; i<24; i++){
            for(int j = 0; j<gArray[i].length; j++){
                if(a == Calendar.PM){

                    if(i==(hours+12)){
                        if(minutes<=gArray[i][j]){
                            string1.append(Integer.toString(gArray[i][j]));
                            string1.append(" ");
                        }
                    }
                    else if(i>(hours+12)){
                        string1.append(Integer.toString(gArray[i][j]));
                        string1.append(" ");
                    }
                }
                else{
                    if(i==hours){
                        if(minutes<=gArray[i][j]){
                            string1.append(Integer.toString(gArray[i][j]));
                            string1.append(" ");
                        }
                    }
                    else if(i>hours){
                        string1.append(Integer.toString(gArray[i][j]));
                        string1.append(" ");
                    }
                }
            }
            if(string1.length()>0){
                string1 = new StringBuilder(string1.substring(0, string1.length() - 1));
                string1.append(", ").append(i + 1).append(": ");
            }
        }


        return string1.toString();
    }//end showSchedule


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
}