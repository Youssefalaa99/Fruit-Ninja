
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
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
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
	private ImageView fruit1;
	@FXML
	private ImageView fruit2;
	@FXML
	private ImageView fruit3;
	@FXML
	private AnchorPane pane;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		ImageCursor imgcursor = new ImageCursor(new Image("sword.png"));
		ImageCursor imgcursor1 = new ImageCursor(new Image("CursorEffect.png"));
		pane.setCursor(imgcursor);
		AnimationGUI ani = new AnimationGUI();
		ani.move1(fruit1);
		ani.move2(fruit2);
		ani.move3(fruit3);
		

		
		fruit1.setOnMouseMoved(e -> {
			fruit1.setCursor(imgcursor1);
			fruit1.setY(0);
		});
		fruit2.setOnMouseMoved(e -> {
			fruit2.setCursor(imgcursor1);
			fruit2.setY(0);
		});
		fruit3.setOnMouseMoved(e -> {
			fruit3.setCursor(imgcursor1);
			fruit3.setY(0);
		});
	}
	
	

}
