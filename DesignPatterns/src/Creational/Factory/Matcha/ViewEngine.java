package Creational.Factory.Matcha;

import java.util.Map;

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}

// There are times when we want to create certain objects that will have the same implementaiton (function calls) but different definitions
// In this case we have a Controller and View Engine that we can create new versions of and then pass them into the builder
// The logic fires off the same, just the objects created are different and handle things differently