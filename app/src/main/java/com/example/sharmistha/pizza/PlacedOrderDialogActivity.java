package com.example.sharmistha.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class PlacedOrderDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        //generate a 4 digit integer 1000 <10000
        int orderNo = (int)(Math.random()*9000)+1000;
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        tv.setText("Your order has been placed and Order  Number is : " + orderNo+"\n Your order will be delivered on "+currentDateTimeString);

        tv.setTextSize(40);
        setContentView(tv);
        //setContentView(R.layout.activity_placed_order_dialog);




    }
}
