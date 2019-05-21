import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class Fruit implements GameObject {
    private Boolean isSliced;
    private Image[] image;
    private Path rdmPath;
    private int sliceScore = 1;

    public Fruit(Image[] image, Path path) {
        isSliced = false;
        this.image = image;
        rdmPath = path;
    }

    public int getSliceScore() {
        return sliceScore;
    }

    @Override
    public boolean isSliced() {
        return isSliced;
    }

    @Override
    public void slice() {
        isSliced = true;
    }

    @Override
    public Image[] getImage() {
        return image;
    }

    public Path getPath() {
        return rdmPath;
    }

    @Override
    public void setIsSliced(Boolean x) {
        isSliced = x;
    }
}
