
package trail_module;

import java.util.Collection;


import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * The TrailTreeSetStore program implements a TreeSet to store catalog
 * of Trail objects
 * The program also allows for versatile searching
 * @author donnobanmaldonado
 *
 */
public class TrailTreeSetStore {
	private static TreeSet<Trail> theSet;

	public TrailTreeSetStore() {
		theSet = new TreeSet<>();
	}
	
	public void add(Trail trail) {
		theSet.add(trail);
	}
	/**
	 * This method is used to add multiple Trail objects at once
	 * @param trailCollection
	 * @return nothing
	 */
	public void addAll(Collection<Trail> trailCollection) {
		theSet.addAll(trailCollection);
	}

	/**
	 * This method is used to remove Trail Objects from theSet
	 * Confirms success using boolean 
	 * @param trail
	 * @return boolean
	 */
	public boolean remove(Trail trail) {
		return theSet.remove(trail);
	}
	
	/**
	 * This method is used to search throughout theSet
	 * Versatile and needs predicate to determine sorting keys
	 * return Set object incase of multiple matches
	 * @param predicate
	 * @return Set<Trail>
	 */
	public Set<Trail> find(Predicate<Trail> predicate) {
		Set<Trail> newSet = theSet.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		return newSet;
	}

	public void display() {
		theSet.stream().forEach(System.out::println);
	}
	
	public TreeSet<Trail> getTreeSet(){
		return theSet;
	}

}
