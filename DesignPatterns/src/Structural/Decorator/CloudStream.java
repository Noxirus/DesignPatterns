package Structural.Decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String data){
        System.out.println("Writing: " + data);
    }


}
    // With this we can overload a function to pass in multiple "decorators" with various functionality on the object to be created
    // This was we can chain functionality onto an object

    /*
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }

     */