package com.empresa.configuracion.modelo.ejercicio2;

import jakarta.annotation.Resource;
import jakarta.inject.Named;
import org.springframework.stereotype.Component;

@Named()
public class NotificationController {
    @Resource(name = "sms")
    private INotificacionServicio servicio;

    public String llamada(){
        return servicio.notifica();
    }
}
