package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        double first = Math.pow(x2-x1, 2);
        double second = Math.pow(y2-y1, 2);
        double third = Math.sqrt(first + second);
        return third;
    }
    public static void main(String[] args){
        double resultA = distance(0,0,2,0);
        System.out.println("result (0, 0) to (2, 0) " + resultA);
        double resultB = distance(1,0,5,0);
        System.out.println("result (1, 0) to (5, 0) " + resultB);
        double resultC = distance(1,1,5,4);
        System.out.println("result (1, 1) to (5, 4) " + resultC);
    }
}
