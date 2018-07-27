package secondTask;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Structure structure = new Structure();
        Tree tree = new Tree(structure);

        tree.makeTheTree();
        System.out.println(tree.countHeight(structure.getRootNode()));

    }

}
