package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void to_txt(int[] arr, int len) {
        try {

            Formatter f = new Formatter("array.txt");
            for (int i = 0; i < len; i++) {
                f.format("%s", Integer.toString(arr[i]) + " ");
                if (i % 100 == 0 && i > 0) f.format("%s", "\r\n");
            }
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        System.out.println("Input the size: ");
        int[] arr = new int[360005];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        for (int i = 0; i < n; i++) arr[i] = r.nextInt(1000);
        to_txt(arr, n);
        System.out.println(arr[0] + "-------" + arr[n - 1]);
        System.out.println("The text file with numbers of array was created successfully");

    }
}



