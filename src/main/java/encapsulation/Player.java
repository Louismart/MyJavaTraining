package encapsulation;

public class Player {

    private String name;
    public int health;
    public String weapon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player(String name) {
        this.name = name;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remainig for the player
        }
    }
    public int healthRemaning() {
        return this.health;
    }
}
