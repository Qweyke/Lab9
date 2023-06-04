import java.util.HashMap;
import java.util.Scanner;
public class Lab9Tsk7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        HashMap<Character, Integer> charCnt = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCnt.containsKey(c)) {
                charCnt.put(c, charCnt.get(c) + 1);
            } else {
                charCnt.put(c, 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : charCnt.keySet()) {
            stringBuilder.append(c);
            stringBuilder.append(charCnt.get(c));
        }
        System.out.println("Количество разных символов: " + charCnt.size());
        System.out.println("Новая строка: " + stringBuilder);
    }
}
