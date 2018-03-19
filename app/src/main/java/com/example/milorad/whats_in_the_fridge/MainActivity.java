package com.example.milorad.whats_in_the_fridge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import com.example.milorad.whats_in_the_fridge.buttons.Ingredient;
import com.example.milorad.whats_in_the_fridge.buttons.IngredientSelectionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected ArrayList<Ingredient> ingredients;
    protected LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.ingredient_container);
        ingredients = new ArrayList<Ingredient>();

        ingredients.add(new Ingredient("Cabbage"));
        ingredients.add(new Ingredient("Pumpkin"));
        ingredients.add(new Ingredient("Broccoli"));

        fillSegmentFromList(ingredients);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void fillSegmentFromList(ArrayList<Ingredient> list){
        for (int i = 0; i < list.size(); i++){
            IngredientSelectionButton button = new IngredientSelectionButton(this, list.get(i));
            if (i == 0) resetButtonMargins(button);

            container.addView(button);
        }
    }



    private void resetButtonMargins(IngredientSelectionButton button){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(button.getLayoutParams());
        params.setMargins(0,0,0,0);
        button.setLayoutParams(params);
    }
}


