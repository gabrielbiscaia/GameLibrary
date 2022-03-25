import java.util.Scanner;

public class Menu {
    private int answer;

    public int callMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------MENU----------------");
        System.out.println("------------------------------------");
        System.out.println("1 - Add a new game in the library.");
        System.out.println("2 - Remove a game of the library.");
        System.out.println("3 - Consult a game for the key word.");
        System.out.println("4 - Listing of all games registered.");
        System.out.println("5 - Change a game's price");
        System.out.println("6 - Leave");
        System.out.println("------------------------------------");
        System.out.println("Type here: ");
        answer = sc.nextInt();
        sc.close();
        return answer;
    }

    public int getAnswer() {
        return answer;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }

}
