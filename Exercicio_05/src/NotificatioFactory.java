public class NotificatioFactory {
    public static Notification createNotification(String type){
        if(type == "email"){
            return new EmailNotification();

        }else if(type == "SMS"){
            return new SMSNotification();

        }else if(type == "Push"){
            return new PushNotification();
        }
        return null;
    }
}