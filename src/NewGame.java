
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.util.Duration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.animation.*;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;

public class NewGame implements Initializable {
	@FXML
	private ImageView sword;
	@FXML
	private Button start;
	@FXML
	private ImageView tomato;
	@FXML
	private ImageView watermelon;
	@FXML
	private ImageView grape;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		Timeline t = new Timeline();
		t.getKeyFrames().addAll(new KeyFrame(Duration.seconds(3), new KeyValue(grape.yProperty(), 300),
				new KeyValue(grape.rotateProperty(), 720)));
		t.setCycleCount(1000);
		t.play();

		Timeline t1 = new Timeline();
		t1.getKeyFrames().addAll(new KeyFrame(Duration.seconds(3), new KeyValue(tomato.yProperty(), 300),
				new KeyValue(tomato.rotateProperty(), 720)));
		t1.setCycleCount(1000);
		t1.setDelay(Duration.seconds(1));
		t1.play();

		Timeline t2 = new Timeline();
		t2.getKeyFrames().addAll(new KeyFrame(Duration.seconds(3), new KeyValue(watermelon.yProperty(), 300),
				new KeyValue(watermelon.rotateProperty(), 720)));
		t2.setCycleCount(1000);
		t1.setDelay(Duration.seconds(2));
		t2.play();

	}

}
