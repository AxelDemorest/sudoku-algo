package com.company;

public class backtracing {
    static int complexity =0;

    /**
     * Verifie les contraintes de lignes, colonne et sous section
     * @param array Tableau contenant les valeurs de la grille de sudoku
     * @return Renvoie true si toutes les contraintes sont validées
     */
    static boolean isValid (int array[][]){
        if (grilleValid.VerifGrille(array)){
            return true;
        }else return false;
    }

    /**
     * Algorithme permettant de vérifier chaque combinaisons de chiffre
     * @param Array Tableau contant les valeurs de la grille de sudoku
     * @return
     */
    static boolean backtracing(int [][]Array) {
        for (int a = 0; a< 9; a++) {
            for (int b = 0; b < 9; b++) {
                if (Array[a][b] != 0) {
                    continue;
                }
                for (int i = 1; i <= 9; i++) {
                    Array[a][b] = i;
                    complexity++;
                    boolean isValid = isValid(Array);
                    if (isValid) {
                        if (backtracing(Array)){
                           return true;
                        }
                    }Array[a][b] = 0;
                }
                return false;
            }
        }
        Main.printSudoku(Array);
        System.out.println("Complexité : "+ complexity);

    return true;}


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

        backtracing(boardEasy);


    }
}