package Structural.Proxy;

public interface EBook {
    void show();

    String getFileName();
}

        /*
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for(var file : fileNames){
            library.add(new LoggingEbookProxy(file));
        }

        library.openEBook("a");
        library.openEBook("b");

         */