package dao;

import bean.CustomerBean;
import db.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CustomerDao {

    private Logger logger = Logger.getLogger(CustomerDao.class.getName());

    public List<CustomerBean> getCustomers() {
        Connection connection = ConnectionFactory.getConnection();
        List<CustomerBean> customers = new ArrayList<>();
        String query = "SELECT id, name, date_of_birth, document FROM customer";

        try(Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                CustomerBean customerBean = new CustomerBean();
                customerBean.setId(resultSet.getInt("id"));
                customerBean.setName(resultSet.getString("name"));
                customerBean.setDateOfBirth(resultSet.getDate("date_of_birth").toString());
                customerBean.setDocument(resultSet.getString("document"));
                customers.add(customerBean);
            }
        } catch (SQLException exception) {
            logger.warning("Houve um erro: " + exception.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return customers;
    }

    public int save(CustomerBean customer) {
        Connection connection = ConnectionFactory.getConnection();
        String query = "INSERT INTO customer (name, date_of_birth, document) VALUES (?, ?, ?)";

        try(PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getDateOfBirth());
            preparedStatement.setString(3, customer.getDocument());
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if(resultSet.next()) {
                return resultSet.getInt(1);
            }
        } catch (SQLException exception) {
            logger.warning("Houve um erro: " + exception.getMessage());
        }

        return 0;
    }

    public boolean delete(int id) {
        Connection connection = ConnectionFactory.getConnection();
        String query = "DELETE FROM customer WHERE id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException exception) {
            logger.warning("Houve um erro: " + exception.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return false;

    }

    public CustomerBean getCustomerById(int id) {
        Connection connection = ConnectionFactory.getConnection();
        String query = "SELECT id, name, date_of_birth, document FROM customer WHERE id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();
            if(resultSet.next()) {
                CustomerBean customer = new CustomerBean();
                customer.setId(resultSet.getInt("id"));
                customer.setName(resultSet.getString("name"));
                customer.setDateOfBirth(resultSet.getString("date_of_birth"));
                customer.setDocument(resultSet.getString("document"));
                return customer;
            }
        } catch (SQLException exception) {
            logger.warning("Houve um erro: " + exception.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return null;

    }

    public boolean update(CustomerBean customer) {
        Connection connection = ConnectionFactory.getConnection();
        String query = "UPDATE customer SET name = ?, date_of_birth = ?, document = ? WHERE id = ?";

        try(PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getDateOfBirth());
            preparedStatement.setString(3, customer.getDocument());
            preparedStatement.setInt(4, customer.getId());
            return preparedStatement.executeUpdate() == 1;
        } catch (SQLException exception) {
            logger.warning("Houve um erro: " + exception.getMessage());
        } finally {
            ConnectionFactory.closeConnection();
        }

        return false;
    }
}
