package ru.x5.Lesson3.task1;

class Main {

    public static class Phone {

        int number, weight;
        String model;
        String name = "Boris"; // Имя звонящего

        public void receiveCall() {     //Метод receiveCall с именем звонящего.

            System.out.println("Звонит " + name);
        }

        public void receiveCall(String name, int number) {      //Перегруженный метод receiveCall с именей звонящего и номером звонящего.

            System.out.println("\n" + "Звонит " + name + " номер: " + number);
        }

        public void getNumber() {       //Метод getNumber - возвращает номер телефона.

            System.out.println("Номер: " + number);
        }

        public void sendMessage(int number1, int number2) {   //Метод sendMessage - вывод номеров телефонов, которым будет отправленно сообщение.

            System.out.println("\n" + number1 + "  " + number2);
        }

        public Phone(int a, String b, int c) {      //Конструктор Phone. Принимает три параметра.

            number = a;
            model = b;
            weight = c;

            Phone ph = new Phone(1, "model");   //Вызов конструктора с двумя параметрами.
        }

        public Phone(int a, String b) {     //Конструктор Phone. Принимает два параметра.

            number = a;
            model = b;
        }

        public Phone() {    //Конструктор Phone без параметров.
        }
    }

    public static void main(String [ ] args) {

        Phone ph1 = new Phone();
        Phone ph2 = new Phone();
        Phone ph3 = new Phone();
        Phone ph = new Phone();

        ph1.number = 7999111;
        ph1.model = "iPhone";
        ph1.weight = 10;

        ph2.number = 7999222;
        ph2.model = "Nokia";
        ph2.weight = 11;

        ph3.number = 7999333;
        ph3.model = "Samsung";
        ph3.weight = 12;

        System.out.println("Number: " + ph1.number + ";" + " Model: " + ph1.model + ";" + " Weight: " + ph1.weight + ";");
        System.out.println("Number: " + ph2.number + ";" + " Model: " + ph2.model + ";" + " Weight: " + ph2.weight + ";");
        System.out.println("Number: " + ph3.number + ";" + " Model: " + ph3.model + ";" + " Weight: " + ph3.weight + ";");

        System.out.println();
        ph1.receiveCall();
        ph1.getNumber();

        System.out.println();
        ph2.receiveCall();
        ph2.getNumber();

        System.out.println();
        ph3.receiveCall();
        ph3.getNumber();

        ph.receiveCall(ph1.name, ph2.number);
        ph.sendMessage(ph1.number, ph2.number);
    }
}