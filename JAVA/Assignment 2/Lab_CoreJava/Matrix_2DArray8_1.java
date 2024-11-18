//Write a program to perform matrix addition and subtraction using 2D arrays.

package Lab_CoreJava;

import java.util.Scanner;

public class Matrix_2DArray8_1 {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner r = new Scanner(System.in);

        //first matrix
        System.out.println("Enter First Matrix Data:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j]=r.nextInt();
            }
        }

        // second matrix
        System.out.println("Enter Second Matrix Data:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                b[i][j]=r.nextInt();
            }
        }

        // first matrix
        System.out.println("First Matrix:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }

        // second matrix
        System.out.println("Second Matrix:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(b[i][j]+ " ");
            }
            System.out.println();
        }

        // Sum of two matrices
        System.out.println("Sum of two matrices:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }

        // Subtraction of two matrices
        System.out.println("Subtraction of two matrices:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++) {
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
    }
}