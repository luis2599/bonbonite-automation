package pages;

import org.openqa.selenium.By;

public class pageLogin extends basicSteps {

    public pageLogin() {
        super(driver);
    }

    // Variables de configuración
    String url = config.get("url.base");
    int timeout = config.getInt("timeout.explicit");
    int numDocumento = config.getInt("numero_documento_EP2");
    String nombre = config.get("nombre_EP2");
    String pass = config.get("pass_EP2");

    // Elementos locators
    By documento = locators.login.documento;
    By contrasena = locators.login.contrasena;
    By botonIniciSesion = locators.login.botonIniciSesion;
    By nombreRegistrado = locators.login.nombreRegistrado;
    By nombrePanelUsuario = locators.login.nombrePanelUsuario;
    By botonPanelUsuario = locators.login.botonPanelUsuario;

    public void loginUsuario() {
        loginUsuario(documento, contrasena, botonIniciSesion, numDocumento, pass);
    }

    public boolean validacionNombreUsuario() {
        click(botonPanelUsuario);
        esperar(timeout, nombrePanelUsuario);
        try {
            String texto = driver.findElement(nombrePanelUsuario).getText();
            if (texto == null || texto.isEmpty()) {
                return false;
            }else if (texto.contains(nombre)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }

}
