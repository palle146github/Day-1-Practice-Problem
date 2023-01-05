import java.util.Scanner;
public class Cstringequality {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String string1, string2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first String");
        string1 = scanner.nextLine();

        System.out.println("Enter second String");
        string2 = scanner.nextLine();
        // Comparing two input string
        if (string1.equals(string2))
            System.out.print("Equal Strings");
        else
            System.out.print("UnEqual Strings");

    }
}
