package com.company.uzd5;

public class Superpair<T0, T1, T2 extends Number> {
    private T0 t0;
    private T1 t1;
    private T2 t2;

    public Superpair(T0 t0, T1 t1, T2 t2) {
        this.t0 = t0;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T0 getT0() {
        return t0;
    }

    public void setT0(T0 t0) {
        this.t0 = t0;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
}
/*Sukurkite klasę SuperPair su trimis generic tipais taip, kad trečiasis tipas galėtų būti tik koks nors
Number skaičius. Pirmieji du tipai gali būti bet kokie. Klasė SuperPair turi turėti kontruktorių su
trimis parametrais. Sukurkite kelis tokių porų objektus. Pabandykite trečią parametrą paduoti ne
skaičių*/
