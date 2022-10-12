package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int num =0;
    int num2 =0;


    public void threeb (View v){
        num = num +3 ;
        display (num);
    }

    public void twob (View v){
        num = num + 2;
        display(num);
    }

    public void oneb (View v){
        num = num +1;
        display(num);
    }

    public void threea (View v){
        num2 = num2 +3 ;
        display2(num2);
    }

    public void twoa (View v){
        num2 = num2 +2 ;
        display2 (num2);
    }

    public void onea (View v){
        num2 = num2 +1 ;
        display2 (num2);
    }

public void reset (View v ){
        num =0;
        num2=0;
        display2(num2);
        display(num);
}

    public void display (int a ){

        TextView v1 = (TextView) findViewById(R.id.edi);
        v1.setText(String.valueOf(a));
    }

    public void display2 (int b){
        TextView v2 = (TextView) findViewById(R.id.edi2);
        v2.setText(String.valueOf(num2));
    }

}






