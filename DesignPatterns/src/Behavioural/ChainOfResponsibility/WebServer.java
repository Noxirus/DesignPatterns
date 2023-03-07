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

        /*
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admim", "1234"));

         */