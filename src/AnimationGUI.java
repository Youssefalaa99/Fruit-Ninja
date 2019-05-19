import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Path;
import javafx.util.Duration;

import java.util.Random;

public class AnimationGUI {

	private PathTransition pathTrans;
	private GameObjectFactory factory=GameObjectFactory.getInstance();


	public void moveFruit(ImageView fruit, int delay, int cycle, int x1, int x2) {
		Timeline timeline = new Timeline();

		timeline.getKeyFrames()
				.add(new KeyFrame(Duration.millis(delay + cycle), randomFruitPath(fruit, delay, cycle, x1, x2), new KeyValue(fruit.rotateProperty(), 360)));
//		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	public void moveBomb(ImageView Bomb, int delay, int cycle, int x1, int x2) {
		Timeline timeline = new Timeline();
		timeline.getKeyFrames()
				.addAll(new KeyFrame(Duration.millis(delay + cycle), randomBombPath(Bomb, delay, cycle, x1, x2)));
//		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	public void moveSuper(ImageView fruit, int delay, int cycle) {

		Timeline t = new Timeline();

		t.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomSuperPath(fruit, delay, cycle), new KeyValue(fruit.rotateProperty(), 360)));
		t.setCycleCount(1000);
		t.play();

	}

	public EventHandler<ActionEvent> randomFruitPath(ImageView fruit, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			Path path;
			fruit.setVisible(true);
			fruit.setDisable(false);
			//To be removed
			GameObject object = null;
			Random random = new Random();
			int rand = random.nextInt(4);
			if(rand == 0){
				object = factory.createFruit("B");
			}
			else if(rand == 1){
				object = factory.createFruit("R");
			}
			else if(rand == 2){
				object = factory.createFruit("P");
			}
			else if(rand == 3){
				object = factory.createFruit("W");
			}
			try {
				fruit.setImage(object.getImage()[0]);
				System.out.println("no Error2");
			} catch (Exception e2) {
				System.out.println("Fuck1");
				fruit.setImage(new Image("peach.png"));
			}
			try {
			path =	 object.getPath();
			System.out.println("no Error1");

			}
			catch (Exception e1) {

				System.out.println("Fuck2" + e1);
				 path = object.getPath();
			}
			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathTrans.setDelay(Duration.millis(delay));
			pathTrans.play();

		};

		return event;

	}

	public EventHandler<ActionEvent> randomBombPath(ImageView fruit, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			Path path;
			fruit.setVisible(true);
			fruit.setDisable(false);
			//To be removed
			GameObject object = null;
			Random random = new Random();
			int rand = random.nextInt(3);
			if(rand == 0){
				object = factory.createBomb("D");
			}
			else if(rand == 1){
				object = factory.createBomb("D");
			}
			else if(rand == 2){
				object = factory.createBomb("F");
			}

			try {
				fruit.setImage(object.getImage()[0]);
				System.out.println("no Error2");
			} catch (Exception e2) {
				System.out.println("Fuck1");
				fruit.setImage(new Image("peach.png"));
			}
			try {
				path =	 object.getPath();
				System.out.println("no Error1");

			}
			catch (Exception e1) {

				System.out.println("Fuck2" + e1);
				path = object.getPath();
			}
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

	public EventHandler<ActionEvent> randomSuperPath(ImageView fruit, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);
			//To be removed
			GameObject object = null;
			Random random = new Random();
			int rand = random.nextInt(3);
			if(rand == 0){
				object = factory.createSpecialFruit("S1");
			}
			else if(rand == 1){
				object = factory.createSpecialFruit("S1");
			}
			else if(rand == 2){
				object = factory.createSpecialFruit("S2");
			}

			fruit.setImage(object.getImage()[0]);
			Path path = object.getPath();
			pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathTrans.setDelay(Duration.millis(delay));
			pathTrans.play();

		};

		return event;

	}
}
