package com.company.uzd5;

public class Main {
    public static void main(String[] args) {
        Superpair<Double, Double, Integer> one = new Superpair<>(1.0,2.0,3);
        System.out.println(one);
    }
}
/*Sukurkite klasę SuperPair su trimis generic tipais taip, kad trečiasis tipas galėtų būti tik koks nors
Number skaičius. Pirmieji du tipai gali būti bet kokie. Klasė SuperPair turi turėti kontruktorių su
trimis parametrais. Sukurkite kelis tokių porų objektus. Pabandykite trečią parametrą paduoti ne
skaičių*/