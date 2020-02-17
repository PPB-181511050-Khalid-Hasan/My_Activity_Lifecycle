package com.example.myactivitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("lifecycle","onCreate invoke");
        Toast.makeText(this,"onCreate invoke", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle","onStart invoke");
        Toast.makeText(this,"onStart invoke", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("lifecycle", "onPause invoke");
        Toast.makeText(this,"oPause invoke", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle","onStop invoke");
        Toast.makeText(this,"onStop invoke", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("lifecycle","onRestart invoke");
        Toast.makeText(this,"onRestart invoke", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoke");
        Toast.makeText(this,"onDestroy invoke", Toast.LENGTH_SHORT).show();
    }

}
