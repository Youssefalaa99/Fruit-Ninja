import java.util.ArrayList;
import java.util.List;

public class Model {
    private int lives;
    private int currentScore;
    private int highScore;
    private Level level;
    private List<Fruit> fruits;
    private List<Bombs> bombs;
    private List<FruitDecorator> specialFruits;
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
    }

    public void addFruit(Fruit fruit){
        fruits.add(fruit);
    }

    public void removeFruit(Fruit fruit){
        fruits.remove(fruit);
    }

    public void clearFruits(){
        fruits.clear();
    }

    public void addBomb(Bombs bomb){

    }

    public void removeBomb(Bombs bomb){
        bombs.remove(bomb);
    }

    public void clearBombs(){
        bombs.clear();
    }

    public void addSpecialFruit(FruitDecorator fruit){
        specialFruits.add(fruit);
    }

    public void removeSpecialFruit(FruitDecorator fruit){
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
    
    public void removeLife() {
    	lives--;
    	
    	if(lives==0) {
    		
    	}
    }
}
