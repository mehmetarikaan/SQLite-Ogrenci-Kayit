package com.mehmetarikan.ogrencikayitsistemi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Listele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listele);


        TextView tv = findViewById(R.id.tv);
        Veritabani db = new Veritabani(getApplicationContext());
        List<Ogrenci> ogrenciList = new ArrayList<Ogrenci>();
        ogrenciList = db.TumKayitlariGetir();

        StringBuilder stringBuilder = new StringBuilder();

        for(Ogrenci ogrenci:ogrenciList){

            stringBuilder.append(ogrenci.getAdSoyad()+"\n"+ogrenci.getMail()+"\n"+ogrenci.getAdres()+"\n\n");

        }

        tv.setText(stringBuilder);

            }
        }
