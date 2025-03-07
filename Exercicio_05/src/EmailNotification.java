public class EmailNotification implements Notification {
    public void send (String menssage){
        System.out.println(menssage + " Enviada por e-mail.");
    }
}