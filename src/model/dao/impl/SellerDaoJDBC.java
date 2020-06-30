package model.dao.impl;

import db.DB;
import db.DbException;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.*;
import java.util.Calendar;
import java.util.List;

public class SellerDaoJDBC implements SellerDao {
    private Connection conn;

    public SellerDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Seller obj) {

    }

    @Override
    public void update(Seller obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Seller fideById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            conn.createStatement().execute("USE coursejdbc");//seleciona o banco de dados correto
            st = conn.prepareStatement(
                    "SELECT seller.*, department.Name as DepName "
                    + "FROM seller INNER JOIN department "
                    + "ON seller.DepartmentId = department.Id "
                    + "WHERE seller.Id = ?"
            );

            st.setInt(1, id);
            rs = st.executeQuery();

            if (rs.next()) {
                Department dep = new Department();
                dep.setId(rs.getInt("DepartmentId"));
                dep.setName(rs.getString("DepName"));

                Seller seller = new Seller();
                seller.setId(rs.getInt("Id"));
                seller.setName(rs.getString("Name"));
                seller.setEmail(rs.getString("Email"));
                Calendar cal = new Calendar.Builder().setInstant(rs.getDate("BirthDate")).build();
                seller.setBirthDate(cal);
                seller.setBaseSalary(rs.getDouble("BaseSalary"));
                seller.setDepartment(dep);
                return seller;
            }
            return null;
        } catch (SQLException throwables) {
            throw new DbException(throwables.getMessage());
        }
        finally {
            DB.closeResultset(rs);
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Seller> findAll() {
        return null;
    }
}