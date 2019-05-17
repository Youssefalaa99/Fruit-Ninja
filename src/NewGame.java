
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
import java.util.concurrent.ThreadLocalRandom;

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
import javafx.scene.input.MouseEvent;
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
	private ImageView fruit4;
	@FXML
	private ImageView fruit5;
	@FXML
	private ImageView fruit6;
	@FXML
	private ImageView bomb2;
	@FXML
	private ImageView bomb1;
	@FXML
	private AnchorPane pane;
	@FXML
	private ImageView superFruit1;
	@FXML
	private ImageView superFruit2;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		ImageCursor imgcursor = new ImageCursor(new Image("sword.png"));
		ImageCursor imgcursor1 = new ImageCursor(new Image("CursorEffect.png"));
		pane.setCursor(imgcursor);
		AnimationGUI ani = new AnimationGUI();
		
		ani.moveFruit(fruit1, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(2000, 4000), 350, 500);
		ani.moveFruit(fruit2, ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(2000, 4000), 350, 500);
		ani.moveFruit(fruit3, ThreadLocalRandom.current().nextInt(1000, 5000),
				ThreadLocalRandom.current().nextInt(2000, 4000), 350, 500);
		ani.moveFruit(fruit4, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(2000, 4000), -350, -500);
		ani.moveFruit(fruit5, ThreadLocalRandom.current().nextInt(3000, 5000),
				ThreadLocalRandom.current().nextInt(2000, 4000), -350, -500);
		ani.moveFruit(fruit6, ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(2000, 4000), -350, -500);
		ani.moveBomb(bomb1, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500);
		ani.moveBomb(bomb2, ThreadLocalRandom.current().nextInt(2000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500);
		ani.moveSuper(superFruit1, ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(4000, 5000));
		ani.moveSuper(superFruit2, ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(4000, 5000));
		pane.addEventFilter(MouseEvent.DRAG_DETECTED, (MouseEvent mouseEvent) -> {
			pane.startFullDrag();
		});
		fruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit1.setVisible(false);
				fruit1.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit2.setVisible(false);
				System.out.println("1");
				fruit2.setDisable(true);

			}
		});
		bomb1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				bomb1.setVisible(false);

				bomb1.setDisable(true);
			}
		});

		fruit3.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit3.setVisible(false);

				fruit3.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit4.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit4.setVisible(false);

				fruit4.setDisable(true);

			}
		});
		fruit5.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit5.setVisible(false);

				fruit5.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit6.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit6.setVisible(false);

				fruit6.setDisable(true);
			}
		});
		superFruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit2.setVisible(false);

				superFruit2.setDisable(true);
				// fruit1.slice(true);
			}
		});
		superFruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit1.setVisible(false);

				superFruit1.setDisable(true);

			}
		});
		bomb2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				bomb2.setVisible(false);

				bomb2.setDisable(true);
				// fruit1.slice(true);
			}
		});
	}

	public void slice() {
		fruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit1.setVisible(false);
				fruit1.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit2.setVisible(false);
				System.out.println("1");
				fruit2.setDisable(true);

			}
		});
		bomb1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				bomb1.setVisible(false);

				bomb1.setDisable(true);
			}
		});

		fruit3.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit3.setVisible(false);

				fruit3.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit4.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit4.setVisible(false);

				fruit4.setDisable(true);

			}
		});
		fruit5.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit5.setVisible(false);

				fruit5.setDisable(true);
				// fruit1.slice(true);
			}
		});
		fruit6.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit6.setVisible(false);

				fruit6.setDisable(true);
			}
		});
		superFruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit2.setVisible(false);

				superFruit2.setDisable(true);
				// fruit1.slice(true);
			}
		});
		superFruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit1.setVisible(false);

				superFruit1.setDisable(true);

			}
		});
		bomb2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				bomb2.setVisible(false);

				bomb2.setDisable(true);
				// fruit1.slice(true);
			}
		});
	}
}
