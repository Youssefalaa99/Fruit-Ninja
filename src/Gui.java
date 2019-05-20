import javafx.application.Platform;
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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;


public class Gui implements Initializable {
    @FXML private ImageView sword1;
    @FXML private ImageView sword2;
    @FXML private ImageView sword3;
    @FXML private Button start;
    private AnimationGUI ani;
    @FXML private ImageView fruit1;
    @FXML private ImageView fruit2;
    @FXML private ImageView fruit3;
    @FXML private ImageView fruit4;
    @FXML private ImageView fruit5;
    @FXML private ImageView fruit6;
    @FXML private ImageView fatalBomb;
    @FXML  private ImageView dangerousBomb;
    @FXML private AnchorPane pane;
    @FXML private ImageView superFruit5;
    @FXML private ImageView superFruit10;
    @FXML private HBox livesBox;
    @FXML private Label score;
    @FXML private Label highscore;
    @FXML private  AnchorPane GameOverWdw;
    @FXML private Button okay;
    @FXML private ImageView background;
    @FXML private Button save;
    @FXML private Label timerLabel;
    
    private AudioClip gameover = new AudioClip(this.getClass().getResource("gameover.wav").toString());
    private AudioClip bomb = new AudioClip(this.getClass().getResource("bomb.wav").toString());
    private AudioClip slice = new AudioClip(this.getClass().getResource("slicing.wav").toString());
    Timer timer = new Timer();

    public Gui(){ ani= new AnimationGUI(); }
private GameEngine engine;

    public void sliceObjects(Model model){
        fruit1.setOnMouseDragEntered(mouseEvent -> {
            if (mouseEvent.isPrimaryButtonDown()) {
                fruit1.setImage(model.getFruits(0).getImage()[1]);
                fruit1.setDisable(true);
                slice.play();
                model.getFruits(0).slice();
                model.addScore(model.getFruits(0).getSliceScore());
                model.setCurrentScore(model.getCurrentScore());
                render(model);
                System.out.println(fruit1.getTranslateX());
                System.out.println(fruit1.getTranslateY());
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
                    fruit1.setVisible(false);
                    fruit2.setVisible(false);
                    fruit3.setVisible(false);
                    fruit4.setVisible(false);
                    fruit5.setVisible(false);
                    fruit6.setVisible(false);
                    dangerousBomb.setVisible(false);
                    fatalBomb.setVisible(false);
                    superFruit5.setVisible(false);
                    superFruit10.setVisible(false);
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
                fruit1.setVisible(false);
                fruit2.setVisible(false);
                fruit3.setVisible(false);
                fruit4.setVisible(false);
                fruit5.setVisible(false);
                fruit6.setVisible(false);
                dangerousBomb.setVisible(false);
                fatalBomb.setVisible(false);
                superFruit5.setVisible(false);
                superFruit10.setVisible(false);
                render(model);
                System.out.println("FatalBomb");
                // fruit1.slice(true);
            }
        });
    }
    public void esc(ActionEvent event) throws IOException {

        Stage stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("Start.fxml"));
        Scene scene = new Scene(root);
        stage2.setScene(scene);
        stage2.show();
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

                GameOverWdw.setVisible(true);
                GameOverWdw.setDisable(false);
                timer.cancel();
            }

        }

    public void startAnimation(Model model){
        double x1= model.getLevel().getLevelSpeed();
        double x2= model.getLevel().getNoOfObjects();

        ani.moveFruit(fruit1,model.getFruits(0),x2*ThreadLocalRandom.current().nextInt(5000, 10000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveFruit(fruit2,model.getFruits(1),x2*ThreadLocalRandom.current().nextInt(1000, 3000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveFruit(fruit3,model.getFruits(2), x2*ThreadLocalRandom.current().nextInt(1000, 5000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveFruit(fruit4,model.getFruits(3), x2*ThreadLocalRandom.current().nextInt(5000, 10000),
                x1*ThreadLocalRandom.current().nextInt(3000, 6000));
        ani.moveFruit(fruit5,model.getFruits(4), x2*ThreadLocalRandom.current().nextInt(3000, 5000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveFruit(fruit6,model.getFruits(5), x2*ThreadLocalRandom.current().nextInt(1000, 3000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveBomb(dangerousBomb,model.getBombs(0), x2*ThreadLocalRandom.current().nextInt(5000, 10000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveBomb(fatalBomb,model.getBombs(1), x2*ThreadLocalRandom.current().nextInt(2000, 5000),
                x1*ThreadLocalRandom.current().nextInt(4000, 6000));
        ani.moveSuper(superFruit5,model.getSpecialFruits(0), ThreadLocalRandom.current().nextInt(10000, 20000),
                ThreadLocalRandom.current().nextInt(3000, 5000));
        ani.moveSuper(superFruit10,model.getSpecialFruits(1), ThreadLocalRandom.current().nextInt(10000, 20000),
                ThreadLocalRandom.current().nextInt(3000, 5000));
    }
   
    public void startTimer() {
    	
          timer.scheduleAtFixedRate(new TimerTask() {
    	    	  int interval=1;
    	        public void run() {
    	          
					if(interval > 0)
    	            {
    	            	Platform.setImplicitExit(false);
    	                Platform.runLater(() -> timerLabel.setText(":"+Integer.toString(interval)));
    	                 interval++;
    	            }
    	       
    	        }
    	    }, 1000,1000);
    	}
    	
   
    
    
    public void save() {
    	engine.saveGame();
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pane.addEventFilter(MouseEvent.DRAG_DETECTED, (MouseEvent mouseEvent) -> {
            pane.startFullDrag();
        });
        GameOverWdw.setVisible(false);
        GameOverWdw.setDisable(true);
        
        startTimer();    
    }
    

    
    
    
}
