import java.util.Scanner;
public class Lab9Tsk2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binaryNumber;
        boolean isBinary = false;
        do {
            System.out.print("Введите число в двоичной системе счисления: ");
            binaryNumber = in.nextLine();
            isBinary = true;
            for (int i = 0; i < binaryNumber.length(); i++) {
                if (binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1') {
                    isBinary = false;
                    break;
                }
            }
            if (!isBinary) {
                System.out.println("Ошибка ввода! Введите число, состоящее только из символов 0 и 1.");
            }
        } while (!isBinary);
        int decimalNumber = Integer.parseInt(binaryNumber, 2);
        String octalNumber = Integer.toOctalString(decimalNumber);
        char[] octalArray = octalNumber.toCharArray();
        System.out.print("Число в 8-ой системе счисления: ");
        System.out.println(octalArray);
    }
}
