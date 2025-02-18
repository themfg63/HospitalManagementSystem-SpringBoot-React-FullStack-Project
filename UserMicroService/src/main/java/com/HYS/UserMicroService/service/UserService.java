package com.HYS.UserMicroService.service;

import com.HYS.UserMicroService.dto.UserDTO;
import com.HYS.UserMicroService.exception.HysException;

public interface UserService {
    public void registerUser(UserDTO userDTO) throws HysException;
    public UserDTO loginUser(UserDTO userDTO) throws HysException;
    public UserDTO getUserById(Long id) throws HysException;
    public UserDTO updateUser(UserDTO userDTO) throws HysException;
}
