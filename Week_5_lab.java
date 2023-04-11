package com.mycompany.week_5_lab;

/**
 *
 * @author blckpnthr
 */

/*************************************
Write a java program that initializes a two dimensional array of integers 
with random values between 1 and 100, and then finds and prints 
the maximum value in the array. 
Your program should prompt the user for the dimensions of the array, 
create the array with those dimensions, and then use nested loops 
to fill the array with random values. 
Once the array is filled, your program should use another loop to 
find the maximum value in the array. Once the maximum value is found,
your program should print it to the console. 
***************************************/

import java.util.*;
public class Week_5_lab {

        static int max=0;
        static int numrows;
        static int numcols;
        static int[][] arry;
    public static void main(String[] args) {
        
        findMaxArray();
        print();
    }
    

    public static void findMaxArray(){
    
    
    
    
    Scanner fetch = new Scanner(System.in);
    
    System.out.println("Please enter number of rows;");
    numrows = fetch.nextInt();
    System.out.println("Please enter number of columns:");
    numcols = fetch.nextInt();
    
    arry = new int[numrows][numcols];
    
    for(int i=0; i<numrows; i++){
        for(int j=0; j<numcols; j++){
            arry[i][j] = (int)(Math.random() * 100 + 1);
            if(max < arry[i][j]) max = arry[i][j];
        }
    }
    System.out.print("the max is: "+max + "\n");
    }
    
    public static void print(){
        System.out.print("Array is:\n ");
        for(int i=0; i<numrows; i++){
        for(int j=0; j<numcols; j++){
            System.out.print(arry[i][j] + "\t");
        }
        System.out.println();
    }
       
    }
    
}
