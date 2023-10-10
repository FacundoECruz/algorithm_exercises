import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise4 {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        else {
            Map<String,String> brackets = new HashMap<String,String>();
            brackets.put("(", ")");
            brackets.put("[", "]");
            brackets.put("{", "}");

            ArrayList<String> stack = new ArrayList<String>();

            for(int i = 0; i < s.length(); i++){
                char currentChar = s.charAt(i);
                String key = String.valueOf(currentChar);
                if(brackets.containsKey(key)){
                    stack.add(brackets.get(key));
                } else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    String lastToEnter = stack.remove(stack.size() - 1);
                    if(!lastToEnter.equals(key)){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
