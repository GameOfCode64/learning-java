class Solution {
       public boolean isValid(String s) {
        if(s.length() <= 1 ){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty()) {
                if (ch == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }else{
                        return false;
                    }
                } else if (ch == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }else{
                        return false;
                    }
                } else if (ch == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else{
                        return false;
                    }
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}