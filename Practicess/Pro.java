import java.util.Scanner;

public class Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int m = sc.nextInt();
        int count =0;
        for(int i=2;i<=m/2;){
            count++;
            break;
        }
        if (count!=m) {
            System.out.println("Not a Prime");
        }else{
            System.out.println("Prime Number");
        }
        sc.close();

    }
}
