package notificaciones.factory;

import notificaciones.interfaces.Notificacion;
import notificaciones.implementaciones.EmailNotificacion;
import notificaciones.implementaciones.SMSNotificacion;
import notificaciones.adapter.WhatsAppAdapter;
import notificaciones.adapter.ServicioWhatsApp;
import notificaciones.enums.TipoNotificacion;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(TipoNotificacion tipo){

        switch(tipo){

            case EMAIL:
                return new EmailNotificacion();

            case SMS:
                return new SMSNotificacion();

            case WHATSAPP:
                return new WhatsAppAdapter(new ServicioWhatsApp());

            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado");

        }

    }

}