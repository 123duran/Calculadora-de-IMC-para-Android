package com.example.duran.myapplication;

/**
 * Created by Duran on 19/04/2016.
 */
public class Calcula {

    double IMC(double altura, double peso){

        double retorno= 0;

        altura = altura * altura;
        retorno = peso / altura;
        return retorno;

    }

    String classificaIMC(double resultado){

        String retorno = "";
        if (resultado <17){

            retorno = "Muito Abaixo do Peso";

        }
        else if (resultado > 17 && resultado < 18.49){

            retorno = "Abaixo do Peso";
        }
        else if (resultado >18.49 && resultado < 24.99){

            retorno = "Peso Normal";
        }

        else if (resultado > 24.99 && resultado < 29.99 ){

            retorno = "Acima do Peso";
        }
        else if (resultado > 29.99 && resultado < 34.99){

            retorno = "Obesidade I";
        }

        else if(resultado > 34.99 && resultado < 39.99){

            retorno = "Obesidade II (Severa)";
        }

        else if (resultado > 39.99){

            retorno ="Obesidade III (Mórbida";
        }

        return  retorno;

    }

}
