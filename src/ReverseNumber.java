public class ReverseNumber {
    public static void main(String[] args) {
       int number=465684,reverse=0;

       for (;number!=0;number=number/10){
         int  remainder=number%10;
           reverse=reverse*10+remainder;
         //  number=number/10;
       }
        System.out.println("the reverse number is "+ reverse);
    }
}
