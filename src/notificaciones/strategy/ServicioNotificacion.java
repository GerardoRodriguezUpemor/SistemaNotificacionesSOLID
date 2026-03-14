package notificaciones.strategy;

import notificaciones.interfaces.Notificacion;

public class ServicioNotificacion {

    private Notificacion estrategia;

    public ServicioNotificacion(Notificacion estrategia){
        this.estrategia = estrategia;
    }

    public void enviarMensaje(String mensaje){
        estrategia.enviar(mensaje);
    }

}