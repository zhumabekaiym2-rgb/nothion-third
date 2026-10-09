package kz.kaznu.project;

public class Fourth {

    public static void main(String[] args) {
        int[][] matrix = {
                {  3, 15, -2 },
                { 40,  5,  6 }
        };

        System.out.println("Максимальный элемент: " + findMax(matrix));
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
