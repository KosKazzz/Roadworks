package com.company;

import java.time.LocalDate;

/**
 * Created by rpetrov on 12/9/16.
 */
public interface RoadChecker {

    /* you can use

    Files.readAllLines(Paths.get(fileName)).toArray(new String[]{});

    to read files to string array
     */

    int getRestrictedRoads(String fileName, LocalDate localDate);
}
