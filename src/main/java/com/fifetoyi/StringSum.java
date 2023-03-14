package com.fifetoyi;

public class StringSum {
    public static int sum(String num1, String num2) {
        try {
            int firstNum = Integer.parseInt(num1);
            int secondNum = Integer.parseInt(num2);

            if(firstNum <= 0) firstNum = 0;
            if(secondNum <= 0) secondNum = 0;

            return firstNum + secondNum;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
