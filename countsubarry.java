public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int target = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    count++;

                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                        if (k < j)
                            System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }

        System.out.println("Count = " + count);
    }
}