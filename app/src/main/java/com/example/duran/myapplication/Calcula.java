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
}
