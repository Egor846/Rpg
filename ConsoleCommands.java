import java.util.Objects;
import java.util.Scanner;

class ConsoleCommands implements Runnable{


    public static String getCommand() {
        Scanner command = new Scanner(System.in);
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
                System.out.println("Вы ввели не коану.\nВвеите '!' ля росотре сиска коан");
            }


        } return getCommand();
    }

    @Override
    public void run() {

    }
}