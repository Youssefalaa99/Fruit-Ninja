import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public abstract class FruitDecorator implements GameObject { // when initialized Fruit specialFruit = new SpecialFruit1
																// or 2 (parameters);

	protected Fruit fruit;

	public FruitDecorator(Fruit fruit) {
		this.fruit = fruit;
	}

	public int getSliceScore() {
		return fruit.getSliceScore();
	}

	@Override
	public boolean isSliced() {
		return fruit.isSliced();
	}

	@Override
	public void slice() {
		fruit.slice();
	}

	@Override
	public Image[] getImage() {
		return fruit.getImage();
	}

	public Path getPath() {
		return fruit.getPath();
	}

	@Override
	public void setIsSliced(Boolean x) {
		fruit.setIsSliced(x);
	}

}