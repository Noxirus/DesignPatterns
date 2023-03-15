package Structural.Proxy;

public interface EBook {
    void show();

    String getFileName();
}
    //Storing large amounts of data can be heavy
    //Sometimes we can create a facade that appears to be the object we want but it is just a proxy
    //When we finally need the object the proxy will create the object and use it, but not until it is needed
    //Therefore we can load a large list of object to view but only load in the ones we use


        /*
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for(var file : fileNames){
            library.add(new LoggingEbookProxy(file));
        }

        library.openEBook("a");
        library.openEBook("b");

         */