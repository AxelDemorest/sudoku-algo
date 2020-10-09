package com.company;

import static com.company.Main.printSudoku;

public class Timer {



    public static void main(String[] args) {

             long TimerStart = System.currentTimeMillis();

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
            printSudoku(boardEasy);
            
             long TimerEnd = System.currentTimeMillis();
             long Timer = TimerEnd - TimerStart;

             System.out.println(" ");
             System.out.println("Le sudoku s'est résolu en "+Timer+"ms");

            }


        }



