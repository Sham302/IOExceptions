package com.spartaglobal.io_exceptions.exception;

import java.io.*;

public class ExceptionExample {

    public void readFile() {
        File file = new File("resources/TestFile .txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}