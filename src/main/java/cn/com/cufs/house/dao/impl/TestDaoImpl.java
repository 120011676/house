package cn.com.cufs.house.dao.impl;

import cn.com.cufs.house.dao.TestDao;
import cn.com.cufs.house.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by say on 5/11/16.
 */
@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<User> list() {
        String sql = "select * from user";
        return this.jdbcTemplate.query(sql, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User u = new User();
                u.setId(resultSet.getInt("id"));
                u.setName(resultSet.getString("name"));
                return u;
            }
        });
    }
}
