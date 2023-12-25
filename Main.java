import java.util.Scanner;
import static java.lang.System.out;


public class Main {

   static String str = null;
   boolean isInGame = false;

    public static void main(String[] args) {
        out.println("Вас приветствует игра без названия!\nВведите '!' для просмотра списка комманд.\nВведите 'start' для начала игры.");
        ConsoleCommands.getCommand(str);

    }

    public static String newGame() {
        out.println("Введите имя вашего персонажа: ");
        String name = ConsoleCommands.getCommand(str);
        GameTime time = new GameTime();
        time.run();
        Player player = new Player(name, 100, 10, 5, 100, 0);
        ConsoleCommands.getCommand(str);
        return null;
    }
}

class ConsoleCommands {
    public static String getCommand(String str) {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        if (str.equals("exit")) {
            out.println("Очень жаль.\nДо свидания.");
            System.exit(0);
            return str;
        } else if (str.equals("!")) {
            out.println("СПИСОК КОМАНД\n'!' - выводит это сообщение.\n'start' - начать игру.\n'exit' - выйти из игры\n'status' - выводит статистику персонажа.");
            return getCommand(str);
        } else if (str.equals("start")) {
            return Main.newGame();
        }

        return null;
    }

}