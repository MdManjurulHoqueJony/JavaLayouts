package com.wordpress.jonyonandroidcraftsmanship.javalayouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Main4Activity extends Activity {

    private ImageView iv1,iv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        initialize();
    }

    private void initialize() {
        iv1= (ImageView) findViewById(R.id.iv1);
        iv2= (ImageView) findViewById(R.id.iv2);
    }

    public void changePicture(View view) {
        if (iv1.getVisibility()==View.VISIBLE){
            iv1.setVisibility(View.INVISIBLE);
            iv2.setVisibility(View.VISIBLE);
        }else{
            iv2.setVisibility(View.INVISIBLE);
            iv1.setVisibility(View.VISIBLE);
        }
    }
}
