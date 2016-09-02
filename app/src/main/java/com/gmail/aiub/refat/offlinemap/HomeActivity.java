package com.gmail.aiub.refat.offlinemap;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends Activity {

    Button btn_mapPosition,btn_attendance,btn_report,btn_notes,btn_emergencyAttendance,btn_dataSync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initializeWidget();
    }

    private void initializeWidget()
    {
        btn_mapPosition =(Button)findViewById(R.id.btn_mapPosition);
        btn_attendance = (Button)findViewById(R.id.btn_attendance);
        btn_report =(Button)findViewById(R.id.btn_report);
        btn_notes =(Button)findViewById(R.id.btn_notes);
        btn_emergencyAttendance =(Button)findViewById(R.id.btn_emergencyAttendance);
        btn_dataSync =(Button)findViewById(R.id.btn_dataSync);
    }

    
}
