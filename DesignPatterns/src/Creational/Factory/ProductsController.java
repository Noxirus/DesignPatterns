package Creational.Factory;

import Creational.Factory.Sharp.SharpController;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends SharpController { //You can change this extends to Controller as well to have it work with Matcha
    public void listProducts(){
        //Get products from a DB
        Map<String, Object> context = new HashMap<>();
        //context.put(products)
        render("products.html", context);
    }
}
