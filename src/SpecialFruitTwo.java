import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class SpecialFruitTwo extends FruitDecorator {

	public SpecialFruitTwo(Fruit fruit) {
		super(fruit);
	}

	@Override
	public int getSliceScore() {

		return fruit.getSliceScore() + 9;
	}
}