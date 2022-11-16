public class main {
    public static void main(String[] args) {
        System.out.println("Мобильный оператор");

        int pArea = 115;
        int amount = 1500;
        int bonus;

        if (amount > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }
        int mane = amount / 100;
        int cash = mane * bonus;

        System.out.println("Бонус:" + cash + "руб.");
        System.out.println("Баланс:" + (pArea + amount + cash) + "руб.");
    }
}
