package view;

import javafx.scene.control.Label;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import trail_module.Trail;

public class TrailBox {
	private VBox mainBox = new VBox();
	private Trail trail;
	public TrailBox() {
		HBox topBox = new HBox();
		VBox bottomBox = new VBox();
		mainBox.setPrefSize(400, 200);
		
		Label titleLabel = new Label("TRAIL");
		
		Label nameLabel = new Label("Name: ");
		Label addyLabel = new Label("Head Address: ");
		Label lengthLabel = new Label("Length: ");
		Label gainLabel= new Label("Gain: ");
		Label levelLabel =  new Label("Level: ");
		Label typeLabel = new Label("Type: ");
		
		topBox.getChildren().add(titleLabel);
		bottomBox.getChildren().addAll(nameLabel,addyLabel,lengthLabel
				,gainLabel,levelLabel,typeLabel);
		//
		//missing fields for tokens
		
		
		mainBox.setStyle("-fx-border-color: black");
		mainBox.getChildren().addAll(topBox,bottomBox);
		
	}
	
	public void setTrail(Trail trail) {
		this.trail = trail;
	}
	
	public VBox getTrailBox() {
		return mainBox;
	}
	
}
