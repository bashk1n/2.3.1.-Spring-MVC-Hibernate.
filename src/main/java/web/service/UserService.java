package web.service;

import web.model.User;

import java.util.List;


public interface UserService {
    List<User> getAll();
    void save(User user);
    User getUserById(long id);
    void delete(long id);
    void update(User user);
}
