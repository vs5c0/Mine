import java.util.Scanner;
//sum of a given number
public class Seventeen {
    public static void main(String[] args) {
        Scanner scc= new Scanner(System.in);
        System.out.println("enter a Number: ");
        int YR = scc.nextInt();
        int summ = 0;
        while(YR>0){
            summ=summ+YR%10;
            YR = YR/10;

        }
        System.out.println(summ);
        scc.close();
        }
        
}
