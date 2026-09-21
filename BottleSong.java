package Java;

public class BottleSong {

    public static void main(String[] args) {

        int bottleNumber = 10;
        String word = "bottles";

        while (bottleNumber >= 0) {

            System.out.println("if one green bottle should accidentally fall then...");

            bottleNumber = bottleNumber - 1;

            if (bottleNumber == 1) {
                word = "bottle";
            }

            if (bottleNumber == 0) {
                System.out.println("Fertig luschtig.. keni me übrig");
                break;
            }
            System.out.println(bottleNumber + " green " + word + " hanging on the wall ");
        }

    }

}