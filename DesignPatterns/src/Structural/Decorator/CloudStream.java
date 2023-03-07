package Structural.Decorator;

public class CloudStream implements Stream{
    @Override
    public void write(String data){
        System.out.println("Writing: " + data);
    }


}

    /*
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("1234-1234-1234-1234");
    }

     */