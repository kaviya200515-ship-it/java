public class Main {
    public static void main(String[] args) {
        int[] arr = {3, -4, 2, -3, -1, 7, -5};

        int minSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.min(arr[i], currentSum + arr[i]);
            minSum = Math.min(minSum, currentSum);
        }

        System.out.println("Minimum Sum = " + minSum);
    }
}