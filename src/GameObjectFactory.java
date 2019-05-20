import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GameObjectFactory {
	private static GameObjectFactory instance = null;
	private ObjectImages images = new ObjectImages();

	private GameObjectFactory() {

	}

	public static synchronized GameObjectFactory getInstance() {
		if (instance == null) {
			instance = new GameObjectFactory();
		}
		return instance;

	}

	public GameObject createFruit(String fruit) {
//		Random random = new Random();
//		int x = random.nextInt(4);
		switch (fruit) {
		case "B":
			return new Fruit(images.getBananaImages(), rdmPath());
		case "R":
			return new Fruit(images.getRaspberryImages(), rdmPath());
		case "P":
			return new Fruit(images.getPeachImages(), rdmPath());
		case "W":
			return new Fruit(images.getWatermelonImages(), rdmPath());
		default:
			return null;
		}
	}

	public GameObject createSpecialFruit(String specialFruit) {
//		Random random = new Random();
//		int x = random.nextInt(3);
		Fruit specialFruitOne = new Fruit(images.getSpecialFruit1Images(), rdmLine());
		Fruit specialFruitTwo = new Fruit(images.getSpecialFruit2Images(), rdmLine());
		// System.out.println(x);
		switch (specialFruit) {
		case "S1":
			return new SpecialFruitOne(specialFruitOne);
		case "S2":
			return new SpecialFruitTwo(specialFruitTwo);
		default:
			return null;
		}

	}

	public GameObject createBomb(String bomb) {
//		Random random = new Random();
//		int x = random.nextInt(3);
		switch (bomb) {
		case "D":
			return new DangerousBomb(images.getDangerousBombImages(), rdmPath());
		case "F":
			return new FatalBomb(images.getFatalBombImages(), rdmPath());
		default:
			return null;
		}
	}

	public Path rdmPath() {
		int rdmHeight = ThreadLocalRandom.current().nextInt(-800, -400);
		Path path = new Path();
		Random random = new Random();
		int x = random.nextInt(2);
		if (x == 0) {
			int startXLeft;
			startXLeft = ThreadLocalRandom.current().nextInt(-300, -200);
			path.getElements().add(new MoveTo(startXLeft, 0));
			path.getElements().add(new CubicCurveTo(0, rdmHeight, 350, rdmHeight, 300, 0));

		} else {
			int startXRight;
			startXRight = ThreadLocalRandom.current().nextInt(200, 300);
			path.getElements().add(new MoveTo(startXRight, 0));
			path.getElements().add(new CubicCurveTo(0, rdmHeight, -350, rdmHeight, -300, 0));

		}
		return path;

	}

	public Path rdmLine() {
		Path path = new Path();
		int rdmHeight = ThreadLocalRandom.current().nextInt(-275, 275);
		path.getElements().add(new MoveTo(rdmHeight, 0));
		path.getElements().add(new LineTo(0, 1000));
		System.out.println(path);
		return path;
	}

}
