package com.company.uzd2;

import com.company.uzd2.conifers.Conifers;
import com.company.uzd2.deciduous.Birch;

import java.util.List;

public class Forest {

    static void birchForest(List<Birch> birchList){
        System.out.println("Birch forest");
        for (Birch birch:birchList){
            birch.has();
        }
    }
    static void conifersForest(List<? extends Conifers> conifershList){
        System.out.println("Confers forest");
        for (Conifers conifer:conifershList){
            conifer.has();
        }
    }
    static void variuosForest(List<? extends Tree> treeList){
        System.out.println("Variuos forest");
        for (Tree tree:treeList){
            tree.has();
        }
    }

}
