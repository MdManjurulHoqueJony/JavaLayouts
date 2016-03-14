package com.wordpress.jonyonandroidcraftsmanship.javalayouts;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends Activity {

    private TextView tvCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        initialize();
    }

    private void initialize() {
        tvCustom= (TextView) findViewById(R.id.tvCustom);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/zeroesthree.ttf");
        tvCustom.setTypeface(myCustomFont);
    }

}
