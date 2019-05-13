import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
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
import javafx.stage.Stage;

public class StartContoller implements Initializable {

	@FXML
	ChoiceBox<String> chooseLevel;
	@FXML
	private Button startBtn;
	@FXML
	private Button loadBtn;
	@FXML
	private Button exitBtn;
	@FXML
	public ListView<String> chooseLoad;

	public void startGame(ActionEvent event) throws IOException {

	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("Mode.fxml"));
		Parent GameGUI = loader.load();

		Scene GameScene = new Scene(GameGUI);

		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		window.setScene(GameScene);

		window.show();

	}

	public void loadGame(ActionEvent event) throws IOException {
	}

	public void exitGame() {
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		chooseLevel.getItems().addAll("Classic", "Arcade","Multiplayer");
		chooseLevel.setValue("Classic");
	}

	
}
