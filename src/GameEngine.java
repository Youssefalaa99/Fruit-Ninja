import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class GameEngine implements GameActions, Initializable {
	private static GameEngine instance = null;
	private Model model;
	private GameObjectFactory factory;
	private AnimationGUI ani;
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
	@FXML
	private HBox livesBox;

//	
//    private GameEngine(){
//
//    }
	public static synchronized GameEngine getInstance() {
		if (instance == null) {
			instance = new GameEngine();
		}
		return instance;

	}

	public void newGame(Level level) {
		this.factory = GameObjectFactory.getInstance();
		this.model = new Model(level);
		ani= new AnimationGUI();
		moveNode();
	}

	@Override
	public GameObject createGameObject() {
		return null;
	}

	public Fruit createFruit() {
		int startXLeft;
		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
		int startXRight;
		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
		Path pathLeft = new Path();
		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
		Path pathRight = new Path();
		pathRight.getElements().add(new MoveTo(startXRight, 0));
		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
		return factory.createFruit(pathRight,pathLeft);
	}

	public Bombs createBomb() {
		int startXLeft;
		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
		int startXRight;
		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
		Path pathLeft = new Path();
		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
		Path pathRight = new Path();
		pathRight.getElements().add(new MoveTo(startXRight, 0));
		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
		return factory.createBomb(pathRight,pathLeft);
	}

	public Fruit createSpecialFruit() {
		int startXLeft;
		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
		int startXRight;
		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
		Path pathLeft = new Path();
		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
		Path pathRight = new Path();
		pathRight.getElements().add(new MoveTo(startXRight, 0));
		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
		return factory.createSpecialFruit(pathRight,pathLeft);
	}

	@Override
	public void updateObjectsLocations() {

	}

	@Override
	public void sliceObjects() {
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
	
	public void moveNode() {
		ani.moveFruit(fruit1, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500, createFruit());
		ani.moveFruit(fruit2, ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500, createFruit());
		ani.moveFruit(fruit3, ThreadLocalRandom.current().nextInt(1000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500, createFruit());
		ani.moveFruit(fruit4, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(3000, 6000), -350, -500, createFruit());
		ani.moveFruit(fruit5, ThreadLocalRandom.current().nextInt(3000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500, createFruit());
		ani.moveFruit(fruit6, ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500, createFruit());
		ani.moveFruit(bomb1, ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500, createBomb());
		ani.moveFruit(bomb2, ThreadLocalRandom.current().nextInt(2000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500, createBomb());
		ani.moveSuper(superFruit1, ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(3000, 5000), createSpecialFruit());
		ani.moveSuper(superFruit2, ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(3000, 5000), createSpecialFruit());
		
	}

	@Override
	public void saveGame() {

	}

	@Override
	public void loadGame() {

	}

	@Override
	public void ResetGame() {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		pane.addEventFilter(MouseEvent.DRAG_DETECTED, (MouseEvent mouseEvent) -> {
			pane.startFullDrag();
		});
		sliceObjects();
	}
	
}
