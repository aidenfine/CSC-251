import java.util.Scanner;

public class Revel {
    public static void main(String[] args){
            Scanner stdin = new Scanner(System.in);
            int number = 1;
            int oddTotal = 0;
            int evenTotal = 0;
            int evenCount = 0;
            int oddCount = 0;
        while (stdin.hasNextInt() && number > 0) {
                if (number % 2 == 0 && number > 0)
                evenTotal = evenTotal + number;


                if (number % 2 != 0 && number > 0)
                oddTotal = oddTotal + number;

            }
        System.out.println(evenTotal + " " + oddTotal + " " + evenCount + " " + oddCount);
        }

}
