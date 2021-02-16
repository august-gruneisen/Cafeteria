package food.fruit;

import food.etc.DigestionSpeed;
import food.etc.EnergyRating;
import food.Food;

public class Banana extends Food {

    private final static EnergyRating energyRating = new EnergyRating(3);

    private final static DigestionSpeed digestionSpeed = DigestionSpeed.HIGH;

    public Banana() {
        super(energyRating, digestionSpeed);
    }
}
