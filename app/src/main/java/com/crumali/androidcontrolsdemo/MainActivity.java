package com.crumali.androidcontrolsdemo;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crumali.androidcontrolsdemo.checkbox.CheckBox;
import com.crumali.androidcontrolsdemo.progressbar.ProgressBar;
import com.crumali.androidcontrolsdemo.radiobutton.RadioButton;
import com.crumali.androidcontrolsdemo.seekbar.SeekBar;
import com.crumali.androidcontrolsdemo.spinner.Spinner;
import com.crumali.androidcontrolsdemo.textinputlayout.TextInputLayout;
import com.crumali.androidcontrolsdemo.tooglebutton.ToogleButton;

import java.sql.BatchUpdateException;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //    @BindView(R.id.btn_checkbox)
    //    private Button btn_checkbox;
    //    @BindView(R.id.btn_progressbar)
    //    private Button btn_progressbar;
    //    @BindView(R.id.btn_radiobutton)
    //    private Button btn_radiobutton;
    //    @BindView(R.id.btn_seekbar)
    //    private Button btn_seekbar;
    //    @BindView(R.id.btn_spinner)
    //    private Button btn_spinner;
    //    @BindView(R.id.btn_textinputlayout)
    //    private Button btn_textinputlayout;
    //    @BindView(R.id.btn_togglebutton)
    //    private Button btn_tooglebutton;

    private Button btn_checkbox, btn_progressbar, btn_radiobutton, btn_seekbar, btn_spinner, btn_textinputlayout, btn_tooglebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        controls();


    }

    private void init() {
        btn_checkbox = (Button) findViewById(R.id.btn_checkbox);
        btn_tooglebutton = (Button) findViewById(R.id.btn_togglebutton);
        btn_textinputlayout = (Button) findViewById(R.id.btn_textinputlayout);
        btn_spinner = (Button) findViewById(R.id.btn_spinner);
        btn_seekbar = (Button) findViewById(R.id.btn_seekbar);
        btn_progressbar = (Button) findViewById(R.id.btn_progressbar);
        btn_radiobutton = (Button) findViewById(R.id.btn_radiobutton);
    }

    private void controls() {
        btn_checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                Intent intent = new Intent(MainActivity.this, CheckBox.class);
                //                startActivity(intent);
                startActivity(new Intent(MainActivity.this, CheckBox.class));
            }
        });

        btn_progressbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProgressBar.class));
            }
        });

        btn_radiobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RadioButton.class));
            }
        });

        btn_seekbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SeekBar.class));
            }
        });

        btn_spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Spinner.class));
            }
        });

        btn_textinputlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TextInputLayout.class));
            }
        });

        btn_tooglebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ToogleButton.class));
            }
        });
    }
}
