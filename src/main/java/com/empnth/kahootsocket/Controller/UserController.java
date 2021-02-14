package com.empnth.kahootsocket.Controller;

import com.empnth.kahootsocket.Storage.UserStorage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/registration/{username}")
    public ResponseEntity<Void> register(@PathVariable String username)
        {
        System.out.println("handling register user request: "+username);
        try{
            UserStorage.getInstance().setUser(username);
        } catch (Exception e)
        {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/all")
    public Set<String> fetchAllUsers(){
        return UserStorage.getInstance().getUsers();
    }

}
