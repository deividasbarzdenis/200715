package com.company.uzd2.deciduous;

import com.company.uzd2.Tree;

public class Deciduous implements Tree {
    @Override
    public void has() {
        System.out.println(getClass().getSimpleName()+" has needles");
    }
}
