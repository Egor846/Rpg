import java.util.Objects;
import java.util.Scanner;

class ConsoleCommands {
    static Scanner command = new Scanner(System.in);

    public static String getCommand() {


        switch (command.nextLine()) {
            case ("start") -> {
                if (!Game.isInGame) {

                    Game.isInGame = Game.InGame();

                } else {
                    System.out.println("Вы уже в игре");

                }
            }

            case ("exit") -> {
                System.exit(0);
            }

            case ("status") -> {
                if (!Game.isInGame) {
                    System.out.println("Вы не в игре");

                } else {
                    System.out.println("Статус героя");

                }
            }

            case ("!") -> {
                System.out.println("инструкция");
            }

            default -> {
                if (command.hasNextInt()){
                System.out.println("Вы ввели не команду");
            }
        }


        return getCommand();
    }
}
