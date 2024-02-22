import java.util.Scanner;
import java.util.stream.IntStream;

class ConsoleCommands {
    static Scanner scanner = new Scanner(System.in);

    public static void getCommand() {


        String justGotCommand = scanner.nextLine();


        if (justGotCommand.equals("start") | (justGotCommand.equals("!")) | (justGotCommand.equals("exit")) | (justGotCommand.equals("status"))) {
            switch (justGotCommand) {
                case "start" -> {
                    if (!Game.isInGame) {
                        Game.isInGame = Game.newGame();
                    } else {
                        System.out.println("Вы уже в игре");
                    }
                }
                case "exit" -> System.exit(0);

                case "status" -> {
                    if (!Game.isInGame) {
                        System.out.println("Вы не можете узнать статус игры, Вы не в игре!");
                        getCommand();
                    } else
                        System.out.println("Имя героя " + Player.getName());
getCommand();
                }
                case "!" ->
                        System.out.println("\tСПИСОК КОММАНД:\n1.'start' - начало игры.\n2.'exit' - выход из игры.\n3.'status' - узнать статус игры.\n4.'!' - выводит это сообщение.");
            }
        }

        if (justGotCommand.equals("1") | justGotCommand.equals("2") | justGotCommand.equals("3") | justGotCommand.equals("4")){
            System.out.println("вариант выбора");
        } else getCommand();


getCommand();



    }
}



/*
class ConsoleCommands {
    static Scanner command = new Scanner(System.in);

    public static String getCommand() {

        String com = command.nextLine();

        if (com.equals("start")) {
            if (!Game.isInGame) {
                Game.isInGame = Game.inGame();
            } else {
                System.out.println("Вы уже в игре");
            }
        } else if (command.nextLine().equals("exit")) {
            System.exit(0);
        } else if (command.nextLine().equals("status")) {
            if (!Game.isInGame) {
                System.out.println("Вы не в игре");
            } else {
                System.out.println("Имя: " + Player.getName());
            }
        } else if (command.nextLine().equals("!")) {
            System.out.println("инструкция");
        } else return command.nextLine();
        return command.nextLine();
    }
}

 */