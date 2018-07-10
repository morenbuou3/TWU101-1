package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Triangle printAsterisk = new Triangle();

        printAsterisk.print();
        printAsterisk.printLine(8);
        printAsterisk.printVerticalLine(3);
        printAsterisk.printTriangle(3);

        Diamond diamond = new Diamond();

        diamond.isosceles(3);
        diamond.diamond(3);
        diamond.diamondWithName(3);

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.print();
    }
}
