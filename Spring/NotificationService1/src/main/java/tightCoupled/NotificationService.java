package tightCoupled;

public class NotificationService {
    private String notification;
    private EmailSender es1 = new EmailSender();

    public void setNotification(String n){
        this.notification = n;
    }

    public void sendNotification(){
        es1.setMsg(this.notification);
        es1.sendMsg();
    }

}
