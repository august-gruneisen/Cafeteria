package food.etc;

/**
 * The level of energy attained from consuming a particular food
 */
public class EnergyRating implements BoundedInt {

    private static final int LOW = 1;
    private static final int HIGH = 10;

    private final int value;

    /**
     * Initializes an energy rating between {@value LOW} and {@value HIGH}
     *
     * @param value relative energy rating
     */
    public EnergyRating(int value) {
        verify(value, LOW, HIGH);
        this.value = value;
    }

    /**
     * Returns the relative energy rating
     */
    public int getValue() {
        return value;
    }
}