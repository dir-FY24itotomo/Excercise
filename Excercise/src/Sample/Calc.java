package Sample;

public class Calc {
    public static void main(String[] args) {
        var num1 = 13.5;
        var num2 = 8.7;

        // adding
        var result1 = num1 + num2;
        System.out.println("num1 + num2 = " + result1);

        // subtracting
        var result2 = num1 - num2;
        System.out.println("num1 - num2 = " + result2);

        // multiply
        var result3 = num1 * num2;
        System.out.println("num1 * num2 = " + result3);

        // division
        var result4 = num1 / num2;
        System.out.println("num1 / num2 = " + result4);

        // 剰余
        var result5 = num1 % num2;
        System.out.println("num1 % num2 = " + result5);
    }
}