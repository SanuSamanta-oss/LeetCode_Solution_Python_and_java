import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); // empty Stack created and "stack" is the name of the variable Stack<Character> means  it will be character type 

        for ( char c : s.toCharArray()){
            if ( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if( stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if (c == ')' && top != '('){
                    return false;
                }
                if (c == '}' && top != '{'){
                    return false;
                }
                if (c == ']' && top != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// Time Complexity = O(n)
// Space Complexity: O(n)