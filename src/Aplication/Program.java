package Aplication;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TESTE 1: seller find by id");
		
		Seller seller = sellerDao.FindById(3);
		
		System.out.println(seller);
	}
}
