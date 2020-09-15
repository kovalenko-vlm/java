package com.company;

public class Main {

    public static void main(String[] args) {
//        Task2
        int[] arr = fillArray(0, 10, 2);
        System.out.println(arr.length);
        printArray(arr);

//        Task1
        matrix matr = new matrix(4, 4);
        matr.printMatrix();
        matr.printSideDiagonal();

        System.out.println();

        matrix matr2 = new matrix();
        matr2.setSize1(6);
        matr2.setSize2(4);
        matr2.printMatrix();
        matr2.printSideDiagonal();
    }

//    Task 2
    private static int[] fillArray(int begin, int end, int step){
        int[] arr = new int[end/step];

        int temp = begin;
        for(int i = 0; i < end / step; i++){
            arr[i] = temp;
            temp += step;
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
