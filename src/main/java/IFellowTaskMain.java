import org.apache.commons.lang3.StringUtils;

public class IFellowTaskMain {

    public static String validBrackets(String str) {
        if (str.equals("")) {
            return str;
        }
        int countCloseBrackets = 0;
        int countOpenBrackets = 0;
        StringBuilder resultStr = new StringBuilder();
        StringBuilder tempStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                do {
                    if (str.charAt(i) == '(') {
                        countOpenBrackets++;
                        tempStr.append(str.charAt(i));
                    } else {
                        countCloseBrackets++;
                        tempStr.append(str.charAt(i));
                    }
                    i++;
                    if (i == str.length()) {
                        if (countOpenBrackets > countCloseBrackets) {
                            tempStr = new StringBuilder(validBrackets(tempStr.replace(0, 1, "").toString()));
                        }
                        break;
                    }
                }
                while (countOpenBrackets > countCloseBrackets);
                resultStr.append(tempStr);
                countOpenBrackets = 0;
                countCloseBrackets = 0;
                tempStr = new StringBuilder();
                i--;
            }
        }
        return resultStr.toString();
    }

    public static String getAnswer(String str) {
        String validBrackets = validBrackets(str);
        int countBrackets = validBrackets.length();
        if (countBrackets == 0) {
            return "0";
        }
        return String.format("%s - %s", countBrackets, validBrackets);
    }

    public static void main(String[] args) {
        System.out.println(getAnswer("())(()())(()"));
    }
}
