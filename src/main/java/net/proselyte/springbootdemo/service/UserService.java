package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    List<User> allUsers();

    void add(User user);

    void delete(Long id);

    void edit(User user);

    User getById(Long id);
}