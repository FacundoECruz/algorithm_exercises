import java.util.Arrays;

public class Exercise3 {
    public boolean isPalindrome(String s) {
        if (!s.isEmpty()) {
            int start = 0;
            int last = s.length() - 1;
            while (start <= last) {
                char currFirst = s.charAt(start);
                char currLast = s.charAt(last);
                if (!Character.isLetterOrDigit(currFirst)) {
                    start++;
                } else if (!Character.isLetterOrDigit(currLast)) {
                    last--;
                } else {
                    if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                        return false;
                    }
                    start++;
                    last--;
                }
            }
        }
        return true;
    }

    public String formatString(String s) {
        StringBuilder formatted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                formatted.append(c);
            }
        }
        return formatted.toString().toLowerCase();
    }

    public String reverseString(String s){
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
