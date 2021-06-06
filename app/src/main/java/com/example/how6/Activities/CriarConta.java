package com.example.how6.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.how6.Fragmentos.FragmentoCriarConta;
import com.example.how6.R;

public class CriarConta extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        /**
         * Recebe o fragmento de Criar conta
        **/
        getSupportFragmentManager().beginTransaction()
                .add(R.id.LayoutApp,new FragmentoCriarConta())
                .commit();
    }
}