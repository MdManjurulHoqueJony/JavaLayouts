package com.wordpress.jonyonandroidcraftsmanship.javalayouts;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main2Activity extends Activity {

    private RelativeLayout rl;
    private TextView tv1, tv2, tv3;
    private EditText et1, et2;
    private Button btn;
    private RelativeLayout.LayoutParams dimensionsTV1, dimensionsTV2, dimensionsET1, dimensionsTV3, dimensionsET2, dimensionsBTN;
    private static final int ID1 = 1, ID2 = 2, ID3 = 3, ID4 = 4, ID5 = 5, ID6 = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
        setProperties();
        addViews();
        setContentView(rl);
    }

    private void initialize() {
        rl = new RelativeLayout(this);
        tv1 = new TextView(this);
        tv2 = new TextView(this);
        tv3 = new TextView(this);
        et1 = new EditText(this);
        et2 = new EditText(this);
        btn = new Button(this);
    }

    private void setProperties() {
        RelativeLayout.LayoutParams dimensionsViewGroup = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT);
        rl.setLayoutParams(dimensionsViewGroup);

        createTV1();
        createTV2();
        createET1();
        createTV3();
        createET2();
        createBTN();
    }

    private void createTV1() {
        dimensionsTV1 = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        tv1.setLayoutParams(dimensionsTV1);
        tv1.setText("Please Login First");
        tv1.setId(ID1);
        dimensionsTV1.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
    }

    private void createTV2() {
        dimensionsTV2 = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        tv2.setLayoutParams(dimensionsTV1);
        tv2.setText("User Name");
        tv2.setId(ID2);
        dimensionsTV2.addRule(RelativeLayout.BELOW, ID1);
        dimensionsTV2.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
    }

    private void createET1() {
        dimensionsET1 = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        et1.setLayoutParams(dimensionsET1);
        et1.setId(ID3);
        dimensionsET1.addRule(RelativeLayout.BELOW, ID1);
        dimensionsET1.addRule(RelativeLayout.RIGHT_OF, ID2);
        dimensionsET1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        dimensionsET1.addRule(RelativeLayout.ALIGN_BASELINE, ID2);

    }

    private void createTV3() {
        dimensionsTV3 = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        tv3.setLayoutParams(dimensionsTV3);
        tv3.setText("Password");
        tv3.setId(ID4);
        dimensionsTV3.addRule(RelativeLayout.BELOW, ID3);
        dimensionsTV3.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
    }

    private void createET2() {
        dimensionsET2 = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        et2.setLayoutParams(dimensionsET2);
        et2.setId(ID5);
        dimensionsET2.addRule(RelativeLayout.BELOW, ID3);
        dimensionsET2.addRule(RelativeLayout.RIGHT_OF, ID4);
        dimensionsET2.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        dimensionsET2.addRule(RelativeLayout.ALIGN_BASELINE, ID4);

    }

    private void createBTN() {
        dimensionsBTN = new
                RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn.setLayoutParams(dimensionsBTN);
        btn.setId(ID6);
        btn.setText("Login");
        dimensionsBTN.addRule(RelativeLayout.BELOW, ID5);
        dimensionsBTN.addRule(RelativeLayout.ALIGN_RIGHT, ID5);
    }

    private void addViews() {
        rl.addView(tv1, dimensionsTV1);
        rl.addView(tv2, dimensionsTV2);
        rl.addView(tv3, dimensionsTV3);
        rl.addView(et1, dimensionsET1);
        rl.addView(et2, dimensionsET2);
        rl.addView(btn, dimensionsBTN);
    }

}
