import java.util.Scanner;

public class KeyWordMenu {
    private int keyWordAnswer;

    public int callKeyWordMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------KeyWordMenu---------");
        System.out.println("Consult for: ");
        System.out.println("1 - Genre;");
        System.out.println("2 - Multiplayer;");
        System.out.println("3 - Player's vision;");
        System.out.println("4 - Games +18");
        System.out.println("5 - Release year;");
        System.out.println("6 - Developer;");
        System.out.println("7 - Price;");
        System.out.println("8 - Back.");
        System.out.println("Type here: ");
        keyWordAnswer = sc.nextInt();
        sc.close();
        return keyWordAnswer;
    }

    public int getkeyWordAnswer() {
        return keyWordAnswer;
    }

    public void setkeyWordAnswer(int keyWordAnswer) {
        this.keyWordAnswer = keyWordAnswer;
    }
}
