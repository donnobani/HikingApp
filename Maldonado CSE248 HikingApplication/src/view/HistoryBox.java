package view;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import history_module.History;
import history_module.HistoryToken;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import trail_module.Trail;
import user_module.User;


public class HistoryBox {
	private VBox mainBox = new VBox();
	private ListView<HistoryToken> historyListView = new ListView<HistoryToken>();
	private History history;
	
	public HistoryBox() {
		history = ProfileScene.getHistory();
		mainBox.setPrefSize(200, 500);
		mainBox.setStyle("-fx-border-color: black");
		
		
		historyListView.setPrefSize(200, 500);
		historyListView.setItems(getObsList());
		mainBox.getChildren().add(historyListView);
		
	}
	
	
	public VBox getHistoryBox() {
		return mainBox;
	}
	
	public ObservableList<HistoryToken> getObsList(){
		//List<HistoryToken> list = new ArrayList<HistoryToken>(history.getList());
	//	ObservableList<HistoryToken> obsList = FXCollections.observableList(list);
		//return obsList;
		return null;
	}

	public void setHistory(History history) {
		this.history = history;
	}
	

}
