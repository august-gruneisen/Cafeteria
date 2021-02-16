package food.etc;

import food.Food;

/**
 * State of a unit of {@link Food}
 */
public enum FoodState {
    NOT_READY_FOR_CONSUMPTION, // ie, waiting to ripen
    READY_FOR_CONSUMPTION,
    CONSUMED
}
