package view;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import user_module.User;

public class UserBox {
	private VBox mainBox = new VBox();
	private Label userLabel = new Label();
	private Label idLabel = new Label();
	private User user;
	
	public UserBox() {
		
		HBox nameBox = new HBox();
		HBox idBox = new HBox();
		
		
		Label userTitleLabel = new Label("User: ");
		Label idTitleLabel =  new Label("ID: ");
		
		
		mainBox.setPrefSize(200, 100);
		mainBox.setStyle("-fx-border-color: black");
		
		
		nameBox.getChildren().addAll(userTitleLabel,userLabel);
		idBox.getChildren().addAll(idTitleLabel,idLabel);
		mainBox.getChildren().addAll(nameBox,idBox);
		
	}
	
	
	public VBox getUserBox() {
		return mainBox;
	}
	
	public void setUser(User user) {
		userLabel.setText(user.getUsername());
		idLabel.setText(user.getId());
	}

}
