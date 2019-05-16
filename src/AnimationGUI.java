import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class AnimationGUI {

	private PathTransition pathtrans;

	public void move1(ImageView fruit, int delay, int cycle) {
		int randomNum = ThreadLocalRandom.current().nextInt(500, 2000 + 1);

		Timeline timeline = new Timeline();

		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomPath(fruit, delay, cycle)));
		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}

//	public void move2(ImageView fruit) {
//
//		Timeline timeline = new Timeline();
//
//		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(3000), randomKeyFrame(fruit, 4, 0)));
//		timeline.setCycleCount(Timeline.INDEFINITE);
//		timeline.setDelay(Duration.millis(3000));
//		timeline.play();
//
//	}
//
//	public void move3(ImageView fruit) {
//
//		Timeline timeline = new Timeline();
//
//		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(3000), randomKeyFrame(fruit, 9, 0)));
//		timeline.setCycleCount(Timeline.INDEFINITE);
//		timeline.play();
//
//	}
	
	
	public void move3(ImageView fruit) {
		
		Timeline t = new Timeline();
		t.getKeyFrames().addAll(new KeyFrame(Duration.seconds(3), new KeyValue(fruit.yProperty(), 600),
				new KeyValue(fruit.rotateProperty(), 720)));
		t.setCycleCount(1000);
		t.play();

	}
	
	
	
	public void move4(ImageView fruit, int delay, int cycle) {
		int randomNum = ThreadLocalRandom.current().nextInt(500, 2000 + 1);

		Timeline timeline = new Timeline();

		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomPath1(fruit, delay, cycle)));
		timeline.setDelay(Duration.millis(randomNum));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.play();

	}
	
	

	public EventHandler<ActionEvent> randomPath(ImageView fruit, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
//			fruit.setImage(new Image("watermelon.png"));
			Path path = new Path();
			path.getElements().add(new MoveTo(0, 0));
			path.getElements().add(new CubicCurveTo(0, -500, 350, -500, 500, 0));
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
	
	
	public EventHandler<ActionEvent> randomPath1(ImageView fruit, int delay, int cycle) {

		EventHandler<ActionEvent> event = e -> {
			fruit.setVisible(true);
	        Path path = new Path();
			path.getElements().add(new MoveTo(0, 0));
			path.getElements().add(new CubicCurveTo(0, -500, 500, -900, -500, 0));
			pathtrans = new PathTransition(Duration.millis(cycle), path, fruit);
			pathtrans.setDelay(Duration.millis(delay));
			pathtrans.play();

		};

		return event;

	}
	
	
	

}
