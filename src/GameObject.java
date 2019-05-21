import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public interface GameObject {
	/**
	 * @return whether the object is sliced or not
	 */
	public boolean isSliced();

	/**
	 * it is used to slice the object
	 */
	public void slice();

	/**
	 * @return at least two images of the object, one when it is sliced and one when
	 *         it is not.
	 */
	public Image[] getImage();

	public Path getPath();

	public int getSliceScore();

	public void setIsSliced(Boolean x);

}
