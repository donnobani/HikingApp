package trail_model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import util.TrailEvaluator;

public class TrailMapStore {
	private static TreeMap<String, Trail> theMap;

	public TrailMapStore() {
		theMap = new TreeMap<>();
	}
	
	public void add(Trail trail) {
		theMap.put(trail.getName(), trail);
	}
	
	public void addAll(Collection<Trail> trailCollection) {
		theMap.putAll(trailCollection.stream().collect(Collectors.toMap(Trail::getName, trail->trail)));
	}
	
	public boolean remove(Trail trail) {
		return theMap.remove(trail.getName(), trail);
	}
	
	public Set<Trail> find(Predicate<Trail> predicate){
		long start = System.currentTimeMillis();
		Set<Trail> tempSet = new HashSet<>(theMap.values());
		long end = System.currentTimeMillis();
		long timeTook = end - start;
		TrailEvaluator.mapResults.add((int) timeTook);
		return tempSet.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());	
	}
	
	public void display() {
		theMap.forEach((k,v)->{
			System.out.println(v);
		});
	}
	

}
