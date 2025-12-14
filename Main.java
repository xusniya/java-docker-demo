public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java Docker App 🚀");
        while (true) {
            try {
                Thread.sleep(5000);
                System.out.println("App is running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
