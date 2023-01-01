package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

import javax.persistence.Column;


public interface UserService {
    public List<User> getAllUsers();

    public User getUser(int n);

    public void saveUser(User user);

    public void deleteUser(int id);
}
