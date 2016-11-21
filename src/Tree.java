/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class Tree extends Watering {
    public Tree(){
        super("Tree", 0);
    }

    public Tree(String color) {
        this.color = color;
        this.name = "Tree";
        this.needsWater = "needs";
    }

}
