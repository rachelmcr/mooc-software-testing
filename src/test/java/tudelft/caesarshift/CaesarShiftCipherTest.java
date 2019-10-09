package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher cipher;

    @BeforeEach
    public void initialize() {
        this.cipher = new CaesarShiftCipher();
    }

    @Test
    public void invalidCharacters() {
        String string = cipher.CaesarShiftCipher("ABC123", 3);
        Assertions.assertEquals("invalid", string);
    }

    @Test
    public void invalidShift() {
        String string = cipher.CaesarShiftCipher("a b c", 0);
        Assertions.assertEquals("invalid", string);
    }

    @Test
    public void positiveShift() {
        String string = cipher.CaesarShiftCipher("a b c", 3);
        Assertions.assertEquals("d e f", string);
    }

    @Test
    public void negativeShift() {
        String string = cipher.CaesarShiftCipher("a b c", -3);
        Assertions.assertEquals("x y z", string);
    }

}
