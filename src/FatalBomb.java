import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class FatalBomb extends Bombs {

	public FatalBomb(Image[] image, Path path) {
		super(image, path);
	}

	public int changes(int lives) {
		return isSliced() ? 0 : lives;
	}

}
