package com.example.android.simplemetalcalculator;


public class Metals {
    final static double ACERO_CAR = 7.85;
    final static double ACERO = 7.90;
    final static double HIERRO_FUN = 7.20;
    final static double ALUMINIO = 2.70;
    final static double MAGNESIO = 1.74;
    final static double TITANIO = 4.50;
    final static double COBRE = 8.96;
    final static double LATON = 8.45;
    final static double BRONCE = 8.20;
    final static double ZINC = 7.13;
    final static double ESTANIO= 7.29;
    final static double PLOMO = 11.34;
    private double item;

    public double density(int selectedId) {
        switch (selectedId) {
            case 0:
                item = ACERO_CAR;
                break;
            case 1:
                item = ACERO;
                break;
            case 2:
                item = HIERRO_FUN;
                break;
            case 3:
                item = ALUMINIO;
                break;
            case 4:
                item = MAGNESIO;
                break;
            case 5:
                item = TITANIO;
                break;
            case 6:
                item = COBRE;
                break;
            case 7:
                item = LATON;
                break;
            case 8:
                item = BRONCE;
                break;
            case 9:
                item = ZINC;
                break;
            case 10:
                item = ESTANIO;
                break;
            case 11:
                item = PLOMO;
                break;

        }return item;

    }
}


