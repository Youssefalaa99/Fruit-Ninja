import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GameEngine implements GameActions {
    private static GameEngine instance = null;
    private Model model;
    private Gui view;

    private GameEngine(){

    }
    public static synchronized GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;

    }

    public void newGame(Level level) {
        this.model = new Model(level);
//		view = new Gui();
//		ani= new AnimationGUI();
        view.render(model);
//		moveNode();
        view.startAnimation(model);
        sliceObjects();
    }

    @Override
    public GameObject createGameObject() {
        return null;
    }


    @Override
    public void updateObjectsLocations() {

    }

    @Override
    public void sliceObjects() {
        view.sliceObjects(model);

    }


    @Override
    public void saveGame() {
        Invoker invoker = new Invoker();
        SaveGame saveGame = new SaveGame(model);
        invoker.setCommand(saveGame);
        invoker.executeCommand();
    }

    @Override
    public void loadGame() {
        Invoker invoker = new Invoker();
        LoadGame loadGame = new LoadGame(model);
        invoker.setCommand(loadGame);
        invoker.executeCommand();
        view.startAnimation(model);
        view.render(model);
        sliceObjects();
    }

    @Override
    public void ResetGame() {

//		ani= new AnimationGUI();
//		render(model);
//		moveNode();
    }

    public void setGui(Gui gui){
        view = gui;
    }



}
