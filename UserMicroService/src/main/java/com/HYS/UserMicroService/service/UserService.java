package com.HYS.UserMicroService.service;

import com.HYS.UserMicroService.dto.UserDTO;
import com.HYS.UserMicroService.exception.HmsException;

public interface UserService {
    public void registerUser(UserDTO userDTO) throws HmsException;
    public UserDTO loginUser(UserDTO userDTO) throws HmsException;
    public UserDTO getUserById(Long id) throws HmsException;
    public void updateUser(UserDTO userDTO);
}
