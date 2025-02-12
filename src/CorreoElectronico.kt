package src

class CorreoElectronico(override val mensaje: String): Notificable {

    override fun enviarNotificacion() {
        println(mensaje)
    }

}