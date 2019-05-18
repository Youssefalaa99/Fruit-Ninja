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

	public GameObject createFruit() {
		Random random = new Random();
		int x = random.nextInt(5);
		switch (x) {
		case 0:
			return new Fruit(images.getBananaImages(), rdmPath());
		case 1:
			return new Fruit(images.getRaspberryImages(), rdmPath());
		case 2:
			return new Fruit(images.getPeachImages(), rdmPath());
		case 3:
			return new Fruit(images.getWatermelonImages(), rdmPath());
		default:
			return null;
		}
	}

	public GameObject createSpecialFruit() {
		Random random = new Random();
		int x = random.nextInt(3);
		Fruit specialFruitOne = new Fruit(images.getSpecialFruit1Images(), rdmLine());
		Fruit specialFruitTwo = new Fruit(images.getSpecialFruit2Images(), rdmLine());
		System.out.println(x);
		switch (x) {
		case 0:
			return new SpecialFruitOne(specialFruitOne);
		case 1:
			return new SpecialFruitOne(specialFruitOne);
		default:
			return new SpecialFruitTwo(specialFruitTwo);
		}

	}

	public GameObject createBomb() {
		Random random = new Random();
		int x = random.nextInt(3);
		switch (x) {
		case 0:
			return new DangerousBomb(images.getDangerousBombImages(), rdmPath());
		case 1:
			return new DangerousBomb(images.getDangerousBombImages(), rdmPath());
		default:
			return new FatalBomb(images.getFatalBombImages(), rdmPath());
		}
	}

	private Path rdmPath() {
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

	private Path rdmLine() {
		Path path = new Path();
		int rdmHeight = ThreadLocalRandom.current().nextInt(-275, 275);
		path.getElements().add(new MoveTo(rdmHeight, 0));
		path.getElements().add(new LineTo(0, 1000));
		System.out.println(path);
		return path;
	}

}
