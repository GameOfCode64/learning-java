public class ProcessStringwithSpecialOperations {

    static String processStr(String s) {
        StringBuilder sb = new StringBuilder("");

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            if (element == '#') {
                if (!sb.isEmpty()) {
                    sb.append(sb);
                } else {
                    sb.append("");
                }
            } else if (element == '%') {
                sb = sb.reverse();
            } else if (element == '*') {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(element);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "p##";
        System.out.println(processStr(input));
    }
}