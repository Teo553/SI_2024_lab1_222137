import java.util.ArrayList;
import java.util.List;

public class SILab1_1 {
    public static List<String> filterOddLengthStrings(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String el : list) {
            if (el.length() % 2 == 1) {
                result.add(el);
            }
        }
        System.out.println(SILab1_1.filterOddLengthStrings(list));
        System.out.println(SILab1_2.makeBigStringFrom(list));
        return result;
    }


}