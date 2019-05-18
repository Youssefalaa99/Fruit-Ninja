import javafx.scene.image.Image;
import javafx.scene.shape.Path;

import java.util.Random;

public class SpecialFruitOne extends Fruit {
    private final int sliceScore=5;

    public SpecialFruitOne(Image[] image, Path path){
        super(image,path);
    }

    @Override
    public int getSliceScore() {
        return sliceScore;
    }
}
