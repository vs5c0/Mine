class Art{
    static int add(int m,int n){
        for(int i=1;i<=n;i++){
            m++;
        }
        return m;
    }
    public static void main(String[] args) {
        int a = add(12,22);
        System.out.println(a);
    }
}