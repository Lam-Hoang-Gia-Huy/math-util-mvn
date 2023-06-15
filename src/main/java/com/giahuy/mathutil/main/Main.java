package com.giahuy.mathutil.main;

import org.giahuy.mathutil.core.MathUtility;

public class Main {

    public static void main(String[] args) {
//run test case 1
        int n = 0; //checkk getF(0) 0!
        long expected = 1; //hy vọng 0! trả về 1
        long actual; //=?; 0! thực tế là mấy , gọi hàm tới b
        actual = MathUtility.getFactorial(n); //sao sánh hoy
        System.out.println(n + "! |expected: " + expected + " |actual: " + actual);
//test case #2
        System.out.println(1 + "! |expected: " + expected + " |actual: " + MathUtility.getFactorial(1));
        //test case #3
        System.out.println(2 + "! |expected: " + 2 + " |actual: " + MathUtility.getFactorial(2));
        //test case #4
        System.out.println(3 + "! |expected: " + 6 + " |actual: " + MathUtility.getFactorial(3));
        //test case #5
        System.out.println(4 + "! |expected: " + 24 + " |actual: " + MathUtility.getFactorial(4));
        //test case #6
    }
}
