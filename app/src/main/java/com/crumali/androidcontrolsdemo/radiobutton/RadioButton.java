package com.crumali.androidcontrolsdemo.radiobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.crumali.androidcontrolsdemo.R;

public class RadioButton extends AppCompatActivity {

    private TextView rb_tv_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        rb_tv_res = (TextView) findViewById(R.id.rb_tv_res);
    }

    public void radiobtnclick(View view) {
        boolean checked = ((android.widget.RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.rb_a:
                if (checked) {
                    rb_tv_res.setText("Android");
                }
                break;
            case R.id.rb_b:
                if (checked) {
                    rb_tv_res.setText("iOS");
                }
                break;
            case R.id.rb_c:
                if (checked) {
                    rb_tv_res.setText("Windows Phone");
                }
                break;
        }
    }

}
