package com.HYS.UserMicroService.dto;

import com.HYS.UserMicroService.dto.enums.Roles;
import com.HYS.UserMicroService.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;

    @NotBlank(message = "Ad Soyad Boş Bırakılmaz.")
    private String name;

    @NotBlank(message = "Email Adresi Boş Bırakılamaz.")
    @Email(message = "Lütfen Geçerli Bir Email Adresi Giriniz.")
    private String email;

    @NotBlank(message = "Şifre Boş Bırakılamaz.")
    private String password;

    private Roles role;

    public User toEntity(){
        return new User(
                this.id,
                this.name,
                this.email,
                this.password,
                this.role
        );
    }

    public UserDTO(Long id, String name, String email, String password, Roles role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
}
