package food.veggie;

import food.Food;
import food.etc.DigestionSpeed;
import food.etc.EnergyRating;

public class Carrot extends Food {

    private final static EnergyRating energyRating = new EnergyRating(2);

    private final static DigestionSpeed digestionSpeed = DigestionSpeed.MEDIUM;

    public Carrot() {
        super(energyRating, digestionSpeed);
    }
}
