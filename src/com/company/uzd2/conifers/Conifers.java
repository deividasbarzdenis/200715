package com.company.uzd2.conifers;

import com.company.uzd2.Tree;

public class Conifers implements Tree {

    @Override
    public void has() {
        System.out.println(getClass().getSimpleName() + " has has leaves");
    }
}
