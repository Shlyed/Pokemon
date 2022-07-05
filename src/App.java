// import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        /* String nameBulbasaur = "Bulbasaur";
        int levelBulbasaur = 1;
        int hpBulbasaur = 50;
        int atkBulbasaur = 10;
        int defBulbasaur = 5;
        int spdBulbasaur = 6;

        String nameCharmander = "Charmander";
        int levelCharmander = 1;
        int hpCharmander = 50;
        int atkCharmander = 11;
        int defCharmander = 4;
        int spdCharmander = 8;

        boolean rnGesus = false;

        System.out.println("Name:" + nameBulbasaur + "\n Level: " + levelBulbasaur + "\n HP: " + hpBulbasaur + "\n ATK: " + atkBulbasaur +
        "\n DEF: " + defBulbasaur + "\n SPD: " + spdBulbasaur);

        System.out.println("\n Name:" + nameCharmander + "\n Level: " + levelCharmander + "\n HP: " + hpCharmander + "\n ATK: " + atkCharmander +
        "\n DEF: " + defCharmander + "\n SPD: " + spdCharmander);

        
        while (hpBulbasaur > 0 && hpCharmander > 0) {


            if (spdBulbasaur > spdCharmander) {

                hpCharmander = hpCharmander - atkBulbasaur;
            }
            else if (spdBulbasaur < spdCharmander) {

                hpBulbasaur = hpBulbasaur - atkCharmander;
            }
            else {
                Random rd = new Random();
                rnGesus = rd.nextBoolean();
                
                if (rnGesus) {

                    hpCharmander = hpCharmander - atkBulbasaur;
                }
                else {

                    hpBulbasaur = hpBulbasaur - atkCharmander;
                }

            }
            System.out.println("Name:" + nameBulbasaur + "\n Level: " + levelBulbasaur + "\n HP: " + hpBulbasaur + "\n ATK: " + atkBulbasaur +
            "\n DEF: " + defBulbasaur + "\n SPD: " + spdBulbasaur);

            System.out.println("\n Name:" + nameCharmander + "\n Level: " + levelCharmander + "\n HP: " + hpCharmander + "\n ATK: " + atkCharmander +
            "\n DEF: " + defCharmander + "\n SPD: " + spdCharmander);
        }

        if  (hpBulbasaur > hpCharmander) {
            System.out.println("Winner: " + nameBulbasaur + "!");
        }
        else {
            System.out.println("Winner :" + " " + nameCharmander + "!");
        } */

        Pokemon Charmander = new Pokemon();
        Charmander.Property("Charmander", 1, 8, 30, 6);

        Charmander.PropertyPrintout();


    }
}
