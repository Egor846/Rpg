public class GameTime implements Runnable {

    int millisForSleep = 900000;

    @Override
    public void run() {

        while (true) {
            System.out.println("Наступило утро");
            try {
                Thread.sleep(millisForSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Наступил день");
            try {
                Thread.sleep(millisForSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Наступил вечер");
            try {
                Thread.sleep(millisForSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Наступила ночь");
            try {
                Thread.sleep(millisForSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
