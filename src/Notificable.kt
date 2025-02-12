package src

interface Notificable {
    val mensaje: String

    fun enviarNotificacion()
}