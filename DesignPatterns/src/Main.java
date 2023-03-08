import Creational.Builder.MovieBuilder;
import Creational.Builder.PdfDocumentBuilder;
import Creational.Builder.Presentation;
import Creational.Builder.Slide;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));
        presentation.addSlide(new Slide("Slide 3"));
        presentation.addSlide(new Slide("Slide 4"));

        var builder = new MovieBuilder();
        presentation.export(builder);
        var pdf = builder.getMovie();
    }
}