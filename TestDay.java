package day5;

import java.util.Scanner;

public class TestDay {//计算两个日期相差多少天，日期有控制台控制

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要计算的起始年月日");
        int fromYear = scanner.nextInt();
        int fromMonth = scanner.nextInt();
        int fromDay = scanner.nextInt();
        System.out.println("请输入终止年月日");
        int toYear = scanner.nextInt();
        int toMonth = scanner.nextInt();
        int toDay = scanner.nextInt();
        int result = DelDay(fromYear, fromMonth, fromDay, toYear, toMonth, toDay);
        System.out.println(result);
    }

    public static int DelDay(int fromYear, int fromMonth, int fromDay, int toYear, int toMonth, int toDay) {
        // 1、起始那一天，是fromYear的第几天
        // 2、终止那一天，是toYear的第几天
        // 3、计算 fromYear的1月1日 ~ toYear的1月1日相差多少天
        // 4、 3 + 2 - 1

        int fromDays = getDay(fromYear, fromMonth, fromDay);
        int toDays = getDay(toYear, toMonth, toDay);
        int days = 0;
        for (int y = fromYear; y < toYear; y++) {
            days += check(y) ? 366 : 365;
        }

        return days + toDays - fromDays;

    }

    //计算一个日期是当年的第几天
    public static int getDay(int year, int month, int day) {
        int days = day;
        for (int m = 1; m < month; m++) {
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                days += 31;
            } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                days += 30;
            } else if (m == 2) {//闰年二月份为29天
                days += check(year) ? 29 : 28;
            }

        }
        return days;
    }

    public static boolean check(int year) {
        //判断年份是否为闰年：能被4整除，不能被100整除，或能被400整除

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
