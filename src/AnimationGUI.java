import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class AnimationGUI {
	public void move1(ImageView fruit) {
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(1000), new KeyValue(fruit.yProperty(), 300),
				new KeyValue(fruit.rotateProperty(), 360)));
		timeline.setCycleCount(1000);
		timeline.play();
	}

	public void move2(ImageView fruit) {
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(1000), new KeyValue(fruit.yProperty(), 900),
				new KeyValue(fruit.rotateProperty(), 360)));
		timeline.setCycleCount(1000);
		timeline.play();
	}

	public void move3(ImageView fruit) {
		Timeline timeline = new Timeline();
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(1000), new KeyValue(fruit.yProperty(), 300),
				new KeyValue(fruit.rotateProperty(), 360)));
		timeline.setCycleCount(1000);
		timeline.play();
	}

}
