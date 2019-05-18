import javafx.scene.image.Image;
import javafx.scene.shape.Path;

public class SpecialFruitTwo extends SpecialFruit {
    private final int sliceScore = 10;


    public SpecialFruitTwo(Image[] image, Path path){
        super(image,path);
    }
    
    public SpecialFruitTwo(Fruit fruit){
        super(fruit);
    }
    
    @Override
    public int getSliceScore() {
    	
        return sliceScore; 
    }
}
