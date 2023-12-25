import java.util.Scanner;

import static java.lang.System.out;


public class Main {

   static String str = null;

    public static void main(String[] args) {



        out.println("Вас приветствует игра без названия!\nВведите '!' для просмотра списка комманд.\nВведите 'start' для начала игры.");
        ConsoleCommands.getCommand(str);
        out.println("Введите имя вашего персонажа: ");
        String name = ConsoleCommands.getCommand(str);
        newGame();

    }
}

class ConsoleCommands {
    public static String getCommand(String str){
    Scanner sc = new Scanner(System.in);
    str = sc.nextLine();
        if (str.equals("exit")){
            out.println("Очень жаль.\nДо свидания");
            System.exit(0);
            return str;
        } else if ( str.equals("!")) {
            out.println("СПИСО ОМАНД\n'!' - выводит то сооение.\n'start' - начат игр.\n'exit' - выти и игры\n'status' - выводит статисти персонажа.");
            return getCommand(str);
        } else if (str.equals("start")){
            return
        }

    }

    class Game{
        GameTime time = new GameTime();
        time.run();
        Player player = new Player(name, 100, 10, 5, 100, 0);
        out.println(player.toString());
    }
}