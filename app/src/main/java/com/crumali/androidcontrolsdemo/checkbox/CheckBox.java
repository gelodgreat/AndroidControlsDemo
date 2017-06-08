package com.crumali.androidcontrolsdemo.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.crumali.androidcontrolsdemo.R;

import java.util.ArrayList;

public class CheckBox extends AppCompatActivity {

    ArrayList<String> oslist = new ArrayList<String>();
    private TextView cb_tv_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb_tv_res = (TextView) findViewById(R.id.cb_tv_result);

    }

    public void cbcontrols(View view) {

        boolean checked = ((android.widget.CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cb_a:
                if (checked) {
                    oslist.add("Android" + "\n");
                } else {
                    oslist.remove("Android" + "\n");
                }
                output();
                break;
            case R.id.cb_b:
                if (checked) {
                    oslist.add("iOS" + "\n");
                } else {
                    oslist.remove("iOS" + "\n");
                }
                output();
                break;
            case R.id.cb_c:
                if (checked) {
                    oslist.add("Windows Phone" + "\n");
                } else {
                    oslist.remove("Windows Phone" + "\n");
                }
                output();
                break;
        }
    }

    public void output() {
        String out = "";
        for (String outmoto : oslist) {
            out = out + outmoto + "\n";
        }
        cb_tv_res.setText(out);
    }
}
