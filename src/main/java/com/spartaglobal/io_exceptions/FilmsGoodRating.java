package com.spartaglobal.io_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilmsGoodRating {

    public void csvReader(double ratings){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("resources/movie_metadata.csv"));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null){
                String[] LineData = line.split(" , ");
               if (Double.parseDouble(LineData[1])>= ratings){
                   System.out.println(LineData[0]);
                   System.out.println(LineData[1]);
               }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
