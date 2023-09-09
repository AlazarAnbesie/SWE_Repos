package edu.mum.cs.cs425.demos.exercises;

public class Exercise1 {
    public static void main(String[] args) {
        printHelloWorld(new int[]{1,2,3,4,5,6,7,8,9,10,21});
        System.out.println(findSecondBiggest(new int[]{1,2,3,4,67,6,7,8,9,10,21}));
    }
    static void printHelloWorld(int[] input){
        for (int j : input) {
            if (j % 5 == 0)
                System.out.println("Hello");
            else if (j % 7 == 0)
                System.out.println("World");
            else
                System.out.println("HelloWorld");
        }
    }
    static int findSecondBiggest(int[] input){
        int max = input[0];
        int secondMax = Integer.MAX_VALUE;
        for (int j : input) {
            if(j>max){
                secondMax=max;
                max=j;
            }
            else if(j>secondMax){
                secondMax = j;
            }
        }
        return secondMax;
    }
}
