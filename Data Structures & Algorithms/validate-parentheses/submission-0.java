class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];  // manual stack using array
        int top = -1;                // stack pointer

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            // If opening bracket → push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }
            // If closing bracket → check top of stack
            else {
                // Stack is empty, no matching opening bracket
                if (top == -1) return false;

                char top_ch = stack[top];

                if (ch == ')' && top_ch == '(') top--;
                else if (ch == '}' && top_ch == '{') top--;
                else if (ch == ']' && top_ch == '[') top--;
                else return false;  // Mismatched pair
            }
        }

        // Stack must be empty at end
        return top == -1;
    }
}