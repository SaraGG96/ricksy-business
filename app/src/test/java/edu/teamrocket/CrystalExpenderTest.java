package edu.teamrocket;

import org.junit.jupiter.api.Test;

public class CrystalExpenderTest {

    CrystalExpender testExpender = new CrystalExpender(10, 500);
    CreditCard testCard = new CreditCard("test", "99999999");
    
    @Test
    public void dispatchTest() {
        testCard.setCredit(2000);
        testExpender.dispatch(testCard);
        assert(testExpender.stock() == 9);
    }

}
