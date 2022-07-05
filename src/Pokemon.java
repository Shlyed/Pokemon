import java.util.Random;

public class Pokemon {
    public String name;
    public int level;
    public int atk;
    public int hp;
    public int spd;

    boolean rnGesus = false;

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

    public void Fight(Pokemon firstPokemon, Pokemon secondPokemon) {
        firstPokemon.PropertyPrintout();
        secondPokemon.PropertyPrintout();
        
        while (firstPokemon.hp > 0 && secondPokemon.hp > 0) {

            if (firstPokemon.spd > secondPokemon.spd) {

                secondPokemon.hp = secondPokemon.hp - firstPokemon.atk;

            }
            else if (firstPokemon.spd < secondPokemon.spd) {

                firstPokemon.hp = firstPokemon.hp - secondPokemon.atk;
            }
            else {
                Random rd = new Random();
                rnGesus = rd.nextBoolean();

                if (rnGesus) {

                    firstPokemon.hp = firstPokemon.hp - secondPokemon.atk;
                }
                else {

                    secondPokemon.hp = secondPokemon.hp - firstPokemon.atk;
                }
            }
            firstPokemon.PropertyPrintout();
            secondPokemon.PropertyPrintout();
        }
        if (firstPokemon.hp > secondPokemon.hp) {
            System.out.println("Winner: " + firstPokemon.name + "!");
        }
        else {
            System.out.println("Winner: " + secondPokemon.name + "!");
        }
    }

}

