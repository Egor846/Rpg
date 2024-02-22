import java.lang.System.*;

import static java.lang.System.out;

class Game {

    static public boolean isInGame = false;

    static boolean newGame() {



        out.println("Введите имя вашего персонажа: ");
        Player.setName();

        isInGame = true;
        out.println("Игра началась!");
//        GameTime gameTime = new GameTime();
//        gameTime.run();
        out.println("Вы просыпаетесь в своей избе, и слышите крики на улице.\nВзяв свой меч, вы покидаете свой дом.");
        out.println("Оглянувшись, вы видите горящую таверну, разруженые избы, а повсюду сражаются люди и монстры.");
        out.println("Вы прячетесь за куст возле своего дома. Вас вроде никто не видел.");
        out.println("\tВаш ход:\n1. Развернуться и уползти домой.\n2. Пользуясь ситуацией, осмотреться по-лучше.");
        ConsoleCommands.getCommand();


        return true;
    }



}


/*
import static java.lang.System.out;
public class Game {
    static boolean isInGame = false;
    boolean isInDialogue = false;

    public static boolean inGame() {


        Player.setName();
        Player player1 = new Player(Player.getName(), 100, 10, 7, 50, 0);

        out.println("Игра началась");
        GameTime time = new GameTime();
        time.run();

        return true;

    }
}
*/
