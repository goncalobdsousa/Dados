package devapp.upt.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int img1, img2 , img3;
    boolean won;
    int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = -1;
        img2 = -2;
        img3 = -3;
        cont = 0;
        won = false;

    }



    public void jogar(View v){
        if(!won) {
            Random random = new Random();
            int[] images = new int[7];
            int cont = 0;
            ToggleButton toggle1, toggle2, toggle3;
            Button buttonplay;
            TextView congratsText;

            congratsText = findViewById(R.id.textView);


            ImageView dice1 = (ImageView) findViewById(R.id.dice1);
            ImageView dice2 = (ImageView) findViewById(R.id.dice2);
            ImageView dice3 = (ImageView) findViewById(R.id.dice3);


            images[1] = R.drawable.f1;
            images[2] = R.drawable.f2;
            images[3] = R.drawable.f3;
            images[4] = R.drawable.f4;
            images[5] = R.drawable.f5;
            images[6] = R.drawable.f6;

            toggle1 = findViewById(R.id.toggle1);
            toggle2 = findViewById(R.id.toggle2);
            toggle3 = findViewById(R.id.toggle3);
            buttonplay = findViewById(R.id.buttonPlay);

            if (toggle1.isChecked()) {
                img1 = random.nextInt(6) + 1;
                dice1.setImageResource(images[img1]);
            }
            if (toggle2.isChecked()) {
                img2 = random.nextInt(6) + 1;
                dice2.setImageResource(images[img2]);
            }
            if (toggle3.isChecked()) {
                img3 = random.nextInt(6) + 1;
                dice3.setImageResource(images[img3]);
            }
            cont++;
            if (img1 == img2 && img1 == img3) {
                congratsText.setVisibility(View.VISIBLE);
                won = true;
            }
        }
    }
}