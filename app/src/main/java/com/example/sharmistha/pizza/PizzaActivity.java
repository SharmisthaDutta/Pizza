package com.example.sharmistha.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        Button confirm_order_button = (Button) findViewById(R.id.confirm_order_button);
        Button pizza_drink_menu_button = (Button) findViewById(R.id.pizza_drink_menu_button);

        //when click on confirm order button review update order page is displayed
        confirm_order_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),ReviewUpdateOrderActivity.class);
                startActivity(intent);
            }
        });
        //when click on add order button pizza and drink page should be shown again with previous entries
        // erased and previous entered data should be stored in db
        pizza_drink_menu_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
