package com.company;

public class Diamond {
    public void isosceles(int n) {
        int len = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            int aLen = 2 * (i) - 1;
            int k = len / 2 - aLen / 2;
            while (j <= len) {
                if (j <= k || j > aLen + k) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
        }
    }
}
