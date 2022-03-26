import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Game> game = new ArrayList<Game>();
    private String aux;
    Scanner sc = new Scanner(System.in);

    public void addGame(){
        System.out.println("---New Game---");
        System.out.println("Game's name: ");
        game.setName(sc.nextLine());
        System.out.println("Game's genre: ");
        game.setGenre(sc.nextLine());
        System.out.println("This game is multiplayer [yes/no]: ");
        aux = sc.nextLine();
        if(aux == "yes"){
            game.setMultiplayer(true);
        }else if(aux == "no"){
            game.setMultiplayer(false);
        }else{
            System.out.println("There is a problem to set multiplayer");
        }
        System.out.println("Game's vision [1/3]: ");
        game.setVision(sc.nextInt());
        System.out.println("This game is +18 years old [yes/no]: ");
        if(aux == "yes"){
            game.setOverEighteen(true);
        }else if(aux == "no"){
            game.setOverEighteen(false);
        }else{
            System.out.println("There is a problem to set +18");
        }
        System.out.println("Game's release: ");
        game.setReleaseYear(sc.nextInt());
        System.out.println("Game's developer: ");
        game.setDeveloper(sc.nextLine());
        System.out.println("Game's price: ");
        game.setPrice(sc.nextFloat());
    }
    public void removeGame(){

    }
    public void consultGames(){

    }
    public void listingGames(){

    }
    public void changePrice(){
        
    }
}
