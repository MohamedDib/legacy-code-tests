package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.user.User;
import org.craftedsw.tripservicekata.user.UserSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TripServiceTest {

    User u = new User();
    TripService ts = new TripService();

    @BeforeEach
    void initUserTS(){
        u = new User();
        ts = new TripService();
    }

    @Test
	void testIfUserLogged(){

        Assertions.assertTrue(ts.isUserLogged(u));

    }

    @Test
    void testIsFriend(){

        boolean isFriend = false;
        // initialize a friend to u
        User friend = new User();
        u.addFriend(friend);
        // test isFriend
        ts.isFriend(friend,u,isFriend);

    }

    @Test
    void testGetTripsByUsers(){
        // Create some trips
        Trip t1 = new Trip();
        Trip t2 = new Trip();
        // add trips to u
        u.addTrip(t1);
        u.addTrip(t2);
        // prepare expexted trip list
        List<Trip> expextedTrips = new ArrayList<Trip>();
        expextedTrips.add(t1);
        expextedTrips.add(t2);
        // compare
        Assertions.assertEquals(expextedTrips,ts.getTripsByUser(u));
    }

}
