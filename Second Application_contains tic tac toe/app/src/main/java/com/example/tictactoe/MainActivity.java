package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 - x
    // 1 - o

    int activePlayer = 0;
    int[] gameState = {2 , 2 , 2 , 2 , 2 , 2 , 2 , 2 , 2};

    // State meaning :
    //    0 - x
    //    1 - 0
    //    2 - NULL
    // the above state explains the condition of the data in the array.

    // this all the position where if the player plays definitely wins.
    int[][] winPosition = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
    };

    public void playerTap(View view)    {
        ImageView img = (ImageView) view;
        int tapImageIndex = Integer.parseInt(img.getTag().toString());

        if(gameState[tapImageIndex] == 2)   {
            gameState[tapImageIndex] = activePlayer;
            img.setTranslationY(-1000f);

            if(activePlayer == 0)   {
                img.setImageResource(R.drawable.x);
                activePlayer = 1;
            }   else    {
                img.setImageResource(R.drawable.o);
                activePlayer = 0;
                }
            img.animate().translationYBy(1000f).setDuration(200);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}