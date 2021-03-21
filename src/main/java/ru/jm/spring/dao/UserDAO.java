package ru.jm.spring.dao;

import ru.jm.spring.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void updateUser(int id, User updatedUser);

    public void deleteUser(int id);
}
