

public class PatternProgram05 {
    public static void main(String[] args) {
        int n=9;
        for (int row=1; row<=n; row++){
            int totalcolum = row > 5 ? n-row+1 : row;
            for (int col=1; col<=totalcolum; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
