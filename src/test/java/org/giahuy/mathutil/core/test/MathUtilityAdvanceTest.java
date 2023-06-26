/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.giahuy.mathutil.core.test;

import org.giahuy.mathutil.core.MathUtility;
import static org.giahuy.mathutil.core.MathUtility.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runners.Parameterized;

/**
 *
 * @author legion
 */
public class MathUtilityAdvanceTest {
    //hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
    //0 -> 1
    //1 -> 1
    //2 -> 2
    //6 -> 720
    //mảng 2 chiều, cột 0 là n, cột 1 là expected
    //n   expected

    public static Object[][] initTestData() {
        int a[] = {5, 10, 15, 20};
        Object testdata[][] = {{0, 1},
        {1, 1},
        {2, 2},
        {4, 24},
        {5, 1200}};
        return testdata;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnswell(int n, long expected) {
                                                            //Cột 0, cột 1
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
//Băt ngoại lệ thì sao, tức là hàm của ta getF() trả về 
//ngoại lệ khi đưa N cà chớn -1, -2, N>20
//Junit đưa ra hàm mới, AssertThrows()
//hàm này lại xài lambda expression

//TDD: test driven developer là kĩ thuật dành cho dân dev
//nói về việc viết code chính cần phải dc kiểm tra ngay về chất lượng nên viết code chính đan xen, xen kẽ cùng với việc thiết kế các test case để test code chính
// lập trình mà viết code chính và code test(Junit, unit test) đan xen kẽ nhau thì gọi là TDD
//Viết code hướng theo việc kiểm thử ngay code

//DTT: Data driven testing: là kĩ thuật mở rộng, bổ sung thêm cho TDD trong đó việc viết code test dc tách riêng ra so với test data nghĩa là bộ dữ liệu test thường ddc đặt để ở 1 mảng 2 chiều hoặc để ở table, file test. excel sau đó dc nhồi/fill/map vào trong câu lệnh kiểm thử
//Việc data tách riêng ra, sau đó fill trở lại hàm so sánh qua tên biến thì DDT còn dc gọi là parameterized testing
