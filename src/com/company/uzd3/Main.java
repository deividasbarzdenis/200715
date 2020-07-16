package com.company.uzd3;
/*Sukurkite klasę Pora , su klasės atributais Raktas ir Reiksme . Abu klasės atributai gali būti bet
koks objektas.
Sukurkite klasę Mapas su vienu klasės atributu sarasasPoru , kuris bus sarasas, skirtas saugoti
klasės Pora objektams. Klasė Mapas turi turėti metodą ideti , kuriam per parametrus perdavus
raktą ir reikšmę, iš jų sukonstruoja porą ir ją įdeda į map'ą. Taip pat reikalingas metodas gauti ,
kuriam per parametrą perdavus raktą, gausime reikšmę pagal tą raktą iš sąrašo.
Sukurkite klasę DnsServer , kuri turi atributus ip1 ir ip2 .
Sukurkite enum DnsProvider , kuris saugos keletą reikšmių, pvz. GOOGLE .
Atskiroje klasėje main metode sukurti map'ą, kuris saugo DnsProvider -> DnsServer poras.
Sukurti kitą map'ą, kuris saugo String -> String poras. Map'us užpildyti duomenimis ir
pabandyti gauti reikšmes pagal raktus.*/
public class Main {
    public static void main(String[] args) {
      /*  Pair<Integer, String > pair1 = new Pair<>(1, "First");
        Pair<Integer, String > pair2 = new Pair<>(1, "second");
        Pair<Integer, String > pair3 = new Pair<>(1, "First");
        Pair<Integer, String > pair4 = new Pair<>(1, "First");*/

        Map<DnsProvider, DnsServer> maps = new Map<>();
        maps.addToMap(DnsProvider.BING,new DnsServer("111","111"));
        maps.addToMap(DnsProvider.GOOGLE,new DnsServer("111","111"));
        maps.addToMap(DnsProvider.YAHOO,new DnsServer("111","111"));
        maps.addToMap(DnsProvider.GOOGLE,new DnsServer("111","111"));

        for (Pair<DnsProvider, DnsServer> pair:maps.getListOfPairs()){
            System.out.println(String.format("pair key: %s  and value %s", pair.getKey(), pair.getValue()));
        }
        System.out.println(maps.getValue(DnsProvider.GOOGLE));
    }
}
