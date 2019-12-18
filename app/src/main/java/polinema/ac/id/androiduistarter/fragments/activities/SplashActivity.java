package polinema.ac.id.androiduistarter.fragments.activities;

import androidx.appcompat.app.AppCompatActivity;
import polinema.ac.id.androiduistarter.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, WelcomeAcitivty.class));
                finish();
            }
        },5000);
    }
}