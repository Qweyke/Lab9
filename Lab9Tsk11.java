import java.util.Arrays;
public class Lab9Tsk11 {
    public static void main(String[] args) {
        String[] strings = {"   Every  ", " elk    ", "   go to forest   "};
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].trim();
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replaceAll("\s+", " ");
        }
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }
        System.out.println(Arrays.toString(strings));
    }
}
