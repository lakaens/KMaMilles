package com.example.ericnds.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final float MILLES_PER_KM = 0.621371f;

    public static final float KM_PER_MILLES = 1.60934f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickMilles(View view) {
        EditText edit_km=findViewById(R.id.edit_km);
        EditText edit_milles=findViewById(R.id.edit_milles);
        String skm=edit_km.getText().toString();
        if(!skm.equals("")) {
            float km = Float.valueOf(skm);
            float milles = km * MILLES_PER_KM;
            String smilles = Float.toString(milles);
            edit_milles.setText(smilles);
        }
    }


    public void OnClickKm(View view) {
        EditText edit_milles=findViewById(R.id.edit_milles);
        EditText edit_km=findViewById(R.id.edit_km);
        String smilles=edit_milles.getText().toString();
        if(!smilles.isEmpty()) {
            float milles = Float.valueOf(smilles);
            float km = milles * KM_PER_MILLES;
            String skm = Float.toString(km);
            edit_km.setText(skm);
        }
    }
}
