import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int HG = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(HG+ "*" +i+ "=" +(HG*i));

        }
        sc.close();
    }
}
