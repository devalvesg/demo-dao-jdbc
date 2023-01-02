package Aplication;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = new Department();
		
		
		System.out.println("=== TESTE 1: department find by id");
		department = departmentDao.FindById(1);		
		System.out.println(department);

		System.out.println("\n=== TESTE 2: department findAll");
		List <Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
	/*	System.out.println("\n=== TESTE 3: department insert");
		Department newDep = new Department(null, "Music");
		departmentDao.insert(newDep);
		System.out.println("Inserted, new id = " + newDep.getId());
	*/	
		System.out.println("\n=== TESTE 4: department update");
		department = departmentDao.FindById(1);
		department.setName("Computers");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n=== TESTE 5: department delete");
		System.out.print("Digite um ID para ser deletado: ");
		int id = entrada.nextInt();
		
		departmentDao.deleteById(id);
		System.out.println("Delete Complete");
		
		entrada.close();
	}
}

