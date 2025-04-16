package cat.ohmushi;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import static cat.ohmushi.BalancedBrackets.isBalanced;

public class BalancedBracketsTest {

    @Test
    void assertjShouldWork() {
        assertThat(true).isTrue();
    }

    @Test
    void emptyStringShouldBeBalanced() {
        assertThat(isBalanced("")).isTrue();
    }

    @Test
    void simpleClosingParenthesesShouldBeBalanced() {
        assertThat(isBalanced("()")).isTrue();
    }

    @Test
    void twoClosingParenthesesShouldNotBeBalanced() {
        assertThat(isBalanced("))")).isFalse();
    }

    @Test
    void twoOpeningParenthesesShouldNotBeBalanced() {
        assertThat(isBalanced("((")).isFalse();
    }

    @Test
    void simpleClosingBracketsShouldBeBalanced() {
        assertThat(isBalanced("[]")).isTrue();
    }

    @Test
    void twoClosingBracketsShouldNotBeBalanced() {
        assertThat(isBalanced("]]")).isFalse();
    }

    @Test
    void complexBalancedExpressionShouldBeBalanced() {
        assertThat(isBalanced("([(())([])])[()]")).isTrue();
    }

    @Test
    void complexUnbalancedExpressionShouldNotBeBalanced() {
        assertThat(isBalanced("[(())([]])[()]")).isFalse();
    }

}
