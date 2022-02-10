public class Main {

    public static void main(String[] args) {
        int balance = 300;
        int refill = 999;
        int bonus = refill / 100;


        if (refill >= 1000) {
            int balanceBonus = balance + refill + bonus;
            System.out.println("Баланс: " + balanceBonus);
        } else  {
            int balanceNoBonus = balance + refill;
            System.out.println("Баланс: " + balanceNoBonus);

        }
    }
}