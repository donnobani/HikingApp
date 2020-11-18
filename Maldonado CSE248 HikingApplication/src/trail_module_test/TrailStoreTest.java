package trail_module_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;


import trail_module.Level;
import trail_module.Trail;
import trail_module.TrailTreeSetStore;
import trail_module.Type;
import utilities.Initializer;

public class TrailStoreTest {

	@Test
	public void testFind() {
		Random rand = new Random();
		Trail targetTrail = new Trail("boop","beep",rand.nextDouble(),rand.nextDouble(),
				Level.EASY,Type.LOOP);
		TrailTreeSetStore trailStore = new TrailTreeSetStore();
		trailStore.addAll(Initializer.emitTrails(100));
		trailStore.add(targetTrail);
		
		Set<Trail> resultSet = trailStore.find(t->t.compareTo(targetTrail)==0);
		Trail resultTrail = resultSet.iterator().next();
		
		assertEquals(targetTrail, resultTrail);
		
	}
}
