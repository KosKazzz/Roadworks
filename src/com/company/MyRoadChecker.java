package com.company;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

public class MyRoadChecker implements RoadChecker {
    int result=0;
    public int getRestrictedRoads(String fileName, LocalDate localDate){
       try {
           String[] rows =  Files.readAllLines(Paths.get(fileName)).toArray(new String[]{});
           for(String ros : rows){
               String [] columns = ros.split(",");
               try {
                   LocalDate start =  LocalDate.parse(columns[10], DateTimeFormatter.ofPattern("yyyyMMdd"));
                   if (localDate.compareTo(start) >= 0 && columns[12].contains("-")){
                       result = result+1;
                   }else{
                       if (!columns[12].contains("-")){
                       LocalDate end = LocalDate.parse(columns[12], DateTimeFormatter.ofPattern("yyyyMMdd"));
                   if (localDate.compareTo(start) >= 0 && (localDate.compareTo(end) <= 0)  ) {
                       result = result+1;
                   } else {
                       result = result;
                   }
                       }
                   }
               } catch (DateTimeParseException x){  System.out.println(" Не верно задан формат  даты !");}
           }
           }
         catch (IOException e) {
            e.printStackTrace();
        }
       return result;
    }
}
