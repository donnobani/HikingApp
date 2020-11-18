package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import user_module.UserType;

public class SignUpScene {
	private Scene scene;
	private Stage stage;
	private TextField userField = new TextField("username");
	private TextField passField = new TextField("password");
	private ComboBox<UserType> typeBox = new ComboBox<UserType>();

	public SignUpScene(Stage mainStage) {
		Alert userFailedAlert = new Alert(AlertType.INFORMATION, "User already taken!\ntry again!", ButtonType.OK);
		Alert noTypeAlert = new Alert(AlertType.INFORMATION, "User Type field is missing!\ntry again!", ButtonType.OK);
		VBox root = new VBox();
		Label mainLabel = new Label("HikeWithMe");
		HBox topCredBox = new HBox();
		HBox bottomCredBox = new HBox();
		Button signUpBtn = new Button("Sign Up");
		Button returnBtn = new Button("Return");

		typeBox.getItems().setAll(UserType.values());
		typeBox.setPromptText("User Type");
		stage = mainStage;
		mainLabel.setAlignment(Pos.TOP_CENTER);
		mainLabel.setTextFill(Color.CADETBLUE);
		mainLabel.setFont(Font.font(50));
		root.setAlignment(Pos.CENTER);
		root.setSpacing(50);
		topCredBox.setSpacing(20);
		topCredBox.setAlignment(Pos.CENTER);
		bottomCredBox.setSpacing(20);
		bottomCredBox.setAlignment(Pos.CENTER);

		signUpBtn.setOnAction(e -> { 
			if (typeBox.getValue() != null) {	
				boolean userIsValid = App.addUser(userField.getText(), passField.getText(), typeBox.getValue());
				if (userIsValid) {
					App.launchProfileScene(userField.getText(),passField.getText()); //return boolean to check if failed
					
				} else {
					userFailedAlert.show();
				}
			} else {
				noTypeAlert.show();
			}

		});
		returnBtn.setOnAction(e -> {
			App.launchWelcomeScene();
		});

		topCredBox.getChildren().addAll(userField, passField, typeBox);
		bottomCredBox.getChildren().addAll(signUpBtn, returnBtn);
		root.getChildren().addAll(mainLabel, topCredBox, bottomCredBox);
		scene = new Scene(root, 600, 600);
	}

	public Scene getScene() {
		return scene;
	}

	public void show() {
		stage.setScene(scene);
	}

}
