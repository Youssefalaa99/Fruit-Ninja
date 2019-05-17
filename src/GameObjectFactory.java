import javafx.scene.shape.Path;
import java.util.Random;

public class GameObjectFactory {
    private static GameObjectFactory instance=null;
    private ObjectImages images=new ObjectImages();


    private GameObjectFactory(){

    }
    public static synchronized GameObjectFactory getInstance(){
        if(instance==null){
            instance=new GameObjectFactory();
        }
        return instance;

    }

    public Fruit createFruit(Path right,Path left){
        Random random=new Random();
        int x=random.nextInt(5);
        switch (x){
            case 0:
                return new Fruit(images.getBananaImages(),right,left);
            case 1:
                return new Fruit(images.getRaspberryImages(),right,left);
            case 2:
                return new Fruit(images.getPeachImages(),right,left);
            case 3:
                return new Fruit(images.getWatermelonImages(),right,left);
            default:
                return null;
        }
    }

    public Fruit createSpecialFruit(Path right,Path left){
    	Random random=new Random();
        int x=random.nextInt(3);
    	System.out.println(x);
        switch (x){
            case 0:
                return new SpecialFruitOne(images.getSpecialFruit1Images(),right,left);
            case 1:
            	return new SpecialFruitOne(images.getSpecialFruit1Images(),right,left);
            default:
            	return new SpecialFruitTwo(images.getSpecialFruit2Images(),right,left);
        }

    }

    public Bombs createBomb(Path right,Path left){
    	Random random=new Random();
        int x=random.nextInt(3);
    	switch (x){
            case 0:
            	return new DangerousBomb(images.getDangerousBombImages(),right,left);
            case 1:
            	return new DangerousBomb(images.getDangerousBombImages(),right,left);
            default:
            	return new FatalBomb(images.getFatalBombImages(),right,left);
        }
    }


}
