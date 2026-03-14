package notificaciones.adapter;

import notificaciones.interfaces.Notificacion;

public class WhatsAppAdapter implements Notificacion {

    private ServicioWhatsApp servicio;

    public WhatsAppAdapter(ServicioWhatsApp servicio){
        this.servicio = servicio;
    }

    @Override
    public void enviar(String mensaje){
        servicio.enviarMensaje(mensaje);
    }
}