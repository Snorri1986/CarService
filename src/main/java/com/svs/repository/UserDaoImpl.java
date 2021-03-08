package com.svs.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.svs.entity.User;


// TODO: end this method
public class UserDaoImpl implements UserRepository {

    String sqlquery = "select * from testtable";

    private JdbcTemplate jdbcTemp;

    public UserDaoImpl(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    List<User> findAll() {

        List<User> listUser = jdbcTemp.query(sqlquery, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                return null;
            }
        })
                return listUser;
    }
}






