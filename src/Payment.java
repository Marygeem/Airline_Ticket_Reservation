public class Payment {

    protected int paymentID;
    protected double amount;
    protected PaymentStatus status;

    public boolean makeTransaction() {
        return true;
    }

}