package dao.impl;

import dao.UserDao;
import domain.homework;
import druidUtils.druidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate template = new JdbcTemplate(druidUtils.getDataSource());

    @Override
    public void register(homework user) {
        String username = user.getUsername();
        String password = user.getPassword();

        String sql = "insert into homework values(?,?)";
        template.update(sql,username,password);
    }

    @Override
    public boolean isRegister(String username) {
        String sql = "select * from homework where username = ?";
        homework result = new homework();
        try{
            result = template.queryForObject(sql, new BeanPropertyRowMapper<homework>(homework.class), username);
        }catch (Exception e){
            result = null;
        }

        return result == null;
    }

    @Override
    public homework findUserByUP(homework user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String sql = "select * from homework where username = ? and password = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<homework>(homework.class), username, password);
    }
}
