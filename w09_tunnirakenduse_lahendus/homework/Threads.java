public class Threads {

    // numbrid
    public static int[] nr = { 1, 2, 3, 4, 5 };

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            try {
                new Thread(getRunnable()).start();
                //panen threadi ootele
                Thread.sleep(500);
            } catch (Exception evt){
                System.out.println(evt.getMessage());
            }
        }
    }

    public static Runnable getRunnable() {
        return () -> {
            for (int i = 3; i > 0; i--){
                try {
                    //
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.sleep(1000);
                } catch (Exception evt){
                    System.out.println(evt.getMessage());
                }
            }
        };
    }
}
