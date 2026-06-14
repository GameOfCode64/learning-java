import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {
    static String intToRoman(int num) {
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] Symbol = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        int[] value = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };

        int count = 0;

        for (int i = value.length - 1; i >= 0; i--) {
            while (num >= value[i]) {
                num -= value[i];
                count++;
            }
            map.put(value[i], count);
            count = 0;
        }

        for (int i = value.length - 1; i >= 0; i--) {
            int currentCount = map.get(value[i]);
            if (currentCount > 0) {
                int counter = 0;
                while (counter < currentCount) {
                    sb.append(Symbol[i]);
                    counter++;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(intToRoman(num));
    }
}
