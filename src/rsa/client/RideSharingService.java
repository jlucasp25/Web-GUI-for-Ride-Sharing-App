package rsa.client;

import java.io.IOException;
import java.util.Set;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import rsa.service.Matcher;
import rsa.service.Users;
import rsa.shared.Location;
import rsa.shared.PreferredMatch;
import rsa.shared.RideMatchInfo;
import rsa.shared.RideRole;
import rsa.shared.RideSharingAppException;
import rsa.shared.UserStars;

@RemoteServiceRelativePath("rsa")
public interface RideSharingService extends RemoteService {
	
	//Declarei todos os metodos do manager aqui para eles serem chamados no RideSharingServiceImpl que implementa isto
	
	void acceptMatch(long rideId, long matchId);

	long addRide(String nick, String password, Location from, Location to, String plate, float cost)
			throws RideSharingAppException;

	boolean authenticate(String nick, String password);

	void concludeRide(long rideId, UserStars classification);

	double getAverage(String nick, RideRole role) throws RideSharingAppException;

	PreferredMatch getPreferredMatch(String nick, String password) throws RideSharingAppException;

	boolean register(String nick, String name, String password) throws RideSharingAppException;

	void reset() throws RideSharingAppException, IOException;

	void setPreferredMatch(String nick, String password, PreferredMatch preferred) throws RideSharingAppException;

	boolean updatePassword(String nick, String oldPassword, String newPassword) throws RideSharingAppException;

	Set<RideMatchInfo> updateRide(long rideId, Location current);

	Users getAllUsers();

	void setAllUsers(Users allUsers);

	Matcher getMatcher();

	void setMatcher(Matcher matcher);

}