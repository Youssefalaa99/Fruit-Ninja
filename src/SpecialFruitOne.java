import javafx.scene.image.Image;
import javafx.scene.shape.Path;

import java.util.Random;

public class SpecialFruitOne extends SpecialFruit {
    private final int sliceScore = 5;

    public SpecialFruitOne(Image[] image, Path right, Path left){
        super(image,right,left);
    }

    @Override
    public int getSliceScore() {
        return sliceScore;
    }
}
