import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IFellowTaskTest {

    @Test
    public void test1() {
        assertEquals("16 - (()(()(((())))))", IFellowTaskMain.getAnswer("))(()(()(((()))))))"));
    }

    @Test
    public void test2() {
        assertEquals("0", IFellowTaskMain.getAnswer("))))((("));
    }

    @Test
    public void test3() {
        assertEquals("4 - ()()", IFellowTaskMain.getAnswer(")()())"));
    }

    @Test
    public void test4() {
        assertEquals("6 - (()())", IFellowTaskMain.getAnswer(")(()())"));
    }

    @Test
    public void test5() {
        assertEquals("0", IFellowTaskMain.getAnswer(")("));
    }

    @Test
    public void test6() {
        assertEquals("4 - ()()", IFellowTaskMain.getAnswer(")(()()"));
    }

    @Test
    public void test7() {
        assertEquals("4 - ()()", IFellowTaskMain.getAnswer("(()((()(((("));
    }

    @Test
    public void test8() {
        assertEquals("12 - (())()()(())", IFellowTaskMain.getAnswer(")(())(((()()(())"));
    }

    @Test
    public void test9() {
        assertEquals("10 - ()(()())()", IFellowTaskMain.getAnswer("())(()())(()"));
    }
}
