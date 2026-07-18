import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};

        Arrays.sort(arr);

        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}