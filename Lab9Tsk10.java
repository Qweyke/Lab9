import java.util.ArrayList;
public class Lab9Tsk10 {
    public static void main(String[] args ){
        String str = "Баскетболист: Иванов; Иван; Иванович; М; Россиянин; 205; 100; 1995, 10, 15; +7(999)123-45-67; Команда1; 5; Центровой; 200; 20. "
                +"Баскетболист: Петров; Петр; Петрович; М; Россиянин; 190; 80; 1996, 5, 20; +7(999)234-56-78; Команда2; 10; Форвард; 150; 30. "
                +"Баскетболист: Сидорова; Мария; Ивановна; Ж; Россиянка; 210; 110; 1994, 3, 1; +(999)345-67-89; Команда1; 7; Центровой; 250; 25. "
                +"Баскетболист: Смирнов; Алексей; Петрович; М; Россиянин; 195; 95; 1993, 12, 5; +7(999)456-78-90; Команда2; 8; Форвард; 100; 40.\n";
        String[] parts = str.trim().split("\\.");
        int cnt1 = 0;
        ArrayList<String> highScore = new ArrayList<>();
        for (String data : parts) {
            String[] stats = data.split(";");
            int height = Integer.parseInt(stats[5].trim());
            int weight = Integer.parseInt(stats[6].trim());
            int points = Integer.parseInt(stats[12].trim());
            if (height >= 200 && height <= 220 && weight >= 90 && weight <= 110) {
                cnt1++;
            }
            if (points > 150) {
                highScore.add(data);
            }
        }
        System.out.println("Количество людей с ростом от 200 до 220 см и весом от 90 до 110 кг: " + cnt1);
        System.out.println("Сведения про баскетболистов, которых забросили за свою команду больше 150 очков:");
        for (String highScorer : highScore) {
            System.out.println(highScorer);
        }
    }

}
