import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class StartController implements Initializable {

	@FXML private ChoiceBox<String> chooseLevel;
	@FXML private Button startBtn;
	@FXML private Button loadBtn;
	@FXML private Button exitBtn;
	@FXML private Button arcade;
	@FXML public ListView<String> chooseLoad;
	@FXML private Button load;
	private AudioClip start=new AudioClip(this.getClass().getResource("start.wav").toString());


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		chooseLevel.getItems().addAll("Easy","Medium","Hard");
		chooseLevel.setValue("Easy");
	    start.setCycleCount(AudioClip.INDEFINITE);

	}


	public void startClassic(ActionEvent event) throws IOException {

		Level level = setLevel(chooseLevel.getValue());
		FXMLLoader loader = new FXMLLoader();

		loader.setLocation(getClass().getResource("Mode.fxml"));

		Parent GameGUI = loader.load();

		Scene GameScene = new Scene(GameGUI);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


		GameEngine engine = loader.getController();
		engine.newGame(level,"Classic");
		start.stop();

		window.setScene(GameScene);

		window.show();

	}

	public Level setLevel(String str){
		switch (str) {
			case "Easy":
				return new EasyLevel();
			case "Medium":
				return new NormalLevel();
			case "Hard":
				return new HardLevel();
		}
		return null;
	}



	public void startArcade(ActionEvent event) throws IOException {
		Level level = new NormalLevel();

		FXMLLoader loader = new FXMLLoader();

		loader.setLocation(getClass().getResource("Mode.fxml"));

		Parent GameGUI = loader.load();

		Scene GameScene = new Scene(GameGUI);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


		GameEngine engine = loader.getController();
		engine.newGame(level,"Arcade");
		start.stop();

		window.setScene(GameScene);

		window.show();

	}
	
	
	public void loadGame(ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();

		loader.setLocation(getClass().getResource("Mode.fxml"));

		Parent GameGUI = loader.load();

		Scene GameScene = new Scene(GameGUI);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();


		GameEngine engine = loader.getController();
		engine.loadGame();
		start.stop();

		window.setScene(GameScene);

		window.show();

		
	}

	public void exitGame() {
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
		System.exit(0);
		
	}

	

}
