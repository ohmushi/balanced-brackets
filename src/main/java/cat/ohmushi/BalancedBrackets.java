package cat.ohmushi;

import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    private final static Map<Character, Character> openAndClose = Map.of(
            '(', ')',
            '[', ']');

    public static boolean isBalanced(String s) {
        if (s.isBlank())
            return true;
        if (s.length() % 2 != 0)
            return false;

        var stack = new Stack<Character>();
        var openners = openAndClose.keySet();
        var closers = openAndClose.values();

        for (char current : s.toCharArray()) {
            if (!openners.contains(current) && !closers.contains(current)) {
                throw new RuntimeException("Unexpected character : " + String.valueOf(current));
            }

            if (openners.contains(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty())
                    return false;
                var lastOpenner = stack.pop();
                var expectedCloser = openAndClose.get(lastOpenner);
                if (current != expectedCloser)
                    return false;
            }

        }
        return stack.isEmpty();
    }
}
