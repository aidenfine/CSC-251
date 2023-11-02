package DataStructures;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.nextLine();
        Boolean res = isPalindrome(s);
        System.out.println(res);

    }

    public static boolean isPalindrome(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                st.append(c);
            }
        }

        String original = st.toString();
        String reversed = st.reverse().toString();

        return original.equalsIgnoreCase(reversed);
    }


}

