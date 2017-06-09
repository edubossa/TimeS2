package com.ews.times2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {

    public static final int SPLASH_DISPLAY_LENGTH = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        loadSplashLogo();
    }

    private void loadSplashLogo() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.animacao_splash);
        animation.reset();

        ImageView imageView = (ImageView) findViewById(R.id.splash);
        imageView.clearAnimation();
        imageView.startAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Após o tempo definido irá executar a próxima tela
                Intent intent = new Intent(SplashScreenActivity.this, MenuActivity.class);

                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

                //Retira a Activity da pilha quando clicar no botao voltar
                SplashScreenActivity.this.finish();

            }

        }, SPLASH_DISPLAY_LENGTH);

    }

}
