package com.company.uzd1;
/*Turime du masyvus - viename skaičiaus tipo elementai { 1, 2, 3 } , kitame eilutės tipo
elementai {"Hello", "World"} .
Užduotis: parašyti vieną metodą printArray , kuris gali atspausdinti visus abiejų turimų masyvų
elementus. Metodas turi priimti ir masyvą su skaičiais, ir masyvą su eilutėmis.
Tikėtinas rezultatas:*/
public class Main {
    public static void main(String[] args) {
        Integer[] var = {1,2,3};
        String[] var1 =  {"Hello", "World"};
        Object[] var2 =  {"Hub", "Space"};
        Printer.print(var);
        System.out.println();
        Printer.print(var1);
        System.out.println();
        Printer.print(var2);
    }
}
