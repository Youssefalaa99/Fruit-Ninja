import javafx.scene.image.Image;

public class DangerousBomb extends Bombs {

	public DangerousBomb(Image image){
		super(image);
	}

	public int changes(int lives) {
		return isSliced() ? --lives : lives;
	}


	@Override
	public void slice() {

	}
}
