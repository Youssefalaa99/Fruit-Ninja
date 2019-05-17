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

    public Fruit createFruit(){
        Random random=new Random();
        int x=random.nextInt(5);

        switch (x){
            case 0:
                return new Fruit(images.getBanana());
            case 1:
                return new Fruit(images.getRaspberry());
            case 2:
                return new Fruit(images.getPeach());
            case 3:
                return new Fruit(images.getWatermelon());
            default:
                return null;
        }
    }

    public Fruit createSpecialFruit(){
    	Random random=new Random();
        int x=random.nextInt(3);
    	System.out.println(x);
        switch (x){
            case 0:
                return new SpecialFruitOne(images.getSpecialFruit1());
            case 1:
            	return new SpecialFruitOne(images.getSpecialFruit1());
            default:
            	return new SpecialFruitTwo(images.getSpecialFruit2());
        }

    }

    public Bombs createBomb(){
    	Random random=new Random();
        int x=random.nextInt(3);
    	switch (x){
            case 0:
            	return new DangerousBomb(images.getDangerousBomb());
            case 1:
            	return new DangerousBomb(images.getDangerousBomb());
            default:
            	return new FatalBomb(images.getFatalBomb());
        }
    }


}
