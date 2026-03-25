package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class pageCreateAccount extends basicSteps {

    // Variables de configuración
    String url = config.get("url.base");
    int timeout = config.getInt("timeout.explicit");
    int numDocumento = config.getInt("numero_documento");
    String nombre = config.get("nombre");
    String apellido = config.get("apellido");
    String correo = config.get("correo");
    String pass = config.get("pass");

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
        esperarCargaCompletaPagina(timeout);
        limpiarCache();
    }

    public void startUser() {
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

    public boolean ValidacionRegistroUser() {
        //login();
        esperar(timeout, nombreRegistrado);
        try {
            String texto = driver.findElement(nombreRegistrado).getText();
            return texto.contains(nombre);
        } catch (Exception e) {
            return false;
        }
    }
}
