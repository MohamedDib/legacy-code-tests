package org.craftedsw.tripservicekata.user;

import org.craftedsw.tripservicekata.trip.Trip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    @Test
    void testAddFriends(){
        // initialize data
        User u1 = new User();
        User u2 = new User();

        // add u1 as a friend
        u1.addFriend(u2);
        // Fill expected results
        List<User> friends = new ArrayList<User>();
        friends.add(u2);
        //Assertion
        Assertions.assertEquals(friends,u1.friends);

    }

    @Test
    void testGetFriends(){
        // initialize data
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        // add u1 as a friend
        u1.friends.add(u2);
        u1.friends.add(u3);
        // Add u2 to the friend list
        List<User> friends = new ArrayList<User>();
        friends.add(u2);
        friends.add(u3);
        //Assertion
        Assertions.assertEquals(friends,u1.getFriends());

    }

    @Test
    void testAddTrips(){
        // initialize data
        User u1 = new User();
        Trip t1 = new Trip();
        Trip t2 = new Trip();

        // Add trips to user u1
        u1.addTrip(t1);
        u1.addTrip(t2);

        // Fill expected results
        List<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);
        // Compare expected results VS actual
        Assertions.assertEquals(trips,u1.trips);
    }

    @Test
    void testGetTrips(){
        // initialize data
        User u1 = new User();
        Trip t1 = new Trip();
        Trip t2 = new Trip();

        // Add trips to user u1
        u1.trips.add(t1);
        u1.trips.add(t2);

        // Fill expected results
        List<Trip> trips = new ArrayList<Trip>();
        trips.add(t1);
        trips.add(t2);
        // Compare expected results VS actual
        Assertions.assertEquals(trips,u1.getTrips());
    }
}
