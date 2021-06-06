package com.example.how6.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.how6.R;

public class MainActivity extends AppCompatActivity {

    // Cria os botões que serão utilizados para chamar outras activities
    private Button butCriarA, butEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recebem o id do botão gerado no XML
        butCriarA = findViewById(R.id.butCreate);
        butEntrar= findViewById(R.id.butLogin);

        //Função chamada ao clicar no botão de criar conta
        butCriarA.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v)
                {
                    CriarActivity();
                }
        });

        //Função chamada ao clicar no botão de Entrar
        butEntrar.setOnClickListener(new View.OnClickListener()
        {
           @Override
              public void onClick(View v)
            {
                EntrarActivity();
            }
        });

    }
        /**
         * Funções utilizadas para iniciar uma segunda Activity
        **/
        private void EntrarActivity() {
            startActivity(new Intent(MainActivity.this, TelaPrincipal.class));
        }

        private void CriarActivity()
        {
            startActivity(new Intent(MainActivity.this, CriarConta.class));
        }
}