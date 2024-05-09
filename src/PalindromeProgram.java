public class PalindromeProgram {
    public static void main(String[] args) {
        int n=535,rev=0,z;
        z=n;

        while(n>0)
        {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if (rev==z)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");


    }
}
