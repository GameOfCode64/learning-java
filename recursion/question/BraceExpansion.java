class Solution {

    public List<String> braceExpansionII(String expression) {
        Set<String> result = parse(expression, 0, expression.length()).set;
        
        List<String> answer = new ArrayList<>(result);
        Collections.sort(answer);

        return answer;
    }

    static class Result {
        Set<String> set;
        int index;

        Result(Set<String> set, int index) {
            this.set = set;
            this.index = index;
        }
    }

    private Result parse(String s, int index, int end) {
        Set<String> result = new HashSet<>();
        Set<String> current = new HashSet<>();
        current.add("");

        while (index < end && s.charAt(index) != '}') {

            char ch = s.charAt(index);

            // Union separator
            if (ch == ',') {
                result.addAll(current);
                current = new HashSet<>();
                current.add("");
                index++;
            }

            // Brace expression
            else if (ch == '{') {
                Result inside = parse(s, index + 1, end);

                current = concatenate(current, inside.set);
                index = inside.index + 1;
            }

            // Single character
            else {
                Set<String> letter = new HashSet<>();
                letter.add(String.valueOf(ch));

                current = concatenate(current, letter);
                index++;
            }
        }

        result.addAll(current);

        return new Result(result, index);
    }

    private Set<String> concatenate(Set<String> a, Set<String> b) {
        Set<String> result = new HashSet<>();

        for (String x : a) {
            for (String y : b) {
                result.add(x + y);
            }
        }

        return result;
    }
}