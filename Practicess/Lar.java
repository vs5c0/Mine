public class Lar {
    public static void main(String[] args) {
        int array[] = {12,444,553,2,1,665,2,4,7691};
        int F = array.length;
        int temp;
        for(int i=0;i<F;i++){
            for(int j=i+1;j<F;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
                System.out.println(array[F-1]);

            }
        }
    }
}
