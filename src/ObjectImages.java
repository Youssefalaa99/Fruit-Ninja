import javafx.scene.image.Image;
import java.io.FileInputStream;

public class ObjectImages {
    private Image banana;
//    private Image bananaSliced;
    private Image peach;
//    private Image mangoSliced;
    private Image watermelon;
//    private Image watermelonSliced;
    private Image raspberry;
//    private Image appleSliced;
    private Image orange;
//    private Image orangeSliced;
    private Image specialFruit1;
//    private Image freezeFruitSliced;
    private Image specialFruit2;
//    private Image multiplierFruitSliced;
    private Image fatalBomb;
    private Image dangerousBomb;

    public ObjectImages (){
        try {
        banana=new Image(new FileInputStream(""));
//        bananaSliced=new Image(new FileInputStream(""));
        peach =new Image(new FileInputStream(""));
//        mangoSliced=new Image(new FileInputStream(""));
        watermelon=new Image(new FileInputStream(""));
//        watermelonSliced=new Image(new FileInputStream(""));
        raspberry =new Image(new FileInputStream(""));
//        appleSliced=new Image(new FileInputStream(""));
        orange=new Image(new FileInputStream(""));
//        orangeSliced=new Image(new FileInputStream(""));
        specialFruit1 =new Image(new FileInputStream(""));
//        freezeFruitSliced=new Image(new FileInputStream(""));
        specialFruit2 =new Image(new FileInputStream(""));
//        multiplierFruitSliced=new Image(new FileInputStream(""));
        fatalBomb=new Image(new FileInputStream(""));
        dangerousBomb=new Image(new FileInputStream(""));
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

    public Image getOrange() {
        return orange;
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
