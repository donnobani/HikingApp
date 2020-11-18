package history_module_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

import history_module.History;
import history_module.HistoryToken;

public class HistoryTest {

	@Test
	public void testFind() {
		Random rand = new Random();
		HistoryToken targetToken = new HistoryToken("boop",rand.nextLong(),rand.nextDouble(),rand.nextDouble());
		History history = new History();
		
		history.add(targetToken);
		
		Set<HistoryToken> resultSet = history.find(t->t.compareTo(targetToken)==0);
		HistoryToken resultToken = resultSet.iterator().next();
		
		assertEquals(targetToken, resultToken);
		
	}

}
