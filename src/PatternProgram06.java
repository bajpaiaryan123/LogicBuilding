public class PatternProgram06 {
    public static void main(String[] args) {
        int n =9;
        for (int row=1; row<=n; row++){
            int totalcolums= row > 5 ? n-row+1 : row;
            int totalspaces= n - totalcolums;
            for (int s=1; s<=totalspaces; s++){
                System.out.print(" ");
            }
            for (int col=1; col<=totalcolums; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
