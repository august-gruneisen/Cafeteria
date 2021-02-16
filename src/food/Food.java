package food;

import food.etc.DigestionSpeed;
import food.etc.EnergyRating;
import food.etc.FoodState;

/**
 * A unit of edible matter suitable for conversion into energy
 */
public abstract class Food {

    /**
     * Relative energy provided from consumption
     */
    private final EnergyRating energyRating;

    /**
     * How fast this food breaks down into energy when digested
     */
    private final DigestionSpeed digestionSpeed;

    /**
     * Current state of this food
     */
    private FoodState state;

    /**
     * Initializes a new piece of food that is immediately ready for consumption
     *
     * @param energyRating   {@link EnergyRating}
     * @param digestionSpeed {@link DigestionSpeed}
     */
    protected Food(EnergyRating energyRating, DigestionSpeed digestionSpeed) {
        this.energyRating = energyRating;
        this.digestionSpeed = digestionSpeed;
        this.state = FoodState.READY_FOR_CONSUMPTION;
        System.out.println("New " + getClass().getSimpleName());
    }

    /**
     * Returns the energy rating of this piece of food
     */
    int getEnergyRating() {
        return energyRating.getValue();
    }

    /**
     * Returns the {@link DigestionSpeed} of this piece of food
     */
    DigestionSpeed getDigestionSpeed() {
        return digestionSpeed;
    }

    /**
     * Returns true if this piece of food is ready to be consumed
     */
    boolean readyForConsumption() {
        return state == FoodState.READY_FOR_CONSUMPTION;
    }

    /**
     * Called to convert this food into energy
     */
    void consume() {
        state = FoodState.CONSUMED;
        System.out.println("Consumed " + getClass().getSimpleName());
    }
}
