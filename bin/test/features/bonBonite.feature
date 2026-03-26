@Bon-Bonite
Feature: Registro de usuario
    Proceso de creación de cuenta en el portal de Bon-Bonite,
    donde se realizará el registro del usuario,
    mediante el ingreso de sus datos básicos y credenciales de acceso.


    Background: Navegación a sitio
        Given El cliente ingresa a la pagina de bon-bonite

    @RegistroUsuario
    Scenario: Registro exitoso
        Given El cliente selecciona la seccion de usuarios
        And El cliente da clic en la opcion registrate
        And Ingresa los datos del formulario de registro como numero de documento, Nombre, Apellido
        And Ademas ingresa un correo electronico y la contraseña
        When Una vez ingresados los datos, procesede a leer y aceptar la autorizacion de tratamiento de datos personales
        And Finalmente, procede a dar clic en boton registrar
        Then El cliente verifica que su nombre sea el correcto

    @LoginUsuario
    Scenario: Ingreso de usuario exitoso
        Given El cliente selecciona la seccion de usuarios
        When Ingresa su numero de documento y contraseña correctos en el formulario de inicio de sesion, ademas da clic en iniciar sesion
        Then Valida que su nombre sea el correcto en la pagina inicial y en el panel de usuario
    
    @ActualizacionDatos
    Scenario: Actualizacion de datos de usuario
        Given El cliente selecciona la seccion de usuarios
        And El cliente realiza el procesos de login
        When Navega a la seccion datos y modifica su correo a "becora2307@exespay.com"
        Then El sistema actualiza la información y muestra  los nuevos datos visibles en el perfil

    @SeleccionarProducto
    Scenario: Actualizacion de datos de usuario
        When El cliente hace clic en el menu de categoria Zapatos
        Then El sistema muestra el listado de productos con imagen
        And El usuario puede seleccionar un producto para ver su detalle


