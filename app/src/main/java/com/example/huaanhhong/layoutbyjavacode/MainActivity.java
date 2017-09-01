package com.example.huaanhhong.layoutbyjavacode;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        RelativeLayout myLayout= new RelativeLayout(this);
        Button myButton=new Button(this);

        myButton.setText("Click Here");
        myButton.setBackgroundColor(Color.BLUE);
        myLayout.setBackgroundColor(Color.BLACK);

        RelativeLayout.LayoutParams buttonDetails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        myLayout.addView(myButton,buttonDetails);

        EditText username=new EditText(this);
        myButton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams usernameDeatails= new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        usernameDeatails.addRule(RelativeLayout.ABOVE,myButton.getId());
        usernameDeatails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        usernameDeatails.setMargins(0,0,0,50);
        Resources r=getResources();
        int x=(int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());
        username.setWidth(x);
        myLayout.addView(username,usernameDeatails);

        setContentView(myLayout);

    }
}
