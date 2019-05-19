import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.sql.Time;
import java.util.Random;

public class AnimationGUI {

	private PathTransition pathTrans;
	private GameObjectFactory factory=GameObjectFactory.getInstance();
	private Timeline timelineFruit;
	private Timeline timelineBomb;
	private Timeline timelineSpecialFruit;

	public AnimationGUI(){
		timelineFruit = new Timeline();
		timelineBomb = new Timeline();
		timelineSpecialFruit = new Timeline();
	}


	public void moveFruit(ImageView fruit,GameObject object, int delay, int cycle, int x1, int x2) {
//		Timeline timeline = new Timeline();

		timelineFruit.getKeyFrames()
				.add(new KeyFrame(Duration.millis(delay + cycle), randomFruitPath(fruit,object, delay, cycle, x1, x2), new KeyValue(fruit.rotateProperty(), 360)));
//		timeline.setDelay(Duration.millis(randomNum));
		timelineFruit.setCycleCount(Timeline.INDEFINITE);
		timelineFruit.play();

	}

	public void moveBomb(ImageView Bomb,GameObject object, int delay, int cycle, int x1, int x2) {
//		Timeline timeline = new Timeline();
		timelineBomb.getKeyFrames()
				.addAll(new KeyFrame(Duration.millis(delay + cycle), randomBombPath(Bomb,object, delay, cycle, x1, x2)));
//		timeline.setDelay(Duration.millis(randomNum));
		timelineBomb.setCycleCount(Timeline.INDEFINITE);
		timelineBomb.play();

	}

	public void moveSuper(ImageView fruit,GameObject object, int delay, int cycle) {

//		Timeline t = new Timeline();

		timelineSpecialFruit.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomSuperPath(fruit,object, delay, cycle), new KeyValue(fruit.rotateProperty(), 360)));
		timelineSpecialFruit.setCycleCount(1000);
		timelineSpecialFruit.play();

	}

	public EventHandler<ActionEvent> randomFruitPath(ImageView fruit,GameObject object, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			Path path;
			fruit.setVisible(true);
			fruit.setDisable(false);

				fruit.setImage(object.getImage()[0]);

			path =	 object.getPath();


			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathTrans.setDelay(Duration.millis(delay));
			pathTrans.play();

		};

		return event;

	}

	public EventHandler<ActionEvent> randomBombPath(ImageView fruit,GameObject object, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			Path path;
			fruit.setVisible(true);
			fruit.setDisable(false);



				fruit.setImage(object.getImage()[0]);



				path =	 object.getPath();

			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathTrans.setDelay(Duration.millis(delay));
			pathTrans.play();

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
//			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
//			pathTrans.setDelay(Duration.millis(delay));
//			pathTrans.play();
//
//		};
//
//		return event;
//
//	}

	public EventHandler<ActionEvent> randomSuperPath(ImageView fruit,GameObject object, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);

			fruit.setImage(object.getImage()[0]);
			Path path = object.getPath();
			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathTrans.setDelay(Duration.millis(delay));
			pathTrans.play();

		};

		return event;

	}

	public void stopTimeline(){
		timelineFruit.stop();
		timelineBomb.stop();
		timelineSpecialFruit.stop();
	}
}
