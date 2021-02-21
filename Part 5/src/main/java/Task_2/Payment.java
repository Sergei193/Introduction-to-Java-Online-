package Task_2;

import java.util.ArrayList;

public class Payment {
    private long paymentId;
    private String buyerPayment;
    private boolean statePayment;

    protected Payment() {
    }

    protected Payment(long paymentId, String buyerPayment, boolean statePayment) {
        this.paymentId = paymentId;
        this.buyerPayment = buyerPayment;
        this.statePayment = statePayment;
    }

    public long getPaymentId() {
        return paymentId;
    }

    public String getBuyerPayment() {
        return buyerPayment;
    }

    public String isStatePayment() {
        String state;
        state = statePayment ? "goods ordered" : "goods did not order";
        return String.format(" %s ", state);
    }

    public void setStatePayment(boolean statePayment) {
        this.statePayment = statePayment;
    }

    protected void checkOut(int cashierCheckId, CashierCheck cashierCheck) {
        if (cashierCheckId == cashierCheck.getCashierCheckId()) {
            setStatePayment(true);
            System.out.println("Payment № " + getPaymentId() + " checkout");
        }
    }

    @Override
    public String toString() {
        return String.format("%s, Buyer : %s, state of pay %b ", paymentId, buyerPayment, statePayment);
    }

    protected class CashierCheck {
        private int cashierCheckId;
        private double totalPrice;
        protected ArrayList<Product> listProductsCheck = new ArrayList<>();

        public CashierCheck(int cashierCheckId, double totalPrice) {
            this.cashierCheckId = cashierCheckId;
            this.totalPrice = totalPrice;
        }

        protected void addProduct(Product product) {
            listProductsCheck.add(product);
            System.out.println(product.toString() + " added in shopping basket!!!");
        }

        protected void removeProduct(int productId) {
            if (!listProductsCheck.isEmpty()) {
                for (Product product : listProductsCheck) {
                    if (product.getProductId() == productId) {
                        listProductsCheck.remove(product);
                        System.out.println("Product " + product.toString() + " removed from shopping basket!!!");
                    }
                }

            }
        }

        protected void printProductCheck() {
            for (Product product : listProductsCheck) {
                System.out.println(product.toString());
            }
        }

        public int getCashierCheckId() {
            return cashierCheckId;
        }

        protected double getTotalPrice() {
            double totalPrice = 0;
            for (Product product : listProductsCheck) {
                totalPrice += product.getProductPrice();
            }
            return totalPrice;
        }

        public String toString() {
            return String.format("Check number : %s , Amount : %.2f ", getCashierCheckId(), getTotalPrice());
        }
    }


}
