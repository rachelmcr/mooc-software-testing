package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {

    private GHappy happy;

    @BeforeEach
    public void initialize() {
        this.happy = new GHappy();
    }

    @Test
    public void singleG() {
        boolean result = happy.gHappy("xgx");
        Assertions.assertFalse(result);
    }

    @Test
    public void twoGs() {
        boolean result = happy.gHappy("xggx");
        Assertions.assertTrue(result);
    }

    @Test
    public void separatedGs() {
        boolean result = happy.gHappy("xgxgx");
        Assertions.assertFalse(result);
    }

    @Test
    public void onlyG() {
        boolean result = happy.gHappy("g");
        Assertions.assertFalse(result);
    }
}
