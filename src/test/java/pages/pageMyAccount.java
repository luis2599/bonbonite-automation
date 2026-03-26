package pages;

import org.openqa.selenium.By;

public class pageMyAccount extends basicSteps {

    public pageMyAccount(){
        super(driver);
    }

    // Variables de configuración
    String url = config.get("url.base");
    int timeout = config.getInt("timeout.explicit");
    int numDocumento = config.getInt("numero_documento_EP3");
    String nombre = config.get("nombre_EP3");
    String pass = config.get("pass_EP3");
    String correoNuevo = config.get("correo_nuevo_EP3");

    // Elementos locators
    By documento = locators.login.documento;
    By contrasena = locators.login.contrasena;
    By botonIniciSesion = locators.login.botonIniciSesion;
    By botonPanelUsuario = locators.login.botonPanelUsuario;
    By opcionDatosPanel = locators.account.opcionDatosPanel;
    By botonActualizarDatos = locators.account.botonActualizarDatos;
    By campoActualizarCorreo = locators.account.campoActualizarCorreo;
    By botonGuardarCambios = locators.account.botonGuardarCambios;
    By CampoCorreo = locators.account.CampoCorreo;

    public void loginUsuario(){
        loginUsuario(documento, contrasena, botonIniciSesion, numDocumento, pass);
    }

    public void actualizacionDatos(String correoNuevo){
        click(botonPanelUsuario);
        esperar(timeout, opcionDatosPanel);
        click(opcionDatosPanel);
        esperarCargaCompletaPagina(timeout);
        click(botonActualizarDatos);
        escribirTexto(campoActualizarCorreo, correoNuevo);
        click(botonGuardarCambios);
    }

    public boolean validacionCambioCorreo(){
        esperar(timeout, CampoCorreo);
        try {
            String texto = driver.findElement(CampoCorreo).getText();
            if (texto.equals(correoNuevo)) {
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
}
