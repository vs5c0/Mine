import java.util.Scanner;

public class Fibonaci {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Range of the Fibonaci series");
    int N= sc.nextInt();
    System.out.println("Enter a First Term :");
    int a = sc.nextInt();
    System.out.println("Enter the Second Term : ");
    int b = sc.nextInt();
    for(int i=0;i<=N;i++){
        int c = a+b;
        a=b;
        b=c;
        System.out.println(c);
    
    }
    sc.close();

   } 
}
