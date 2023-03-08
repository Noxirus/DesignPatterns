package Creational.Factory.Sharp;

import Creational.Factory.Matcha.Controller;
import Creational.Factory.Matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
