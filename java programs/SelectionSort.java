package com.example.demo1.sorting;

import java.util.Arrays;

public class SelectionSort {

    public void selectionSort(int ar[]){

        for(int i=0;i<ar.length-1;i++){
            int min_index = i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[j] < ar[min_index]){
                    min_index = j;
                }
            }
            int temp = ar[min_index];
            ar[min_index] = ar[i];
            ar[i] = temp;
        }
    }
    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        SelectionSort ob1 = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.selectionSort(arr);
        System.out.println("printing sorting array");
        ob.printArray(arr);

    }

    private void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
    }
}
