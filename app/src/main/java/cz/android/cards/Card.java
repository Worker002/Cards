package cz.android.cards;

/**
 * Created by dominikmach on 21/12/2017.
 */

public class Card {

    String name;
    float power;
    String packageName;

    public Card(String name, float power, String packageName) {
        this.name = name;
        this.power = power;
        this.packageName = packageName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return packageName + " - " + name + " - " + power;
    }
}
