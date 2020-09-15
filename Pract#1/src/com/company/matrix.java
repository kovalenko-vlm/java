package com.company;

import java.util.Random;

// Task1
public class matrix {
    private final Random random = new Random();
    private int size1;
    private int size2;
    private int[][] arr;

    public matrix(int size1, int size2){
        this.size1 = size1;
        this.size2 = size2;
    }

    public matrix(){
    }

    public int getSize1(){
        return size1;
    }

    public void setSize1(int size1){
        if(size1 > 0)
            this.size1 = size1;
        else
            System.out.println("We need only positive numbers");
    }

    public int getSize2(){
        return size2;
    }

    public void setSize2(int size2){
        if(size2 > 0)
            this.size2 = size2;
        else
            System.out.println("We need only positive numbers");
    }

    public void randomize(){
        arr = new int[size1][size2];
        for (int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                arr[i][j] = random.nextInt(10);
            }
        }
    }

    public void printMatrix(){
        randomize();
        for (int i = 0; i < size1; i++){
            for(int j = 0; j < size2; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printSideDiagonal(){
        if(size1 == size2){
            int size = size2;
            for (int i = 0; i < size1; i++){
                for(int j = size - 1; j >= 0; j--){
                    System.out.print(arr[i][j] + " ");
                    break;
                }
                size -= 1;
            }
            System.out.println();
        } else {
            System.out.print("We can`t do this dude! Number of rows must be equal to number of cols");
        }
    }
}
