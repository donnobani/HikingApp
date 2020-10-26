package app;

import java.util.Collection;
import java.util.LinkedList;

import history_model.HistoryLinkedListStore;
import history_model.HistoryToken;
import util.HistoryEvaluator;
import util.Utilities;

public class HistoryDataTester {
	
	public HistoryDataTester() {
		HistoryLinkedListStore historyList = new HistoryLinkedListStore();
		Collection<HistoryToken> list = new LinkedList<>();
		
		for(int i =100; i <=3000; i+=100) {
			list = Utilities.emitHistoryTokens(i);
			historyList.addAll(list);
			final HistoryToken temp = Utilities.getRandHistoryToken(list);
			historyList.find(t -> t.compareTo(temp)==0);
		}
	
		System.out.println("HISTORY\nLINKEDLIST: "+HistoryEvaluator.listResults);

		
	}	}


