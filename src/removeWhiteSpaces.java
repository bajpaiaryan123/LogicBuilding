import java.util.function.Function;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        String s = "Aryan Bajpai from Hardoi";
        Function<String,String> f = s1 -> s1.replaceAll(" ","");
        System.out.println(f.apply(s));

    }
}
