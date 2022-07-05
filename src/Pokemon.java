
public class Pokemon {
    public String name;
    public int level;
    public int atk;
    public int hp;
    public int spd;

    public void Property(String name, int level, int atk, int hp, int spd) {

        this.name = name;
        this.level = level;
        this.atk = atk;
        this.hp = hp;
        this.spd = spd;
    }

    public void PropertyPrintout() {
    System.out.println("Name: " + this.name + "\nLevel: " + this.level + "\nAttack: " + this.atk + "\nHealth: " + this.hp + "\nSpeed: " + this.spd);

    }
}

