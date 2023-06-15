package org.giahuy.mathutil.core.test;
import org.giahuy.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilityTest {
    @Test
    public void checkFactorialGivenRightArgumentReturnswell(){
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(720, MathUtility.getFactorial(6));
    }
}
//Kiến thức mới: DDT
//Data driven testing
//Là kĩ thuật viết code kiểm thử của UnitTest mà tách phần data ra khỏi câu lệnh assertE()

//Viết các test case hướng dẫn về việc tách data test ra riêng biệt

//ko nhầm lẫn lẫn với TDD: test driven development
//Kĩ thuật viết code làm app thì phải viết luôn cho các test casae để đảm bảo hàm/method/class chạy ngon

//TDD: Viết code chính và code test/test case đan xen để check hàm đúng sai
//DDT: trong quá trình viết code test, tách data test ra riêng 1 chỗ cho dễ đọc, dễ bảo trì
//DDT là nằm trong TDD