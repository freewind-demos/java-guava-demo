package demo;

import com.google.common.base.Strings;

public class Hello {

    public static void main(String[] args) {
        System.out.println(Strings.commonPrefix("abc", "abd"));
        System.out.println(Strings.commonSuffix("123", "223"));
    }

}
