package com.homework.springhometask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {111, 21, 23, 14, 225, 621, 72, 855, 9777};
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int k = 1; k < arr.length; k++) {
                if (arr[k - 1] < arr[k]) {
                    temp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}