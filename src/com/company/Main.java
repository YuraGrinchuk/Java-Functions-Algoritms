package com.company;
import com.sun.tools.javac.util.Convert;

import java.util.*;

import java.util.Scanner;

public class Main {

    public static int numbPow (int a, int b){
        int i;
        int result = 1;
        for(i = 0 ; i < b; ++i){
            result = result *a;
        }
        return result;
    }

    public static void pow (int a , int b){
        int result= 1;
        int i;
        for(i = 0; i<b;++i){
            result *=a;
        }
        System.out.println(result);
    }

    public static void arrayCreator(int n){
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i=0;i<n;++i){
            System.out.println("Enter element number : "+i+"!");
            arr[i] = scan.nextInt();
        }
        for (int i = 1; i <= n; ++i ){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        //loops-------------------------------------------------------------------------------------------------------

//        for(int i = 0; i <=10; ++i){
//            System.out.println(i);
//        }
//

//        int i = 0;
//        while(i<=10){
//            System.out.println(i);
//            ++i;
//            if (i==5)
//                break;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            ++i;
//        }while(i<=10);


        //arrays-------------------------------------------------------------------------------------------------------
//
//        int[] arr1 = new int[] {2,5,78,100};
//        System.out.println(arr1[1]);
//
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr2 = new int[n];
//
//        for(int i = 0; i < n;++i){
//            System.out.println("Enter : i = "+i+";");
//            arr2[i] = scan.nextInt();
//        }

        //two/three_arrays=============================================================================================
//        char [] [] array = new char [3] [3];
//        array [0] [0]= 'C';

        //functions----------------------------------------------------------------------------------------------------

//        System.out.println(numbPow(2,3));
//        pow(2,3);

//        arrayCreator(3);
        System.out.println(8 <=8);


        // move all zeros to the end of array

//        Scanner scan = new Scanner(System.in);
//        int numberOfArrayElaments = scan.nextInt();
//
//        int[] arrin = new int[numberOfArrayElaments];
//
//        for(int i = 0; i < numberOfArrayElaments; ++i) {
//            arrin[i] = scan.nextInt();
//        }
//        for(int i = 0; i < numberOfArrayElaments; ++i) {
//            if (arrin[i] == 0) {
//                arrin[i] = arrin[i+1];
//                arrin[i+1] = 0;
//            }
//        }
//
//        for (int i = 0; i < numberOfArrayElaments; ++i){
//            System.out.print(arrin[i]+" ");
//        }

        //find an average value of an array of integers exept of the largest and the smallest

        Scanner scan = new Scanner(System.in);
        int numberOfArrayItems = scan.nextInt();
        int [] arrayOfNumbers = new int[numberOfArrayItems];

        for (int i = 0; i < numberOfArrayItems; ++i){
            arrayOfNumbers[i] = scan.nextInt();
        }

        int min = 0;
        int max = 0;

        for (int i = 0; i < numberOfArrayItems; ++i){
            if (arrayOfNumbers[i] < min) {
                min = arrayOfNumbers[i];
            }else if (arrayOfNumbers[i] > max)
                max = arrayOfNumbers[i];
        }
        int sum = 0;
        for (int i = 0; i < numberOfArrayItems; ++i){
            if(arrayOfNumbers[i] != max || arrayOfNumbers[i] != min)
                sum += arrayOfNumbers[i];
        }
        double averageSum = (sum - min - max) / (numberOfArrayItems - 2);

        System.out.print(min +" "+ max +" "+ sum +" "+averageSum);





    }

}
