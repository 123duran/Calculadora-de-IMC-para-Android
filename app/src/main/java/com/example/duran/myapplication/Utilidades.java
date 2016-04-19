package com.example.duran.myapplication;

import java.text.DecimalFormat;

/**
 * Created by Duran on 19/04/2016.
 */
public class Utilidades {

        DecimalFormat df = new DecimalFormat("#.##");

    public String formatarDoubleDuasCasas(double value){

        return  df.format(value);
    }


}
