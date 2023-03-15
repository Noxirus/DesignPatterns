package Structural.Facade;

//This is used to mask a complex amount of logic
//This decouples the main from having to track the changes of multiple objects
// We just need to call send and the logic will run here
public class NotificationService {
    public void send(String message, String target){
        var server = new NotificationServer();
        var connection = server.connect("ip");
        var authToken = server.authenticate("AppID", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
