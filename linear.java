public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int key = 40;

        int found = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }
    }
}