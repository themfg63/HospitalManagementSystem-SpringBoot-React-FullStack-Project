package com.HospitalManagementSystem.UserMicroService.dto;

import com.HospitalManagementSystem.UserMicroService.dto.enums.Role;
import com.HospitalManagementSystem.UserMicroService.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Role role;

    public User toEntity(){
        return new User(
                this.id,
                this.name,
                this.email,
                this.password,
                this.role
        );
    }
}
