import java.util.Scanner;

public class Fdemonstrate {

    static void table(int n) {
        System.out.println(n + " Table");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter a number");

        int number = sc.nextInt();
        table(number);
    }
}
