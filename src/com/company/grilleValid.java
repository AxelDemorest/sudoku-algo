package com.company;

public class grilleValid {
    /**
     * Verifie les contraintes de lignes, colonne et sous section
     * @param array Tableau contenant les valeurs de la grille de sudoku
     * @return Renvoie true si toutes les contraintes sont validées
     */
    static boolean VerifGrille(int[][] array) {

            if(LigneValid.AllLigneIsValid(array) && VerifColonne.AllColumnIsValid(array) && Verif_Section.verifSection(array)) {

                return true;

            } else {

                return false;

            }
    }

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


        System.out.println(VerifGrille(boardEasy));
    }
}
