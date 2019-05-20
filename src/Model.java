import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Model {
    private int lives;
    private int currentScore;
    private int highScore;
    private Level level;
    private List<GameObject> fruits;
    private List<GameObject> bombs;
    private List<GameObject> specialFruits;
    private XmlFile file;


    public Model(Level level){
        lives = 3 ;
        currentScore = 0;
        file = new XmlFile();
        setHighScore(file.getHighScore());
        setLevel(level);
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
    	if(lives==0) {
    		endGame();
    		flag=1;
    	}
    	return flag;
    }

    public void endGame(){
        lives=0;
        System.out.println("Game Over!!!");
    }


    //To be modified: get objects from arrayList
    public GameObject getRandomFruit(){
        GameObjectFactory factory = GameObjectFactory.getInstance();
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
        return object;
    }

    public GameObject getRandomBomb(){
        GameObjectFactory factory = GameObjectFactory.getInstance();
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
        return object;
    }

    public GameObject getRandomSpecialFruit(){
        GameObjectFactory factory = GameObjectFactory.getInstance();
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
        return object;
    }

    public void setLives(int lives){
        this.lives=lives;
    }

    public void save() {
        file.saveGame(this);
    }

    public void load() {
        Model loadedModel = file.loadGame();
        this.setLevel(loadedModel.getLevel());
        this.setCurrentScore(loadedModel.getCurrentScore());
        this.setHighScore(loadedModel.getHighScore());
        this.setLives(loadedModel.getLives());
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
