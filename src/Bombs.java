import javafx.scene.image.Image;

public abstract class Bombs implements GameObject {


    @Override
    public int getXlocation() {
        return 0;
    }

    @Override
    public int getYlocation() {
        return 0;
    }

    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public int getInitialVelocity() {
        return 0;
    }

    @Override
    public int getVelocity() {
        return 0;
    }

    @Override
    public boolean isSliced() {
        return false;
    }

    @Override
    public boolean hasMovedOffScreen() {
        return false;
    }

    @Override
    public void slice() {

    }

    @Override
    public void move(double time) {

    }

    @Override
    public Image[] getImages() {
        return new Image[0];
    }
}
