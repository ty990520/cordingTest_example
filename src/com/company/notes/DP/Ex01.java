package com.company.notes.DP;

import java.util.Scanner;

public class Ex01 {
    public static int solution(int n){
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 2;

        for(int i=2; i<n;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }

        return arr[n-1];
    }
    public static void main(String[] args) {
        Ex01 T = new Ex01();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println(T.solution(n));
    }
}
