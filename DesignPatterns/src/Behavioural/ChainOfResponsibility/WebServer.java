package Behavioural.ChainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}

//Essentially a linked list of tasks, tasks inherit from the same abstract functionality of handler to check and call the next task
//This allows us to link and change the order of tasks without needing to change anything about their functionality

        /*
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admim", "1234"));

         */