package steps;

import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.*;
import pages.pageCreateAccount;
import pages.pageLogin;
import pages.pageMyAccount;
import pages.pageProduct;


public class bonBonite {

    SoftAssert soft = new SoftAssert();
    pageCreateAccount main = new pageCreateAccount();
    pageLogin login = new pageLogin();
    pageMyAccount account = new pageMyAccount();
    pageProduct product = new pageProduct();

    @Given("^(?:El cliente ingresa a la pagina de bon-bonite)$")
    public void ingresoSitio(){
        main.startSession();
    }

    @Given("^(?:El cliente se dirige a la seccion de usuarios||El cliente selecciona la seccion de usuarios)$")
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

    @Given("^(?:El cliente realiza el procesos de login)$")
    public void procesoLogin(){
        account.loginUsuario();
    }

    @When("^(?:Una vez ingresados los datos, procesede a leer y aceptar la autorizacion de tratamiento de datos personales)$")
    public void tratamientoDatos(){
        main.aceptaTratamientoDatos();
    }
    
    @When("^(?:Finalmente, procede a dar clic en boton registrar)$")
    public void finalizacionRegistro(){
        main.finalizacionRegistroUser();
    }

    @When("^(?:Ingresa su numero de documento y contraseña correctos en el formulario de inicio de sesion,||Ingresa los datos de login,) ademas da clic en iniciar sesion$")
    public void ingresoDatosLogin(){
        account.loginUsuario();
    }

    @When("^(?:Navega a la seccion datos y modifica su correo a) \"([^\"]*)\"$")
    public void actualizacionDatos(String correoNuevo){
        account.actualizacionDatos(correoNuevo);
    }

    @When("^(?:El cliente hace clic en el menu de categoria Zapatos)$")
    public void seleccionZapatos(){
        product.seleccionarOpcion();
    }

    @Then("^(?:El cliente verifica que su nombre sea el correcto)$")
    public void ValidacionRegistro(){
        soft.assertTrue(main.validacionRegistroUser(), "El nombre del usuario registrado, no es el mismo de la pagina");
        soft.assertAll();
    }

    @Then("^(?:Valida que su nombre sea el correcto en la pagina inicial y en el panel de usuario)$")
    public void ValidacionDatos(){
        soft.assertTrue(login.validacionNombreUsuario(), "El nombre del usuario que se encuentra en el panel de usuario, no es el mismo de la pagina");
        soft.assertAll();
    }

    @Then("^(?:El sistema actualiza la información y muestra  los nuevos datos visibles en el perfil)$")
    public void ValidaionCambiosRealizados(){
        soft.assertTrue(account.validacionCambioCorreo(), "El correo electronico no fue actulizado");
        soft.assertAll();
    }
    
    @Then("^(?:El sistema muestra el listado de productos con imagen)$")
    public void validarListadoProductos(){
        soft.assertTrue(product.validarListadoProductos(), "El producto no presenta caracteristicas");
        soft.assertAll();
    }

    @Then("^(?:El usuario puede seleccionar un producto para ver su detalle)$")
    public void seleccionarProducto(){
        soft.assertTrue(product.seleccionarPrimerProducto(), "No se pudo direccionar al producto seleccionado");
        soft.assertAll();
    }
    
}
