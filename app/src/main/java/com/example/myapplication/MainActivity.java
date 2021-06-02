package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    double result = 0;
    public void fen(View view)
    {
        String str;
        TextView txt= findViewById(R.id.dd);
        EditText kolvo6 = findViewById(R.id.editTextTextMultiLine); //количество монет
        result =  Double.valueOf(String.valueOf(kolvo6.getText()))*22.2;//количество рублей
        str = String.valueOf(result); //результат переводим в строку
        txt.setText(str); //пишем результат
    }

    public void itibuban(View view)
    {
        String str = "";
        TextView txt= findViewById(R.id.dd);
        EditText kolvo7 = findViewById(R.id.editTextTextMultiLine); //количество монет
        result =  Double.valueOf(String.valueOf(kolvo7.getText()))*2812.5; //количество рублей
        str = String.valueOf(result); //результат переводим в строку
        txt.setText(str); //пишем результат
    }

    public void soldo(View view)
    {
        String str = "";
        TextView txt= findViewById(R.id.dd);
        EditText kolvo8 = findViewById(R.id.editTextTextMultiLine); //количество монет
        result =  Double.valueOf(String.valueOf(kolvo8.getText()))*19.56; //количество рублей
        str = String.valueOf(result); //результат переводим в строку
        txt.setText(str); //пишем результат
    }

    public void dublon(View view)
    {
        String str = "";
        TextView txt= findViewById(R.id.dd);
        EditText kolvo9 = findViewById(R.id.editTextTextMultiLine); //количество монет
        result =  Double.valueOf(String.valueOf(kolvo9.getText()))*6134.4; //количество рублей
        str = String.valueOf(result); //результат переводим в строку
        txt.setText(str); //пишем результат
    }

    public void taler(View view)
    {
        String str = "";
        TextView txt= findViewById(R.id.dd);
        EditText kolvo10 = findViewById(R.id.editTextTextMultiLine); //количество монет
        result =  Double.valueOf(String.valueOf(kolvo10.getText()))*1458; //количество рублей
        str = String.valueOf(result); //результат переводим в строку
        txt.setText(str); //пишем результат
    }












}