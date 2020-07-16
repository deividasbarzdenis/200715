package com.company.uzd2;

import com.company.uzd2.conifers.Pine;
import com.company.uzd2.deciduous.Birch;
import com.company.uzd2.deciduous.Deciduous;
import com.company.uzd2.deciduous.Oak;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Birch> birches = Arrays.asList(new Birch(), new Birch(), new Birch());
        Forest.birchForest(birches);

        List<Deciduous> deciduous = Arrays.asList(new Deciduous(), new Deciduous(), new Deciduous());
        Forest.variuosForest(deciduous);

        List<Tree> trees = Arrays.asList(new Deciduous(), new Oak(), new Pine());
        Forest.variuosForest(trees);
    }
}
