package com.ejemplo.Proyecto;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProtectApplication {

	public static void main(String[] args) {

		Enterprise colanta = new Enterprise(1040, "MBA", "900360840", "3205087012", "CLL 50 D 3 40");

		System.out.println("El ID es:" + colanta.getId());
		System.out.println("El Nombre de la empresa es:" + colanta.getName());
		System.out.println("El NIT de la empresa es:" + colanta.getDocument());
		System.out.println("Telefono" + colanta.getPhone());
		System.out.println("Direccion" + colanta.getAddress());

		Profile perfil1 = new Profile("1020","01","3205086412","M0N01", LocalDate.of(2022,8,1),LocalDate.of(2022,8,1));

		System.out.println("El ID es:" + perfil1.getId());
		System.out.println("La imagen es:" + perfil1.getImage());
		System.out.println("El telefono es:" + perfil1.getPhone());
		System.out.println("Usuario es" + perfil1.getUser());
		System.out.println(perfil1.getCreatedAt());
		System.out.println(perfil1.getUpdateAt());

		Enmu_RoleName cargo1 = new Enmu_RoleName("Gerente","Mensajero");

		Employee empleado1 = new Employee(1011, "Mono@gmail.com", perfil1, cargo1, colanta, LocalDate.now(), LocalDate.now());

		System.out.println("El ID es:" + empleado1.getId());
		System.out.println("El correo es" + empleado1.getEmail());
		System.out.println("Mi perfil es:" + empleado1.getProfile());
		System.out.println("Mi cargo es:" + empleado1.getEnmu_RoleName());
		System.out.println("La empresa es:" + empleado1.getEnterprise());
		System.out.println(empleado1.getCreatedAt());
		System.out.println(empleado1.getUpdateAt());

		Transaction transaction1 = new Transaction(1015,"compra",1000000,colanta,LocalDate.now(),LocalDate.now());

		System.out.println("El ID es:" + transaction1.getId());
		System.out.println("El concepto es:" + transaction1.getConcept());
		System.out.println("El Mono es:" + transaction1.getAmount());
		System.out.println("La empresa es:" + transaction1.getEnterprise());
		System.out.println(transaction1.getCreatedAt());
		System.out.println(transaction1.getUpdateAt());
		}
}
