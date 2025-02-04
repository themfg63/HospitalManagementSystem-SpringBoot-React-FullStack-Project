package com.HospitalManagementSystem.UserMicroService.controller;

import com.HospitalManagementSystem.UserMicroService.dto.ResponseDTO;
import com.HospitalManagementSystem.UserMicroService.dto.UserDTO;
import com.HospitalManagementSystem.UserMicroService.exception.HmsException;
import com.HospitalManagementSystem.UserMicroService.service.IUserService;
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
    private IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> registerUser(@RequestBody @Valid UserDTO userDTO) throws HmsException{
        userService.registerUser(userDTO);
        return new ResponseEntity<>(new ResponseDTO("Hesap Oluşturuldu."), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO) throws HmsException{
        return new ResponseEntity<>(userService.loginUser(userDTO),HttpStatus.OK);
    }
}
