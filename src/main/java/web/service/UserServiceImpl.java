package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao udao;

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return udao.getAllUsers();
    }

    @Transactional
    @Override
    public User getUser(int n) {
        return udao.getUser(n);
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        udao.saveUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        udao.deleteUser(id);
    }
}
