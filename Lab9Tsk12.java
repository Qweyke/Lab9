import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Lab9Tsk12 {
    public static void main(String[] args) {
        String[] array = {
                "Январь: 20 учащихся, 15 отличников",
                "Февраль: 22 учащихся, 12личников",
                "Март: 25 учащихся, 18 отличников",
                "Апрель: 24 учащихся, 14 отличников",
                "Май: 26 учаихся, 20 отличников",
                "Июнь: 23 учащихся, 16 отличников",
                "Июль: 25 учащихся, 19 отличников",
                "Август: 24 учащихся, 17личников",
                "Сентябрь: 26 учащихся, 21 отличник",
                "Октябрь: 23 учащихся, 15 отличников",
                "Ноябрь: 25 учащся, 18 отличников",
                "Декабрь: 24 учащихся, 16 отличников"
        };
        Pattern pattern = Pattern.compile("(\\d+)\\s+учащихся,\\s+(\\d+)\\s+отличник");
        for (String month : array) {
            System.out.println("Исходная строка: " + month);
            Matcher matcher = pattern.matcher(month);
            if (matcher.find()) {
                int students = Integer.parseInt(matcher.group(1));
                int excellent = Integer.parseInt(matcher.group(2));
                String newMonth = month.replaceAll("(\\d+)\\s+учащихся", getDeclension(students, "учащийся", "учащихся", "учащих"))
                        .replaceAll("(\\d+)\\s+отличник", getDeclension(excellent, "отличник", "отличника", "отличников"));

                System.out.println("Измененная строка: " + newMonth);
            } else {
                System.out.println("Ошибка: не найдены данные о численности учащихся и отличников");
            }
        }
    }
    private static String getDeclension(int number, String one, String two, String five) {
        int mod10 = number % 10;
        int mod100 = number % 100;
        if (mod10 == 1 && mod100 != 11) {
            return number + " " + one;
        } else if (mod10 >= 2 && mod10 <= 4 && (mod100 < 10 || mod100 >= 20)) {
            return number + " " + two;
        } else {
            return number + " " + five;
        }
    }
}
