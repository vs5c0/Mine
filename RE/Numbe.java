import java.util.Scanner;

public class Numbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to print: ");
        int rows=sc.nextInt();
        int i,j;
        for(i=rows;i>=1;i--){
            for(j=rows;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
