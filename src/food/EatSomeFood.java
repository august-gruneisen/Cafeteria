package food;

import food.fruit.Apple;
import food.fruit.Banana;
import food.veggie.Carrot;

public class EatSomeFood {
    public static void main(String[] args) {
        Food myApple = new Apple();
        Food myBanana = new Banana();
        Food[] myCarrots = {new Carrot(), new Carrot(), new Carrot()};

        consoleDivider();

        if (myApple.readyForConsumption()) {
            System.out.println("Mmm an apple!");
            myApple.consume();
        }

        consoleDivider();

        if (myBanana.readyForConsumption()) {
            System.out.println("Ooo a banana!");
            myBanana.consume();
        }

        consoleDivider();

        for (int i = 0; i < myCarrots.length; i++) {
            Food carrot = myCarrots[i];
            if (carrot.readyForConsumption()) {
                System.out.printf("%d carrot...%n", i + 1);
                carrot.consume();
            }
        }

        consoleDivider();

        System.out.println("That was a light snack, and not half bad!");
    }

    private static void consoleDivider() {
        System.out.println("-------------------");
    }
}
