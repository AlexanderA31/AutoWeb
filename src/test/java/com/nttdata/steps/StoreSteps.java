package com.nttdata.steps;

import com.nttdata.pages.StorePage;
import org.openqa.selenium.WebDriver;

public class StoreSteps {
    private WebDriver driver;
    private StorePage storePage;

    public StoreSteps(WebDriver driver) {
        this.driver = driver;
        storePage = new StorePage(driver);
    }

    public void navegarA(String url) {
        storePage.navigateTo(url);
    }

    public void loguearse(String usuario, String clave) {
        storePage.login(usuario, clave);
    }

    public void navegarACategoria(String categoria, String subcategoria) {
        storePage.navigateToCategory(categoria, subcategoria);
    }

    public void agregarProductoAlCarrito(int unidades) {
        storePage.addProductToCart(unidades);
    }

    public void validarConfirmacionProducto() {
        storePage.isConfirmationPopupDisplayed();
    }

    public void validarCalculoTotal(double precioUnitario, int unidades) {

    }

    public void finalizarCompra() {
        storePage.proceedToCheckout();
    }

    public void validarTituloCarrito() {
        storePage.getPageTitle();
    }

    public void validarCalculoPreciosCarrito(double precioEsperado) {
        // Lógica para validar el cálculo de precios en el carrito
        // Puedes implementar aquí la comparación del precioEsperado con el total mostrado en el carrito
    }
}