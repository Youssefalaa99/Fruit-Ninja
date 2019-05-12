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
    @Override
    public int getXlocation() {
        return Xlocation;
    }

    @Override
    public int getYlocation() {
        return Ylocation;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getInitialVelocity() {
        return initialVelocity;
    }

    @Override
    public int getFallingVelocity() {
        return fallingVelocity;
    }

    @Override
    public Boolean isSliced() {
        return isSliced;
    }

    @Override
    public Boolean hasMovedOffScreen() {
        return hasMovedOffScreen;
    }

    @Override
    public void slice() {
        isSliced=true;
    }

    @Override
    public void move(double time) {

    }

    @Override
    public Image[] getImages() {
        return images;
    }
}
