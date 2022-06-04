import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    
    
    
    public static String findDay(int month, int day, int year) {
        int leapYears = ((month < 3) ? --year : year) / 4;
        int nonLeapCenturionYears = year / 100 - year / 400;
        leapYears -= nonLeapCenturionYears;
        // int[] monthDaysArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] monthDays = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
        // int monthDays = 0;
        // for (int i = 0; i < month; i++) {
        //     monthDays += monthDaysArr[i];
        // }
        int currentDay = ((year + leapYears) + monthDays[month - 1] + day) % 7;
        String[] weekDays = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
        String weekDay = weekDays[currentDay];
        return weekDay;

    }
    
}

public class Solution {
    static void test() {
        int[] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        // int[] monthDays = {0,3,3,6,1,4,6,2,5,0,3,5};
        int monthDay = 0;
        for (int i = 0; i < 12; i++) {
            monthDay += monthDays[i];
            System.out.print(monthDay%7+" ");
        }
    }
    public static void main(String[] args) throws IOException {
        test();
    }
}
