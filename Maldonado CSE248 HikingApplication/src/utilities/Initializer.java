package utilities;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

import trail_module.Trail;
import trail_module.TrailTreeSetStore;
import user_module.User;
import user_module.UserTreeMapStore;

public class Initializer {
	
	public static TrailTreeSetStore trailStoreInit(int size) {
		TrailTreeSetStore trailStore = new TrailTreeSetStore();
		trailStore.addAll(emitTrails(size));
		return trailStore;
	}
	
	public static UserTreeMapStore userStoreInit(int size) {
		UserTreeMapStore userStore = new UserTreeMapStore();
		userStore.addAll(emitUsers(size));
		return userStore;

	}
	
	public static Collection<Trail> emitTrails(int size){
		Collection<Trail> list = new LinkedList<>();
		Trail temp;
		for(int i = 0; i < size; i++) {
			temp = new Trail(TokenFactory.spitTrailName(),
					TokenFactory.spitAddress(),
					TokenFactory.spitLength(),
					TokenFactory.spitGain(),
					TokenFactory.spitLevel(),
					TokenFactory.spitType());
			list.add(temp);
			
		}
		
		return list;
	}
	
	public static Collection<User> emitUsers(int size){
		Collection<User> list = new LinkedList<>();
		User temp;
		for(int i = 0; i < size; i++) {
			temp = new User(TokenFactory.spitUsername(),
					TokenFactory.spitPassword(),
					TokenFactory.spitUserType(),
					TokenFactory.spitHistory());
			while(list.contains(temp)){
				temp = new User(TokenFactory.spitUsername(),
						TokenFactory.spitPassword(),
						TokenFactory.spitUserType(),
						TokenFactory.spitHistory());
			}
			if(i == 1 ) {
				System.out.println(temp.toString());
			}
			list.add(temp);	
			
		}
		
		return list;
	}


	

}
