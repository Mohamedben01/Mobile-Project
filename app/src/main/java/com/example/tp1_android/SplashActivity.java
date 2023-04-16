package com.example.tp1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    TextView welcome,name;
    private static int splash_timeout = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        welcome=findViewById(R.id.textView1);
        name=findViewById(R.id.textView2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, splash_timeout);
        Animation myAnimation1 = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.animation2);
        welcome.startAnimation(myAnimation1);

        Animation myAnimation2 = AnimationUtils.loadAnimation(SplashActivity.this,R.anim.animation1);
        name.startAnimation(myAnimation2);
    }
}