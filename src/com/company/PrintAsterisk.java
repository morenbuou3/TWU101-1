package com.company;

public class PrintAsterisk {
    public void print() {
        System.out.println("*");
    }

    public void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
