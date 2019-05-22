import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.event.*;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class AnimationGUI {

    private PathTransition pathTrans;
    private Timeline timelineFruit;
    private Timeline timelineBomb;
    private Timeline timelineSpecialFruit;
    private GameEngine engine;

    public AnimationGUI(GameEngine engine) {
        timelineFruit = new Timeline();
        timelineBomb = new Timeline();
        timelineSpecialFruit = new Timeline();
        this.engine = engine;
    }


    public void moveFruit(ImageView fruit, GameObject object, double delay, double cycle, String gameType) {

        if (gameType.equals("Classic")) {
            timelineFruit.getKeyFrames()
                    .add(new KeyFrame(Duration.millis(delay + cycle + 200), randomFruitPathClassic(fruit, object, delay, cycle), new KeyValue(fruit.rotateProperty(), 360)));
            timelineFruit.setCycleCount(Timeline.INDEFINITE);
            timelineFruit.play();
        } else if (gameType.equals("Arcade")) {
            timelineFruit.getKeyFrames()
                    .add(new KeyFrame(Duration.millis(delay + cycle + 200), randomFruitPathArcade(fruit, object, delay, cycle), new KeyValue(fruit.rotateProperty(), 360)));
            timelineFruit.setCycleCount(Timeline.INDEFINITE);
            timelineFruit.play();
        }

    }

    public void moveBomb(ImageView bomb, GameObject object, double delay, double cycle) {
        timelineBomb.getKeyFrames()
                .addAll(new KeyFrame(Duration.millis(delay + cycle), randomBombPath(bomb, object, delay, cycle)));
        timelineBomb.setCycleCount(Timeline.INDEFINITE);
        timelineBomb.play();

    }

    public void moveSuper(ImageView specialFruit, GameObject object, double delay, double cycle) {
        timelineSpecialFruit.getKeyFrames().addAll(new KeyFrame(Duration.millis(delay + cycle), randomSuperPath(specialFruit, object, delay, cycle), new KeyValue(specialFruit.rotateProperty(), 360)));
        timelineSpecialFruit.setCycleCount(1000);
        timelineSpecialFruit.play();

    }

    public EventHandler<ActionEvent> randomFruitPathClassic(ImageView fruit, GameObject object, double delay, double cycle) {

        EventHandler<ActionEvent> event = e -> {
            Path path;
            fruit.setVisible(true);
            fruit.setDisable(false);
            object.setIsSliced(false);
            fruit.setImage(object.getImage()[0]);
            path = (GameObjectFactory.getInstance()).rdmPath();
            pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
            pathTrans.setDelay(Duration.millis(delay));
            pathTrans.play();
            pathTrans.setOnFinished(event1 -> check(object));

        };

        return event;

    }

    public EventHandler<ActionEvent> randomFruitPathArcade(ImageView fruit, GameObject object, double delay, double cycle) {

        EventHandler<ActionEvent> event = e -> {
            Path path;
            fruit.setVisible(true);
            fruit.setDisable(false);
            object.setIsSliced(false);
            fruit.setImage(object.getImage()[0]);
            path = (GameObjectFactory.getInstance()).rdmPath();
            pathTrans = new PathTransition(Duration.millis(cycle), path, fruit);
            pathTrans.setDelay(Duration.millis(delay));
            pathTrans.play();

        };

        return event;

    }

    public EventHandler<ActionEvent> randomBombPath(ImageView bomb, GameObject object, double delay, double cycle) {

        EventHandler<ActionEvent> event = e -> {
            Path path;
            bomb.setVisible(true);
            bomb.setDisable(false);
            bomb.setImage(object.getImage()[0]);
            path = (GameObjectFactory.getInstance()).rdmPath();

            pathTrans = new PathTransition(Duration.millis(cycle), path, bomb);
            pathTrans.setDelay(Duration.millis(delay));
            pathTrans.play();
        };

        return event;

    }


    public EventHandler<ActionEvent> randomSuperPath(ImageView specialFruit, GameObject object, double delay, double cycle) {

        EventHandler<ActionEvent> event = e -> {
            specialFruit.setVisible(true);
            specialFruit.setDisable(false);
            object.setIsSliced(false);
            specialFruit.setImage(object.getImage()[0]);
            Path path = (GameObjectFactory.getInstance()).rdmLine();
            pathTrans = new PathTransition(Duration.millis(cycle), path, specialFruit);
            pathTrans.setDelay(Duration.millis(delay));
            pathTrans.play();


        };

        return event;

    }


    public void check(GameObject object) {
        if (object.isSliced() == false) {
            engine.removeLife();
        }
    }


    public void stopTimeline() {
        timelineFruit.stop();
        timelineBomb.stop();
        timelineSpecialFruit.stop();
    }
}
