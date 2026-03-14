package notificaciones.main;

import notificaciones.factory.NotificacionFactory;
import notificaciones.strategy.ServicioNotificacion;
import notificaciones.interfaces.Notificacion;

public class Main {

    public static void main(String[] args) {

        Notificacion email = NotificacionFactory.crearNotificacion("EMAIL");
        ServicioNotificacion servicio1 = new ServicioNotificacion(email);
        servicio1.enviarMensaje("Mensaje por Email");

        Notificacion sms = NotificacionFactory.crearNotificacion("SMS");
        ServicioNotificacion servicio2 = new ServicioNotificacion(sms);
        servicio2.enviarMensaje("Mensaje por SMS");

        Notificacion whatsapp = NotificacionFactory.crearNotificacion("WHATSAPP");
        ServicioNotificacion servicio3 = new ServicioNotificacion(whatsapp);
        servicio3.enviarMensaje("Mensaje por WhatsApp");

    }

}