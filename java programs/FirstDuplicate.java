
//Find First duplicate number and print it int arr[]={16,19,21,25,21,5,8,10,25}

package com.example.demo1.model;

public class FirstDuplicate {
    public static void main(String[] args) {
       int arr[]={16,19,21,25,21,5,8,10,25};
       boolean flag = false;
       //outer loop
        for(int i=0;i<arr.length;i++){

            //inner loop
            for(int j=i+1;j<arr.length;j++){

                if(arr[i] == arr[j]){
                    flag = true;
                    System.out.println("first duplicate number is : " + arr[i]);
                    break;
                }
            }
            if(flag)
                break;
        }

    }
}
