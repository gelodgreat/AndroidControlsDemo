package com.crumali.androidcontrolsdemo.spinner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import com.crumali.androidcontrolsdemo.R;

public class Spinner extends AppCompatActivity {

    private TextView sp_tv_res;
    private android.widget.Spinner sp_oslist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        sp_tv_res = (TextView) findViewById(R.id.sp_tv_res);
        sp_oslist = (android.widget.Spinner) findViewById(R.id.sp_spinner);

        sp_oslist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String val;
                val = sp_oslist.getSelectedItem().toString();
                sp_tv_res.setText(val);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
