public class Lab9Tsk1 {
        public static void main(String[] args) {
            char[] arr = {'a', '1', 'b', '2', 'c', '3', 'd', '4', 'e', '5', 'f', '6'};
            for (int i = 0; i < arr.length; i++) {
                if (Character.isDigit(arr[i])) {
                    arr[i] = '!';
                }
            }
            System.out.println(arr);
        }
    }


