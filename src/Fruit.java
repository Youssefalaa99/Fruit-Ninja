import javafx.scene.image.Image;

import java.util.Random;

public class Fruit implements GameObject {
    private int Xlocation;
    private int Ylocation;
    private int maxHeight;
    private int initialVelocity;
    private int fallingVelocity;
    private Boolean isSliced;
    private Boolean hasMovedOffScreen;
    private Image[] images;
    private int randomInitialPosition;

    public Fruit(Image[] images){
        Random random=new Random();
        randomInitialPosition =random.nextInt(4);
        Xlocation=0;
        Ylocation=0;
        maxHeight=0;
        initialVelocity=0;
        fallingVelocity=0;
        isSliced=false;
        hasMovedOffScreen=false;
        this.images=images;
    }


    public enum getObjectType{

    };
    
    public int getXlocation() {
        return Xlocation;
    }

    
    public int getYlocation() {
        return Ylocation;
    }

    
    public int getMaxHeight() {
        return maxHeight;
    }

    
    public int getInitialVelocity() {
        return initialVelocity;
    }

    @Override
    public int getVelocity() {
        return fallingVelocity;
    }

    @Override
    public boolean isSliced() {
        return isSliced;
    }

    
    public boolean hasMovedOffScreen() {
        return hasMovedOffScreen;
    }

    @Override
    public void slice() {
        isSliced=true;
    }

    
    public void move(double time) {

    }

    
    public Image getImages() {
        return null;
    }
}
