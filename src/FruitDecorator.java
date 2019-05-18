import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public abstract class FruitDecorator implements GameObject{ // when initialized Fruit specialFruit = new SpecialFruit1 or 2 (parameters);

	private int Xlocation;
	private int Ylocation;
	private int maxHeight;
	private int initialVelocity;
	private int fallingVelocity;
	private Boolean isSliced;
	private Boolean hasMovedOffScreen;
	private Image[] image;
	private Path rdmPath;
	private int sliceScore = 1;

	protected Fruit fruit;

	public FruitDecorator(Fruit fruit) {
		this.fruit = fruit;
	}


	public int getSliceScore() {
		return sliceScore;
	}

	public void setXlocation(int xlocation) {
		Xlocation = xlocation;
	}

	public void setYlocation(int ylocation) {
		Ylocation = ylocation;
	}

	public void setMaxHeight(int maxHeight) {
		this.maxHeight = maxHeight;
	}

	public void setInitialVelocity(int initialVelocity) {
		this.initialVelocity = initialVelocity;
	}

	public void setFallingVelocity(int fallingVelocity) {
		this.fallingVelocity = fallingVelocity;
	}

	public void setHasMovedOffScreen(Boolean hasMovedOffScreen) {
		this.hasMovedOffScreen = hasMovedOffScreen;
	}

	@Override
	public int getXlocation() {
		return Xlocation;
	}

	@Override
	public int getYlocation() {
		return Ylocation;
	}

	@Override
	public int getMaxHeight() {
		return maxHeight;
	}

	@Override
	public int getInitialVelocity() {
		return initialVelocity;
	}

	@Override
	public int getFallingVelocity() {
		return fallingVelocity;
	}

	@Override
	public boolean isSliced() {
		return isSliced;
	}

	@Override
	public boolean hasMovedOffScreen() {
		return hasMovedOffScreen;
	}

	@Override
	public void slice() {
		isSliced = true;
		// Setting sliced image to image view
		// Score++

	}

	@Override
	public void move(double time) {

	}

	@Override
	public Image[] getImage() {
		return image;
	}

	public Path getPath() {
		return rdmPath;
	}


}
