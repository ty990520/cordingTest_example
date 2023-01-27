package com.company.notes.backtracking.nAndM;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
/*
 * N과 M (4)
 * */
public class BOJ15652 {
    static int[] arr;
    static int n, m;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        arr = new int[m + 1];

        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        dfs(1);
        bw.flush();
        bw.close();
    }

    private static void dfs(int level) throws IOException {
        if (level == m + 1) {
            for (int i = 1; i <= m; i++) {
                bw.write(arr[i] + " ");
            }
            bw.newLine();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(arr[level-1]<=i){
                arr[level] = i;
                dfs(level + 1);
            }
        }
    }
}
