import javafx.scene.image.Image;

import java.io.FileInputStream;

public class ObjectImages {
	private Image banana;
	private Image mango;
	private Image watermelon;
	private Image apple;
	private Image orange;
	private Image fatalBomb;
	private Image dangerousBomb;

	public ObjectImages() {
		try {
			banana = new Image(new FileInputStream(""));
			mango = new Image(new FileInputStream(""));
			watermelon = new Image(new FileInputStream(""));
			apple = new Image(new FileInputStream(""));
			orange = new Image(new FileInputStream(""));
			fatalBomb = new Image(new FileInputStream(""));
			dangerousBomb = new Image(new FileInputStream(""));
		} catch (Exception e) {
			System.out.println("Error in ObjectImages" + e);
		}
	}

	public Image getBanana() {
		return banana;
	}

	public Image getMango() {
		return mango;
	}

	public Image getWatermelon() {
		return watermelon;
	}

	public Image getApple() {
		return apple;
	}

	public Image getOrange() {
		return orange;
	}

	public Image getFatalBomb() {
		return fatalBomb;
	}

	public Image getDangerousBomb() {
		return dangerousBomb;
	}
}
