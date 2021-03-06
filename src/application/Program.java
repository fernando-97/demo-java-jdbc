package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Calendar;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        /*
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("====== Test 1: findById ======");
        Seller seller = sellerDao.fideById(3);
        System.out.println(seller);

        System.out.println("\n====== Test 2: findByDepartment ======");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n====== Test 3: findAll ======");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n====== Test 4: insert ======");
        Seller seller1 = new Seller(null, "Nando", "nando@gmail.com", Calendar.getInstance(), 5000.0, new Department(2, null));
        sellerDao.insert(seller1);
        System.out.println("Inserido! Novo Id" + seller1.getId());

        System.out.println("\n====== Test 5: update ======");
        seller = sellerDao.fideById(9);
        seller.setName("Fernando Braga");
        sellerDao.update(seller);
        System.out.println("Update completo");


        System.out.println("\n====== Test 6: deleteById ======");
        sellerDao.deleteById(9);
        System.out.println("Deletado com sucesso");


        DepartmentDao departmentDao = DaoFactory.createDepartmentDAo();
        List<Department> list = null;

        System.out.println("\n====== Test 3: findAll ======");
        list = departmentDao.findAll();
        list.forEach(System.out::println);


        System.out.println("\n====== Test 4: insert and update ======");
        Department department = new Department(null, "Food");
        departmentDao.insert(department);
        System.out.println("Inserido! Novo Id" + department.getId());


        System.out.println("\n====== Test 5: update ======");
        Department department = departmentDao.fideById(5);
        department.setName("Shoots");
        departmentDao.update(department);
        System.out.println("Update completo");

        System.out.println("\n====== Test 6: deleteById ======");
        departmentDao.deleteById(5);
        System.out.println("Deletado com sucesso");
        list = departmentDao.findAll();
        list.forEach(System.out::println);
         */
    }
}
