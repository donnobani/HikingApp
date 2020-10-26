
package trail_model;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import util.TrailEvaluator;

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
		long start = System.currentTimeMillis();
		Set<Trail> newSet = theSet.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		long end = System.currentTimeMillis();
		long timeTook = end - start;
		TrailEvaluator.setResults.add((int) timeTook);
		return newSet;
	}

	public void display() {
		theSet.stream().forEach(System.out::println);
	}
}
