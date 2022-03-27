import java.util.Scanner;

public class Library {
    private Game[][] game = new Game[20][8];
    private String aux;
    private int gameNumber = 0;
    Scanner sc = new Scanner(System.in);

    public void addGame(){
        gameNumber = gameNumber++;
        System.out.println("---New Game---");
        System.out.println("Game's name: ");
        game[gameNumber][0].setName(sc.nextLine());
        System.out.println("Game's genre: ");
        game[gameNumber][1].setGenre(sc.nextLine());
        System.out.println("This game is multiplayer [yes/no]: ");
        aux = sc.nextLine();
        if(aux == "yes"){
            game[gameNumber][2].setMultiplayer(true);
        }else if(aux == "no"){
            game[gameNumber][2].setMultiplayer(false);
        }else{
            System.out.println("There is a problem to set multiplayer");
        }
        System.out.println("Game's vision [1/3]: ");
        game[gameNumber][3].setVision(sc.nextInt());
        System.out.println("This game is +18 years old [yes/no]: ");
        if(aux == "yes"){
            game[gameNumber][4].setOverEighteen(true);
        }else if(aux == "no"){
            game[gameNumber][4].setOverEighteen(false);
        }else{
            System.out.println("There is a problem to set +18");
        }
        System.out.println("Game's release: ");
        game[gameNumber][5].setReleaseYear(sc.nextLine());
        System.out.println("Game's developer: ");
        game[gameNumber][6].setDeveloper(sc.nextLine());
        System.out.println("Game's price: ");
        game[gameNumber][7].setPrice(sc.nextFloat());
        sc.close();
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
