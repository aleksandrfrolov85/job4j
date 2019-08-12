package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        return value / 70;
    }
    public static int rubleToDollar(int value){
        return value / 60;
    }
    public static int euroToRuble(int value){
        return value * 70;
    }
    public static int dollarToRuble(int value){
        return value * 60;
    }
    public static void main(String[] args){
        int in1 = 140;
        int expected1 = 2;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test results: " + passed1);
        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test results: " + passed2);
        int in3 = 1;
        int expected3 = 70;
        int out3 = euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1 euro is 70. Test results: " + passed3);
        int in4 = 2;
        int expected4 = 120;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("2 dollars are 120. Test results: " + passed4);
    }
}
