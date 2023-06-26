/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.giahuy.mathutil.core;

/*Class này dẽ mô phỏng, clone lại class java.util.Math
 */
public class MathUtility {

    public static final double PI = 3.1415;
//    hàm này tính n!
//    thiết kế hàm này như sau:
//    0!=1!=1
//    ko có âm giai thừa
//    hàm chỉ cho phép n=0..20->n>20 ném exception

    public static long getFactorial(int n) {
        if (n < 0 || n >= 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);

    }
}
//5!=4!x5=5x4!
//4!=4x3!
//3!=3x2!
//2!=2x1!
//1!=1

//TDD: test drigver development là kĩ thuật  viết code có chất lượng bằng cách code và test case và test run dc  thực thi đan xen song song, vừa viết code, vừa test.
//Công việc của QC và developer có điểm giống nhau
//đều phải thiết kế các test và run chúng để coi đúng sai
//test case run với app(QC) test case để run với code/hàm/class(dev)
//QC và dev khác nhau cơ bản là
//dev viết code/viết app+thêm viết test
//QC ko viết code ra app, có thể viết code để tự động hoá thao tác kiểm thử app
//dev và qc đểu phải biết thiết kế testcase
//test case là bộ data gồm phần input, expected dùng để đưa vào app/hàm để đo lường  hàm đúng sai, và mô phỏng 1 tình huống xài app của user
//test case có thể viết tự do, hoặc viết theo template
//tự do: để test hàm getF9)  ta cần các test case sau:
//0!->1; 1->1 ; 2!=2; 3!=6; 5!=120
//đưa data vào và hy vọng trả về
//Giang hồ luôn viết theo template, 1 test case sẽ gồm nhiều info liên quan/nhiều mục  cần điền info
//Test case #1(mục đích test case): Check getF() method with n=0
//Steps
//1.given n=0
//2.Call getF() with n=0; getF(0) getF(n)
//expected results
//getF(0) must return 1
//Test case #1(mục đích test case): Check getF() method with n=1
//Steps
//1.given n=1
//2.Call getF() with n=1; getF(1) getF(n)
//expected results
//getF(0) must return 1
