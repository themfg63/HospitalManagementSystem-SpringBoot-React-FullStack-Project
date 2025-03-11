package com.HYS.UserMicroService.controller;

import com.HYS.UserMicroService.dto.ResponseDto;
import com.HYS.UserMicroService.dto.UserDTO;
import com.HYS.UserMicroService.exception.HmsException;
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
    public ResponseEntity<ResponseDto> registerUser(@RequestBody @Valid UserDTO userDTO) throws HmsException{
        userService.registerUser(userDTO);
        return new ResponseEntity<>(new ResponseDto("Hesap Oluşturuldu."), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> loginUser(@RequestBody UserDTO userDTO) throws HmsException{
        return new ResponseEntity<>(userService.loginUser(userDTO),HttpStatus.OK);
    }
}
