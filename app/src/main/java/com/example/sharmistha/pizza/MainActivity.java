package com.example.sharmistha.pizza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring button variables to launch other activities upon clicking
        Button pizza_button = (Button) findViewById(R.id.Pizzabutton);
        Button drink_button = (Button) findViewById(R.id.Drinkbutton);
        Button help_button = (Button) findViewById(R.id.help_button);


        //when click on drink_button occurs load the second screen
        drink_button.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
        Intent intent =new Intent(getApplicationContext(),DrinkActivity.class);
        startActivity(intent);
        }
        });
        //when click on pizza_button occurs load the second screen
        pizza_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),PizzaActivity.class);
                startActivity(intent);
            }
        });
        //when click on help_button occurs load the second screen
        help_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent =new Intent(getApplicationContext(),HelpActivity.class);
                startActivity(intent);
            }
        });
    }
}
