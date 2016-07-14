package com.example.sharmistha.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlacedOrderDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed_order_dialog);

        Button go_back_pizza_menu_button = (Button) findViewById(R.id.place_order);


        // Allows the user to start a new order may not be necessary

        // TODO: How to exit the application gracefully
        go_back_pizza_menu_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),PizzaAndDrinkMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
