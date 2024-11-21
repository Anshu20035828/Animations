package digi.coders.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.lang.annotation.Annotation;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        // translate

        Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation);

        //rotate
        Animation rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation_rotate);
        //scalte
        Animation scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
        // alpha
        Animation alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //text.startAnimation(animation);

                text.startAnimation(scale);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               // text.startAnimation(rotate);

                text.startAnimation(alpha);
            }
        });


    }
}