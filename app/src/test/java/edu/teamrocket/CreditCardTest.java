package edu.teamrocket;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CreditCardTest {

    CreditCard testcard = new CreditCard("test", "99999999");

    @Test
    public void payTest() {
        testcard.setCredit(1000);
        assertEquals(1000, testcard.credit());
        testcard.pay(500);
        assertEquals(500, testcard.credit());
    }
    
}
