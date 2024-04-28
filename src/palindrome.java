import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        int flag=0;

        while (i<j && flag==0)
        {
            if(s.charAt(i)!=s.charAt(j))
                flag=1;

            i=i+1;
            j=j-1;
        }
        if (flag==0) {
            System.out.println("palindrome ");
        }else {
        System.out.println("Not palindrome ");}

    }
}
