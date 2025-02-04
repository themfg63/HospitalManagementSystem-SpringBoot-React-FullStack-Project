package com.HospitalManagementSystem.UserMicroService.entity;

import com.HospitalManagementSystem.UserMicroService.dto.UserDTO;
import com.HospitalManagementSystem.UserMicroService.dto.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private Role role;

    public UserDTO toDTO(){
        return new UserDTO(
                this.id,
                this.name,
                this.email,
                this.password,
                this.role
        );
    }
}

