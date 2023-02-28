package by.itacademy.andreichumakou.javabasics;

import static java.lang.Double.NaN;

public class CalculatorFromCMD {

    public static void main(String[] args) {
        double numberOne, numberTwo, result;
        if (args.length == 0) {
            throw new IllegalArgumentException("Where are arguments?");
        }
        try {
            numberOne = Double.parseDouble(args[0]);
            numberTwo = Double.parseDouble(args[1]);
        } catch (Exception e) {
            System.out.println("Wrong entered data");
            e.printStackTrace();
            return;
        }

        switch (args[2].charAt(0)) {
            case '+': {
                result = numberOne + numberTwo;
                break;
            }
            case '-': {
                result = numberOne - numberTwo;
                break;
            }
            case '*': {
                result = numberOne * numberTwo;
                break;
            }
            case '/': {
                result = numberOne / numberTwo;
                break;
            }
            default: result = NaN;
        }
        System.out.println(result);
    }
}
