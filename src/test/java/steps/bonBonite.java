package steps;

import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.*;
import pages.pageCreateAccount;

public class bonBonite {

    SoftAssert soft = new SoftAssert();
    pageCreateAccount main = new pageCreateAccount();

    @Given("^(?:El cliente ingresa a la pagina de bon-bonite)$")
    public void ingresoSitio(){
        main.startSession();
    }

    @Given("^(?:El cliente se dirige a la seccion de usuarios)$")
    public void ingresoUsuarios(){
        main.startUser();
    }

    @Given("^(?:El cliente da clic en la opcion registrate)$")
    public void registroUsuario(){
        main.RegistUser();
    }

    @Given("^(?:Ingresa los datos del formulario de registro como numero de documento, Nombre, Apellido)$")
    public void registroDatosUsuario(){
        main.ingresoDatos();
    }

    @Given("^(?:Ademas ingresa un correo electronico y la contraseña)$")
    public void registroDatosLogin(){
        main.ingresoDatosLogin();
    }

    @When("^(?:Una vez ingresado los datos, procesede a leer y aceptar la autorizacion de tratamiento de datos personales)$")
    public void tratamientoDatos(){
        main.aceptaTratamientoDatos();
    }
    
    @When("^(?:Finalmente procede a dar clic en boton registrar)$")
    public void finalizacionRegistro(){
        main.finalizacionRegistroUser();
    }

    @Then("^(?:El cliente verifica que su nombre sea el correcto)$")
    public void ValidacionRegistro(){
        soft.assertTrue(main.ValidacionRegistroUser(), "El nombre del usuario registrado, no es el mismo de la pagina");
    }
    
}
