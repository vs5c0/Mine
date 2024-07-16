import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int year = sc.nextInt();

        if((year%2==0)&&(year%4!=0)||(year%400==0)){
            System.out.println("Leap Year ");
        }else{
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
    
}
