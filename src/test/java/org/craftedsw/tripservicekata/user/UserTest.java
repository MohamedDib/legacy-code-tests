package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    User u1 = new User();
    User u2 = new User();

    Trip t1 = new Trip();
    Trip t2 = new Trip();

    @BeforeEach
    void reInitUsers(){
        u1 = new User();
        u2 = new User();
    }

    @BeforeEach
    void reInitUTrips(){
         t1 = new Trip();
         t2 = new Trip();
    }
    @Test
    void testUserFriends(){
        // add u1 as a friend
        u1.addFriend(u2);
        // Fill expected results
        List<User> friends = new ArrayList<User>();
        friends.add(u2);
        //Assertion
        Assertions.assertEquals(friends,u1.getFriends());

    }

    @Test
    void testUserTrips(){
        // Add trips to user u1
        u1.addTrip(t1);
        u1.addTrip(t2);

        // Fill expected results
        List<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);
        // Compare expected results VS actual
        Assertions.assertEquals(trips,u1.getTrips());
    }


}
