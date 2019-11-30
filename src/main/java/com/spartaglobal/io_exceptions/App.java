package com.spartaglobal.io_exceptions;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try{
            bufferedFileManager.readerWriter();
        } catch (IOException e){
            e.printStackTrace();
        }

        FileInputStreamManager fileInputStreamManager = new FileInputStreamManager();
        fileInputStreamManager.fileStreamReader();
        MovieManager movieManager = new MovieManager();
        movieManager.searchForFilm("fast"); */

        FilmsGoodRating filmsGoodRating = new FilmsGoodRating();
        filmsGoodRating.csvReader(7.5);
    }



}
