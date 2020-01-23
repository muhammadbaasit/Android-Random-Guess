package com.example.ex6_random_guess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randnum;
    int guessint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        guessint=rand.nextInt(20)+1;

    }

   /* public void guessMethod(String string){
        Toast.makeText(MainActivity.this,string,Toast.LENGTH_LONG).show();
    }*/

    public void guessClick(View view) {

        EditText editText=findViewById(R.id.editText);
        randnum=Integer.parseInt(editText.getText().toString());

        if(guessint>randnum){
            Toast.makeText(MainActivity.this,"Lower!",Toast.LENGTH_LONG).show();
        }
        else if(guessint<randnum){
            Toast.makeText(MainActivity.this,"Greater!",Toast.LENGTH_LONG).show();
        }
        else{

            Toast.makeText(MainActivity.this,"Thats Right, Try again",Toast.LENGTH_LONG).show();
            Random rand=new Random();
            guessint=rand.nextInt(20)+1;
        }

    }
}
