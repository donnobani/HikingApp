package app;

import java.util.Collection;
import java.util.LinkedList;

import user_model.User;
import user_model.UserTreeMapStore;
import user_model.UserTreeSetStore;
import util.UserEvaluator;
import util.Utilities;

public class UserDataTester {
	
	public UserDataTester() {
		UserTreeSetStore userSet = new UserTreeSetStore();
		UserTreeMapStore userMap = new UserTreeMapStore();
		Collection<User> list = new LinkedList<>();
		
		for(int i =100; i <=3000; i+=100) {
			list = Utilities.emitUsers(i);
			userSet.addAll(list);
			userMap.addAll(list);
			final User user = Utilities.getRandUser(list);
			userSet.find(t -> t.compareTo(user)==0);
			userMap.find(t -> t.compareTo(user)==0);	
		}
	
		System.out.println("USERS\nSet: "+UserEvaluator.setResults
				+ "\nMap: "+UserEvaluator.mapResults);
		
	}

}
