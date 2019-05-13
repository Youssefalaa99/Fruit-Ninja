import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application {

	public static void main(String[] args) {

		launch(args);

	}

	public void start(Stage primaryStage) throws Exception {
		Parent LoginUserGUI = FXMLLoader.load(getClass().getResource(""));
		primaryStage.setTitle("Fruit Ninja");
		primaryStage.setScene(new Scene(LoginUserGUI, 500, 500));

		primaryStage.show();
	}

}