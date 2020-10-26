package history_model;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import util.HistoryEvaluator;

public class HistoryLinkedListStore {
	private static LinkedList<HistoryToken> theList;
	
	public HistoryLinkedListStore() {
		theList = new LinkedList<>();
	}
	
	public void add(HistoryToken token) {
		theList.add(token);
	}
	
	public void addAll(Collection<HistoryToken> tokenCollection) {
		theList.addAll(tokenCollection);
	}
	
	public boolean remove(HistoryToken token) {
		return theList.remove(token);
	}
	
	public Set<HistoryToken> find(Predicate<HistoryToken> predicate) {
		long start = System.currentTimeMillis();
		Set<HistoryToken> newSet = theList.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		long end = System.currentTimeMillis();
		long timeTook = end - start;
		HistoryEvaluator.listResults.add((int) timeTook);
		return newSet;
	}
	
	public void display() {
		theList.stream().forEach(System.out::println);
	}

}
