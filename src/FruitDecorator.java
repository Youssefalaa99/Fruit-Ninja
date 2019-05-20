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

	public void setXlocation(int xlocation) {
		fruit.setXlocation(xlocation);
	}

	public void setYlocation(int ylocation) {
		fruit.setYlocation(ylocation);
	}

	public void setMaxHeight(int maxHeight) {
		fruit.setMaxHeight(maxHeight);
	}

	public void setInitialVelocity(int initialVelocity) {
		fruit.setInitialVelocity(initialVelocity);
	}

	public void setFallingVelocity(int fallingVelocity) {
		fruit.setFallingVelocity(fallingVelocity);
	}

	public void setHasMovedOffScreen(Boolean hasMovedOffScreen) {
		fruit.setHasMovedOffScreen(hasMovedOffScreen);
	}

	@Override
	public int getXlocation() {
		return fruit.getXlocation();
	}

	@Override
	public int getYlocation() {
		return fruit.getYlocation();
	}

	@Override
	public int getMaxHeight() {
		return fruit.getMaxHeight();
	}

	@Override
	public int getInitialVelocity() {
		return fruit.getInitialVelocity();
	}

	@Override
	public int getFallingVelocity() {
		return fruit.getFallingVelocity();
	}

	@Override
	public boolean isSliced() {
		return fruit.isSliced();
	}

	@Override
	public boolean hasMovedOffScreen() {
		return fruit.hasMovedOffScreen();
	}

	@Override
	public void slice() {
		fruit.slice();
	}

	@Override
	public void move(double time) {
		fruit.move(time);
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