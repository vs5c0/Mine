import java.util.Scanner;

public class Primco {
    static boolean isPrime(int n){
        if(n==0||n==1){
            return false;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
            return false;
        }
    }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        if(isPrime(n)){
            System.out.println(n);

        sc.close();
    }
    
    }
}
