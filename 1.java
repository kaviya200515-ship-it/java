 import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Arithmetic Operators");
        System.out.println("Add = " + (a + b));
        System.out.println("Sub = " + (a - b));
        System.out.println("Multiply = " + (a * b));
        System.out.println("Divide = " + (a / b));
        System.out.println("Modulus = " + (a % b));
        System.out.println("\nAssignment Operator");
        System.out.println("Initial a = " + a);
        a += 5;
        System.out.println("After a += 5 = " + a);
        System.out.println("\nRelational Operators");
        a = 10;
        b = 20;
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        System.out.println("\nLogical Operators");
        int age = 25;
        System.out.println("age >= 18 && age <= 60 = " + (age >= 18 && age <= 60));
        System.out.println("age <= 18 || age >= 60 = " + (age <= 18 || age >= 60));
        System.out.println("!(age < 18) = " + (!(age < 18)));
        System.out.println("\nUnary Operators");
        a = 10;
        System.out.println("Original value = " + a);
        System.out.println("Pre Increment = " + (++a));
        System.out.println("Post Increment = " + (a++));
        System.out.println("Current value = " + a);
        System.out.println("Pre Decrement = " + (--a));
        System.out.println("Post Decrement = " + (a--));
        System.out.println("Final value = " + a);
        System.out.println("\nTernary Operator");
        age = 20;
        String result = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println(result);
        System.out.println("\nOperator Precedence");
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("(10 + 5) * 2 = " + result2);
        System.out.println("Before Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}