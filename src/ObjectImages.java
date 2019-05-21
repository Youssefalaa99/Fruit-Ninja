import javafx.scene.image.Image;

import java.io.FileInputStream;

public class ObjectImages {
    private Image banana;
    private Image bananaSliced;
    private Image peach;
    private Image peachSliced;
    private Image watermelon;
    private Image watermelonSliced;
    private Image raspberry;
    private Image raspberrySliced;
    private Image specialFruit1;
    private Image specialFruit1Sliced;
    private Image specialFruit2;
    private Image specialFruit2Sliced;
    private Image fatalBomb;
    private Image dangerousBomb;

    public ObjectImages() {
        try {
            banana = new Image(new FileInputStream("banana.png"));
            bananaSliced = new Image(new FileInputStream("bananaS.png"));
            peach = new Image(new FileInputStream("peach.png"));
            peachSliced = new Image(new FileInputStream("peachS.png"));
            watermelon = new Image(new FileInputStream("watermelon.png"));
            watermelonSliced = new Image(new FileInputStream("watermelonS.png"));
            raspberry = new Image(new FileInputStream("raspberry.png"));
            raspberrySliced = new Image(new FileInputStream("raspberryS.png"));
            specialFruit1 = new Image(new FileInputStream("special5.png"));
            specialFruit1Sliced = new Image(new FileInputStream("special5S.png"));
            specialFruit2 = new Image(new FileInputStream("special10.png"));
            specialFruit2Sliced = new Image(new FileInputStream("special10S.png"));
            fatalBomb = new Image(new FileInputStream("fatalBomb.png"));
            dangerousBomb = new Image(new FileInputStream("bomb.png"));
        } catch (Exception e) {
            System.out.println("Error in ObjectImages " + e);
        }
    }

    public Image[] getBananaImages() {
        Image[] images = new Image[2];
        images[0] = banana;
        images[1] = bananaSliced;
        return images;
    }

    public Image[] getPeachImages() {
        Image[] images = new Image[2];
        images[0] = peach;
        images[1] = peachSliced;
        return images;
    }

    public Image[] getWatermelonImages() {
        Image[] images = new Image[2];
        images[0] = watermelon;
        images[1] = watermelonSliced;
        return images;
    }

    public Image[] getRaspberryImages() {
        Image[] images = new Image[2];
        images[0] = raspberry;
        images[1] = raspberrySliced;
        return images;
    }

    public Image[] getSpecialFruit1Images() {
        Image[] images = new Image[2];
        images[0] = specialFruit1;
        images[1] = specialFruit1Sliced;
        return images;
    }

    public Image[] getSpecialFruit2Images() {
        Image[] images = new Image[2];
        images[0] = specialFruit2;
        images[1] = specialFruit2Sliced;
        return images;
    }

    public Image[] getFatalBombImages() {
        Image[] images = new Image[1];
        images[0] = fatalBomb;
        return images;
    }

    public Image[] getDangerousBombImages() {
        Image[] images = new Image[2];
        images[0] = dangerousBomb;
        return images;
    }
}
