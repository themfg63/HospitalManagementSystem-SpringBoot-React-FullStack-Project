package com.HYS.UserMicroService.dto;

import lombok.Data;


public class ResponseDTO {
    public String message;

    public ResponseDTO(){}

    public ResponseDTO(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
