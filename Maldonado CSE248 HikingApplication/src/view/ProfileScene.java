package view;

import history_module.History;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import user_module.User;
import user_module.UserTreeMapStore;

public class ProfileScene {
	private Scene scene;
	private Stage stage;
	private UserBox userBox;
	private HistoryBox historyBox;
	private static User user;
	
	public ProfileScene(Stage stage) {
		this.stage = stage;
		user = new User();
		HBox mainBox = new HBox();
		VBox leftBox = new VBox();
		VBox rightBox = new VBox();
		
		TrailBox trailBox = new TrailBox();
		CatalogBox catalogBox = new CatalogBox();
		historyBox = new HistoryBox();
		userBox = new UserBox();
		
	
		
		scene = new Scene(mainBox,600,600);
		
		leftBox.setPrefSize(200, 600);
		rightBox.setPrefSize(400, 600);
		
		
		leftBox.getChildren().addAll(userBox.getUserBox(),historyBox.getHistoryBox());
		rightBox.getChildren().addAll(trailBox.getTrailBox(),catalogBox.getCatalog());
		mainBox.getChildren().addAll(leftBox,rightBox);
	}
	
	public static History getHistory() {
		return user.getHistory();
	}

	public void setUser(User user) {
		userBox.setUser(user);
		
	}
	
	
	public void show() {
		stage.setScene(scene);
	}

}
