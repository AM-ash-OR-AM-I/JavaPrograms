import java.util.Scanner;

public class Printf {
    public static String findDay(int month, int day, int year) {
        int leapYears = --year / 4;
        int nonLeapCenturionYears = year / 100 - year / 400;
        leapYears -= nonLeapCenturionYears;
        int[] monthDaysArr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int monthDays = 0;
        for (int i = 0; i <= month; i++) {
            monthDays += monthDaysArr[i];
        }
        int currentDay = ((year * 365 + leapYears) + monthDays + day - 1) % 7;
        String[] weekDays = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY" };
        String weekDay = weekDays[currentDay];
        return weekDay;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[3][2];
        for (int i = 0; i < 3; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", arr[i][0], Integer.parseInt(arr[i][1]));
        }
    }
}
