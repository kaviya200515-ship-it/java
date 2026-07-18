import java.util.Scanner;

class attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int present = 0;
        int absent = 0;

        for (int i = 1; i <= 30; i++) {
            int attendance = sc.nextInt();

            if (attendance == 1) {
                present++;
            } else if (attendance == 0) {
                absent++;
            }
        }

        System.out.println("Present: " + present);
        System.out.println("Absent: " + absent);

        sc.close();
    }
}