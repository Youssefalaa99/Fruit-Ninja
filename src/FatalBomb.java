import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class FatalBomb extends Bombs {

	public FatalBomb(Image[] image, Path right, Path left){
		super(image,right,left);
	}

	public int changes(int lives) {
		return isSliced() ? 0 : lives;
	}





}
