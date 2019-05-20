import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class GameEngine implements GameActions, Initializable {
	private static GameEngine instance = null;
	private Model model;
	private AnimationGUI ani;
	@FXML
	private ImageView sword1;
	@FXML
	private ImageView sword2;
	@FXML
	private ImageView sword3;
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
	private ImageView fatalBomb;
	@FXML
	private ImageView dangerousBomb;
	@FXML
	private AnchorPane pane;
	@FXML
	private ImageView superFruit5;
	@FXML
	private ImageView superFruit10;
	@FXML
	private HBox livesBox;
	@FXML
	private Label score;
	@FXML
	private Label highscore;
	@FXML private AnchorPane GameOverWdw;
	@FXML private Button okay;
	@FXML private ImageView background;

	AudioClip slice = new AudioClip(this.getClass().getResource("slicing.wav").toString());
	AudioClip gameover = new AudioClip(this.getClass().getResource("gameover.wav").toString());
	AudioClip bomb = new AudioClip(this.getClass().getResource("bomb.wav").toString());

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
		GameObjectFactory factory = GameObjectFactory.getInstance();
		this.model = new Model(level);

		//To be modified
//		fruit1.setImage(factory.createFruit("B").getImage()[0]);
//		fruit2.setImage(factory.createFruit("R").getImage()[0]);
//		fruit3.setImage(factory.createFruit("P").getImage()[0]);
//		fruit4.setImage(factory.createFruit("W").getImage()[0]);
//		dangerousBomb.setImage(factory.createBomb("D").getImage()[0]);
//		fatalBomb.setImage(factory.createBomb("F").getImage()[0]);
//		superFruit5.setImage(factory.createSpecialFruit("S1").getImage()[0]);
//		superFruit10.setImage(factory.createSpecialFruit("S2").getImage()[0]);
		ani= new AnimationGUI();
		render(model);
		moveNode();
	}

	@Override
	public GameObject createGameObject() {
		return null;
	}
