package notificaciones.main;

import notificaciones.factory.NotificacionFactory;
import notificaciones.strategy.ServicioNotificacion;
import notificaciones.interfaces.Notificacion;
import notificaciones.enums.TipoNotificacion;

public class Main {

    public static void main(String[] args) {

        Notificacion email = NotificacionFactory.crearNotificacion(TipoNotificacion.EMAIL);
        ServicioNotificacion servicio1 = new ServicioNotificacion(email);
        servicio1.enviarMensaje("Mensaje por Email");

        Notificacion sms = NotificacionFactory.crearNotificacion(TipoNotificacion.SMS);
        ServicioNotificacion servicio2 = new ServicioNotificacion(sms);
        servicio2.enviarMensaje("Mensaje por SMS");

        Notificacion whatsapp = NotificacionFactory.crearNotificacion(TipoNotificacion.WHATSAPP);
        ServicioNotificacion servicio3 = new ServicioNotificacion(whatsapp);
        servicio3.enviarMensaje("Mensaje por WhatsApp");

    }

}