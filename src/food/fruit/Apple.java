package food.fruit;

import food.etc.DigestionSpeed;
import food.etc.EnergyRating;
import food.Food;

public class Apple extends Food {

    private final static EnergyRating energyRating = new EnergyRating(2);

    private final static DigestionSpeed digestionSpeed = DigestionSpeed.HIGH;

    public Apple() {
        super(energyRating, digestionSpeed);
    }
}
