package com.example.a451lb.agung_1202152179_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this, pilihmenu.class));
                Toast.makeText(splash.this, "JIMLY ASSHIDDIQY_1202150091", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, 2000);
    }
}
