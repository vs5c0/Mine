import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int G = sc.nextInt();
        int rever=0;
        while (G!=0) {
            int rem = G%10;
            rever = rever*10+rem;
            G=G/10;
            System.out.println(rever);
            sc.close();

        }
    }
}
