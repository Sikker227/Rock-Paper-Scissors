public class Main extends Player {
    public static void main(String[] args) {
        moveName();
        moveFigure();

        Player bot = new Player();
        Player alex = new Player(user_figur, user_nam);

        System.out.println(bot.whoWins(bot, alex));
    }
}
