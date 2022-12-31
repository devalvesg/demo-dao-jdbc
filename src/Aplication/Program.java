package Aplication;

import java.sql.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller find by id");
		Seller seller = sellerDao.FindById(3);		
		System.out.println(seller);

		System.out.println("\n=== TESTE 2: seller find by id");
		Department department = new Department(2, null);
		List <Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TESTE 3: seller findAll");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
			}
		
		System.out.println("\n=== TESTE 4: seller inset");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(0), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted, new id = " + newSeller.getId());
		
		System.out.println("\n=== TESTE 5: seller update");
		seller = sellerDao.FindById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update Completed");
	}
	
	
}