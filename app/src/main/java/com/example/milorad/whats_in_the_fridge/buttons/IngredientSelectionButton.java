package com.example.milorad.whats_in_the_fridge.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.widget.AppCompatButton;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.milorad.whats_in_the_fridge.R;

/**
 * Created by Milorad on 3/19/2018.
 */

public class IngredientSelectionButton extends AppCompatButton {

    private static int WIDTH_DP = 150;
    private static int HEIGHT_DP = 75;
    private static int TEXT_SIZE = 22;
    private static int TEXT_COLOR_ID = R.color.colorWhiteText;
    private static int BACKGROUND_ID = R.drawable.ingredient_icon_background;

    private static Context context;

    private Ingredient ingredient;

    public IngredientSelectionButton(Context context, Ingredient ingredient){
        super(context);
        this.context = context;
        this.ingredient = ingredient;
        setUpButtonProperties();
    }

    private void setUpButtonProperties(){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, WIDTH_DP, getResources().getDisplayMetrics()),
                (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, HEIGHT_DP, getResources().getDisplayMetrics())
        );
        params.setMargins(10,0,0,0);

        Typeface typeface = ResourcesCompat.getFont(context, R.font.apple_storm_font);

        setText(ingredient.getName());
        setTextSize(TEXT_SIZE);
        setTypeface(typeface);
        setTextColor(getResources().getColor(TEXT_COLOR_ID));
        setBackground(getResources().getDrawable(BACKGROUND_ID));
        setLayoutParams(params);
    }

}
