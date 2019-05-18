import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class AnimationGUI {

	private PathTransition pathtrans;
	private Model model;
	
	
	public void getModel(Model model) {
	this.model=model;	
	}

	public void moveFruit(ImageView fruit, int delay, int cycle, int x1, int x2) {
		Timeline timeline = new Timeline();

		timeline.getKeyFrames()
				.add(new KeyFrame(Duration.millis(delay + cycle), randomPath(fruit, delay, cycle, x1, x2), new KeyValue(fruit.rotateProperty(), 360)));
//		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

//	public void moveBomb(ImageView Bomb, int delay, int cycle, int x1, int x2) {
//		int randomNum = ThreadLocalRandom.current().nextInt(500, 2000 + 1);
//
//		Timeline timeline = new Timeline();
//
//		timeline.getKeyFrames()
//				.addAll(new KeyFrame(Duration.millis(delay + cycle), randomBombPath(Bomb, delay, cycle, x1, x2)));
//		timeline.setDelay(Duration.millis(randomNum));
//		timeline.setCycleCount(Timeline.INDEFINITE);
//		timeline.play();
//
//	}

	public void moveSuper(ImageView fruit, int delay, int cycle) {

		Timeline t = new Timeline();

		t.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomSuperPath(fruit, delay, cycle), new KeyValue(fruit.rotateProperty(), 360)));
		t.setCycleCount(1000);
		t.play();

	}

	public EventHandler<ActionEvent> randomPath(ImageView fruit, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			Path path =	new Path();
			fruit.setVisible(true);
			fruit.setDisable(false);
			try {
				fruit.setImage(GameObjectFactory.getInstance().createFruit().getImage()[0]);
				System.out.println("no Error2");
			} catch (Exception e2) {
				System.out.println("Fuck1");
				fruit.setImage(new Image("peach.png"));
			}
			try {
			path =	 GameObjectFactory.getInstance().createFruit().getRightPath();
			System.out.println("no Error1");

			}
			catch (Exception e1) {

				System.out.println("Fuck2" + e1);
				 path = GameObjectFactory.getInstance().createFruit().getRightPath();
			}
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}

//	public EventHandler<ActionEvent> randomBombPath(ImageView fruit, int delay, int cycle, int x1, int x2) {
//
//		EventHandler<ActionEvent> event = e -> {
//			fruit.setVisible(true);
//			fruit.setDisable(false);
////			fruit.setImage(new Image("watermelon.png"));
//			Path path = new Path();
//			path.getElements().add(new MoveTo(0, 0));
//			path.getElements().add(new CubicCurveTo(0, -800, x1, -800, x2, 0));
//			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
//			pathtrans.setDelay(Duration.millis(delay));
//			pathtrans.play();
//
//		};
//
//		return event;
//
//	}

	public EventHandler<ActionEvent> randomSuperPath(ImageView fruit, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);
			fruit.setImage(GameObjectFactory.getInstance().createSpecialFruit().getImage()[0]);
			Path path = GameObjectFactory.getInstance().createSpecialFruit().getRightPath();
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
}
