package examples.Math;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class MathChallenge {
    int MathChallenge(String str) {
        str = str.replaceAll("\\s", "");
        //replace all " with nothing
        str = str.replaceAll("\"", "");
        str = str.replaceAll("[)][(]", ")*(");
        str = str.replaceAll("([0-9])[(]", "$1*(");
        str = str.replaceAll("[)]([0-9])", ")*$1");

        str = evalBrackets(str);
        str = evalDivivisionAndMultiplication(str);
        str = evalAdditionAndSubtraction(str);
        return Integer.valueOf(str);

    }

    String evalBrackets(String str) {
        StringBuilder result = new StringBuilder(str);

        int openBracketIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                openBracketIndex = i;
            } else if (c == ')') {
                String calc = str.substring(openBracketIndex, i + 1);
                String betweenBrackets = calc.substring(1, calc.length() - 1);
                String res = evalDivivisionAndMultiplication(betweenBrackets);
                res = evalAdditionAndSubtraction(res);

                int startIndex = result.indexOf(calc);
                result.replace(startIndex, startIndex + calc.length(), res);
            }
        }

        return result.toString();
    }

    String evalDivivisionAndMultiplication(String str) {
        StringBuilder result = new StringBuilder(str);

        while (result.indexOf("*") != -1 || result.indexOf("/") != -1) {
            for (int i = 0; i < result.length(); i++) {
                char c = result.charAt(i);

                if (c == '*' || c == '/') {
                    String before = getDigitBeforeSign(result.toString(), i);
                    String after = getDigitAfterSign(result.toString(), i);
                    String calc = result.substring(i - before.length(), i + after.length() + 1);
                    int res = c == '*' ? Integer.parseInt(before) * Integer.parseInt(after) : Integer.parseInt(before) / Integer.parseInt(after);

                    int startIndex = result.indexOf(calc);
                    result.replace(startIndex, startIndex + calc.length(), String.valueOf(res));
                    break;
                }
            }
        }

        return result.toString();
    }

    String evalAdditionAndSubtraction(String str) {
        StringBuilder result = new StringBuilder(str);

        while (result.indexOf("+") != -1 || result.lastIndexOf("-") > 0) {
            for (int i = 0; i < result.length(); i++) {
                char c = result.charAt(i);

                if (c == '+' || (c == '-' && i != 0)) {
                    String before = getDigitBeforeSign(result.toString(), i);
                    String after = getDigitAfterSign(result.toString(), i);
                    String calc = result.substring(i - before.length(), i + after.length() + 1);
                    int res = c == '+' ? Integer.parseInt(before) + Integer.parseInt(after) : Integer.parseInt(before) - Integer.parseInt(after);

                    int startIndex = result.indexOf(calc);
                    result.replace(startIndex, startIndex + calc.length(), String.valueOf(res));
                    break;
                }
            }
        }

        return result.toString();
    }

    String getDigitBeforeSign(String str, int signIndex) {
        StringBuilder digit = new StringBuilder("");
        for (int i = signIndex - 1; i >= 0; i--) {
            char d = str.charAt(i);

            if (d == '+' || (d == '-' && i != 0) || d == '/' || d == '*') {
                return digit.toString();
            } else {
                digit.insert(0, d);
            }
        }
        return digit.toString();
    }

    String getDigitAfterSign(String str, int signIndex) {
        StringBuilder digit = new StringBuilder("");
        for (int i = signIndex + 1; i < str.length(); i++) {
            char d = str.charAt(i);

            if (d == '+' || d == '-' || d == '/' || d == '*') {
                return digit.toString();
            } else if (Character.isDigit(d)) {
                digit.append(d);
            }
        }
        return digit.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        MathChallenge c = new MathChallenge();
        System.out.print(c.MathChallenge(s.nextLine()));
    }
}
