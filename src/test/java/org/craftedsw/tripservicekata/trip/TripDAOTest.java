package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TripDAOTest {

    @Test
    void testfindTripsByUser(){
        User u = new User();

        Trip t1 = new Trip();
        Trip t2 = new Trip();

        u.addTrip(t1);
        u.addTrip(t2);

        ArrayList<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);

        Assertions.assertEquals(trips, TripDAO.findTripsByUser(u));
    }

}
