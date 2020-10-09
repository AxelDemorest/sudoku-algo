package com.company;

public class VerifColonne {
    /**
     * Vérifire dans chaque colonne de la grille si il y a plusieurs fois la même valeur
     * @param array Tableau contenant les valeurs de la grille de sudoku
     * @return Renvoie true si les contraintes de colonne sont bonnes
     */
    static boolean AllColumnIsValid(int[][] array) {

        for(int column = 0; column < 9; column++) {

            for (int number = 1; number < 10; number++) {

                int compteurNumber = 0;

                for (int ligne = 0; ligne < 9; ligne++) {

                    if (array[ligne][column] == number) {

                        if (compteurNumber == 1) {
                            return false;
                        } else {
                            compteurNumber = compteurNumber + 1;
                        }

                    }

                }

            }

        }

        return true;

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

        int[][] boardEasy2 = {
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

        System.out.println(AllColumnIsValid(boardEasy2));

    }
}
