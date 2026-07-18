 import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {

        int number = 42;

        int tens = number / 10;
        int ones = number % 10;

        int reverse = (ones * 10) + tens;

        System.out.println("Reverse number: " + reverse);
    }
}