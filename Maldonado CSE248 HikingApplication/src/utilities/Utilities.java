package util;


import java.util.Collection;

import java.util.LinkedList;
import java.util.Random;


import history_model.HistoryToken;
import trail_model.Trail;
import user_model.User;

public class Utilities {

	
	public static Collection<Trail> emitTrails(int number) {
		Collection<Trail> list = new LinkedList<>();
		Random rand = new Random();
		Trail temp;
		for(int i = 0; i < number; i++) {
			temp = new Trail(Utilities.spitName(rand.nextInt(20)+i));
			if(!list.contains(temp)) {
				list.add(temp);
			}
			temp = new Trail(Utilities.spitName(rand.nextInt(20)));
		}
		
		return list;
	}
	
	public static Collection<User> emitUsers(int number){
		Collection<User> list = new LinkedList<>();
		Random rand = new Random();
		User temp;
		for(int i = 0; i < number; i++) {
			temp = new User(Utilities.spitName(rand.nextInt(20)+i));
			if(!list.contains(temp)) {
				list.add(temp);
			}
			temp = new User(Utilities.spitName(rand.nextInt(20)+i));
		}
		return list;
	}
	
	public static Collection<HistoryToken> emitHistoryTokens(int number) {
		Collection<HistoryToken> list = new LinkedList<>();
		Random rand = new Random();
		HistoryToken temp;
		for(int i = 0; i < number; i++) {
			temp = new HistoryToken(Utilities.spitName(rand.nextInt(20)+i));
			if(!list.contains(temp)) {
				list.add(temp);
			}
			temp = new HistoryToken(Utilities.spitName(rand.nextInt(20)));
		}
		
		return list;
	}
	
	public static String spitName(int length) {
		int leftLimit = 32; 
	    int rightLimit = 122; 
	    int targetStringLength = length;
	    Random random = new Random();
	    StringBuilder buffer = new StringBuilder(targetStringLength);
	    for (int i = 0; i < targetStringLength; i++) {
	        int randomLimitedInt = leftLimit + (int) 
	          (random.nextFloat() * (rightLimit - leftLimit + 1));
	        buffer.append((char) randomLimitedInt);
	    }
	    String generatedString = buffer.toString();
	    return generatedString;
	}
	
	public static Trail getRandTrail(Collection<Trail> list) {
		Object[] arr = list.toArray();
		Random rand = new Random();
		return (Trail) arr[rand.nextInt(arr.length)];
				
	}
	
	public static User getRandUser(Collection<User> list) {
		Object[] arr = list.toArray();
		Random rand = new Random();
		return (User) arr[rand.nextInt(arr.length)];
	}
	
	public static HistoryToken getRandHistoryToken(Collection<HistoryToken> list) {
		Object[] arr = list.toArray();
		Random rand = new Random();
		return (HistoryToken) arr[rand.nextInt(arr.length)];
	}
	

}
