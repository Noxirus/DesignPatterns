package Behavioural.Strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter){
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}

// We may have a series of features added to a primary object, compressor or filter in this example
// We may have a variety of filters or compressors, we dont know how they are going to work
// This way we can attach any customized compressor or filter and they will be able to handle their own logic
// We can extend on this as much as we like without having to change the primary object