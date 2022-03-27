import java.util.Scanner;

public class Library {
    private Game[][] game = new Game[20][8];
    private String aux;
    private int i;
    private int numberOfGames = 0, gameDeleted, gameNumber;
    Scanner sc = new Scanner(System.in);

    public void addGame(){
        numberOfGames += 1;
        gameNumber = numberOfGames;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("---Delete Game---");
        System.out.println("Which game do you want to delete?");
        for(i=0;i<numberOfGames;i++){
            System.out.println("["+i+"]"+" "+game[i][1]);
        }
        System.out.println("Type here: ");
        gameDeleted = sc.nextInt();
        sc.close();
        if(gameDeleted > numberOfGames){//if you type a number bigger than the quantity of games
            System.out.println("You cannot delete this game.");
            removeGame();
        }else{
            for(i = gameDeleted; i<numberOfGames; i++){
                game[i][0] = game[(i+1)][0];
                game[i][1] = game[(i+1)][1];
                game[i][2] = game[(i+1)][2];
                game[i][3] = game[(i+1)][3];
                game[i][4] = game[(i+1)][4];
                game[i][5] = game[(i+1)][5];
                game[i][6] = game[(i+1)][6];
            }
            numberOfGames -= 1;
        }
    }
    public void consultGames(){

    }
    public void listingGames(){

    }
    public void changePrice(){
        
    }
}
