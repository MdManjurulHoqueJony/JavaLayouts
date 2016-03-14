package com.wordpress.jonyonandroidcraftsmanship.javalayouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout ll;
    private TextView tv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
        setProperties();
        addViews();
        setContentView(ll);
    }

    private void initialize() {
        ll = new LinearLayout(this);
        tv = new TextView(this);
        btn = new Button(this);
    }

    private void setProperties() {
        LinearLayout.LayoutParams dimensionsViewGroup = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams dimensionsView = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        ll.setLayoutParams(dimensionsViewGroup);
        ll.setOrientation(LinearLayout.VERTICAL);
        tv.setLayoutParams(dimensionsView);
        tv.setText("Don't Disturb !");
        btn.setLayoutParams(dimensionsView);
        btn.setText("Don't Click");
    }

    private void addViews() {
        ll.addView(tv);
        ll.addView(btn);
    }

}
