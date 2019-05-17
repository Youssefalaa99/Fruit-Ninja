public class Model {
    private int lives;
    private int currentScore;
    private int highScore;
    private Level level;

    public Model(Level level){
        lives = 3 ;
        currentScore = 0;
        //Object class XmlFile
        //highScore=load...
        setLevel(level);
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
