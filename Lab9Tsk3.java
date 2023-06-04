import java.util.Scanner;
public class Lab9Tsk3 {
    public static void main(String[] args) {
        System.out.print("Введите строку : ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char [] arr = str.toCharArray();
        int cnt1 = 0;
        for (char c : arr) {
            if (Character.isUpperCase(c) && Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
                cnt1++;
            }
        }
        System.out.println("Количество прописных букв русского языка: " + cnt1);
        System.out.print("Введите знак препинания: ");
        char a = in.next().charAt(0);
        boolean flag = false;
        for (char c : arr) {
            if (c == a) {
                flag = true;
                break;
            }
        }
        System.out.println("Знак препинания " + a + " присутствует: " + flag);
        System.out.print("Введите слово: ");
        String word = in.next();
        int cnt2 = 0;
        for (char c : arr) {
            if (word.indexOf(c) != -1) {
                cnt2++;
            }
            if (cnt2 >= 2) {
                break;
            }
        }
        System.out.println("Среди символов имеются хотя бы две буквы из слова: " + (cnt2 >= 2));
        boolean flag2 = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 'т' && arr[i + 1] == 'о') || (arr[i] == 'о' && arr[i + 1] == 'т')) {
                flag2 = true;
                break;
            }
        }
        System.out.println("Имеется ли среди символов пара соседствующих букв «то» или «от»: " + flag2);
        boolean flag3 = false;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                flag3 = true;
                break;
            }
        }
        System.out.println("Имеется ли среди символов три подряд идущих одинаковых символа: " + flag3);
        boolean flagE = false;
        for (int i = arr.length / 2 + 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (Character.isDigit(arr[i]) && Character.isDigit(arr[i + 1]) && Math.abs(arr[i] - arr[i + 1]) == 1 &&
                        Character.isLetter(arr[j]) && Character.isLetter(arr[j + 1]) && arr[j] == arr[j + 1]) {
                    flagE = true;
                    break;
                }
            }
            if (flagE) {
                break;
            }
        }
        System.out.println("Верно ли условие е: " + flagE);
    }
}
