import java.util.Scanner;

public class d_adduserinputnums {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        sum = a + b;
        System.out.println("The sum is =" + sum);
        sc.close();
    }
}
