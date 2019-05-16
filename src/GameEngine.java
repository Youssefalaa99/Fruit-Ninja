public class GameEngine  implements GameActions{
    private static GameEngine instance=null;

    private GameEngine(){

    }
    public static synchronized GameEngine getInstance(){
        if(instance==null){
            instance=new GameEngine();
        }
        return instance;

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

    }

    @Override
    public void saveGame() {

    }

    @Override
    public void loadGame() {

    }

    @Override
    public void ResetGame() {

    }
}
