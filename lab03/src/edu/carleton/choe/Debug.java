package edu.carleton.choe;

/**
 * Created by EunjinCho on 9/24/15.
 */
public class Debug {

    String myString;

    public Debug(String s) {
        myString = s;
    }

    /**
     * Return true when myString is the result of inserting exactly one
     * character into s, and return false otherwise.
     */
    public boolean contains1MoreThan(String s) {
        if (myString.length() == 0) {
            return false;
        } else if (s.length() == 0) {
            return myString.length() == 1;
        } else if (myString.charAt(0) == s.charAt(0)) {
            Debug remainder = new Debug(myString.substring(1));
            return remainder.contains1MoreThan(s.substring(1));
        } else {
            return myString.substring(1) == s;
        }
    }

    public static void main(String[] args) {
        check("abc", "def"); // should be false
        check("abc2", "abc"); // should be true
        check("1234", "123"); // should be true
        check("ab2", "ab2"); // should be false
        check("abc", "abc");

    }

    public static void check(String s1, String s2) {
        Debug d = new Debug(s1);
        if (d.contains1MoreThan(s2)) {
            System.out.println(s1
                    + " is the result of adding a single character to " + s2);
        } else {
            System.out.println(s1
                    + " is not the result of adding a single character to "
                    + s2);
        }
    }

}
