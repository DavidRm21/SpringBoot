package com.course.mobile_app_ws.controller;

import com.course.mobile_app_ws.model.UserDetailsRequest;
import com.course.mobile_app_ws.model.Users;
import com.course.mobile_app_ws.repository.UserRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Users> getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                                @RequestParam(value = "limit", defaultValue = "50") int limit,
                                @RequestParam(value = "sort", required = false) String sort){
        return repository.findAll();
    }

    @GetMapping(value = "/{userId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.TEXT_PLAIN_VALUE})
    public Users getUser(@PathVariable Integer userId){
        return repository.findById(userId).orElse(null);
    }

    @PostMapping
    public Users createUser(@RequestBody UserDetailsRequest user){
        Users userSave = new Users();
        userSave.setFirstName(user.firstName());
        userSave.setLastName(user.lastName());
        userSave.setEmail(user.email());
        userSave.setGender(user.gender());
        userSave.setIpAddress(user.ipAddress());
        return repository.save(userSave);
    }

    @PutMapping("/{userId}")
    public Users updateUser(@PathVariable Integer userId, @RequestBody UserDetailsRequest user){
        Users userSave = repository.findById(userId).orElse(new Users());
        userSave.setFirstName(user.firstName());
        userSave.setLastName(user.lastName());
        userSave.setEmail(user.email());
        userSave.setGender(user.gender());
        userSave.setIpAddress(user.ipAddress());
        return repository.save(userSave);
    }

    @DeleteMapping("/{userId}")
    public Users deleteUser(@PathVariable Integer userId){
        Optional<Users> userDeleted = repository.findById(userId);
        repository.deleteById(userId);
        return userDeleted.get();
    }
}
