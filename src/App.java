/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public class App {
    public static void main(String[] args) {
        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpTree = new Tree("purple");
        Tree orTree = new Tree("purple");

        yellowFlower.water();
        blueFlower.water();
        purpTree.water();
        orTree.water();

        yellowFlower.giveWater(10);
        blueFlower.giveWater(10);
        purpTree.giveWater(10);
        orTree.giveWater(10);
    }
}
