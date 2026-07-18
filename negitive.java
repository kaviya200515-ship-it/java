public class Main {
    public static void main(String[] args) {
        int[] arr = {10, -25, 5, 40, -15, 8, 0};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }

        System.out.println("Negative Count = " + count);
    }
}