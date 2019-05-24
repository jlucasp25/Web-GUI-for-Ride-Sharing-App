package rsa.client;

import java.io.IOException;
import java.util.Set;

import com.google.gwt.user.client.rpc.AsyncCallback;


import rsa.shared.Location;
import rsa.shared.PreferredMatch;
import rsa.shared.RideMatchInfo;
import rsa.shared.RideRole;
import rsa.shared.RideSharingAppException;
import rsa.shared.UserStars;

public interface RideSharingServiceAsync {
	//Declarei as versoes assincronas dos metodos da interface RideSharingServiceAsync
	//Retornam void e o retorno antigo passa para a parametrização de AsyncCallback<T>
	void acceptMatch(long rideId, long matchId,AsyncCallback<Void> callback);

	void addRide(String nick, String password, Location from, Location to, String plate, float cost,AsyncCallback<Long> callback)
			throws RideSharingAppException;

	void authenticate(String nick, String password,AsyncCallback<Boolean> callback);

	void concludeRide(long rideId, UserStars classification,AsyncCallback<Void> callback);

	void getAverage(String nick, RideRole role,AsyncCallback<Double> callback) throws RideSharingAppException;

	void getPreferredMatch(String nick, String password,AsyncCallback<PreferredMatch> callback) throws RideSharingAppException;

	void register(String nick, String name, String password,AsyncCallback<Boolean> callback) throws RideSharingAppException;

	void reset(AsyncCallback<Void> callback) throws RideSharingAppException, IOException;

	void setPreferredMatch(String nick, String password, PreferredMatch preferred,AsyncCallback<Void> callback) throws RideSharingAppException;

	void updatePassword(String nick, String oldPassword, String newPassword,AsyncCallback<Boolean> callback) throws RideSharingAppException;

	void updateRide(long rideId, Location current,AsyncCallback< Set<RideMatchInfo> > callback);

}
