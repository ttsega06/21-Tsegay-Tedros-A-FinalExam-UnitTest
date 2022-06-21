import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void negativeOneShouldReturnIllegalArgumentException(){
        var calculator = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    calculator.add("-1,5");
                })
        ;
    }