package user_module;

import java.util.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class UserTreeMapStore {

	private static TreeMap<String, User> theMap;

	public UserTreeMapStore() {
		theMap = new TreeMap<>();
	}
	
	public void add(User user) {
		theMap.put(user.getUsername(),user);
	}
	
	public void addAll(Collection<User> trailCollection) {
		theMap.putAll(trailCollection.stream().collect(Collectors.toMap(User::getUsername, user->user)));
	}
	
	public boolean remove(User user) {
		return theMap.remove(user.getUsername(),user);
	}
	
	public Set<User> find(Predicate<User> predicate){
		Set<User> tempSet = new HashSet<>(theMap.values());
		return tempSet.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());	
	}
	
	public void display() {
		theMap.forEach((k,v)->{
			System.out.println(k+", "+v);
		});
	}
	

}
