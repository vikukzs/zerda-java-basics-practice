/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public abstract class Watering extends Garden {
    public String needsWater;
    public String name;
    public int waterLevel;
    private int a;

    public Watering(String name, int waterLevel){
        this.name = name;
        this.waterLevel = waterLevel;
    }

    public Watering(){}

    public void giveWater(int a) {
        this.a = 0;

        System.out.println("Watering with " + a);

        while (waterLevel > 5){
            needsWater = "doesn't need";

            if (waterLevel < 5){
                waterLevel = waterLevel + a;
            }
        }

    }

    @Override
    public void water() {
        System.out.printf(formatForWater,
                color,
                name,
                needsWater
        );


    }
}
