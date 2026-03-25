Feature: Registro de usuario
Proceso de creación de cuenta en el portal de Bon-Bonite, 
donde se realizará el registro del usuario, 
mediante el ingreso de sus datos básicos y credenciales de acceso.


    Background: Navegación a sitio
    Given El cliente ingresa a la pagina de bon-bonite
    And El cliente se dirige a la seccion de usuarios

    Scenario: Registro exitoso
    Given El cliente da clic en la opcion registrate
    And Ingresa los datos del formulario de registro como numero de documento, Nombre, Apellido
    And Ademas ingresa un correo electronico y la contraseña
    When Una vez ingresado los datos, procesede a leer y aceptar la autorizacion de tratamiento de datos personales
    And Finalmente procede a dar clic en boton registrar
    Then El cliente verifica que su nombre sea el correcto
 

