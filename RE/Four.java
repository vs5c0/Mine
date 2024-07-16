public class Four {
    static int add(int a,int b){
        for(int i=1;i<=b;i++){
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        int aa = add(12, 21);
        System.out.println(aa);
    }
}
