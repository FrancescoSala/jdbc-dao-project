package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {

        Department obj = new Department(1, "Books");

        SellerDAO sellerDAO = DAOFactory.createSellerDAO();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(3);

        System.out.println(seller);
    }
}