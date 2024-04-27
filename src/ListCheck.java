
import java.util.Arrays;
import java .util.List;
public class ListCheck {
    public static boolean onlyOddNumbers(List<Integer>list) {
        for (int i : list) {
            if (i % 2 == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(onlyOddNumbers(Arrays.asList(5,7,9,4)));
    }
}
