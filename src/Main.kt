package src

fun main(){
    val notificaciones = mutableListOf<Notificable>()

    val correo = CorreoElectronico("Mañana usted tiene cita a las 3.30 pm.")
    val texto = MensajeTexto("Tienes que limpiar tu cuarto. - Mamá")
    val notificacion = NotificationPush("You may have to delete your account...")


}