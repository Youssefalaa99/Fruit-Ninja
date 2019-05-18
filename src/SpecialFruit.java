import javafx.scene.image.Image;
import javafx.scene.shape.Path;
import java.util.Random;

public abstract class SpecialFruit extends Fruit { // when initialized Fruit specialFruit = new SpecialFruit1 or 2 (parameters);

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

	private Fruit SpecialFruit;

	public SpecialFruit(Fruit specialFruit) {
		super(specialFruit.getImage(),specialFruit.getPath());
		this.SpecialFruit = specialFruit;
	}

	public SpecialFruit(Image[] image, Path path) {
		super(image,path);
		Xlocation = 0;
		Ylocation = 0;
		maxHeight = 0;
		initialVelocity = 0;
		fallingVelocity = 0;
		isSliced = false;
		hasMovedOffScreen = false;
		this.image = image;
		rdmPath = path;
	}

	/*
	 * public int getSliceScore() { return sliceScore; }
	 */
	@Override
	public int getSliceScore() {
		return SpecialFruit.getSliceScore();
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
