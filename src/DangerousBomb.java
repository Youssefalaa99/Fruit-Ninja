import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class DangerousBomb extends Bombs {

	public DangerousBomb(Image[] image, Path right, Path left){
		super(image,right,left);
	}

	public int changes(int lives) {
		return isSliced() ? --lives : lives;
	}


	@Override
	public void slice() {

	}
}
