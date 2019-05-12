import javafx.scene.image.Image;

import java.io.FileInputStream;

public class ObjectImages {
    private Image banana;
    private Image bananaSliced;
    private Image mango;
    private Image mangoSliced;
    private Image watermelon;
    private Image watermelonSliced;
    private Image apple;
    private Image appleSliced;
    private Image orange;
    private Image orangeSliced;
    private Image freezeFruit;
    private Image freezeFruitSliced;
    private Image multiplierFruit;
    private Image multiplierFruitSliced;
    private Image fatalBomb;
    private Image dangerousBomb;

    public ObjectImages (){
        try {
        banana=new Image(new FileInputStream(""));
        bananaSliced=new Image(new FileInputStream(""));
        mango=new Image(new FileInputStream(""));
        mangoSliced=new Image(new FileInputStream(""));
        watermelon=new Image(new FileInputStream(""));
        watermelonSliced=new Image(new FileInputStream(""));
        apple=new Image(new FileInputStream(""));
        appleSliced=new Image(new FileInputStream(""));
        orange=new Image(new FileInputStream(""));
        orangeSliced=new Image(new FileInputStream(""));
        freezeFruit=new Image(new FileInputStream(""));
        freezeFruitSliced=new Image(new FileInputStream(""));
        multiplierFruit=new Image(new FileInputStream(""));
        multiplierFruitSliced=new Image(new FileInputStream(""));
        fatalBomb=new Image(new FileInputStream(""));
        dangerousBomb=new Image(new FileInputStream(""));
        }
        catch (Exception e){
            System.out.println("Error in ObjectImages "+e);
        }
    }

    public Image[] getBanana() {
        Image[] images=new Image[2];
        images[0]=banana;
        images[1]=bananaSliced;
        return images;
    }

    public Image[] getMango() {
        Image[] images=new Image[2];
        images[0]=mango;
        images[1]=mangoSliced;
        return images;
    }

    public Image[] getWatermelon() {
        Image[] images=new Image[2];
        images[0]=watermelon;
        images[1]=watermelonSliced;
        return images;
    }

    public Image[] getApple() {
        Image[] images=new Image[2];
        images[0]=apple;
        images[1]=appleSliced;
        return images;
    }

    public Image[] getOrange() {
        Image[] images=new Image[2];
        images[0]=orange;
        images[1]=orangeSliced;
        return images;
    }

    public Image[] getFreezeFruit() {
        Image[] images=new Image[2];
        images[0]=freezeFruit;
        images[1]=freezeFruitSliced;
        return images;
    }

    public Image[] getMultiplierFruit() {
        Image[] images=new Image[2];
        images[0]=multiplierFruit;
        images[1]=multiplierFruitSliced;
        return images;
    }

    public Image[] getFatalBomb() {
        Image[] images=new Image[2];
        images[0]=fatalBomb;
        return images;
    }

    public Image[] getDangerousBomb() {
        Image[] images=new Image[2];
        images[0]=dangerousBomb;
        return images;
    }
}
