package com.example.sharmistha.pizza.data;

import com.example.sharmistha.pizza.R;

import java.util.HashMap;
import java.util.Map;

public class Drink implements Buyable {

    public enum Size {Small, Medium, Large}

    public enum Flavor {
        Coke("Coke"), SevenUp("7-Up"), OrangeCola("Orange Cola"), CherryCola("Cherry Cola");
        private final String id;

        private Flavor(String identifier) {
            this.id = identifier;
        }

        public String toString() {
            return id;
        }
    }

    static Map<Size, Float> sizePrices = new HashMap<>();
    Size selectedSize = Size.Medium;
    Flavor selectedFlavor = Flavor.Coke;

    static {
        sizePrices.put(Size.Small, 2.0f);
        sizePrices.put(Size.Medium, 3.0f);
        sizePrices.put(Size.Large, 4.0f);
    }

    public Drink(Size size, Flavor flavor) {
        selectedSize = size;
        selectedFlavor = flavor;
    }

    @Override
    public String name() {
        return "Drink (" + selectedFlavor + ")";
    }

    @Override
    public int icon() {
        return R.drawable.soda;
    }

    @Override
    public float price() {
        return sizePrices.get(selectedSize);
    }
}
