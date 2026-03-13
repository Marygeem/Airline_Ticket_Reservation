public class CheckTransaction extends Payment {

    private String bankName;
    private String checkNumber;

    @Override
    public boolean makeTransaction() {
        System.out.println("Processing check payment...");
        return true;
    }

}