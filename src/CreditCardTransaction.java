public class CreditCardTransaction extends Payment {

    private String nameOnCard;

    @Override
    public boolean makeTransaction() {
        System.out.println("Processing credit card payment...");
        return true;
    }

}