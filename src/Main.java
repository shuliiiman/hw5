public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Задание номер 1");
        int clientOS = 1;
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
        int clientDeviceYear = 2015;
        int clientOS=0;
        if (clientOS==1 && clientDeviceYear<=2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(clientOS==1 && clientDeviceYear>2015)  {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if(clientOS!=1 && clientDeviceYear<=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if(clientOS!=1 && clientDeviceYear>2015) {

            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }
    }


    public static void task3(){
        System.out.println("Задание номер 3");
        int year = 2021;
        if (year%4 == 0){
            System.out.println(year+" год является високосным");
        }
        else{
            System.out.println(year+" год не является високосным");
        }
    }
    public static void task4(){
        System.out.println("Задание номер 4");
        int deliveryDistance = 95;
        if (deliveryDistance<20){
            System.out.println("Потребуется дней: 1");
        }
        else if(deliveryDistance >=20 && deliveryDistance<60){
            System.out.println("Потребуется дней: 2");
        }
        else if(deliveryDistance >=60 && deliveryDistance<100){
            System.out.println("Потребуется дней: 3");
        }
        else{
            System.out.println("Доставки нет");
        }

    }
    public static void task5(){
        System.out.println("Задание номер 5");
    }
}
