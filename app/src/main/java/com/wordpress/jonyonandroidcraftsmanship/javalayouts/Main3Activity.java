package com.wordpress.jonyonandroidcraftsmanship.javalayouts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Main3Activity extends Activity {

    private CheckBox chk;
    private Switch sw;
    private ToggleButton tb;
    private RelativeLayout rl;
    private EditText et;
    private MyCheckedChangeListener myCheckedChangeListener;
    private MyTextWatcher myTextWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initialize();
        setListeners();
    }

    private void initialize() {
        chk= (CheckBox) findViewById(R.id.chk);
        sw= (Switch) findViewById(R.id.sw);
        tb= (ToggleButton) findViewById(R.id.tb);
        rl= (RelativeLayout) findViewById(R.id.rl);
        et= (EditText) findViewById(R.id.et);
        myCheckedChangeListener=new MyCheckedChangeListener();
        myTextWatcher=new MyTextWatcher();
    }

    private void setListeners() {
        chk.setOnCheckedChangeListener(myCheckedChangeListener);
        sw.setOnCheckedChangeListener(myCheckedChangeListener);
        tb.setOnCheckedChangeListener(myCheckedChangeListener);
        et.addTextChangedListener(myTextWatcher);
    }

    private class MyCheckedChangeListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()){
                case R.id.chk:
                    if (isChecked){
                        Logger.toast(Main3Activity.this,"Checked");
                    }else{
                        Logger.toast(Main3Activity.this,"UnChecked");
                    }
                    break;
                case R.id.sw:
                    if (isChecked){
                        Logger.toast(Main3Activity.this,"Checked");
                    }else{
                        Logger.toast(Main3Activity.this,"UnChecked");
                    }
                    break;
                case R.id.tb:
                    if (isChecked){
                        rl.setBackgroundColor(Color.BLACK);
                    }else{
                        rl.setBackgroundColor(Color.WHITE);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    private class MyTextWatcher implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            int number=0;
            try {
                number= Integer.parseInt(s.toString());
            } catch (NumberFormatException e) {
            }

            if (number>100){
                s.replace(0,s.length(),"100");
            }
        }
    }
}