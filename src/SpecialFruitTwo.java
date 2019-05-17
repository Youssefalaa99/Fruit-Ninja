import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class SpecialFruitTwo extends Fruit {
    private final int sliceScore=10;


    public SpecialFruitTwo(Image[] image, Path right, Path left){
        super(image,right,left);
    }

    @Override
    public int getSliceScore() {
        return sliceScore;
    }


}
