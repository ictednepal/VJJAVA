import java.util.Scanner;

public class c_userinputstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.next();
        System.out.println("Your name is " + name);
        sc.close();
    }
}
