package edu.esprit.game.levels;

import edu.esprit.game.models.Employee;
import edu.esprit.game.utils.Data;

import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();

		/* TO DO 1: Afficher tous les employés */
		employees.stream().forEach(e->e.toString());



		/*
		 * TO DO 2: Afficher les employés dont le nom commence par la lettre n
		 */
		employees.stream().filter(e->e.getName().charAt(0)=='n').forEach(e->e.toString());



		/*
		 * TO DO 3: Afficher les employés dont le nom commence par la lettre n
		 * et le salaire> 1000
		 */
		employees.stream().filter(e-> {return e.getName().charAt(0)=='n' && e.getSalary()>1000;}).forEach(e->e.toString());




		/*
		 * TO DO 4: Afficher les employés dont le nom commence par la lettre s
		 * triés par salaire
		 */
		employees.stream().filter(e->e.getName().charAt(0)=='a').sorted((e1,e2) -> Integer.compare(e1.getSalary(),e2.getSalary()))
				.forEach(e->e.toString());





		/*
		 * TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2
		 * maniéres différentes
		 */
		/* First Way */
		employees.stream().filter(e -> e.getSalary() > 600).forEach(e -> System.out.println(e.getName()));


		/* Second Way */
		employees.stream().filter(e -> e.getSalary() > 600).map(Employee::getName)
				.forEach(System.out::println);



		/*
		 * TO DO 6: Ajouter 200 D pour les employés dont le nom commence avec m
		 * et les affichés ensuite
		 */
		employees.stream().filter(e->e.getName().charAt(0)=='m')
				.forEach(e->{e.setSalary(e.getSalary()+200);
						e.toString();
		});

	}
}
