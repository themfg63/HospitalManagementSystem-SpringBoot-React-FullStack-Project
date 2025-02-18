package com.HYS.UserMicroService.utility;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ErrorInfo {
    private String errorMessage;
    private Integer errorCode;
    private LocalDateTime timestamp;

    public ErrorInfo() {
    }

    public ErrorInfo(String errorMessage,Integer errorCode, LocalDateTime timestamp){
        this.errorMessage=errorMessage;
        this.errorCode=errorCode;
        this.timestamp=timestamp;
    }
}
