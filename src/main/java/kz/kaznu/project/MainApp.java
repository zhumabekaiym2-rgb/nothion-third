package kz.kaznu.project;

public class MainApp {
    public static void main(String[] args) {
        int[][] testArray = {
                { 1, -2,  3 },
                { 4,  5, -6 },
                { 7,  8,  9 }
        };

        System.out.println("Сумма положительных: " + sumOfPositiveElements(testArray));
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}