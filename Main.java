import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n:");
        int n = sc.nextInt();
        //odd number
        System.out.println("List of odd number in " + n);
        for (int i = 0; i < n; i++) {
            i = i + 1;
            System.out.println(i);

        }
        //even number
        System.out.println("List of even number in " + n);
        for (int i = 1; i <= n; i++) {
            i = i + 1;
            System.out.println(i);

        }
        //prime number
        System.out.println("List of prime number in " + n);
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;

                }
            }

            if (count == 0) {
                System.out.println(i);
            }

        }


    }
}