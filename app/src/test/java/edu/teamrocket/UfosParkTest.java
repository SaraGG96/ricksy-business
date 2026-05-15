package edu.teamrocket;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class UfosParkTest {
    
    UfosPark parktest = new UfosPark();

    @Test
    public void addTest() {
        parktest.add("ovni1");
        parktest.add("ovni2");
        parktest.add("ovni3");
        assert(parktest.toString().equals("UfosPark con 3 ufos alquilados."));
    }

    @Test
    public void dispatchTest() {
        PaymentMethod card1 = new CreditCard("Ricky", "1234567890123456");
        parktest.add("ovni1");
        parktest.dispatch(card1);
        assertEquals("ovni1", parktest.getUfoOf("1234567890123456"));
    }



}
