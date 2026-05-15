package edu.teamrocket;

import java.util.ArrayList;
import java.util.List;

public class Receptivo implements GuestDispatcher {

    private List<GuestDispatcher> dispatchers = new ArrayList<GuestDispatcher>();

    public void registra(GuestDispatcher service) {
        dispatchers.add(service);
    }

    public void dispatch(PaymentMethod card) {
        for (GuestDispatcher service : dispatchers) {
            service.dispatch(card);
        }
    }
    
}
