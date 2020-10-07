package com.company;

public class Verif_Section {

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

        System.out.println(verifSection(boardEasy));

    }

}
