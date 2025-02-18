package com.HYS.UserMicroService.controller;

import com.HYS.UserMicroService.dto.ResponseDTO;
import com.HYS.UserMicroService.dto.UserDTO;
import com.HYS.UserMicroService.entity.User;
import com.HYS.UserMicroService.exception.HysException;
import com.HYS.UserMicroService.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> registerUser(@RequestBody @Valid UserDTO userDTO) throws HysException{
        userService.registerUser(userDTO);
        return new ResponseEntity<>(new ResponseDTO("Hesap Oluşturuldu!"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO) throws HysException{
        return new ResponseEntity<>(userService.loginUser(userDTO),HttpStatus.OK);
    }

}
