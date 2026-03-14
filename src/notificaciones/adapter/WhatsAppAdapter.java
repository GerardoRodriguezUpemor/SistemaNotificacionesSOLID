package notificaciones.adapter;

import notificaciones.interfaces.Notificacion;

public class WhatsAppAdapter implements Notificacion {

    private ServicioWhatsApp servicio;

    public WhatsAppAdapter(){
        servicio = new ServicioWhatsApp();
    }

    @Override
    public void enviar(String mensaje){
        servicio.enviarMensaje(mensaje);
    }
}