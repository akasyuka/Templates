public class Impl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.run();
    }
}
