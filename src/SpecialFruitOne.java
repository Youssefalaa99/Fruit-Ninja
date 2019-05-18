import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class SpecialFruitOne extends FruitDecorator {

    public SpecialFruitOne(Fruit fruit){
        super(fruit);
    }

    @Override
    public int getSliceScore() {
        return fruit.getSliceScore()+4;
    }


}
