import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

public class BodyMassIndexTest {

    public void testBodyMassIndex(){
        BodyMassIndex b = new BodyMassIndex(10, 20);

        Assertions.assertEquals(10, b.getHeight());
        Assertions.assertEquals(20, b.getWeight());
    }

    public void testCalculateBMI(){
        BodyMassIndex b = new BodyMassIndex(63, 150);

        double testBMI = b.calculateBMI();

        Assertions.assertEquals(26, testBMI);
    }
}
