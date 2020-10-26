package user_model;

import java.util.Collection;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import util.UserEvaluator;

public class UserTreeSetStore {
	private static TreeSet<User> theSet;

	public UserTreeSetStore() {
		theSet = new TreeSet<>();
	}

	public void add(User u) {
		theSet.add(u);
	}

	public void addAll(Collection<User> userCollection) {
		theSet.addAll(userCollection);
	}

	public boolean remove(User u) {
		return theSet.remove(u);
	}

	public Set<User> find(Predicate<User> predicate) {
		long start = System.currentTimeMillis();
		Set<User> newSet = theSet.stream().filter(t -> predicate.test(t)).collect(Collectors.toSet());
		long end = System.currentTimeMillis();
		long timeTook = end - start;
		UserEvaluator.setResults.add((int) timeTook);
		return newSet;
	}

	public void display() {
		theSet.stream().forEach(System.out::println);
	}
}
