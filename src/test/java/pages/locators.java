package pages;

import org.openqa.selenium.By;

public class locators {
    
    public static class registro {
        public static final By userButton = By.xpath("//div[contains(@id, 'toggle-account-menu')]//a[contains(@class, 'hover:opacity-70 transition-all')]");
        public static final By opcionRegistro = By.xpath("//span[contains(@id, 'show_register')]");
        public static final By registroDocumento = By.xpath("//input[contains(@id, 'reg_username')]");
        public static final By registroNombre = By.xpath("//input[contains(@id, 'first_name')]");
        public static final By registroApellido = By.xpath("//input[contains(@id, 'last_name')]");
        public static final By registroCorreo = By.xpath("//input[contains(@id, 'reg_email')]");
        public static final By registroContrasena = By.xpath("//input[contains(@id, 'reg_password')]");
        public static final By confrimacionContrasena = By.xpath("//input[contains(@id, 'reg_password2')]");
        public static final By tratamientoDatos = By.xpath("//input[contains(@id, 'privacy_policy_reg')]");
        public static final By botonRegistro = By.xpath("//button[contains(@name, 'register')]");     
    }

    public static class login {
        public static final By documento = By.xpath("//input[contains(@id, 'username')]");
        public static final By contrasena = By.xpath("//input[contains(@id, 'password')]");
        public static final By botonIniciSesion = By.xpath("//button[contains(@name, 'login')]");
        public static final By nombreRegistrado = By.xpath("//span[contains(@class, 'font-medium')]");
        public static final By botonPanelUsuario = By.xpath("//a[contains(@id, 'user-icon-wrap')]");
        public static final By nombrePanelUsuario = By.xpath("//div[@id='header-account-menu']//h4[contains(@class, 'text-[32px] font-medium')]");
    }

    public static class account {
        public static final By opcionDatosPanel = By.xpath("//a[contains(@href, 'edit-account')]");
        public static final By botonActualizarDatos = By.xpath("//button[@type= 'button' and contains(@class, 'update-info-btn')]");
        public static final By campoActualizarCorreo = By.xpath("//input[contains(@name, 'aux_email')]");
        public static final By botonGuardarCambios = By.xpath("//button[@type='button' and contains(@class, 'save-info-btn')]");
        public static final By CampoCorreo = By.cssSelector("div[data-field='aux_email']");    

    }

    public static class product {
        public static final By opcionZapatos = By.xpath("//li[@id='menu-item-10']//a[normalize-space()='Zapatos']");
        public static final By listaProductos = By.cssSelector(".product_list .grid");
        public static final By imagenProducto = By.cssSelector(".product-wrapper-with-variation img");
        public static final By primerProducto = By.cssSelector(".product_list .product-wrapper-with-variation a");
        public static final By tituloProducto = By.xpath("//h1[contains(@class, 'product_title')]");

    }

}
