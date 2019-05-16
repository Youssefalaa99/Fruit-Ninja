import javafx.scene.image.Image;

public class SpecialFruitTwo extends Fruit {
    private final int sliceScore=10;

    @Override
    public int getSliceScore() {
        return sliceScore;
    }

    public SpecialFruitTwo(Image image){
        super(image);
    }

}
