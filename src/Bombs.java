import javafx.scene.image.Image;

public abstract class Bombs implements GameObject {
    private int Xlocation;
    private int Ylocation;
    private int maxHeight;
    private int initialVelocity;
    private int fallingVelocity;
    private Boolean isSliced;
    private Boolean hasMovedOffScreen;
    private Image image;


    public Bombs(Image image){
        Xlocation=0;
        Ylocation=0;
        maxHeight=0;
        initialVelocity=0;
        fallingVelocity=0;
        isSliced=false;
        hasMovedOffScreen=false;
        this.image =image;
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
    }

    @Override
    public void move(double time) {

    }

    @Override
    public Image getImage() {
        return image;
    }
}
