public class Main {

    // String toString method.
    public static void main(String[] args) {


        Player player1 = new Player();

        player1.setName("jacob");
        player1.setHeight(42);

        String p1Name = player1.getName();
        int p1H = player1.getHeight();
        System.out.println(p1Name + " " + p1H);
    }
}