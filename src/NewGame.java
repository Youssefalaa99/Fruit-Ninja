
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

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

		
		AnimationGUI ani = new AnimationGUI();
		
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
				fruit2.setDisable(true);
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
		
		superFruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit1.setVisible(false);

				superFruit1.setDisable(true);

			}
		});
		superFruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit2.setVisible(false);

				superFruit2.setDisable(true);
				// fruit1.slice(true);
			}
		});

		bomb1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				bomb1.setVisible(false);

				bomb1.setDisable(true);
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
