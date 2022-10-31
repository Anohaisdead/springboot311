package net.proselyte.springbootdemo.service;

import net.proselyte.springbootdemo.model.User;
import net.proselyte.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public List<User> allUsers() {
        return userRepository.findAll();
    }
    @Transactional
    public void add(User user) {
        userRepository.save(user);
    }
    @Transactional
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
    @Transactional
    public void edit(User user) {
        userRepository.saveAndFlush(user);
    }
    @Transactional
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}