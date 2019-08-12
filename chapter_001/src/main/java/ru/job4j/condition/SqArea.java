package ru.job4j.condition;

public class SqArea {
    public static int square(int p, int k){
        int height = p/(2*k+2);
        int lenght = k*height;
        return height*lenght;
    }
    public static void main(String[] args){
        int result = square(6, 2);
        System.out.println("p = 6, k = 2 than square = " + result);
    }
}
