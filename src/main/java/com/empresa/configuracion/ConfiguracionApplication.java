package com.empresa.configuracion;

import com.empresa.configuracion.modelo.ejercicio2.NotificationController;
import com.empresa.configuracion.modelo.ejercicio3.ConfiguracionProyecto;

import com.empresa.configuracion.modelo.ejercicio4.UserService;
import com.empresa.configuracion.modelo.ejercicio5.Task;
import jakarta.annotation.Resource;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfiguracionApplication implements CommandLineRunner {
	@Resource(name = "notificationController")
	private NotificationController controlador;

	@Autowired
	private ConfiguracionProyecto configuracion;

	@Autowired
	private UserService s1;
	@Autowired
	private UserService s2;


	@Autowired
	private Task t1;

	@Autowired
	private Task t2;



	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
      _05_Ejercicio();
	}

	private void _04_Ejercicio() {
		System.out.println(s1.getServiceId());
		System.out.println(s2.getServiceId());
	}

	private void _05_Ejercicio() {
		System.out.println(t1.getTaskId());
		System.out.println(t2.getTaskId());
	}

	private void _03_Ejercicio() {
		System.out.println(configuracion.getNombreApp());
		System.out.println(configuracion.getVersionApp());
	}

	private void _02_Ejercicio() {
		System.out.println(controlador.llamada());
	}
}
