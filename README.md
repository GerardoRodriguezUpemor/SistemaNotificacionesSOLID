# Sistema de Notificaciones utilizando SOLID

Este proyecto demuestra la aplicación de los principios SOLID mediante el desarrollo de un sistema de envío de notificaciones.

## Principios aplicados:
- **SRP** (Single Responsibility Principle)
- **OCP** (Open/Closed Principle)
- **LSP** (Liskov Substitution Principle)
- **ISP** (Interface Segregation Principle)
- **DIP** (Dependency Inversion Principle)

## Patrones utilizados:
- **Factory Method** (Creacional): Encapsula la creación de los distintos tipos de notificación.
- **Adapter** (Estructural): Permite integrar una API externa (ServicioWhatsApp) adaptándola a la interfaz común.
- **Strategy** (Comportamiento): Permite cambiar dinámicamente el comportamiento del envío de mensajes a través del contexto (`ServicioNotificacion`).

## Tecnología:
Java + Apache NetBeans

## Diagrama UML Conceptual:

```text
          Notificacion
              ▲
     ---------------------
     |        |          |
 Email    SMS      WhatsAppAdapter
                      |
                ServicioWhatsApp
```