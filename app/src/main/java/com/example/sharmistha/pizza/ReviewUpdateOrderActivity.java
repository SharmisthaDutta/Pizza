package com.example.sharmistha.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReviewUpdateOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_update_order);

        Button place_order_button = (Button) findViewById(R.id.place_order);


        //when click on place order button confirmation order page is displayed
        place_order_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),PlacedOrderDialogActivity.class);
                startActivity(intent);
            }
        });
    }
}
