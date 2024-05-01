/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Abdulrehman Khan
 */
import java.util.*;
import java.util.Scanner;
public class ProceduralAbstraction {

/**
 * Requires: None
 * Modifies: None
 * Effects: Returns the smallest positive integer n for which n! (i.e. 1*2*3*...*n) is greater than or equal to x, for positive integer x. Otherwise returns 1.
 */
    public static int reverseFactorial(int x){
        if (x<=0){
            return 1;
        }
        else {
            int factorial=1;
            int n=1;
            
            while (factorial < x){
                n++;
                factorial= factorial * n;
            }
            return n;
        }
        
    }

/**
 * Requires: None
 * Modifies: None
 * Effects: If the matrix arr satisfies Nice property, prints the sum and returns true. Otherwise returns false.
 */  
    public static boolean isMatrixNice (int[][] arr) {
        if (arr.length == 0){
            return false;
        }
        else{
      
            int arraySum= 0;
         
         for (int i=0; i<arr.length; i++){
             if (arr[i].length != arr.length){
                 return false;
             }
             
             int rowSum=0;
             
             for (int j= 0; j<arr[i].length; j++){
                 rowSum = rowSum + arr[i][j];
                 
             }
             
             if (i ==0){
                 arraySum = rowSum;
             }
             
             else if (arraySum != rowSum){
                 return false;
             }
         }
         
         for (int i =0; i< arr.length; i++){
             int columnSum =0;
             
             for (int j=0; j<arr.length; j++){
                 columnSum= columnSum + arr[j][i];
             }
             if (columnSum != arraySum){
                 return false;
             }
         }
         
         
         int diagnolSum1= 0;
         int diagnolSum2= 0;
         
         for (int i=0; i< arr.length; i++){
             diagnolSum1= diagnolSum1 + arr[i][i];
             diagnolSum2= diagnolSum2 + arr[arr.length - 1 - i][i];
         }
         
         if (diagnolSum1 != arraySum || diagnolSum2 != arraySum){
             return false;
         }
         else {
             System.out.println("\n"+ "Sum of the matrix provided:\n" + arraySum + "\n");
             return true;
         }
        }
    }
    
    
    public static void main (String args[]){
    
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter integer you wish to take the reverse facotorial of:\n");
            int z = scan.nextInt();
            System.out.println("\n" + "Reverse Factorial:\n" + reverseFactorial(z));
        
        //System.out.print("Give me a matrix you wish to analyze:\n");
            
        int [][] matrix1 = {{2,7,6}, {9,5,1}, {4,3,8}};
        int [][] matrix2 = {{-3,1,0}, {4,-3,4}, {7,-9,0}}; 
        
        if (isMatrixNice(matrix1)){
            System.out.println("The 1st matrix provided is a nice matrix!\n");
        }
        else{
            System.out.println("The 1st matrix provided is not a nice matrix!\n");
        }
        
        if (isMatrixNice(matrix2)){
            System.out.println("The 2nd matrix provided is a nice matrix!\n");
        }
        else{
            System.out.println("The 2nd matrix provided is not a nice matrix!\n");
        }


    }
    
    
}



