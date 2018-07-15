package com.comarch.ana.db.dao;

import com.comarch.ana.db.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplateOtc;

    @Autowired
    private JdbcTemplate jdbcTemplateGmk;

    public List<Customer> findAll() {

        List<Customer> result = jdbcTemplateOtc.query("SELECT id, name, email, created_date FROM customer", (rs,
                                                                                                             rowNum)
                -> new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDate
                ("created_date")));

        return result;

    }

    public List<Customer> findAllGmk() {

        List<Customer> result = jdbcTemplateGmk.query("SELECT id, name, email, created_date FROM customer", (rs,
                                                                                                             rowNum)
                -> new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDate
                ("created_date")));

        return result;

    }

    public List<Customer> updaye() {

        List<Customer> result = jdbcTemplateOtc.query("SELECT id, name, email, created_date FROM customer", (rs,
                                                                                                             rowNum)
                -> new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"), rs.getDate
                ("created_date")));

        return result;
    }
}