import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    @Test
    public void testDiceConstructor() {
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);

        Assert.assertNull(dice);
    }

}