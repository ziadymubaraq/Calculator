package com.ziterz.calculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Double nilai1,nilai2;
    int operator=0;
    TextView hasilText;
    Button nol, satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, bagi, kali, tambah, kurang, hasil, clear, delete;
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
        delete = (Button) findViewById(R.id.buttonDelete);

        hasilText.setText("0");

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasilText.setText("0");
            }
        });

        satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("1");
                }else{
                    if(operator!=0){
                        hasilText.setText("1");
                    }else{
                        hasilText.setText(hasil+"1");
                    }

                }
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("2");
                }else{
                    if(operator!=0){
                        hasilText.setText("2");
                    }else{
                        hasilText.setText(hasil+"2");
                    }
                }
            }
        });

        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("3");
                }else{
                    if(operator!=0){
                        hasilText.setText("3");
                    }else{
                        hasilText.setText(hasil+"3");
                    }
                }
            }
        });

        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("4");
                }else{
                    if(operator!=0){
                        hasilText.setText("4");
                    }else{
                        hasilText.setText(hasil+"4");
                    }
                }
            }
        });

        lima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("5");
                }else{
                    if(operator!=0){
                        hasilText.setText("5");
                    }else{
                        hasilText.setText(hasil+"5");
                    }
                }
            }
        });

        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("6");
                }else if(hasil.equals("-")) {
                    hasilText.setText("-"+hasil+"6");
                }else{
                    if(operator!=0){
                        hasilText.setText("6");
                    }else{
                        hasilText.setText(hasil+"6");
                    }
                }
            }
        });

        tujuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("7");
                }else{
                    if(operator!=0){
                        hasilText.setText("7");
                    }else{
                        hasilText.setText(hasil+"7");
                    }
                }
            }
        });

        delapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("8");
                }else{
                    if(operator!=0){
                        hasilText.setText("8");
                    }else{
                        hasilText.setText(hasil+"8");
                    }
                }
            }
        });

        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("9");
                }else{
                    if(operator!=0){
                        hasilText.setText("9");
                    }else{
                        hasilText.setText(hasil+"9");
                    }
                }
            }
        });

        nol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil = (String) hasilText.getText();
                if(hasil=="0"){
                    hasilText.setText("0");
                }else{
                    if(operator!=0){
                        hasilText.setText("0");
                    }else {
                        hasilText.setText(hasil+"0");
                    }
                }
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

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String text = (String) hasilText.getText();
                    text = text.substring(0, text.length()-1);
                    hasilText.setText(text);
                } catch (StringIndexOutOfBoundsException e){
                    e.printStackTrace();
                    hasilText.setText("0");
                }

            }
        });
        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat format = new DecimalFormat("#.##");
                format.setDecimalSeparatorAlwaysShown(false);

                try {
                    nilai2 = Double.parseDouble(hasilText.getText().toString());

                    if(operator==1){
                        hasilText.setText(String.valueOf(format.format(nilai1+nilai2)));
                    }else if(operator==2){
                        hasilText.setText(String.valueOf(format.format(nilai1-nilai2)));
                    }else if(operator==3){
                        hasilText.setText(String.valueOf(format.format(nilai1*nilai2)));
                    }else if(operator==4){
                        hasilText.setText(String.valueOf(format.format(nilai1/nilai2)));
                    }
                } catch (NumberFormatException e){
                    e.printStackTrace();
                    nilai2 = nilai1;

                    if(operator==1){
                        hasilText.setText(String.valueOf(format.format(nilai2)));
                    }else if(operator==2){
                        hasilText.setText(String.valueOf(format.format(nilai2)));
                    }else if(operator==3){
                        hasilText.setText(String.valueOf(format.format(nilai2)));
                    }else if(operator==4){
                        hasilText.setText(String.valueOf(format.format(nilai2)));
                    }
                }
                operator=0;

            }
        });

    }
}
