package by.itacademy.andreichumakou.javabasics;

public class Methods {

    public int countQuantityNews(int quantityNews) {
        if (quantityNews < 0) {
            throw new IllegalArgumentException("Wrong number!");
        } else return quantityNews / 10 + 1;
    }

    public int displayNumber(int quantityNumbers) {
        if (quantityNumbers <= 0) {
            throw new IllegalArgumentException("Wrong number!");
        } else return (int) (Math.random() * Math.pow(10, quantityNumbers));
    }
}
