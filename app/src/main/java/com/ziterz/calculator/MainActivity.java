package com.ziterz.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Double nilai1,nilai2;
    int operator;
    TextView hasilText;
    Button nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, bagi, kali, tambah, kurang, hasil, clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasilText = (TextView) findViewById(R.id.view);
        nol = (Button) findViewById(R.id.buttonNol);
        satu = (Button) findViewById(R.id.buttonSatu);
        dua = (Button) findViewById(R.id.buttonDua);
        tiga = (Button) findViewById(R.id.buttonTiga);
        empat = (Button) findViewById(R.id.buttonEmpat);
        lima = (Button) findViewById(R.id.buttonLima);
        enam = (Button) findViewById(R.id.buttonEnam);
        tujuh = (Button) findViewById(R.id.buttonTujuh);
        delapan = (Button) findViewById(R.id.buttonDelapan);
        sembilan = (Button) findViewById(R.id.butonSembilan);
        tambah = (Button) findViewById(R.id.buttonTambah);
        kurang = (Button) findViewById(R.id.buttonKurang);
        kali = (Button) findViewById(R.id.buttonKali);
        bagi = (Button) findViewById(R.id.buttonBagi);
        hasil = (Button) findViewById(R.id.buttonHitung);
        clear = (Button) findViewById(R.id.buttonClear);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("1");
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("2");
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("3");
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("4");
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("5");
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("6");
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("7");
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("8");
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("9");
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("0");
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Double.parseDouble(hasilText.getText().toString());
                hasilText.setText("+");
                operator=1;
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Double.parseDouble(hasilText.getText().toString());
                hasilText.setText("-");
                operator=2;
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Double.parseDouble(hasilText.getText().toString());
                hasilText.setText("x");
                operator=3;
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai1=Double.parseDouble(hasilText.getText().toString());
                hasilText.setText("/");
                operator=4;
            }
        });

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai2=Double.parseDouble(hasilText.getText().toString());
                if(operator==1){
                    hasilText.setText(Double.toString(nilai1+nilai2));
                }else if(operator==2){
                    hasilText.setText(Double.toString(nilai1-nilai2));
                }else if(operator==3){
                    hasilText.setText(Double.toString(nilai1*nilai2));
                }else if(operator==4){
                    hasilText.setText(Double.toString(nilai1/nilai2));
                }
            }
        });

    }
}
