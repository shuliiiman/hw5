public class Main {
    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {
        System.out.println("Задание номер 1");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

        }
    }

    public static void task2() {
        System.out.println("Задание номер 2");
        int clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                if (clientOS < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientOS < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");

                }
                break;


        }
    }
}