public class EmailNotification extends Notification {

    private String email;

    @Override
    public boolean send() {
        System.out.println("Sending email notification...");
        return true;
    }

}