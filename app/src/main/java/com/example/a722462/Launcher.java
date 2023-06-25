 package com.example.a722462;

 import android.content.Intent;
 import android.content.SharedPreferences;
 import android.os.Bundle;
 import android.os.Handler;
 import android.preference.PreferenceManager;

 import androidx.appcompat.app.AppCompatActivity;

 public class Launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(Launcher.this);
                if (sharedPref.contains("token")){
                    Intent main = new Intent(Launcher.this, PasswordApp.class);
                    startActivity(main);
                    finish();
                } else {
                    Intent onBoard = new Intent(Launcher.this, Activity.class);
                    startActivity(onBoard);
                    finish();
                }
            }
        }, 3000);
    }
}