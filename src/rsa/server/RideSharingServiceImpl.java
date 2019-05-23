package rsa.server;

import java.io.IOException;
import java.util.Set;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import rsa.client.RideSharingService;
import rsa.service.Manager;
import rsa.service.Matcher;
import rsa.service.Users;
import rsa.shared.Location;
import rsa.shared.PreferredMatch;
import rsa.shared.RideMatchInfo;
import rsa.shared.RideRole;
import rsa.shared.RideSharingAppException;
import rsa.shared.UserStars;

public class RideSharingServiceImpl extends RemoteServiceServlet implements RideSharingService {
	
	private static final long serialVersionUID = 1L;
	private Manager managerInstance = null;
	
	public RideSharingServiceImpl() throws RideSharingAppException {
	this.managerInstance = Manager.getInstance();
	}
	
	public void acceptMatch(long rideId, long matchId) {
		this.managerInstance.acceptMatch(rideId, matchId);
	}

	public long addRide(String nick, String password, Location from, Location to, String plate, float cost) throws RideSharingAppException {
		return this.managerInstance.addRide(nick, password, from, to, plate, cost);
	}
	
	public boolean authenticate(String nick, String password) {
		return this.managerInstance.authenticate(nick, password);
	}
	
	public void concludeRide(long rideId, UserStars classification) {
		this.managerInstance.concludeRide(rideId, classification);
	}
	
	public double getAverage(String nick, RideRole role) throws RideSharingAppException {
		return this.managerInstance.getAverage(nick, role);
	}

	public PreferredMatch getPreferredMatch(String nick, String password) throws RideSharingAppException {
		return this.managerInstance.getPreferredMatch(nick, password);
	}
	
	public boolean register(String nick, String name, String password) throws RideSharingAppException {
		return this.managerInstance.register(nick, name, password);
	}

	public void setPreferredMatch(String nick, String password, PreferredMatch preferred) throws RideSharingAppException {
		this.managerInstance.setPreferredMatch(nick, password, preferred);
	}
	
	public boolean updatePassword(String nick, String oldPassword, String newPassword) throws RideSharingAppException {
		return this.managerInstance.updatePassword(nick, oldPassword, newPassword);
	}
	
	public Set<RideMatchInfo> updateRide(long rideId, Location current) {
		return this.managerInstance.updateRide(rideId, current);
	}
	
	public Users getAllUsers() {
		return this.managerInstance.getAllUsers();
	}

	public void setAllUsers(Users allUsers) {
		this.managerInstance.setAllUsers(allUsers);
	}
	
	public Matcher getMatcher() {
		return this.managerInstance.getMatcher();
	}
	
	public void setMatcher(Matcher matcher) {
		this.managerInstance.setMatcher(matcher);
	}
	
	public void reset() throws RideSharingAppException, IOException {
		this.managerInstance.reset();
	}

}
