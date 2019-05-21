import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public abstract class Bombs implements GameObject {
    private Boolean isSliced;
    private Image[] image;
    private Path rdmPath;

    public Bombs(Image[] image, Path path) {
        isSliced = false;
        this.image = image;
        rdmPath = path;
    }

    @Override
    public int getSliceScore() {
        return 0;
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
