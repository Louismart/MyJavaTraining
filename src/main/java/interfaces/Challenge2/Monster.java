package interfaces.Challenge2;

import java.util.ArrayList;
import java.util.List;

public class Monster implements Saveable {
    private String name;
    private int hitPoints;
    private int strenght;
    private String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }


    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Monster(String name, int hitPoints, int strenght, String weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
        this.weapon = weapon;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0,"Name: " + this.name);
        values.add(1, "Hitpoints: " + this.hitPoints);
        values.add(2, "Strenght: " + this.strenght);
        values.add(3,"Weapon: " + this.weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);

        }
    }
}
