public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 0, 5, 40, 0, 8, 0};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        System.out.println("Zero Count = " + count);
    }
}