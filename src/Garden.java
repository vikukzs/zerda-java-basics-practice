/**
 * Created by Zsuzska on 2016. 11. 21..
 */
public abstract class Garden {
    protected String name;
    protected String color;

    final String formatForWater = "The %s %s %s water.\n";

    public Garden(String color){
        this.color = color;
    }
    public Garden(){}

    public abstract void water();

}
