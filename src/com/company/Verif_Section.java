package com.company;

public class Verif_Section {

    static void verifSection(int Array[][], int position, int answer, int a, int b){

        System.out.println(position + " "+ answer);

        if (a % 3 == 0){

            if (b%3 == 0){
                int a2 = 0;
                int b2 = 0;
               for (int i = 0; i<=3; i++){
                   if (Array[a2][b2] == answer){
                       System.out.println("OK");
                       a2++;
                       b2++;
                   }

               }

            }else if (b%3 == 1){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }
            }else if (b%3==2){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }

        }


        if (a % 3 == 1){

            if (b%3 == 0){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }else if (b%3 == 1){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }else if (b%3==2){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }

        }


        if (a % 3 == 2){

            if (b%3 == 0){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }else if (b%3 == 1){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }else if (b%3==2){
                int a2 = 0;
                int b2 = 0;
                for (int i = 0; i<=3; i++){
                    if (Array[a2][b2] == answer){
                        System.out.println("OK");
                        a2++;
                        b2++;
                    }

                }

            }else{
                System.out.println("ERREUR");
            }

        }


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
        int a = 0;
        int b = 4;
        verifSection(boardEasy, boardEasy[a][b], 2, a, b);

    }

}
