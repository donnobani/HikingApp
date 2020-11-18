package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SignInScene {
	private Scene scene;
	private Stage stage;
	private TextField userField = new TextField("username");
	private TextField passField = new TextField("password");
	
	
	public SignInScene(Stage mainStage) {
		VBox root = new VBox();
		Label mainLabel = new Label("HikeWithMe");
		HBox credBox = new HBox();
		Button signInBtn = new Button("Sign In");
		Button returnBtn = new Button("Return");
		stage = mainStage;
		mainLabel.setAlignment(Pos.TOP_CENTER);
		mainLabel.setTextFill(Color.CADETBLUE);
		mainLabel.setFont(Font.font(50));
		root.setAlignment(Pos.CENTER);
		root.setSpacing(50);
		credBox.setSpacing(20);
		credBox.setAlignment(Pos.CENTER);
		
		signInBtn.setOnAction(e->{
			App.launchProfileScene(userField.getText(),passField.getText());
			
		});
		returnBtn.setOnAction(e->{
			App.launchWelcomeScene();
		});
		
		credBox.getChildren().addAll(userField,passField,signInBtn,returnBtn);
		root.getChildren().addAll(mainLabel,credBox);
		scene = new Scene(root,600,600);
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public void show() {
		stage.setScene(scene);
	}
	

}
