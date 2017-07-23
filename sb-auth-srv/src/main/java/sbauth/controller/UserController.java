package sbauth.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sbauth.model.User;
import sbauth.repository.UserRepository;

import java.util.List;

/**
 * Created by quchy on 22/07/2017.
 */

@SuppressWarnings("SpringAutowiredFieldsWarningInspection")
@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserRepository userRepo;


    // Get list
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public List<User> list() {
        return userRepo.findAll();
    }

    // Create
    @RequestMapping(value = "users", method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userRepo.saveAndFlush(user);
    }

    // get
    @RequestMapping(value = "users/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id) {
        return userRepo.findOne(id);
    }


    // update
    @RequestMapping(value = "users/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable Long id, @RequestBody User user) {
        User existingUser = userRepo.findOne(id);
        BeanUtils.copyProperties(user, existingUser);
        return userRepo.saveAndFlush(existingUser);
    }

    // delete
    @RequestMapping(value = "users/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id) {
        User existingUser = userRepo.findOne(id);
        userRepo.delete(existingUser);
        return existingUser;
    }

}
