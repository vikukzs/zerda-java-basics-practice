/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class Flower extends Watering {

    public Flower() {
        super("Flower", 0);
    }


    public Flower(String color) {
        this.waterLevel = 0;
        this.color = color;
        this.name = "Flower";
        this.needsWater = "needs";
    }

}
