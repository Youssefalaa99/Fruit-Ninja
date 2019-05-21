import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    private int lives;
    private int currentScore;
    private int highScore;
    private Level level;
    private String gameType;
    private List<GameObject> fruits;
    private List<GameObject> bombs;
    private List<GameObject> specialFruits;
    private XmlFile file;


    public Model(){
        lives = 3 ;
        currentScore = 0;
        file = new XmlFile();
        setHighScore(file.getHighScore());
        fruits = new ArrayList<>();
        bombs = new ArrayList<>();
        specialFruits = new ArrayList<>();
        GameObjectFactory factory = GameObjectFactory.getInstance();
        addFruit(factory.createFruit("B"));
        addFruit(factory.createFruit("R"));
        addFruit(factory.createFruit("P"));
        addFruit(factory.createFruit("W"));
        addFruit(factory.createFruit("W"));
        addFruit(factory.createFruit("P"));
        addBomb(factory.createBomb("D"));
        addBomb(factory.createBomb("F"));
        addSpecialFruit(factory.createSpecialFruit("S1"));
        addSpecialFruit(factory.createSpecialFruit("S2"));
    }

    public String getGameType() {
        return gameType;
    }

    public void reset(){
        lives = 3 ;
        currentScore = 0;
        setHighScore(file.getHighScore());
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public void addScore(int score){
        currentScore+=score;
        if(currentScore > highScore) {
            highScore = currentScore;
            file.saveHighScore(highScore);
            System.out.println(file.getHighScore() + "-------------------------");
        }
    }

    public GameObject getFruits(int i) {
        return fruits.get(i);
    }

    public GameObject getBombs(int i) {
        return bombs.get(i);
    }

    public GameObject getSpecialFruits(int i) {
        return specialFruits.get(i);
    }

    public void addFruit(GameObject fruit){
        fruits.add(fruit);
    }

    public void removeFruit(GameObject fruit){
        fruits.remove(fruit);
    }

    public void clearFruits(){
        fruits.clear();
    }

    public void addBomb(GameObject bomb){
        bombs.add(bomb);
    }

    public void removeBomb(GameObject bomb){
        bombs.remove(bomb);
    }

    public void clearBombs(){
        bombs.clear();
    }

    public void addSpecialFruit(GameObject fruit){
        specialFruits.add(fruit);
    }

    public void removeSpecialFruit(GameObject fruit){
        specialFruits.remove(fruit);
    }

    public void clearSpecialFruits(){
        specialFruits.clear();
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public int getLives() {
        return lives;
    }



    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public Level getLevel() {
        return level;
    }

    public int removeLife() {
    	int flag=0;
        lives--;
    	if(lives<=0) {
    		flag=1;
    	}
    	return flag;
    }


    public void setLives(int lives){
        this.lives=lives;
    }

    public void save() {
        file.saveGame(this);
    }

    public void decreaseScore(){
        currentScore-=5;
        if(currentScore<0)
            currentScore=0;
    }

    public void load() {
        Model loadedModel = file.loadGame();
        this.setLevel(loadedModel.getLevel());
        this.setCurrentScore(loadedModel.getCurrentScore());
        this.setHighScore(loadedModel.getHighScore());
        this.setLives(loadedModel.getLives());
        this.setGameType("Classic");
        fruits = new ArrayList<>();
        bombs = new ArrayList<>();
        specialFruits = new ArrayList<>();
        GameObjectFactory factory = GameObjectFactory.getInstance();
        addFruit(factory.createFruit("B"));
        addFruit(factory.createFruit("R"));
        addFruit(factory.createFruit("P"));
        addFruit(factory.createFruit("W"));
        addFruit(factory.createFruit("W"));
        addFruit(factory.createFruit("P"));
        addBomb(factory.createBomb("D"));
        addBomb(factory.createBomb("F"));
        addSpecialFruit(factory.createSpecialFruit("S1"));
        addSpecialFruit(factory.createSpecialFruit("S2"));
    }
}
