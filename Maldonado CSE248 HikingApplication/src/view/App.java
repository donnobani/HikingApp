package view;

import java.util.Iterator;
import java.util.Set;

import javafx.application.Application;

import javafx.stage.Stage;

import trail_module.TrailTreeSetStore;
import user_module.User;
import user_module.UserTreeMapStore;
import user_module.UserType;
import utilities.Initializer;

public class App extends Application{
		private static WelcomeScene welcomeScene;
		private static SignInScene signInScene;
		private static SignUpScene signUpScene;
		private static ProfileScene profileScene;
		private static UserTreeMapStore userStore;
		private static TrailTreeSetStore trailStore;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage mainStage) throws Exception {
		trailStore = Initializer.trailStoreInit(1000);
		userStore = Initializer.userStoreInit(500);
		
		
		profileScene = new ProfileScene(mainStage);
		signInScene = new SignInScene(mainStage);
		signUpScene = new SignUpScene(mainStage);
		welcomeScene = new WelcomeScene(mainStage);
		
		launchWelcomeScene();
		mainStage.setTitle("HikeWithMe");
		mainStage.setResizable(false);
		mainStage.show();	
	}
	
	
	public static void launchWelcomeScene() {
		welcomeScene.show();
	}
	
	public static void launchSignInScene() {
		signInScene.show();
	}
	
	public static void launchSignUpScene() {
		signUpScene.show();
	}
	
	public static TrailTreeSetStore getTrailStore() {
		return trailStore;
	}
	
	public static boolean launchProfileScene(String user, String pass) {
		Set<User> users = userStore.find(t -> t.compareTo(new User(user,pass))==0);
		Iterator<User> ite = users.iterator();
		if (ite.hasNext()) {
			profileScene.setUser(ite.next());
			profileScene.show();
			return true;
		}else {
			return false;
		}
		
	}
	
	public static UserTreeMapStore getUserStore() {
		return userStore;
	}
	
	public static boolean addUser(String user, String pass, UserType value) {
		Set<User> users = userStore.find(t -> t.compareTo(new User(user,pass,value))==0);
		if (users.isEmpty()) {
			userStore.add(new User(user,pass,value));
			return true;
		}
		return false;
		
	}
	
}
