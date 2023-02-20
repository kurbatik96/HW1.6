public class Main {
    public static void main(String[] args) {
        tusk1();
        tusk2();
        tusk3();
        tusk4();
        tusk5();
        tusk6();
        tusk7();
        tusk8();
        tusk9();
        tusk10();
    }
    public static void tusk1() {
        System.out.println("Задача # 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число равно " + i);
        }
    }
    public static void tusk2() {
        System.out.println("Задача # 2");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("Число равно " + i);
        }
    }
    public static void tusk3( ){
        System.out.println("Задача # 3");
        for(int i = 0;i<=17;i=i+2){
            System.out.println("Число равно "+i);
        }
    }
    public static void tusk4() {
        System.out.println("Задача # 4");
        for(int i = 10;i>=(-10);i = i-1){
        System.out.println("Число равно " + i);
    }
    }
    public static void tusk5() {
    System.out.println("Задача # 5");
    for(int i = 1904; i<=2096;i=i+4){
        System.out.println("Високосный год: "+i);
    }
    }
    public static void tusk6() {
        System.out.println("Задача # 6");
        for(int i = 7;i<=100;i = i+7){
            System.out.println("Число равно "+i);
        }
    }
    public static void tusk7() {
        System.out.println("Задача # 7");
        for(int i = 1;i<=512;i=i*2){
            System.out.println("Число равно "+i);
            }
        }
        public static void tusk8() {
        System.out.println("Задача #8");
        int money = 29000;
        int sum = 0;
        for (int i =1;i<=12;i++){
           sum+=money;
            System.out.println("Месяц "+i+" сумма накоплений равна "+sum+" рублей.");
        }
    }
    public static void tusk9() {
        System.out.println("Задача # 9");
        int money = 29000;
        int sum = 0;
        for (int i =1;i<=12;i++){
            sum=sum+sum/100;
            sum=sum+money;
            System.out.println("Месяц "+i+" сумма накоплений равна "+sum+" рублей.");
        }
    }
    public static void tusk10() {
        System.out.println("Задача # 10");
        int numberOne=2;
        for (int i = 1;i<=10;i++){
            System.out.println(numberOne + " * " + i + " = "
                        + numberOne * i);{
        }
    }
}}

