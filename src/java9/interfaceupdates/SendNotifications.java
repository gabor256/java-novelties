package java9.interfaceupdates;

public interface SendNotifications {
    // Java 9 feature: lehet static is
    static void sendNotifications() {
        establishConnection();
        System.out.println("Sending Multiple Notifications");
    }

    default void sendNotification() {
        establishConnection();
        System.out.println("Sending Notifications");
    }

    // Java 9 feature: private method az interface-ben ami meghívható az interface-en belül
    // Java 9 feature: lehet static is a private method
    private static void establishConnection() {
        System.out.println("Establishing a connection");
    }
}
