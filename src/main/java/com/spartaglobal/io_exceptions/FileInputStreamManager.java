package com.spartaglobal.io_exceptions;

import java.io.*;

public class FileInputStreamManager {

        public void fileStreamReader() {
            try {

                BufferedReader file = new BufferedReader(new FileReader("resources/newFile.txt"));
                while (file.readLine() != null){
                    String [] data = file.readLine().split(" ");
                    System.out.println(data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




