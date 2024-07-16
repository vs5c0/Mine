import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Range: ");
        int F = sc.nextInt();
        System.out.println("Enter a First Term: ");
        int A = sc.nextInt();
        System.out.println("Enter a Second Term: ");
        int B = sc.nextInt();

        for(int i=1;i<=F;i++){
            int temp = A+B;
            A=B;
            B=temp;
            System.out.println(temp);
        }
        sc.close();
    }
}
