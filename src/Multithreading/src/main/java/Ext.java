public class Ext extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {


        Ext ext1 = new Ext();
        ext1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Ext ext2 = new Ext();
        ext2.start();
//        Синхронизация может быть достигнута тремя способами:
//        Синхронизируя метод
//        Синхронизируя определенный блок
//        Статической синхронизацией

    }
}
