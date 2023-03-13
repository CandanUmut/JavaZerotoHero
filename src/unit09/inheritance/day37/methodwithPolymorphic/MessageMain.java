package unit09.inheritance.day37.methodwithPolymorphic;

public class MessageMain {
    public static void main(String[] args) {
        Message message1= new Message();
        sendMessage(message1);
        Message message2= new TextMessage();
        VideoMessage videoMessage= new VideoMessage();
        sendMessage(videoMessage);
        sendMessage(new JSONMessage());
        sendMessage(message2);
    }

    public static void sendMessage(Message message){
        System.out.println("Sending a " + message.getClass().getSimpleName());
    }
}
