package history_module;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class History {
	private static LinkedList<HistoryToken> theList;
	
	public History() {
		theList = new LinkedList<>();
	}
	
	public void add(HistoryToken token) {
		theList.add(token);
	}
	
	public void addAll(Collection<HistoryToken> tokens) {
		theList.addAll(tokens);
	}
	
	public boolean remove(HistoryToken token) {
		return theList.remove(token);
	}
	
	public Set<HistoryToken> find(Predicate<HistoryToken> predicate) {
		Set<HistoryToken> newSet = theList.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		return newSet;
	}
	
	public void display() {
		theList.stream().forEach(System.out::println);
	}

}
