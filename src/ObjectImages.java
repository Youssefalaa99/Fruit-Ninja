import javafx.scene.image.Image;
import java.io.FileInputStream;

public class ObjectImages {
    private Image banana;
    private Image bananaSliced;
    private Image peach;
    private Image mangoSliced;
    private Image watermelon;
    private Image watermelonSliced;
    private Image raspberry;
    private Image appleSliced;
    private Image specialFruit1;
    private Image freezeFruitSliced;
    private Image specialFruit2;
    private Image multiplierFruitSliced;
    private Image fatalBomb;
    private Image dangerousBomb;

    public ObjectImages (){
        try {
        banana=new Image(new FileInputStream("banana.png"));
//        bananaSliced=new Image(new FileInputStream(""));
        peach =new Image(new FileInputStream("peach.png"));
//        mangoSliced=new Image(new FileInputStream(""));
        watermelon=new Image(new FileInputStream("watermelon.png"));
//        watermelonSliced=new Image(new FileInputStream(""));
        raspberry =new Image(new FileInputStream("raspberry.png"));
//        appleSliced=new Image(new FileInputStream(""));
        specialFruit1 =new Image(new FileInputStream("special5.png"));
//        freezeFruitSliced=new Image(new FileInputStream(""));
        specialFruit2 =new Image(new FileInputStream("special10.png"));
//        multiplierFruitSliced=new Image(new FileInputStream(""));
        fatalBomb=new Image(new FileInputStream("fatalBomb.png"));
        dangerousBomb=new Image(new FileInputStream("bomb.png"));
        }
        catch (Exception e){
            System.out.println("Error in ObjectImages "+e);
        }
    }

    public Image getBanana() {
        return banana;
    }

    public Image getPeach() {
        return peach;
    }

    public Image getWatermelon() {
        return watermelon;
    }

    public Image getRaspberry() {
        return raspberry;
    }
    public Image getSpecialFruit1() {
        return specialFruit1;
    }

    public Image getSpecialFruit2() {
        return specialFruit2;
    }

    public Image getFatalBomb() {
        return fatalBomb;
    }

    public Image getDangerousBomb() {
        return dangerousBomb;
    }
}
