package lambda.lambdaArgument;

public class LambdaArgument {
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda - Expressions Extends Java";
        String outStr;
        System.out.println("Input string: " + inStr);

        StringFunc reverse = str -> {
            StringBuilder result = new StringBuilder();
            for (int i = str.length()-1; i >= 0; i--) {
                result.append(str.charAt(i));
            } return result.toString();
        };

        outStr = changeStr(reverse, inStr);
        System.out.println("Reverse string: " + outStr);

        outStr = changeStr((str) -> str.replace(' ', '-'), inStr);
        System.out.println("String with spaced replaced: " + outStr);

        outStr = changeStr((str) -> {
            String result = "";
            char ch;
            for (int i = 0; i < str.length(); i++) {
                ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result += Character.toLowerCase(ch);
                } else {
                    result += Character.toUpperCase(ch);
                }
            }return result;
        }, inStr);
        System.out.println("Inverted string: " + outStr);
    }
}
