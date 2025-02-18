package com.HYS.UserMicroService.dto;

import com.HYS.UserMicroService.dto.enums.Roles;
import com.HYS.UserMicroService.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class UserDTO {
    private Long id;
    @NotBlank(message = "Ad Soyad Bos Birakilamaz!")
    private String name;
    @NotBlank(message = "Email Bos Birakilamaz!")
    @Email(message = "Lütfen Gecerli Bir Email Adresi Giriniz.")
    private String email;
    @NotBlank(message = "Sifre Bos Birakilamaz!")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[\\W]).{8,15}$", message = "Şifreniz en az 1 küçük, 1 büyük harf, 1 özel işaret ve 1 sayı içerip minimum 8 karakterli olmalıdır.")
    private String password;
    private Roles role;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email, String password, Roles role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public User toEntity(){
        return new User(
                this.id,
                this.name,
                this.email,
                this.password,
                this.role
        );
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
