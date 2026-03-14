package notificaciones.factory;

import notificaciones.interfaces.Notificacion;
import notificaciones.implementaciones.EmailNotificacion;
import notificaciones.implementaciones.SMSNotificacion;
import notificaciones.adapter.WhatsAppAdapter;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo){

        switch(tipo){

            case "EMAIL":
                return new EmailNotificacion();

            case "SMS":
                return new SMSNotificacion();

            case "WHATSAPP":
                return new WhatsAppAdapter();

            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado");

        }

    }

}