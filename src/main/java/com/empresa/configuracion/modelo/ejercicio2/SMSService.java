package com.empresa.configuracion.modelo.ejercicio2;

import jakarta.inject.Named;

@Named("sms")
public class SMSService implements INotificacionServicio{
    @Override
    public String notifica() {
        return "Notificando desde el servicio SMS";
    }
}
