package food.etc;

/**
 * An integer with discrete high and low boundaries
 */
interface BoundedInt {
    /**
     * Verifies a value is within bounds
     *
     * @param value value to check
     * @param low   low bound
     * @param high  high bound
     * @throws IllegalArgumentException if the value is not within bounds
     */
    default void verify(int value, int low, int high) {
        if (value < low || value > high)
            throw new IllegalArgumentException("Value out of bounds for " + getClass().getName());
    }
}
