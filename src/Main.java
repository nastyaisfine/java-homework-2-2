public class Main {
    public static void main(String[] args) {
        int base = 100; // начальная сумма на счету
        int refill = 1430; // сумма пополнения счёта
        int bonus = refill / 100; // начисленный бонус

        if (refill < 1000) {
            System.out.println("Ваш баланс: " + (base + refill) + " рублей (рубль)");
        } else {
            System.out.println("Ваш баланс: " + (base + refill + (refill / 100)) + " рублей (рубль)");
            System.out.println("Начисленные бонусы: " + bonus + " рублей");


        }
    }

}
