package by.itacademy.andreichumakou.javabasics;

import java.util.Scanner;

public class Util {

    public static int enterIntNumber() {
        Scanner scanner = new Scanner(System.in);
        int intNumber = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                intNumber = scanner.nextInt();
                break;
            } else {
                System.out.println("Введите целое число: ");
                scanner.nextLine();
            }
        }
        //scanner.close();      //не позволяет второй раз открывать поток
        return intNumber;
    }

    public static double enterDoubleNumber() {
        Scanner scanner = new Scanner(System.in);
        double doubleNumber = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                doubleNumber = scanner.nextDouble();
                break;
            } else {
                System.out.println("Введенное значение не принадлежит типу double!");
                scanner.nextLine();
            }
        }
        //scanner.close();      //не позволяет второй раз открывать поток
        return doubleNumber;
    }

}
