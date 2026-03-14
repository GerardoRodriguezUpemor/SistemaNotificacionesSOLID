package notificaciones.main;

import notificaciones.factory.NotificacionFactory;
import notificaciones.contexto.ServicioNotificacion;
import notificaciones.interfaces.Notificacion;

public class Main {

    public static void main(String[] args) {

        Notificacion noti1 = NotificacionFactory.crearNotificacion("EMAIL");
        ServicioNotificacion servicio1 = new ServicioNotificacion(noti1);
        servicio1.enviarMensaje("Hola desde EMAIL");

        Notificacion noti2 = NotificacionFactory.crearNotificacion("SMS");
        ServicioNotificacion servicio2 = new ServicioNotificacion(noti2);
        servicio2.enviarMensaje("Hola desde SMS");

        Notificacion noti3 = NotificacionFactory.crearNotificacion("WHATSAPP");
        ServicioNotificacion servicio3 = new ServicioNotificacion(noti3);
        servicio3.enviarMensaje("Hola desde WhatsApp");

    }

}