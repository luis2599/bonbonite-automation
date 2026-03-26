package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.registro;

public class pageProduct extends basicSteps {

    public pageProduct() {
        super(driver);
    }

    int timeout = config.getInt("timeout.explicit");

    By opcionZapatos = locators.product.opcionZapatos;
    By imagenProducto = locators.product.imagenProducto;
    By listaProductos = locators.product.listaProductos;
    By primerProducto = locators.product.primerProducto;
    By tituloProducto = locators.product.tituloProducto;

    public void seleccionarOpcion() {
        click(opcionZapatos);
    }

    public boolean validarListadoProductos() {
        esperarCargaCompletaPagina(timeout);
        try {
            esperar(timeout, imagenProducto);

            WebElement imagen = driver.findElement(imagenProducto);
            String src = imagen.getAttribute("src");

            if (src != null && !src.isEmpty()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error al validar producto: " + e.getMessage());
            return false;
        }
    }

    public boolean seleccionarPrimerProducto(){
        String urlAntes = driver.getCurrentUrl();
        click(primerProducto);
        esperarCargaCompletaPagina(timeout);
        try {
            esperar(timeout, tituloProducto);  

            String urlDespues = driver.getCurrentUrl();
            if (!urlDespues.equals(urlAntes)) {
                return true;
            }else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Error al seleccionar producto: " + e.getMessage());
            return false;
        }
    }
}
