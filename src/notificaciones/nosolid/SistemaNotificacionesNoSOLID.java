package notificaciones.nosolid;

// Clase que simula una API de terceros (fuertemente acoplada)
class ServicioWhatsAppExterno {
    public void enviarMensajeExterno(String mensaje) {
        System.out.println("WhatsApp API enviando: " + mensaje);
    }
}

public class SistemaNotificacionesNoSOLID {

    // Rompe DIP (Inversión de Dependencias): Instanciación directa y acoplamiento fuerte a una clase concreta
    private ServicioWhatsAppExterno whatsappAPI; 

    public SistemaNotificacionesNoSOLID() {
        this.whatsappAPI = new ServicioWhatsAppExterno();
    }

    // Rompe SRP (Responsabilidad Única): Esta clase sabe y hace de todo. Conoce a los externos y ejecuta lógicas distintas.
    // Rompe OCP (Abierto/Cerrado): Si mañana sale un nuevo medio como TELEGRAM, estamos OBLIGADOS a modificar este código.
    public void enviarNotificacion(String tipo, String mensaje) {
        
        if (tipo.equals("EMAIL")) {
            System.out.println("Conectando al servidor SMTP...");
            System.out.println("Enviando EMAIL: " + mensaje);
            
        } else if (tipo.equals("SMS")) {
            System.out.println("Conectando a red de telefonía celular...");
            System.out.println("Enviando SMS: " + mensaje);
            
        } else if (tipo.equals("WHATSAPP")) {
            System.out.println("Obteniendo token de API externa...");
            whatsappAPI.enviarMensajeExterno(mensaje);
            
        } else {
            System.out.println("Tipo de notificación no soportado.");
        }
    }

    // Método Main para probar el Anti-patrón
    public static void main(String[] args) {
        SistemaNotificacionesNoSOLID sistemaMalo = new SistemaNotificacionesNoSOLID();
        
        System.out.println("--- EJECUCIÓN SIN SOLID ---");
        sistemaMalo.enviarNotificacion("EMAIL", "Hola sin SOLID por Email");
        sistemaMalo.enviarNotificacion("SMS", "Hola sin SOLID por SMS");
        sistemaMalo.enviarNotificacion("WHATSAPP", "Hola sin SOLID por WhatsApp");
    }
}