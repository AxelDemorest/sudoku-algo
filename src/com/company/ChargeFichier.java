package com.company;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ChargeFichier {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("test.txt"));

        String line;

        int[][] array = new int[9][9];

        while ((line = in.readLine()) != null) {
            // Afficher le contenu du fichier

            String[] splited = line.split("\s+");

            for(int number = 0; number < 9; number++) {

                int a = Integer.parseInt(splited[number]);

                array[number][number] = a;
            }


        }

        in.close();


    }
}
