import java.util.Scanner;

public class e_areaofrectangle {
    public static void main(String[] args) {
        int area = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        area = l * b;
        System.out.println("The are of rectangle = " + area + " m. sqr.");
        sc.close();
    }
}
