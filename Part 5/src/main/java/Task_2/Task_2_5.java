package Task_2;

public class Task_2_5 {
    //    Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
//  покупку из нескольких товаров.
    public static void main(String[] args) {

        Product product_1 = new Product(1, "Bread", 1.3);
        Product product_2 = new Product(2, "Milk", 1.8);
        Payment payment_1 = new Payment(1, "Ivanov", false);
        Payment.CashierCheck cashierCheck_1 = payment_1.new CashierCheck(1, 0);
        cashierCheck_1.addProduct(product_1);
        cashierCheck_1.addProduct(product_2);
        cashierCheck_1.addProduct(new Product(3, "Butter", 2.1));
        System.out.println("Buyer\n" + payment_1.toString());
        System.out.println("Payment of " + payment_1.getBuyerPayment());
        cashierCheck_1.printProductCheck();
        System.out.println("Payment in basket for the amount  " + cashierCheck_1.getTotalPrice());
        cashierCheck_1.removeProduct(2);
        System.out.println("Buyer\n" + payment_1.toString());
        cashierCheck_1.printProductCheck();
        payment_1.checkOut(1, cashierCheck_1);
        System.out.println(String.format(" State of order \n %b, \nfor the amount %.2f", payment_1.isStatePayment(),cashierCheck_1.getTotalPrice()));

    }
}
