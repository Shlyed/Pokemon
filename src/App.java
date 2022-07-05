// import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        

        Pokemon Charmander = new Pokemon();
        Charmander.Property("Charmander", 1, 8, 30, 6);

        Charmander.PropertyPrintout();

        Pokemon Bulbasaur = new Pokemon();
        Bulbasaur.Property("Bulbasaur", 1, 7, 30, 6);

        Bulbasaur.PropertyPrintout();

        Charmander.Fight(Charmander, Bulbasaur);


    }
}
