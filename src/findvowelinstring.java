import java.util.Scanner;

public class findvowelinstring {
    public static void main(String[] args){
        String s = new String();
        int i, vowel=0,cons=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        s=sc.nextLine();
        s=s.toUpperCase();

        for (i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c != ' '){
                if (c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'){
                    vowel++;
                }
                else{
                    cons++;
                }
            }
        }
        System.out.println("vowel :"+ vowel +" constant :"+cons);
    }
}
