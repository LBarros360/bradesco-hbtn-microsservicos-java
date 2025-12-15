package com.example.demo.controller;

import com.example.demo.exception.CPFException;
import com.example.demo.exception.UserIdException;
import com.example.demo.exception.UserNameException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        // Validation: ID must be > 0 and < 100
        if (id > 0 && id < 100) {
            return "You have entered valid ID";
        } else {
            // throw a typed exception so the controller advice can format the response
            throw new UserIdException("You have entered invalid ID");
        }
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {

        // Validation: username length must be > 3 and < 15
        if (userName != null && userName.length() > 3 && userName.length() < 15) {
            return "You have entered valid USERNAME";
        } else {
            throw new UserNameException("You have entered invalid USERNAME");
        }
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        if (cpf == null) {
            throw new CPFException("null");
        }

        if (isCPF(cpf)) {
            return "You have entered valid CPF";
        } else {
            throw new CPFException(cpf);
        }

    }

    public boolean isCPF(String cpf) {
        return cpf.length() > 3 && cpf.length() < 15;
    }
}
