package com.company;

public class Triangle {
    public void print() {
        System.out.println("*");
    }

    public void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
    }
}
