package com.company;

public class Verif_Section {
    /**
     * Vérifire dans chaque sous-section de la grille si il y a plusieurs fois la même valeur
     * @param Array Tableau contenant les valeurs de la grille de sudoku
     * @return Renvoie true si les contraintes de sous-section sont bonnes
     */
    static boolean verifSection(int[][]Array){
        boolean isValid=true;

        int minB=0;
        int maxB=2;
        for (int e = 0; e<=2; e++) {
            int minA =0;
            int maxA = 2;
            for (int d = 0; d < 3; d++) {

                for (int c = 1; c < 10; c++) {

                    int compteur = 0;

                    for (int b = minB; b < maxB + 1; b++) {

                        for (int a = minA; a < maxA + 1; a++) {

                            if (Array[b][a] == c) {
                                compteur++;
                            }

                        }

                    }
                    if (compteur >= 2) {
                        isValid = false;
                    }
                }

                minA = minA + 3;
                maxA = maxA + 3;
            }
            minB = minB+3;
            maxB=maxB+3;
        }

    return isValid;}

    public static void main(String[] args) {

        int[][] boardEasy = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(verifSection(boardEasy));

    }

}
