package com.example.adibf.adibfakhrimuhtadi_1202154192_m2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {


    private static int waktuSplash = 3000; //lama waktu tunggu sampai splash screen selesai

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(main);

                this.finish();
            }

            private void finish(){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context, R.string.toast, Toast.LENGTH_LONG );

                toast.show();
            }
        }, waktuSplash);
    };
}
