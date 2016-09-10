package crawley.james.ZCWLivingRoom;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class Television {

    // This is the member field volume notice how its value is set to private
    private Integer volume;
    // This is the member field channel notice how its value is set to private
    private Integer channel;

    /**
     * This is the constructor, its job is to initialize any member variables
     * to non null values before they are called.
     */
    public Television(){
        volume = 0;
        channel = 0;
    }

    /**
     * Return the private field for the TV's volume.
     */
    public Integer getVolume(){

        return volume;
    }

    /**
     * Set the private field of volume to the value of the input paramater.
     */
    public void setVolume(Integer amount){
        volume = amount;
    }
}
