import java.util.concurrent.ThreadLocalRandom;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class AnimationGUI {

	public void move1(ImageView fruit) {
	
		Timeline timeline = new Timeline();
		
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(3000), randomKeyFrame(fruit,0, 0) ));
		
		timeline.setCycleCount(1000);
		timeline.play();
	
	
	}

	public void move2(ImageView fruit) {
		
		Timeline timeline = new Timeline();
		
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(3000), randomKeyFrame(fruit,0, 0) ));
		timeline.setCycleCount(1000);
		timeline.setDelay(Duration.millis(200));

		timeline.play();
	
	}

	public void move3(ImageView fruit) {
	
		Timeline timeline = new Timeline();
		
		timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(3000), randomKeyFrame(fruit,0, 0) ));
		timeline.setCycleCount(1000);
		
		timeline.play();
	
	}

	public EventHandler<ActionEvent> randomKeyFrame(ImageView fruit, int max, int min) {
		int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
		EventHandler<ActionEvent> event = e ->{
			
			
				Path path = new Path();
				path.getElements().add(new MoveTo(0, 0));
				path.getElements().add(new CubicCurveTo(0, -500,350 , -500, 500, 0));
				PathTransition pathtrans = new PathTransition(Duration.millis(3000), path, fruit);
				pathtrans.play();
		};
		
		return event;

	}

}
