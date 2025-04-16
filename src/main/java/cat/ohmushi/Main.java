package cat.ohmushi;

import static cat.ohmushi.BalancedBrackets.isBalanced;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> exemples = Map.of(
                "", true,
                "()", true,
                "())", false,
                "(())", true,
                ")(", false,
                "[]", true,
                "()[]", true,
                "([)]", false,
                "([(())([])])[()]", true,
                "[(())([]])[()]", false);

        for (var exemple : exemples.entrySet()) {
            System.out.println("'" + exemple.getKey() + "'" + " (" + exemple.getValue().toString() + ") : " +
                    isBalanced(exemple.getKey()));
        }

    }
}