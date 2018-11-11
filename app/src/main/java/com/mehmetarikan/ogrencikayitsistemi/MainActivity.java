package com.mehmetarikan.ogrencikayitsistemi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_adsoyad,et_mail,et_adres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_adsoyad = findViewById(R.id.et_adsoyad);
        et_mail = findViewById(R.id.et_mail);
        et_adres = findViewById(R.id.et_adres);

    }
    public void butonaDokunuldu(View view){
        switch (view.getId()){
            case R.id.btn_kaydet:
            String adsoyad = et_adsoyad.getText().toString();
            String mail = et_mail.getText().toString();
            String adres = et_adres.getText().toString();
            break;
            case R.id.btn_listele:
            break;
        }
    }

}
