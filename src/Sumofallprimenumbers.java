public class Sumofallprimenumbers {
   public static void main(String[] args){
       int Count;
       for (int i=1;i<=100;i++){
           Count=0;
           for (int j=1;j<=i;j++){
               if (i%j==0){
                   Count++;
               }
           }
           if (Count == 2){
               System.out.println(i);
           }
       }

   }
}
