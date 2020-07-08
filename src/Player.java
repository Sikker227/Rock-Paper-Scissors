import java.util.Scanner;

public class Player{
    enum VARIANTS {
    ROCK,
    PAPER,
    SCISSORS
}
    static String user_nam;
    static String bot_name;
    static VARIANTS user_figur;
    static VARIANTS bot_figure;

    public Player(VARIANTS user_figure, String user_name) {
        user_figure = user_figur;
        user_name = user_nam;
    }
    public Player() {
        // не знаю, как сделать так, чтобы бот рандомно брал значения из перечисления VARIANTS
        bot_figure = VARIANTS.SCISSORS;
        bot_name = "bot";
    }
    public String  whoWins(Player bot, Player alex) {
        String winner = "Выиграл игрок с именем: " + bot_name;
        String winner1 = "Выиграл игрок с именем: " + user_nam;
        String noWinner = "Ничья";

        if (alex.user_figur == VARIANTS.PAPER && bot.bot_figure == VARIANTS.PAPER)
            return noWinner;
        if (alex.user_figur == VARIANTS.SCISSORS && bot.bot_figure == VARIANTS.SCISSORS)
            return noWinner;
        if (alex.user_figur == VARIANTS.ROCK && bot.bot_figure == VARIANTS.ROCK)
            return noWinner;
        if (alex.user_figur == VARIANTS.SCISSORS && bot.bot_figure == VARIANTS.PAPER)
            return winner1;
        if (alex.user_figur == VARIANTS.PAPER && bot.bot_figure == VARIANTS.ROCK)
            return winner1;
        if (alex.user_figur == VARIANTS.ROCK && bot.bot_figure == VARIANTS.SCISSORS)
            return winner1;
        if (alex.user_figur == VARIANTS.ROCK && bot.bot_figure == VARIANTS.PAPER)
            return winner;
        if (alex.user_figur == VARIANTS.SCISSORS && bot.bot_figure == VARIANTS.ROCK)
            return winner;
        if (alex.user_figur == VARIANTS.PAPER && bot.bot_figure == VARIANTS.SCISSORS)
            return winner;
        return null;
    }
    public static void moveName() {
        System.out.print("Enter your name " + "\n" + ">> ");
        Scanner name = new Scanner(System.in);
        user_nam = name.nextLine();

    }
    public static void moveFigure() {
        System.out.print("Enter your figure: " + "\n" + "[1]" + VARIANTS.PAPER + "\n"
                + "[2]" + VARIANTS.ROCK + "\n"
                + "[3]" + VARIANTS.SCISSORS + "\n" + ">> " );
        Scanner fg = new Scanner(System.in);
        int us_f = fg.nextInt();
        if (us_f == 1) user_figur = VARIANTS.PAPER;
        if (us_f == 2) user_figur = VARIANTS.ROCK;
        if (us_f == 3) user_figur = VARIANTS.SCISSORS;
        System.out.println();

    }
}