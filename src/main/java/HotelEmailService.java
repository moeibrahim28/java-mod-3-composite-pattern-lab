class HotelEmailService implements RoomCheckinObserver {
    public void update(Object guestName) {
        Logger.getInstance().log("Sent email update to " + guestName);
    }
}

class HotelPushNotificationService implements RoomCheckinObserver {
    public void update(Object guestName) {
        Logger.getInstance().log("Registered " + guestName + " for push notification updates");
    }
}