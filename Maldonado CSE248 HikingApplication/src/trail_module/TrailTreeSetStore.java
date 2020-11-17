
package trail_module;

import java.util.Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TrailTreeSetStore {
	private static TreeSet<Trail> theSet;

	public TrailTreeSetStore() {
		theSet = new TreeSet<>();
	}

	public void add(Trail trail) {
		theSet.add(trail);
	}

	public void addAll(Collection<Trail> trailCollection) {
		theSet.addAll(trailCollection);
	}

	public boolean remove(Trail trail) {
		return theSet.remove(trail);
	}
	

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
