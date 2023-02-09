package com.fast.miniproject.global.response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ErrorResponseDTO {
    private int errorCode;
    private String message;

}