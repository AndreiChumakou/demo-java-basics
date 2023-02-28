package by.itacademy.andreichumakou.javabasics;

public class HelloFromCMD {
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Where arguments?");
        } else System.out.println("Hello, " + args[0]);
    }
}
