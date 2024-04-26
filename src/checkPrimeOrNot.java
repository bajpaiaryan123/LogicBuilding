import java.util.Scanner;

public class checkPrimeOrNot {
    public static void main(String[] args){
        int n,i=1, count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        n = sc.nextInt();
        while(i<=n)
        {
            if (n%i==0)
            {
                count = count + 1;

            }
            i = i + 1;
        }
        if (count==2)
        {
            System.out.println("Prime Number");
        }else

            System.out.println("Not a Prime Number");

    }
}
