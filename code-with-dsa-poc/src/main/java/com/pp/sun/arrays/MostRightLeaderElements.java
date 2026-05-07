package com.pp.sun.arrays;

import java.util.ArrayList;

public class MostRightLeaderElements {

    public static void main(String[] args) {

        int [] input = {16,17,3,4,5,2,56,65,754,67};
        System.out.println(leaders(input));

    }

        static ArrayList<Integer> leaders(int arr[]) {
            // code here
            ArrayList<Integer> res= new ArrayList<>();
            int max =0;
            for(int i = 1; i< arr.length ; i++){

                if ( arr.length-1 != i &&  ( arr[i-1] <= arr[i] )){
                    max = arr[i];
                } else if (  arr[i-1] > arr[i])  {
                    res.add(max);
                }

            }
            res.add(arr[arr.length-1]);

            return res;

        }


}
