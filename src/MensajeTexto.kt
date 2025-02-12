package src

class MensajeTexto(override val mensaje: String): Notificable {

    override fun enviarNotificacion() {
        println(mensaje)
    }

}