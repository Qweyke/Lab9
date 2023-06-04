import java.util.HashMap;
import java.util.Scanner;
public class Lab9Tsk5u {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = in.nextLine();
        str = str.replaceAll("[^a-zA-Zа-яА-Я ]", "").toLowerCase();
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordsCnt = new HashMap<>();
        for (String word : words) {
            if (wordsCnt.containsKey(word)) {
                wordsCnt.put(word, wordsCnt.get(word) + 1);
            } else {
                wordsCnt.put(word, 1);
            }
        }
        for (String word : wordsCnt.keySet()) {
            System.out.println(word + ": " + wordsCnt.get(word));
        }
    }
}
