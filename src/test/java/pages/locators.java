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
        public static final By documento = By.xpath("//input[contains(@id='username'])");
        public static final By contrasena = By.xpath("//input[contains(@id, 'password'])");
        public static final By botonIniciSesion = By.xpath("//button[contains(@name, 'login'])");
        public static final By nombreRegistrado = By.xpath("//span[contains(@class,'font-medium')]");
    }

}
