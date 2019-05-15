import javafx.scene.image.Image;

public interface GameObject {
    /**
     *@return velocity of game object
     */
    public int getVelocity();
    /**
     *@return whether the object is sliced or not
     */
    public boolean isSliced();
    /**
     *it is used to slice the object
     */
    public void slice();

    /**
    *@return at least two images of the object, one when it is
    sliced and one when it is not.
    */
    public Image getImages();


}
