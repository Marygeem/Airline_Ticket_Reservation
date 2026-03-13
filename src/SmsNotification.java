public class SmsNotification extends Notification {

    private String phone;

    @Override
    public boolean send() {
        System.out.println("Sending SMS notification...");
        return true;
    }

}