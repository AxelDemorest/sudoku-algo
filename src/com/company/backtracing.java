package com.company;

public class backtracing {

    static void backtracing(int [][]Array) {
        for (int a = 0; a< 9; a++)
            for (int b = 0; b <8; b++) {
                for (int c = 0; c<10; c++) {
                    if (Array[a][b] != 0) {
                        b++;
                    } else {
                        break;
                    }

                }
                for (int i = 1; i <= 9; i++) {
                    if (VerifColone.VerifColone(Array, i, b) && LigneValid.LigneIsValid(Array, i, a)) {
                        Array[a][b] = i;
                        if (Verif_Section.verifSection(Array)){
                            break;
                        }
                    }else{
                        Array[a][b] = 0;
                    }
                }
            }
        Main.printSudoku(Array);
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

        backtracing(boardEasy);


    }
}