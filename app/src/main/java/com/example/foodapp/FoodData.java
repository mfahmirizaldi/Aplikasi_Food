package com.example.foodapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Cappuchino", "Cappuchino is an espresso-based coffee drink that originated in Italy, and is prepared with steamed milk foam", "Rp. 10000", context.getDrawable(R.drawable.cappuchino)));
        list.add(new Food("Coffee", "Coffee is a brewed drink prepared from roasted coffee beans, the seeds of berries from certain Coffea species.", "Rp. 10000", context.getDrawable(R.drawable.kopi_hitam)));
        list.add(new Food("Sparkling Tea", "Sparkling teas are essentially a mix of soda and tea, a cold, carbonated version of the healthy classic—and health experts love them.", "Rp. 10000", context.getDrawable(R.drawable.sparkling_tea)));
        list.add(new Food("Cheesecake", "Cheesecake is a sweet dessert consisting of one or more layers.", "Rp. 10000", context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Donut", "A doughnut or donut is a type of leavened fried dough.", "Rp. 10000", context.getDrawable(R.drawable.donut)));
        list.add(new Food("Batagor", "Batagor is a Sundanese dish from Indonesia, and popular in Southeast Asia, consisting of fried fish dumplings, usually served with peanut sauce.", "Rp. 10000", context.getDrawable(R.drawable.batagor)));
        list.add(new Food("Black Salad", "Why black salad? Because there is charcoal that has a good function for our bodies, including preventing bloating and lowering cholesterol.", "Rp.10000", context.getDrawable(R.drawable.black_salad)));
        list.add(new Food("Cireng", "Cireng is one of the culinary delights from Bandung that is liked by many people.", "Rp. 10000", context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Mie Goreng", "Mie goreng, also known as bakmi goreng, is an Indonesian style of stir fried noodle dish.", "Rp. 10000", context.getDrawable(R.drawable.mie_goreng)));
        list.add(new Food("Nasi Goreng", "Nasi goreng is a Southeast Asian fried rice dish, usually cooked with pieces of meat and vegetables.", "Rp. 10000", context.getDrawable(R.drawable.nasigoreng)));


        return list;
    }
}