package com.company;

public class LigneValid {

    static boolean LigneIsValid(int[][] array, int valeur, int ligne) {

        for (int i = 0; i < 9;  i++) {
            if(array[ligne][i] == valeur) return false;
        }
        return true;
    }




    public static void main(String[] args) {

        int[][] boardEasy = {
                {4, 0, 0, 1, 0, 2, 6, 8, 0},
                {1, 0, 0, 0, 9, 0, 0, 0, 4},
                {0, 3, 8, 0, 6, 4, 0, 1, 0},
                {0, 0, 5, 0, 7, 1, 9, 2, 0},
                {0, 2, 6, 0, 0, 9, 8, 0, 0},
                {8, 0, 0, 2, 5, 0, 0, 0, 0},
                {9, 0, 3, 0, 0, 0, 0, 0, 8},
                {2, 5, 0, 6, 0, 0, 1, 0, 7},
                {6, 0, 7, 9, 0, 5, 3, 0, 0}
        };

        System.out.println(LigneIsValid(boardEasy, 9, 1));

    }
}