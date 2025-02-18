package com.HYS.UserMicroService.service;

import com.HYS.UserMicroService.dto.UserDTO;
import com.HYS.UserMicroService.entity.User;
import com.HYS.UserMicroService.exception.HysException;
import com.HYS.UserMicroService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(UserDTO userDTO) throws HysException {
        Optional<User> optional = userRepository.findByEmail(userDTO.getEmail());
        if(optional.isPresent()){
            throw new HysException("USER_ALREADY_EXISTS");
        }
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(userDTO.toEntity());
    }

    @Override
    public UserDTO loginUser(UserDTO userDTO) throws HysException{
        User user = userRepository.findByEmail(userDTO.getEmail()).orElseThrow(() -> new HysException("USER_NOT_FOUND"));
        if(!passwordEncoder.matches(userDTO.getPassword(),user.getPassword())){
            throw new HysException("INVALID_CREDENTIALS");
        }
        user.setPassword(null);
        return user.toDTO();
    }

    @Override
    public UserDTO getUserById(Long id) throws HysException{
        return userRepository.findById(id).orElseThrow(() -> new HysException("USER_NOT_FOUND")).toDTO();
    }

    @Override
    public UserDTO updateUser(UserDTO userDTO) throws HysException{
        return null;
    }
}
