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

        /*
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));

         */