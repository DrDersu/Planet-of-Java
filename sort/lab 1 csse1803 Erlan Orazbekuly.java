//bubble sort
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a[] = new int[100];
        int len, n1 = 0, count = 0;
        boolean isswap = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the len: ");
        len = sc.nextInt();
        System.out.print("Input the element of array: \n");
        for (int i = 0; i<len; i++){
            a[i] = sc.nextInt();
        }
        while(isswap){
            isswap = false;
            for (int i = 0; i < len - n1 - 1; i++, count++) {
                if(a[i]>a[i+1]){
                    int t = a[i];
                    a[i] = a[i+1];
                    a[i+1] = t;
                    isswap = true;
                }
            }
            n1++;
        }
        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nCount: " + count);
    }
}



//insertion sort 
package javaapplication1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    int len, start = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the len: ");
    len = sc.nextInt();
    int a[] = new int[100];
    System.out.print("Input the element of array: \n");
    for (int i = 0; i<len; i++){
        a[i] = sc.nextInt();
    }
    for(int i = len-2; i>=0; i--){
         int fig = a[i];
         int j = i+1;
         while(j<len && fig>a[j]){
             a[j-1]=a[j];
             j++;
         }
         a[j-1]=fig;
    }
    for (int i = 0; i < len; i++) {
        System.out.print(a[i]+" ");
    }
    
}
}


//selection sort Recursive method

package javaapplication1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    int len, start = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the len: ");
    len = sc.nextInt();
    int a[] = new int[100];
    System.out.print("Input the element of array: \n");
    for (int i = 0; i<len; i++){
        a[i] = sc.nextInt();
    }    
    selection_sort(a , len , 0);
    for (int i = 0; i < len; i++) {
        System.out.print(a[i]+" ");
    }
    
}

     private static int[] selection_sort(int[] a, int len, int left) {
          if(left==len-1) return a;
          else{
               int min = left;
               for (int j = left+1; j < len; j++)
                    if (a[j] < a[min])
                         min = j;
               int n = a[min];
               a[min] = a[left];
               a[left] = n;                  
               
               left++;
               return selection_sort(a, len, left);
          }
     }
}
