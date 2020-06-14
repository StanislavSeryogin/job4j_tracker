package stringSort;

public class StringSort {
    public static void main(String[] args) {
        String str = "String";
        String str1 = "Strung";
        String str2 = "String";

        int var1 = str.compareTo( str1 );
        System.out.println("str & str1: "+var1);

        int var2 = str.compareTo( str2 );
        System.out.println("str & str2: "+var2);

        int var3 = str1.compareTo("Strung");
        System.out.println("str1 & string argument comparison: "+var3);

        String str3 = "Cow";
        String str4 = "";
        String str5 = "Goat";
        System.out.println(str3.compareTo(str4));
        System.out.println(str4.compareTo(str5));
    }
}
