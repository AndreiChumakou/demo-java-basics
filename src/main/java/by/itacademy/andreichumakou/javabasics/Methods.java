package by.itacademy.andreichumakou.javabasics;

public class Methods {

    public int countQuantityNews(int quantityNews) {
        return quantityNews / 10 + 1;
    }

    public int displayNumber(int quantityNumbers) {
        return (int) (Math.random() * Math.pow(10, quantityNumbers));
    }
}
