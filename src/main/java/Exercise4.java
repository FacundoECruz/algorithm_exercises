import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Exercise4 {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        else {
            Stack<Character> stack = new Stack<Character>();
            for(char c : s.toCharArray()){
                if(c == '(')
                    stack.push(')');
                else if (c == '{')
                    stack.push('}');
                else if (c == '[')
                    stack.push(']');
                else if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
            return stack.isEmpty();
        }
    }
}
