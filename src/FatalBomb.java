import javafx.scene.image.Image;

public class FatalBomb extends Bombs {

	public FatalBomb(Image image){
		super(image);
	}

	public int changes(int lives) {
		return isSliced() ? 0 : lives;
	}





}
