package pages;

import org.openqa.selenium.By;

public class pageCreateAccount extends basicSteps {

    // Variables de configuración
    String url = config.get("url.base");
    int timeout = config.getInt("timeout.explicit");
    int numDocumento = config.getInt("numero_documento_EP1");
    String nombre = config.get("nombre_EP1");
    String apellido = config.get("apellido_EP1");
    String correo = config.get("correo_EP1");
    String pass = config.get("pass_EP1");

    // Elementos locators
    By userButton = locators.registro.userButton;
    By opcionRegistro = locators.registro.opcionRegistro;
    By registroDocumento = locators.registro.registroDocumento;
    By registroNombre = locators.registro.registroNombre;
    By registroApellido = locators.registro.registroApellido;
    By registroCorreo = locators.registro.registroCorreo;
    By registroContrasena = locators.registro.registroContrasena;
    By confrimacionContrasena = locators.registro.confrimacionContrasena;
    By tratamientoDatos = locators.registro.tratamientoDatos;
    By botonRegistro = locators.registro.botonRegistro;
    By documento = locators.login.nombreRegistrado;
    By contrasena = locators.login.nombreRegistrado;
    By botonIniciSesion = locators.login.nombreRegistrado;
    By nombreRegistrado = locators.login.nombreRegistrado;

    public pageCreateAccount() {
        super(driver);
    }

    public void startSession() {
        navigateTo(url);
        limpiarCache();
    }

    public void startUser() {
        esperarCargaCompletaPagina(timeout);
        click(userButton);
    }

    public void RegistUser() {
        scrollHaciaElemento(opcionRegistro);
        click(opcionRegistro);
        esperarCargaCompletaPagina(timeout);
    }

    public void ingresoDatos() {
        escribirNumero(registroDocumento, numDocumento);
        escribirTexto(registroNombre, nombre);
        escribirTexto(registroApellido, apellido);
    }

    public void ingresoDatosLogin() {
        escribirTexto(registroCorreo, correo);
        escribirTexto(registroContrasena, pass);
        escribirTexto(confrimacionContrasena, pass);
    }

    public void aceptaTratamientoDatos() {
        click(tratamientoDatos);
    }

    public void finalizacionRegistroUser() {
        click(botonRegistro);
    }

    public void login() {
        escribirNumero(documento, numDocumento);
        escribirTexto(contrasena, pass);
        click(botonIniciSesion);
    }

    public boolean validacionRegistroUser() {
        //login();
        esperar(timeout, nombreRegistrado);
        try {
            String texto = driver.findElement(nombreRegistrado).getText();
            if (texto.equals(nombre)) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
