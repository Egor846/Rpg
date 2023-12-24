import java.util.Scanner;

public class Main {

    public Main(String str) {

    }

    public static void main(String[] args) {



        System.out.println("Вас приветствует игра без названия!\nВведите '!' для просмотра списка комманд.");
        ConsoleCommands.getCommand();


        if (name.equals("exit")){
            System.out.println("Очень жаль.\nДо свидания");
            System.exit(0);
        }

        GameTime time = new GameTime();
        time.run();
        Player player = new Player(name, 100, 10, 5, 100, 0);
    }
}

class ConsoleCommands {
    public static void getCommand(){
    Scanner sc = new Scanner(System.in);
    switch ()

    }
}