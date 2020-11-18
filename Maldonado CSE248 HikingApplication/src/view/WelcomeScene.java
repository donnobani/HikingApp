package view;

import javafx.geometry.Pos;

import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class WelcomeScene{
	private static Scene scene;
	private Stage stage;

	
	public WelcomeScene(Stage mainStage) {
		VBox root = new VBox();
		Button signInBtn = new Button("Sign In");
		Button signUpBtn = new Button("Sign Up");	
		HBox buttonBox = new HBox();
		Label mainLabel = new Label("HikeWithMe");
		stage = mainStage;
		
		
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setSpacing(20);
		mainLabel.setAlignment(Pos.TOP_CENTER);
		signInBtn.setPrefWidth(120);
		signUpBtn.setPrefWidth(120);
		
		
		mainLabel.setTextFill(Color.CADETBLUE);
		mainLabel.setFont(Font.font(50));
		buttonBox.getChildren().addAll(signInBtn, signUpBtn);
		root.getChildren().addAll(mainLabel, buttonBox);
		scene = new Scene(root,600,600); 
		
		signInBtn.setOnAction(e->{
			App.launchSignInScene();
		});
		signUpBtn.setOnAction(e->{
			App.launchSignUpScene();
		});
		
	}
	
	public Scene getScene() {
		return scene;
	}
	
	public void show() {
		stage.setScene(scene);
	}


	

}
