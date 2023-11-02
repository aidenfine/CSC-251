package strings;

public class strings {
    public static void main(String[] args){
        String s = "Hello World!";
        "Welcome".replace('e', 'A'); // WAlcomA
        "Welcome".replaceFirst("e", "AB"); // WABlcome

        System.out.println("Java".matches("Java")); // true
        System.out.println("Java".equals("Java")); // true


        // Char to Array
        char[] chars = "Java".toCharArray();

        // array of char into string
        String cToArray = new String(new char[]{'j','a','v','a'});
        System.out.println(cToArray);
    }
}
