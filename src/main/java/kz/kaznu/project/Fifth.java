package kz.kaznu.project;

public class Fifth {

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 }, // 2-я строка (сумма = 15)
                { 7, 8, 9 }
        };

        System.out.println("Сумма 2-й строки: " + sumOfSecondRow(matrix));

        int[][] smallMatrix = { { 1, 2, 3 } };
        System.out.println("Сумма 2-й строки (если её нет): " + sumOfSecondRow(smallMatrix));
    }

    public static int sumOfSecondRow(int[][] array) {
        if (array.length < 2) {
            return -1;
        }

        int sum = 0;
        for (int j = 0; j < array[1].length; j++) {
            sum += array[1][j];
        }
        return sum;
    }
}
// HomeWork 3 Completed