import java.util.ArrayList;
import java.util.Arrays;
public class Lab9Tsk4u {
    public static void main(String[] args) {
        char[][] array = {
                {'1', '+', '2', '/', '2', '=', '2'},
                {'3', '-', '4', '/', '2', '=', '1'},
                {'5', '+', '6', '/', '3', '=', '7'},
                {'8', '-', '9', '/', '3', '=', '5'},
                {'1', '+', '1', '/', '1', '=', '3'}
        };
        int cnt = 0;
        ArrayList<String> incorrectExpressions = new ArrayList<>();
        for (char[] row : array) {
            String exp = new String(row);
            if (RegexCheck(exp)) {
                if (MathCheck(exp)) {
                    cnt++;
                } else {
                    incorrectExpressions.add(Fix(exp));
                }
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            StringBuilder expressionBuilder = new StringBuilder();
            for (char[] row : array) {
                expressionBuilder.append(row[i]);
            }
            String exp = expressionBuilder.toString();
            if (RegexCheck(exp)) {
                if (MathCheck(exp)) {
                    cnt++;
                } else {
                    incorrectExpressions.add(Fix(exp));
                }
            }
        }
        System.out.println("Количество правильно вычисленных выражений: " + cnt);
        System.out.println("Неправильно вычисленные выражения с корректировкой ответа: " + Arrays.toString(incorrectExpressions.toArray()));
    }

    private static boolean RegexCheck(String exp) {
        return exp.matches("\\d[+\\-]\\d/\\d=\\d");
    }

    private static boolean MathCheck(String exp) {
        int num1 = Character.getNumericValue(exp.charAt(0));
        char sing = exp.charAt(1);
        int num2 = Character.getNumericValue(exp.charAt(2));
        int num3 = Character.getNumericValue(exp.charAt(4));
        int result = Character.getNumericValue(exp.charAt(6));
        int resultC;
        if (sing == '+') {
            resultC = num1 + num2 / num3;
        } else {
            resultC = num1 - num2 / num3;
        }
        return resultC == result;
    }

    private static String Fix(String exp) {
        int num1 = Character.getNumericValue(exp.charAt(0));
        char sing = exp.charAt(1);
        int num2 = Character.getNumericValue(exp.charAt(2));
        int num3 = Character.getNumericValue(exp.charAt(4));
        int resultC;
        if (sing == '+') {
            resultC = num1 + num2 / num3;
        } else {
            resultC = num1 - num2 / num3;
        }
        return exp.substring(0, 6) + resultC;
    }
}
