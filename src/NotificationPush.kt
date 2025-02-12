package src

class NotificationPush(override val mensaje: String): Notificable {

    override fun enviarNotificacion() {
        println(mensaje)
    }

}