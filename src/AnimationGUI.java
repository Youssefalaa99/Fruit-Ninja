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
	int i;
	public void moveFruit(ImageView fruit, int delay, int cycle, int x1 , int x2) {
i = 0;
		Timeline timeline = new Timeline();

		timeline.getKeyFrames()
				.addAll(new KeyFrame(Duration.millis(delay + cycle), randomPath(fruit, delay, cycle,x1,x2)));
//		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	public void moveBomb(ImageView Bomb, int delay, int cycle, int x1, int x2) {
		int randomNum = ThreadLocalRandom.current().nextInt(500, 2000 + 1);

		Timeline timeline = new Timeline();

		timeline.getKeyFrames()
				.addAll(new KeyFrame(Duration.millis(delay + cycle), randomBombPath(Bomb, delay, cycle, x1, x2)));
		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

	public void moveSuper(ImageView fruit, int delay, int cycle) {

		Timeline t = new Timeline();
		t.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomSuperPath(fruit, delay, cycle)));
		t.setCycleCount(1000);
		t.play();

	}

	public EventHandler<ActionEvent> randomPath(ImageView fruit, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);
//			fruit.setImage(new Image("watermelon.png"));
			Path path = new Path();
			path.getElements().add(new MoveTo(0, 0));
			path.getElements().add(new CubicCurveTo(0, -800, x1, -800, x2, 0));
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
	
	public EventHandler<ActionEvent> randomBombPath(ImageView fruit, int delay, int cycle, int x1, int x2) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);
//			fruit.setImage(new Image("watermelon.png"));
			Path path = new Path();
			path.getElements().add(new MoveTo(0, 0));
			path.getElements().add(new CubicCurveTo(0, -800, x1, -800, x2, 0));
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
	public EventHandler<ActionEvent> randomSuperPath(ImageView fruit, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
			fruit.setDisable(false);
//			fruit.setImage(new Image("watermelon.png"));
			Path path = new Path();
			path.getElements().add(new MoveTo(0, 0));
			path.getElements().add(new LineTo(0, 1000));
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
}
