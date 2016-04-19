package com.example.duran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.*;
import android.view.*;
import android.app.*;

import java.text.DecimalFormat;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    EditText edAltura, edPeso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    double altura = 0;
    double peso = 0;
    double resultado = 0;
    String teste = "";



   public void  acao(View view){
    edAltura = (EditText)findViewById(R.id.edAltura);
    edPeso   = (EditText)findViewById(R.id.edPeso);
    altura = Double.parseDouble(edAltura.getText().toString());
//  teste = edAltura.getText().toString();
     peso   = Double.parseDouble(edPeso.getText().toString());
       Calcula calcula = new Calcula();
      resultado = calcula.IMC(altura ,peso);
      Utilidades util = new Utilidades();
      teste =  util.formatarDoubleDuasCasas(resultado);
      Toast.makeText(getApplicationContext(),"Seu imc é: "+ teste, Toast.LENGTH_SHORT).show();
       Toast.makeText(getApplicationContext(),calcula.classificaIMC(resultado),Toast.LENGTH_LONG).show();
    }
}
