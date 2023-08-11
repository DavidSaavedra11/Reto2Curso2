package com.example.reto2modulo2.Controller;

import com.example.reto2modulo2.Model.User;
import com.example.reto2modulo2.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User user){
        return userService.save(user);
    }
    @GetMapping("/all")
    public List<User> getAll(){
        return userService.getAll();
    }
    @GetMapping("/id/{id}")
    public User getUser(@PathVariable int id){
        return userService.getUser(id);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user){
        return userService.update(user);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id){
        userService.delete(id);
    }
    @GetMapping("/emailexist/{email}")
    public boolean emailExists(@PathVariable String email){
        return userService.emailExists(email);
    }
    @GetMapping("/{email}/{password}")
    public User authUser(@PathVariable String email, @PathVariable String password){
        return  userService.authUser(email,password);
    }
}
