package Structural.Proxy;

public class EBookProxy implements EBook{
    private String fileName;
    private RealEBook eBook;


    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(eBook == null){
            eBook = new RealEBook(fileName);
        }
        eBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
