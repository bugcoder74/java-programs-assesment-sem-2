package tightCoupled;

public class Main {
    public static void main(String[] args) {
        NotificationService N = new NotificationService();
        N.setNotification("Please Recharge your Phone with Rs.349 plan !");
        N.sendNotification();
    }
}
