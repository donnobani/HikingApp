package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import trail_module.Trail;
import trail_module.TrailTreeSetStore;

public class CatalogBox {
	private HBox mainBox = new HBox();
	private ListView<Trail> trailListView = new ListView<Trail>();
	private TrailTreeSetStore trailStore;
	
	public CatalogBox() {
		trailStore = App.getTrailStore();
		mainBox.setStyle("-fx-border-color: black");
		trailListView.setPrefSize(400, 400);
		trailListView.setItems(getObsList());
		
		
		
		mainBox.setPrefSize(400, 400);
		
		mainBox.getChildren().add(trailListView);
		
		
	}
	
	public HBox getCatalog() {
		return mainBox;
	}
	
	public ObservableList<Trail> getObsList(){
		ArrayList<Trail> arrList = new ArrayList<Trail>(trailStore.getTreeSet());
		ObservableList<Trail> obsList = FXCollections.observableArrayList(arrList);
		return obsList;
	}

}
