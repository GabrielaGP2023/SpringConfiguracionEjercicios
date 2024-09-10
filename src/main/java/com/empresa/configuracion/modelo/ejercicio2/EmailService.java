package com.empresa.configuracion.modelo.ejercicio2;

import jakarta.inject.Named;

@Named("email")
public class EmailService implements INotificacionServicio{
    @Override
    public String notifica() {
        return "Notificando desde el servicio Email";
    }
}
