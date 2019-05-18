import javafx.scene.image.Image;
import javafx.scene.shape.Path;

import java.util.Random;

public class Fruit implements GameObject {
    private int Xlocation;
    private int Ylocation;
    private int maxHeight;
    private int initialVelocity;
    private int fallingVelocity;
    private Boolean isSliced;
    private Boolean hasMovedOffScreen;
    private Image[] image;
    private Path rightPath;
    private Path leftPath;
    private int sliceScore = 1;
    
    public Fruit() {
    	
    }

    public Fruit(Image[] image,Path right,Path left){
        Xlocation = 0;
        Ylocation = 0;
        maxHeight = 0;
        initialVelocity = 0;
        fallingVelocity = 0;
        isSliced = false;
        hasMovedOffScreen = false;
        this.image = image;
        rightPath=right;
        leftPath=left;
    }

    public int getSliceScore() {
        return sliceScore;
    }

    public void setXlocation(int xlocation) {
        Xlocation = xlocation;
    }

    public void setYlocation(int ylocation) {
        Ylocation = ylocation;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public void setInitialVelocity(int initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public void setFallingVelocity(int fallingVelocity) {
        this.fallingVelocity = fallingVelocity;
    }

    public void setHasMovedOffScreen(Boolean hasMovedOffScreen) {
        this.hasMovedOffScreen = hasMovedOffScreen;
    }

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
    public boolean isSliced() {
        return isSliced;
    }

    @Override
    public boolean hasMovedOffScreen() {
        return hasMovedOffScreen;
    }

    @Override
    public void slice() {
        isSliced=true;
        //Setting sliced image to image view
        //Score++

    }

    @Override
    public void move(double time) {

    }

    @Override
    public Image[] getImage() {
        return image;
    }

    public Path getRightPath() {
        return rightPath;
    }

    public Path getLeftPath() {
        return leftPath;
    }
}
