package com.example.lenovo.androiddasar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnsatu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(MainActivity.this, "On Create", Toast.LENGTH_SHORT).show();
        Log.d("Riwayat", "On Create");

        setContentView(R.layout.activity_main);
        btnsatu = (Button) findViewById(R.id.btnpertama);

        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotampill = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(gotampill);
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "On Stop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "OnPause", Toast.LENGTH_SHORT).show();
        Log.d("Riwayat","On Pause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "On Resume", Toast.LENGTH_SHORT).show();
        Log.d("Riwayat", "On resume");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "On Destroy", Toast.LENGTH_SHORT).show();
        Log.d("Riwayat", "On Destroy");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_SHORT).show();
        Log.d("Riwayat", "On Start");   
    }
}
