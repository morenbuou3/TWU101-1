package com.company;

import java.util.Stack;

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

    public void diamond(int n) {
        Stack<String> stack = new Stack<>();
        int len = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            int aLen = 2 * (i) - 1;
            int k = len / 2 - aLen / 2;
            StringBuilder result = new StringBuilder();
            while (j <= len) {
                if (j <= k || j > aLen + k) {
                    System.out.print(" ");
                    result.append(" ");
                } else {
                    System.out.print("*");
                    result.append("*");
                }
                j++;
            }
            stack.push(result.toString());
            System.out.println();
        }
        stack.pop();
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

    public void diamondWithName(int n) {
        Stack<String> stack = new Stack<>();
        int len = 2 * n - 1;
        for (int i = 1; i < n; i++) {
            int j = 1;
            int aLen = 2 * (i) - 1;
            int k = len / 2 - aLen / 2;
            StringBuilder result = new StringBuilder();
            while (j <= len) {
                if (j <= k || j > aLen + k) {
                    System.out.print(" ");
                    result.append(" ");
                } else {
                    System.out.print("*");
                    result.append("*");
                }
                j++;
            }
            stack.push(result.toString());
            System.out.println();
        }
        System.out.println("Jiahao Wang");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
