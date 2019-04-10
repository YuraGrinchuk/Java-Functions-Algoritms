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

        Scanner scan = new Scanner(System.in);

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

        //Write a Java program to replace every element with the next greatest element----------------------------------
        // (from right side) in an given array of integers.-------------------------------------------------------------
//
//        int numberOfElements = scan.nextInt();
//
//        int[] arr = new int[numberOfElements];
//        for (int i = 0; i < numberOfElements; ++i){
//            arr[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i < numberOfElements - 1; ++i){
//            if (arr[i] <= arr[i+1]){
//                arr[i] = arr[i+1];
//            }
//        }
//
//        for (int i = 0; i <numberOfElements; ++i){
//            System.out.print(arr[i] + " ");
//        }

        //Write a Java program to remove duplicate elements from an array-----------------------------------------------

//        int numberOfElements = scan.nextInt();
//
//        int[] arr = new int[numberOfElements];
//        for (int i = 0; i <numberOfElements;++i){
//            arr[i] = scan.nextInt();
//        }
//
//        for (int i = 0; i <numberOfElements; ++i){
//
//        }

        //MOVE ALL ZEROS TO THE END OF ARRAY----------------------------------------------------------------------------

//        int numberOfElements = scan.nextInt();
//
//        int[] arr = new int[numberOfElements];
//        for (int i = 0; i <numberOfElements;++i){
//            arr[i] = scan.nextInt();
//        }
//
//        int counter = 0;
//
//        for (int i = 0; i <numberOfElements; ++i){
//            if (arr[i] != 0){
//                arr[counter++] = arr[i];
//            }
//        }
//        while (counter<numberOfElements){
//            arr[counter++] = 0;
//        }
//
//        for (int i = 0; i < numberOfElements; ++i){
//            System.out.print(arr[i] + " ");
//        }

        // FIND ALL THE DUPLICATES IN INTEGER ARRAY---------------------------------------------------------------------

        int numberOfElements = scan.nextInt();

        int[] arr = new int[numberOfElements];
        for (int i = 0; i <numberOfElements;++i){
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < numberOfElements; ++i){
            for (int j = 0; j <= numberOfElements; ++j){
                if (arr[i] == arr[j+1]){
                    System.out.println("Duplicate found : "+ arr[i]);
                }
            }
        }



    }

}
