package org.craftedsw.tripservicekata.trip;

import java.util.ArrayList;
import java.util.List;

import org.craftedsw.tripservicekata.user.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;

public class TripService {



	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		// it's not possible to use user session because it's not possible to use it tests
		boolean isFriend = false;

		List<Trip> tripList = new ArrayList<Trip>();

		if (isUserLogged(user)) {
			isFriend = isFriend(user, user, isFriend);
			if (!isFriend) {
				tripList = TripDAO.findTripsByUser(user);
			}
			return tripList;
		} else {
			throw new UserNotLoggedInException();
		}
	}

	public boolean isFriend(User user, User loggedUser, boolean isFriend) {
		for (User friend : user.getFriends()) {
			if (friend.equals(loggedUser)) {
				isFriend = true;
				break;
			}
		}
		return isFriend;
	}

	public boolean isUserLogged(User user){
		if (user != null) {
			return true;
		}else {
			return false;
		}
	}
	
}
