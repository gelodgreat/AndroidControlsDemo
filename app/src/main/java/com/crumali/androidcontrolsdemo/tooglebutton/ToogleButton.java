package com.crumali.androidcontrolsdemo.tooglebutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.crumali.androidcontrolsdemo.R;

public class ToogleButton extends AppCompatActivity {

    private android.widget.ToggleButton toogleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        toogleButton = (android.widget.ToggleButton) findViewById(R.id.tb_on_off);

        toogleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_SHORT).show();
                } else {

                }

            }
        });
    }
}