//
//	public Fruit createFruit() {
//		int startXLeft;
//		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
//		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
//		int startXRight;
//		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
//		Path pathLeft = new Path();
//		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
//		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
//		Path pathRight = new Path();
//		pathRight.getElements().add(new MoveTo(startXRight, 0));
//		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
//		return factory.createFruit(pathRight,pathLeft);
//	}
//
//	public Bombs createBomb() {
//		int startXLeft;
//		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
//		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
//		int startXRight;
//		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
//		Path pathLeft = new Path();
//		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
//		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
//		Path pathRight = new Path();
//		pathRight.getElements().add(new MoveTo(startXRight, 0));
//		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
//		return factory.createBomb(pathRight,pathLeft);
//	}
//
//	public Fruit createSpecialFruit() {
//		int startXLeft;
//		startXLeft=ThreadLocalRandom.current().nextInt(-275, -75);
//		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
//		int startXRight;
//		startXRight=ThreadLocalRandom.current().nextInt(75, 275);
//		Path pathLeft = new Path();
//		pathLeft.getElements().add(new MoveTo(startXLeft, 0));
//		pathLeft.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 500, 0));
//		Path pathRight = new Path();
//		pathRight.getElements().add(new MoveTo(startXRight, 0));
//		pathRight.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -500, 0));
//		return factory.createSpecialFruit(pathRight,pathLeft);
//	}

	@Override
	public void updateObjectsLocations() {

	}

	@Override
	public void sliceObjects() {
		fruit1.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit1.setImage(model.getFruits(0).getImage()[1]);
				fruit1.setDisable(true);
				slice.play();
				model.getFruits(0).slice();
				model.addScore(model.getFruits(0).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
				// fruit1.slice(true);
			}
		});
		fruit2.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {

				fruit2.setImage(model.getFruits(1).getImage()[1]);
				fruit2.setDisable(true);
				slice.play();
				model.getFruits(1).slice();
				model.addScore(model.getFruits(1).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});

		fruit3.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit3.setImage(model.getFruits(2).getImage()[1]);
				fruit3.setDisable(true);
				slice.play();
				model.getFruits(2).slice();
				model.addScore(model.getFruits(2).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});
		fruit4.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit4.setImage(model.getFruits(3).getImage()[1]);
				fruit4.setDisable(true);
				slice.play();
				model.getFruits(3).slice();
				model.addScore(model.getFruits(3).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});
		fruit5.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit5.setImage(model.getFruits(4).getImage()[1]);
				fruit5.setDisable(true);
				slice.play();
				model.getFruits(4).slice();
				model.addScore(model.getFruits(4).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});
		fruit6.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fruit6.setImage(model.getFruits(5).getImage()[1]);
				fruit6.setDisable(true);
				slice.play();
				model.getFruits(5).slice();
				model.addScore(model.getFruits(5).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});

		superFruit5.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit5.setVisible(false);
				slice.play();
				superFruit5.setDisable(true);
				model.addScore(model.getSpecialFruits(0).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
			}
		});
		superFruit10.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				superFruit10.setVisible(false);
				slice.play();
				superFruit10.setDisable(true);
				model.addScore(model.getSpecialFruits(1).getSliceScore());
				model.setCurrentScore(model.getCurrentScore());
				render(model);
				System.out.println("Score: "+model.getCurrentScore());
				// fruit1.slice(true);
			}
		});

		dangerousBomb.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				dangerousBomb.setVisible(false);
                bomb.play();
				dangerousBomb.setDisable(true);
				int x=model.removeLife();
				if(x==1){
					ani.stopTimeline();
				}
				render(model);
			}
		});
		fatalBomb.setOnMouseDragEntered(mouseEvent -> {
			if (mouseEvent.isPrimaryButtonDown()) {
				fatalBomb.setVisible(false);
                gameover.play();
				fatalBomb.setDisable(true);
				model.endGame();
				ani.stopTimeline();
				render(model);
				System.out.println("FatalBomb");
				
			}
		});

	}
	
	
	public void check() {
		
		//if (fatalBomb.getY()>background.getY())
			//System.out.println(fatalBomb.getY() + "+"+background.getY());
			
			
	}

	public void render(Model model) {

		score.setText(Integer.toString(model.getCurrentScore()));

		highscore.setText(Integer.toString(model.getHighScore()));
		if (model.getLives() == 3) {
			sword1.setVisible(true);
			sword2.setVisible(true);
			sword3.setVisible(true);

		}

		else if (model.getLives() == 2) {
			sword1.setVisible(false);
			sword2.setVisible(true);
			sword3.setVisible(true);

		}

		else if (model.getLives() == 1) {
			sword1.setVisible(false);
			sword2.setVisible(false);
			sword3.setVisible(true);

		} else {
			sword1.setVisible(false);
			sword2.setVisible(false);
			sword3.setVisible(false);
			ani.stopTimeline();
			GameOverWdw.setVisible(true);
			GameOverWdw.setDisable(false);

		}

	}
	
	public void moveNode() {
		ani.moveFruit(fruit1,model.getFruits(0), ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500);
		ani.moveFruit(fruit2,model.getFruits(1),ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500);
		ani.moveFruit(fruit3,model.getFruits(2), ThreadLocalRandom.current().nextInt(1000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500);
		ani.moveFruit(fruit4,model.getFruits(3), ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(3000, 6000), -350, -500);
		ani.moveFruit(fruit5,model.getFruits(4), ThreadLocalRandom.current().nextInt(3000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500);
		ani.moveFruit(fruit6,model.getFruits(5), ThreadLocalRandom.current().nextInt(1000, 3000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500);
		ani.moveBomb(dangerousBomb,model.getBombs(0), ThreadLocalRandom.current().nextInt(5000, 10000),
				ThreadLocalRandom.current().nextInt(4000, 6000), 350, 500);
		ani.moveBomb(fatalBomb,model.getBombs(1), ThreadLocalRandom.current().nextInt(2000, 5000),
				ThreadLocalRandom.current().nextInt(4000, 6000), -350, -500);
		ani.moveSuper(superFruit5,model.getSpecialFruits(0), ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(3000, 5000));
		ani.moveSuper(superFruit10,model.getSpecialFruits(1), ThreadLocalRandom.current().nextInt(10000, 20000),
				ThreadLocalRandom.current().nextInt(3000, 5000));
		
	
	}
	
	
	
	public void esc(ActionEvent event) throws IOException {

		Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
		AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Start.fxml"));
		Scene scene = new Scene(root);
		stage2.setScene(scene);
		stage2.show();
	}
	

	@Override
	public void saveGame() {
		Invoker invoker = new Invoker();
		SaveGame saveGame = new SaveGame(model);
	}

	@Override
	public void loadGame() {
		Invoker invoker = new Invoker();
		LoadGame loadGame = new LoadGame(model);
		invoker.setCommand(loadGame);
		invoker.executeCommand();
		ani= new AnimationGUI();
		render(model);
		moveNode();

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
		sword1.setVisible(false);
		sword2.setVisible(false);
		sword3.setVisible(false);
		GameOverWdw.setVisible(false);
		GameOverWdw.setDisable(true);
		check();
	}

}
