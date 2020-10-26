package app;

import java.util.Collection;
import java.util.LinkedList;

import trail_model.Trail;
import trail_model.TrailMapStore;
import trail_model.TrailTreeSetStore;
import util.TrailEvaluator;
import util.Utilities;

public class TrailDataTester{
	
	public TrailDataTester() {
		TrailTreeSetStore trailTreeSet = new TrailTreeSetStore();
		TrailMapStore trailMap = new TrailMapStore();
		Collection<Trail> list = new LinkedList<>();

		for(int i =100; i <=3000; i+=100) {
			list = Utilities.emitTrails(i);
			trailTreeSet.addAll(list);
			trailMap.addAll(list);
			final Trail trail = Utilities.getRandTrail(list);
			trailTreeSet.find(t -> t.compareTo(trail)==0);
			trailMap.find(t -> t.compareTo(trail)==0);	
		}
	
		System.out.println("TRAILS\nSet: "+TrailEvaluator.setResults
				+ "\nMap: "+TrailEvaluator.mapResults);
	}

}
