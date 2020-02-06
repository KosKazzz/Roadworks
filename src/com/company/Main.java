package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by rpetrov on 12/9/16.
 */
public class Main {
    public static void main(String s[]){

        LocalDate localDate = LocalDate.of(2015, Month.MARCH, 15);

        System.out.println(localDate);


        RoadChecker roadChecker = new MyRoadChecker();
        int count = roadChecker.getRestrictedRoads("C:\\JavaPr\\14_01_2020\\data-20191105T072439-structure-20160117T173719.csv", localDate);

        System.out.println(count);
    }
}

