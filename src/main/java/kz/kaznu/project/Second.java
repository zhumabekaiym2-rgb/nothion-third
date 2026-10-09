package kz.kaznu.project;

public class Second {

    public static void main(String[] args) {
        printSquare(4);
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}