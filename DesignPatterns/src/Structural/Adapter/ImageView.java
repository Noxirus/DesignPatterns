package Structural.Adapter;

public class ImageView {
    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply(image);
    }
}
    //There are times where incoming information from a third party plugin needs to be handled differently
    // We can add an adapter that will handle the incoming logic and convert it to our implementation

        /*
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

         */