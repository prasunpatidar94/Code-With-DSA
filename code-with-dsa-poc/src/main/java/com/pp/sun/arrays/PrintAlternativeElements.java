package com.pp.sun.arrays;

public class PrintAlternativeElements {


   /* Examples:

    Input: arr[] = [10, 20, 30, 40, 50]
    Output: 10 30 50
    Explanation: Print the first element (10), skip the second element (20),
    print the third element (30), skip the fourth element(40) and
    print the fifth element(50).

    Input: arr[] = [-5, 1, 4, 2, 12]
    Output: -5 4 12
*/

    public static void main(String[] args) {
        int[] input = {10, 20, 30, 40, 50};

        for (int i = 0; i < input.length; i = i + 2) {
            System.out.print(input[i] + ", ");
        }

        System.out.println("--------------------");
        getElement(0, input);

    }

    public static void getElement(int n, int[] input) {
        if (n >= input.length) return ;
            System.out.print(input[n] + ", ");
            getElement(n+2,input);
    }
}
