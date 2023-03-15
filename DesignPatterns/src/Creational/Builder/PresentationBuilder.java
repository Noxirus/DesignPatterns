package Creational.Builder;

public interface PresentationBuilder {
    void addSlide(Slide slide);
}

// With this we want to have logic in place for adding a slide via this interface
// We want to be handling the creation/addition of slides but want this to be extensible
// Movie builder and PDF builder are the ones that inherit this interface and handle the add slide functionality when creating a presentation
// But with this implementation we could add any number of builders to handle different creations of presentation objects