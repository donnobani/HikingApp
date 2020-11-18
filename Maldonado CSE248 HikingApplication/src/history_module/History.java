package history_module;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * History allows Users to catalog their previously hiked trails
 * using historyToken objects.
 * 
 * @author Donnoban Maldonado
 * @see HistoryToken
 *
 */
public class History {
	private static LinkedList<HistoryToken> theList;
	
	public History() {
		theList = new LinkedList<>();
	}
	
	/**
	 * This method inserts a HistoryToken Object into linkedList 
	 * @param token
	 * @return nothing
	 */
	public void add(HistoryToken token) {
		theList.add(token);
	}
	/**
	 * This method inserts allows the insertion of multiple tokens at once
	 * using the Collection class
	 * @param tokens
	 */
	public void addAll(Collection<HistoryToken> tokens) {
		theList.addAll(tokens);
	}
	
	/**
	 * This method allows the user to remove a target HistoryToken
	 * and confirms success with a boolean 
	 * @param token
	 * @return boolean
	 */
	public boolean remove(HistoryToken token) {
		return theList.remove(token);
	}
	
	/**
	 * This method allows the user to search the history LinkedList
	 * however they so choose using Predicates
	 * For example, name or distance
	 * Returns set of found historyTokens incase of trails with same name
	 * @param predicate
	 * @return Set<HistoryToken>
	 */
	public Set<HistoryToken> find(Predicate<HistoryToken> predicate) {
		Set<HistoryToken> newSet = theList.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		return newSet;
	}
	
	/**
	 * This is a util method that returns the main LinkedList in History
	 * 
	 * @return LinkedList
	 */
	public LinkedList<HistoryToken> getList(){
		return theList;
	}
	
	/**
	 * This method facilitates the display of each historyToken in list
	 * @return nothing
	 */
	public void display() {
		theList.stream().forEach(t-> t.toString());
		
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		theList.stream().forEach(t->builder.append(t+" ,"));
		return builder.toString();
	}
	
	

}
