package com.HospitalManagementSystem.UserMicroService.service;

import com.HospitalManagementSystem.UserMicroService.dto.UserDTO;
import com.HospitalManagementSystem.UserMicroService.exception.HmsException;

public interface IUserService {
    public void registerUser(UserDTO userDTO) throws HmsException;
    public UserDTO loginUser(UserDTO userDTO)throws HmsException;
    public UserDTO getUserById(Long id)throws HmsException;
    public void updateUser(UserDTO userDTO)throws HmsException;
}
